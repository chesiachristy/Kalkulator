package com.example.kelompok_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity {

    EditText tinggi, berat;
    String proses, hasilbmi;
    TextView hasil;
    Button hitung, refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        tinggi = (EditText) findViewById(R.id.tinggi);
        berat = (EditText) findViewById(R.id.berat);
        hitung = (Button) findViewById(R.id.hitung);
        refresh = (Button) findViewById(R.id.refresh);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String S1 = berat.getText().toString();
                String S2 = tinggi.getText().toString();

                float nilaiBerat = Float.parseFloat(S1);
                float nilaiTinggi = Float.parseFloat(S2) / 100;
                float bmi = nilaiBerat / (nilaiTinggi * nilaiTinggi);

                if(bmi < 18.5){
                    hasilbmi = "Kekurangan Berat Badan";
                }
                else if(bmi >= 18.5 && bmi <= 24.9){
                    hasilbmi = "Ideal";
                }
                else if(bmi >= 25 && bmi <= 29.9){
                    hasilbmi = "Kelebihan Berat Badan";
                }
                else{
                    hasilbmi = "Obesitas";
                }

                proses = bmi + "\n" + hasilbmi;
                hasil.setText(String.valueOf(proses));
            }
        });

        hasil = findViewById(R.id.hasil);

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinggi.setText("");
                berat.setText("");
                hasil.setText("");
                berat.requestFocus();
            }
        });
    }
}