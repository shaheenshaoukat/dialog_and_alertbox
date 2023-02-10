package com.example.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;

import com.example.dialog.databinding.ActivityMain2Binding;
import com.example.dialog.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {
  ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Intent intent=getIntent();
        String str1= intent.getStringExtra("name");
        String str2= intent.getStringExtra("father");



        binding.name.setText(str1);
        binding.fathername.setText(str2);





    }
}