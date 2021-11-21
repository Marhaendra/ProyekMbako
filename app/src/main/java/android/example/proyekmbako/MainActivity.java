package android.example.proyekmbako;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView applogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        applogo = findViewById(R.id.applogo);

        //membuat timer untuk awal pindah dari logo ke startApp (pake handler)
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent logoawal = new Intent(MainActivity.this, StartApp.class);
                //untuk menjalankan intent pake startactivity
                startActivity(logoawal); //mulai dari intent nya logo awal
                finish();

            }
        }, 2000); //jadi timernya durasi 2 detik lgsg pindah ke halaman startapp




        //hasil klik dari user kalo dia ngeklik logo aplikasi (applogo)
       // applogo.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {
                //pindah halaman menggunakan intent
                //() pada new Intent(halaman tempat kita berada.this(nandain kalo lagi di halaman ini), halaman yang di mau.class)
                //Intent logoawal = new Intent(MainActivity.this, StartApp.class);
                //untuk menjalankan intent pake startactivity
               // startActivity(logoawal); //mulai dari intent nya logo awal
                //finish();

            //}
        //});
    }
}