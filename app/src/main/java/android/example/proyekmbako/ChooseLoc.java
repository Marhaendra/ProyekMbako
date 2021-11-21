package android.example.proyekmbako;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

public class ChooseLoc extends AppCompatActivity{
    Spinner sp_prov;
    Spinner sp_kota;
    Spinner sp_pasar;
    Button buttonConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_loc);
        //mengidentifikasi spinnernya sp_prov
        Spinner sp_prov = findViewById(R.id.sp_prov);
        Spinner sp_kota = findViewById(R.id.sp_kota);
        Spinner sp_pasar = findViewById(R.id.sp_pasar);
        Button buttonConfirm = findViewById(R.id.buttonConfirm);
        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent confirm = new Intent(ChooseLoc.this, Homepage.class);
                startActivity(confirm);
                finish();
            }
        });
        //pas masukin (this); dalam OnItemSelected jangan lupa untuk implements AdapterView.OnItemSelectedListener
        //terus di implement methodsnya

    }

}