package android.example.proyekmbako;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MinyakActivity extends Activity {

    ArrayList<Food> foods = new ArrayList<>();
    ListView listView;
    DatabaseReference database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minyak);

        listView = findViewById(R.id.lv_minyak);
        database = FirebaseDatabase.getInstance().getReference();

        database.child("food").child("minyak").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                foods.clear();
                for (DataSnapshot food : dataSnapshot.getChildren()){

                    Food foodclass = food.getValue(Food.class);
                    Log.d("zxy", "cek " + foodclass.getname());
                    foods.add(foodclass);
                }
                FoodAdapter foodAdapter = new FoodAdapter(MinyakActivity.this, foods) ;
                listView.setAdapter(foodAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

    }
}
