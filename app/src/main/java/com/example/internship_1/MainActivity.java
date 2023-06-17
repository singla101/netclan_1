package com.example.internship_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
//    String courseList[] = {"C-Programming", "Data Structure", "Database", "Python",
//            "Java", "Operating System", "Compiler Design", "Android Development"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner= (Spinner) findViewById(R.id.spinner_1);
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
//                R.layout.activity_main, R.id.spinner_1, courseList);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.numbers, android.R.layout.simple_spinner_item);
//        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(arrayAdapter);
        spinner.setAdapter(adapter);
    }
}