package com.example.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dialog.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.dialog);
                EditText ed_name = dialog.findViewById(R.id.name);
                EditText ed_fathername = dialog.findViewById(R.id.fathername);
                Button btn_send = dialog.findViewById(R.id.btn_send);




                dialog.show();

                btn_send.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setTitle("Alert Dialog");
                        builder.setMessage("Are You Sure to Send Data");
                        builder.setCancelable(false);
                        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                Intent intent=new Intent(MainActivity.this,MainActivity2.class);

                                intent.putExtra("name", ed_name.getText().toString());
                                intent.putExtra("father", ed_fathername.getText().toString());
                                startActivity(intent);



                            }
                        });

                        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        builder.show();
                    }
                });

            }
        });
    }
}