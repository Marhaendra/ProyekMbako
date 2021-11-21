package android.example.proyekmbako;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class StartApp extends AppCompatActivity {
    ImageView applogo1;
    TextView startmbako;
    Button buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_app);
        applogo1 = findViewById(R.id.applogo1);
        startmbako = findViewById(R.id.startmbako);
        buttonStart = findViewById(R.id.buttonStart);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startapp = new Intent(StartApp.this, ChooseLoc.class);
                startActivity(startapp);
                finish();

            }
        });

    }
}