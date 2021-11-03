package com.example.laboratorio_06;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PersistenceManager {

    private final SharedPreferences datos;
    private String sessionKey;

    public PersistenceManager(Context context) {
        datos = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public String getSessionKey() {
        return datos.getString("sessionKey", "");
    }

    public void setSessionKey(String sessionKey) {
        SharedPreferences.Editor editor = datos.edit();
        editor.putString("sessionKey", sessionKey);
        editor.apply();
    }

}
