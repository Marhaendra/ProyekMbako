package android.example.proyekmbako;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class BerasActivity extends AppCompatActivity {

    ArrayList<Food> foods = new ArrayList<>();
    ListView listView;
    DatabaseReference database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beras);

        listView = findViewById(R.id.lv_beras);
        database = FirebaseDatabase.getInstance().getReference();

        String Food = "food";
        String Sembako = "beras";

        database.child(Food).child(Sembako).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                foods.clear();
                for (DataSnapshot food : dataSnapshot.getChildren()){

                    Food foodclass = food.getValue(Food.class);
                    Log.d("zxy", "cek " + foodclass.getname());
                    foods.add(foodclass);
                }
                FoodAdapter foodAdapter = new FoodAdapter(BerasActivity.this, foods) ;
                listView.setAdapter(foodAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

    }
}