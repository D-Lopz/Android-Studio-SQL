package com.example.actividad_bd.view;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.actividad_bd.R;
import com.example.actividad_bd.databinding.ActivityMainBdBinding;

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
                binding.tvMessage.setText("Mensake desde el click del boton😉");
            }
        });
    }

}