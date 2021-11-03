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



    // Parte de guardado de nueva alerta
    public String getUbicacionAlerta() {
        return datos.getString("ubicacionAlerta", "");
    }

    public void setUbicacionAlerta(String ubicacionAlerta) {
        SharedPreferences.Editor editor = datos.edit();
        editor.putString("ubicacionAlerta", ubicacionAlerta);
        editor.apply();
    }

    public String getEvidenciFoto() {
        return datos.getString("evidenciaFoto", "");
    }

    public void setEvidenciFoto(String evidenciaFoto) {
        SharedPreferences.Editor editor = datos.edit();
        editor.putString("evidenciaFoto", evidenciaFoto);
        editor.apply();
    }
    // Fin de  Parte de guardado de nueva alerta
    
    

}
