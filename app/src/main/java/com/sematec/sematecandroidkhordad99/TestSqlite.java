package com.sematec.sematecandroidkhordad99;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class TestSqlite extends SQLiteOpenHelper {

    String TABLE_NAME = "students";

    public TestSqlite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_QUERY = "CREATE TABLE " + TABLE_NAME + "(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT," +
                "score INTEGER" +
                ")";
        db.execSQL(CREATE_TABLE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade
    }

    public void insertStudent(String name, int score) {
        String INSERT_STUDENT_QUERY = "INSERT INTO " + TABLE_NAME + "(name,score)" +
                "VALUES("
                + "'" + name + "'" + "," +
                score + ")";
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(INSERT_STUDENT_QUERY);
        db.close();
    }

    List<String> getAllStudentsNames() {

        String GET_ALL_NAMES_QUERY = "SELECT name FROM " + TABLE_NAME;
        ArrayList<String> names = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(GET_ALL_NAMES_QUERY, null);

        while (cursor.moveToNext()) {
            names.add(cursor.getString(0));
        }
        db.close();
        return names;
    }
}
