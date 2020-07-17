package com.sematec.sematecandroidkhordad99;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TestRecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler_view);

        List<String> names = new ArrayList<>();
        names.add("Pouya Heydari");
        names.add("Mohammad Samangi");
        names.add("Sahar Taghizadeh");
        names.add("Shahrokh Sorahitalab");
        names.add("Vali Jafari Moghadam");

        RecyclerView recycler = findViewById(R.id.recycler);
        LinearLayoutManager manager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recycler.setLayoutManager(manager);
        TestAdapter adapter = new TestAdapter(names);
        recycler.setAdapter(adapter);
    }
}