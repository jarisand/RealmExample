package com.example.jarisandstrom.realmexample.adapters;

/**
 * Created by jarisandstrom on 02/03/2017.
 */

import android.support.v7.widget.RecyclerView;

import io.realm.RealmBaseAdapter;
import io.realm.RealmObject;

public abstract class RealmRecyclerViewAdapter<T extends RealmObject> extends RecyclerView.Adapter {

    private RealmBaseAdapter<T> realmBaseAdapter;

    public T getItem(int position){
        return realmBaseAdapter.getItem(position);
    }

    public RealmBaseAdapter<T> getRealmAdapter(){
        return realmBaseAdapter;
    }

    public void setRealmBaseAdapter(RealmBaseAdapter<T> realmAdapter){
        realmBaseAdapter = realmAdapter;
    }
}
