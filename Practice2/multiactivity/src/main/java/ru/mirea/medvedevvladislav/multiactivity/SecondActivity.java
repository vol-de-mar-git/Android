package ru.mirea.medvedevvladislav.multiactivity;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView1 = findViewById(R.id.textView1);

        Bundle text = getIntent().getExtras();

        if (text!=null)
        {
            String name =text.get("name").toString();
            textView1.setText(name);
        }

    }

    @Override protected void onStart()
    {
        super.onStart();
    }
    @Override protected void onRestart(){
        super.onRestart();
    }
    @Override protected void onResume(){
        super.onResume();
    }
    @Override protected void onPause(){
        super.onPause();
    }
    @Override protected void onStop(){
        super.onStop();
    }
    @Override protected void onDestroy(){
        super.onDestroy();
    }


}