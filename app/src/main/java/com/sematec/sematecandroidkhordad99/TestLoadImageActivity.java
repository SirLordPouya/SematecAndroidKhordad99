package com.sematec.sematecandroidkhordad99;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class TestLoadImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_load_image);

        String imageAddress = "https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png";
        ImageView imgProfile = findViewById(R.id.imgProfile);
        Glide.with(this).load(imageAddress).into(imgProfile);

    }
}