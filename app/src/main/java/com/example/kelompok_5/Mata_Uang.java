package com.example.kelompok_5;
import androidx.appcompat.app.AppCompatActivity;
import java.text.NumberFormat;
import java.util.Locale;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Mata_Uang extends AppCompatActivity {

    EditText input_uang;
    Button rp_usd, rp_euro, rp_yen, rp_won;
    TextView hasil_konversi;

    double angka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mata_uang);

        input_uang = (EditText) findViewById(R.id.uang_input);
        rp_usd = (Button) findViewById(R.id.rpusd);
        rp_euro = (Button) findViewById(R.id.rpeuro);
        rp_yen = (Button) findViewById(R.id.rpyen);
        rp_won = (Button) findViewById(R.id.rwon);
        hasil_konversi = (TextView) findViewById(R.id.hasil_konversi);
    }

    public boolean cek(){
        if (input_uang.getText().toString().isEmpty()){
            Toast.makeText(this, "Silahkan masukan jumlah uang", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }

        public void toYEN(View v){
            if (cek()){
                return;
            }

            try{
                angka = Double.parseDouble(input_uang.getText().toString());
            }catch(Exception ex){
                Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
            }

            double hasil = angka / 130.42;
            hasil_konversi.setText(NumberFormat.getCurrencyInstance(Locale.JAPAN).format(hasil));
            Toast.makeText(this, "1 Yen = Rp 130.42", Toast.LENGTH_SHORT).show();
        }

    public void toEuro(View v){
        if (cek()){
            return;
        }

        try{
            angka = Double.parseDouble(input_uang.getText().toString());
        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 17397;
        hasil_konversi.setText(NumberFormat.getCurrencyInstance(Locale.GERMANY).format(hasil));
        Toast.makeText(this, "1 Euro = Rp 17.397", Toast.LENGTH_SHORT).show();
    }



    public void toUSD(View v){
        if (cek()){
            return;
        }

        try{
            angka = Double.parseDouble(input_uang.getText().toString());
        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 14279;
        hasil_konversi.setText(NumberFormat.getCurrencyInstance(Locale.US).format(hasil));
        Toast.makeText(this, "1 U$D = Rp 14279", Toast.LENGTH_SHORT).show();
    }

    public void toWon(View v){
        if (cek()){
            return;
        }

        try{
            angka = Double.parseDouble(input_uang.getText().toString());
        }catch(Exception e){
            Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
        }

        double hasil = angka / 12.79;
        hasil_konversi.setText(NumberFormat.getCurrencyInstance(Locale.KOREA).format(hasil));
        Toast.makeText(this, "1 ₩ = Rp 12.79", Toast.LENGTH_SHORT).show();
    }

}
