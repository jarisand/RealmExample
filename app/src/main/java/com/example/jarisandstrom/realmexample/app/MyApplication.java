package com.example.jarisandstrom.realmexample.app;

/**
 * Created by jarisandstrom on 02/03/2017.
 */

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MyApplication  extends Application{

    @Override
    public void onCreate(){

        super.onCreate();
            RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(this)
                    .name(Realm.DEFAULT_REALM_NAME)
                    .schemaVersion(0)
                    .deleteRealmIfMigrationNeeded()
                    .build();
            Realm.setDefaultConfiguration(realmConfiguration);

    }
}
