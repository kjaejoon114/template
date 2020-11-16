package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, first.class);
        startActivity(intent);

        Button imageButton = (Button) findViewById(R.id.button);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                setContentView(R.layout.assistant);
                Intent intent = new Intent(getApplicationContext(), assistant.class);
                startActivity(intent);

            }
        });

        Button imageButton2 = (Button) findViewById(R.id.button2);
        imageButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view2) {
                Intent intent2 = new Intent(getApplicationContext(), location.class);
                startActivity(intent2);
            }
        });

        Button imageButton3 = (Button) findViewById(R.id.button3);
        imageButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view3) {
                Intent intent3 = new Intent(getApplicationContext(), list.class);
                startActivity(intent3);
            }
        });

        Button imageButton4 = (Button) findViewById(R.id.button4);
        imageButton4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view4) {
                Intent intent4 = new Intent(getApplicationContext(), help.class);
                startActivity(intent4);
            }
        });

    }
}