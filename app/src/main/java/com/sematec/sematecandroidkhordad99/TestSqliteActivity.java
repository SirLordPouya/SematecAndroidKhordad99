package com.sematec.sematecandroidkhordad99;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class TestSqliteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_sqlite);

        TestSqlite database = new TestSqlite(this, "sematec", null, 1);
        database.insertStudent("Pouya Heydari", 90);
        database.insertStudent("Qoli Qolizde", 95);

        List<String> names = database.getAllStudentsNames();
        String printName = "";
        for (int i = 0; i < names.size(); i++) {
            printName += names.get(i) + "\n";
        }
        Toast.makeText(this, printName, Toast.LENGTH_SHORT).show();
    }
}