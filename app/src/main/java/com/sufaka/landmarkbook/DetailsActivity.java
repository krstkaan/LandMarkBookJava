package com.sufaka.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sufaka.landmarkbook.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Intent intent  = getIntent();
        Landmark selectedLandmark = (Landmark) intent.getSerializableExtra("landmark");
        binding.nameText.setText(selectedLandmark.date);
        binding.countryText.setText(selectedLandmark.Country);
        binding.imageView2.setImageResource(selectedLandmark.image);
    }
}