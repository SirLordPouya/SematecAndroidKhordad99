package com.sematec.sematecandroidkhordad99;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txtName = findViewById(R.id.txtName);
        final TextView txtFamily = findViewById(R.id.txtFamily);
        Button btnSave = findViewById(R.id.btnSave);
        ImageView imgProfile = findViewById(R.id.imgProfile);
        EditText edtAge = findViewById(R.id.edtAge);


        txtName.setText("Pouya");
        txtFamily.setText("Heydari");

        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "imgProfile Clicked!");
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Toast message", Toast.LENGTH_LONG).show();
            }
        });

        txtName.setText(HtmlCompat.fromHtml("<h2>Title</h2><br><p>Description here</p>",HtmlCompat.FROM_HTML_MODE_COMPACT));
    }
}