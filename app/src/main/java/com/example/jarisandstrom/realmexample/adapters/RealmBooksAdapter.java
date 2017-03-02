package com.example.jarisandstrom.realmexample.adapters;

/**
 * Created by jarisandstrom on 02/03/2017.
 */

import android.content.Context;

import com.example.jarisandstrom.realmexample.model.Book;

import io.realm.RealmResults;

public class RealmBooksAdapter extends RealmModelAdapter<Book> {

    public RealmBooksAdapter(Context context, RealmResults<Book> realmResults, boolean automaticUpdate){

        super(context, realmResults, automaticUpdate);
    }
}
