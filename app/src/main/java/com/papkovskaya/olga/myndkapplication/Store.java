package com.papkovskaya.olga.myndkapplication;

/**
 * Created by olga on 20.12.17.
 */

public class Store {
    static {
        System.loadLibrary("Store");
    }

    public native int getCount();

    public native String getString(String pKey) throws IllegalArgumentException;

    
    public native int getInteger(String pKey) throws IllegalArgumentException;

    
    public native float getFloat(String pKey) throws IllegalArgumentException;

    
    public native boolean getBoolean(String pKey) throws IllegalArgumentException;

    
    public native short getShort(String pKey) throws IllegalArgumentException;

    
    public native Object getObject(String pKey) throws IllegalArgumentException;

    
    public native long getLong(String pKey) throws IllegalArgumentException;

    
    public native double getDouble(String pKey) throws IllegalArgumentException;

    
    public native byte getByte(String pKey) throws IllegalArgumentException;

    public native void setString(String pKey, String pString);

    public native void setInteger(String pKey, int pInt);

    public native void setFloat(String pKey, float pFloat);

    public native void setBoolean(String pKey, boolean pBoolean);

    public native void setShort(String pKey, short pShort);

    public native void setObject(String pKey, Object pObject);

    public native void setByte(String pKey, byte pByte);

    public native void setLong(String pKey, long pLong);

    public native void setDouble(String pKey, double pDouble);

    public native boolean hasEntry(String pKey);


}
