package com.hfad.marketstore;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BDHelper extends SQLiteOpenHelper {

    public static final String BDNAME = "login_db";

    public BDHelper(Context context) {
        super(context, "login_db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table USERS(user TEXT primary key, password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists USERS");
    }

    public boolean insertData (String user, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("user", user);
        values.put("password", password);

        long result = db.insert("USERS", null, values);
        if(result==-1) return false;
        else
            return true;
    }

    public boolean checkusername(String user){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from USERS where user=?", new String[]{user});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }

    public boolean checkuserpassword(String user, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from USERS where user=? and password=?", new String[]{user, password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
}
