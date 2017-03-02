package com.example.jarisandstrom.realmexample.app;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;

import com.example.jarisandstrom.realmexample.realm.RealmController;

import io.realm.Realm;

/**
 * Created by jarisandstrom on 02/03/2017.
 */
public class Prefs {

    private static final String PRE_LOAD = "preLoad";
    private static final String PREFS_NAME = "prefs";
    private static Prefs instance;
    private final SharedPreferences sharedPreferences;

    public Prefs(Context context) {

        sharedPreferences = context.getApplicationContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    public static Prefs with(Context context) {

        if (instance == null) {
            instance = new Prefs(context);
        }
        return instance;
    }

    public void setPreLoad(boolean totalTime) {

        sharedPreferences
                .edit()
                .putBoolean(PRE_LOAD, totalTime)
                .apply();
    }

    public boolean getPreLoad(){
        return sharedPreferences.getBoolean(PRE_LOAD, false);
    }
}
