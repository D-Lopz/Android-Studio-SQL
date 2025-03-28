package com.example.actividad_bd.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MiBaseDeDatos extends SQLiteOpenHelper {

    private static final String NOMBRE_DB = "MiDB";
    private static final int VERSION_DB = 1;
    public MiBaseDeDatos(Context context) {
        super(context, NOMBRE_DB, null, VERSION_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String crearTabla = "CREATE TABLE usuarios (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                "nombre TEXT NOT NULL, " +
                "edad INTEGER NOT NULL)";

            db.execSQL(crearTabla);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists usuarios");
        onCreate(db);
    }
}
