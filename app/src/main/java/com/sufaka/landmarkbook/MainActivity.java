package com.sufaka.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.sufaka.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        landmarkArrayList = new ArrayList<>();
        Landmark pisa = new Landmark("PISA", "ITALY", R.drawable.pisatower);
        landmarkArrayList.add(pisa);
        Landmark kizkulesi = new Landmark("KIZ KULESI", "TURKEY", R.drawable.kzkulesi);
        landmarkArrayList.add(kizkulesi);
        Landmark eiffel = new Landmark("EIFFEL", "FRANCE", R.drawable.eiffel);
        landmarkArrayList.add(eiffel);




        //adapter
        //ListView
        //mapping
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.date).collect(Collectors.toList()));
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("landmark",landmarkArrayList.get(i));
                startActivity(intent);
            }
        });





    }
}