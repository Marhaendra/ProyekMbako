package android.example.proyekmbako;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FoodAdapter extends ArrayAdapter<Food> {

    private List<Food> dataset;
    private Context context;

    public FoodAdapter(@NonNull Context context, @NonNull List<Food> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Food currentFood = getItem(position);

        TextView name = (TextView) convertView.findViewById(R.id.tv_nama);
        name.setText(currentFood.getname());
        TextView harga = (TextView) convertView.findViewById(R.id.tv_harga);
        harga.setText(currentFood.getprice());
        TextView berat = (TextView) convertView.findViewById(R.id.tv_berat);
        berat.setText(currentFood.getweight());

        return convertView;
    }
}
