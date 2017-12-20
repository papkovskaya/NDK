package com.papkovskaya.olga.myndkapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText etKey;
    private EditText etValue;
    private Spinner spinner;

    private Store store = new Store();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etKey = findViewById(R.id.editTextKey);
        etValue = findViewById(R.id.editTextValue);
        spinner = findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.types_array,
                android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void onSaveClick(View view) {
        String key = etKey.getText().toString();
        String value = etValue.getText().toString();

        switch (spinner.getSelectedItemPosition()){
            case 0 : {
                store.setString(key, value);
            }
            break;
            case 1 : {
                store.setInteger(key, Integer.parseInt(value));
            }
            break;
            case 2 : {
                store.setFloat(key, Float.parseFloat(value));
            }
            break;
        }
        etKey.setText("");
        etValue.setText("");
    }

    public void onGetClick(View view) {
        String key = etKey.getText().toString();
        try{
            switch (spinner.getSelectedItemPosition()){
                case 0 : {
                    etValue.setText(store.getString(key));
                }
                break;
                case 1 : {
                    etValue.setText(String.format("%d",store.getInteger(key)));
                }
                break;
                case 2 : {
                    etValue.setText(String.format("%f",store.getFloat(key)));
                }
                break;
            }
        } catch (Exception e) {
            Toast.makeText(this, e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

    public void onCheckKeyClick(View view) {
        String key = etKey.getText().toString();
        boolean isHasEntry = store.hasEntry(key);
        Toast.makeText(this, "has entry: " + isHasEntry, Toast.LENGTH_SHORT).show();
    }
}
