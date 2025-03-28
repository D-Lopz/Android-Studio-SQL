package com.example.actividad_bd.view;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;

import com.example.actividad_bd.databinding.ActivityMainBdBinding;
import com.example.actividad_bd.model.UsuarioDAO;

public class MainActivityBD extends AppCompatActivity {
    private ActivityMainBdBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBdBinding.inflate(getLayoutInflater());
        //setContentView(R.layout.activity_main_bd);
        setContentView (binding.getRoot());
        binding.btnSaludar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                binding.tvMessage.setText("Mensaje desde el click del boton😉");
            }
        });
        UsuarioDAO usuarioDAO = new UsuarioDAO(this);
        usuarioDAO.insertarUsuario("David", 19);
        usuarioDAO.consultarUsuarios();
    }

}