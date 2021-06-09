package com.example.kelompok_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Kalkulator_BMI(View view) {
        Intent intent = new Intent(MainActivity.this, BMI.class);
        startActivity(intent);
    }

    public void Konversi_Mata_Uang(View view) {
        Intent intent = new Intent(MainActivity.this, Mata_Uang.class);
        startActivity(intent);
    }

}