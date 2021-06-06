package ru.mirea.medvedevvladislav.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView tv = findViewById(R.id.textView1);
        Bundle arg = getIntent().getExtras();
        String date = arg.getString("dateS");
        tv.setText(date);
    }

}