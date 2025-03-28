package com.example.actividad_bd.model;

import android.content.ContentValues;
import android.content.Context;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class UsuarioDAO {
    private MiBaseDeDatos dbHelper;
    public UsuarioDAO(Context context){
        dbHelper = new MiBaseDeDatos(context);
    }

    public void insertarUsuario(String nombre, int edad){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("nombre", nombre);
        values.put("edad", edad);
        db.insert("usuarios", null, values);
        db.close();
    }

    public void consultarUsuarios() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from usuarios", null);

        while (cursor.moveToNext()){
            String nombre = cursor.getString(cursor.getColumnIndexOrThrow("nombre"));
            int edad = cursor.getInt(cursor.getColumnIndexOrThrow("edad"));
            System.out.println("Usuario: " + nombre + ". Edad: " + edad);
        }

        cursor.close();
        db.close();
    }
}
