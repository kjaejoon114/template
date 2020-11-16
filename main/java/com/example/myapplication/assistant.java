package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class assistant extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assistant);


        Button imageButton5 = (Button) findViewById(R.id.button);
        imageButton5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent5 = new Intent(getApplicationContext(), poster.class);
                startActivity(intent5);

            }
        });
    }

}