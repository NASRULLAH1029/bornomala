package com.rubi.bornomala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {

    LinearLayout layout_1, layout_2, layout_3, layout_4, layout_5, layout_6, layout_7, layout_8, layout_9, layout_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        layout_1 = (LinearLayout) findViewById(R.id.btn_1);
        layout_2 = (LinearLayout) findViewById(R.id.btn_2);
        layout_3 = (LinearLayout) findViewById(R.id.btn_3);
        layout_4 = (LinearLayout) findViewById(R.id.btn_4);
        layout_5 = (LinearLayout) findViewById(R.id.btn_5);
        layout_6 = (LinearLayout) findViewById(R.id.btn_6);
        layout_7 = (LinearLayout) findViewById(R.id.btn_7);
        layout_8 = (LinearLayout) findViewById(R.id.btn_8);
        layout_9 = (LinearLayout) findViewById(R.id.btn_9);
        layout_10 = (LinearLayout) findViewById(R.id.btn_10);


        layout_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity2.class);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "বিসমিল্লাহির রাহমানির রাহীম", Toast.LENGTH_SHORT);
                toast.show();

            }
        });

        layout_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity3.class);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "বিসমিল্লাহির রাহমানির রাহীম", Toast.LENGTH_SHORT);
                toast.show();

            }
        });


        layout_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity4.class);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "বিসমিল্লাহির রাহমানির রাহীম", Toast.LENGTH_SHORT);
                toast.show();

            }
        });


        layout_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity5.class);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "বিসমিল্লাহির রাহমানির রাহীম", Toast.LENGTH_SHORT);
                toast.show();

            }
        });


        layout_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity6.class);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "বিসমিল্লাহির রাহমানির রাহীম", Toast.LENGTH_SHORT);
                toast.show();

            }
        });


        layout_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity7.class);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "বিসমিল্লাহির রাহমানির রাহীম", Toast.LENGTH_SHORT);
                toast.show();

            }
        });


        layout_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity8.class);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "বিসমিল্লাহির রাহমানির রাহীম", Toast.LENGTH_SHORT);
                toast.show();

            }
        });


        layout_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity9.class);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "বিসমিল্লাহির রাহমানির রাহীম", Toast.LENGTH_SHORT);
                toast.show();

            }
        });


        layout_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity10.class);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "বিসমিল্লাহির রাহমানির রাহীম", Toast.LENGTH_SHORT);
                toast.show();

            }
        });


        layout_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity8.this, MainActivity11.class);
                startActivity(intent);
                Toast toast = Toast.makeText(getApplicationContext(), "বিসমিল্লাহির রাহমানির রাহীম", Toast.LENGTH_SHORT);
                toast.show();

            }
        });
    }
}