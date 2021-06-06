package ru.mirea.medvedevvladislav.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2); //на стороннем эмуляторе не запускался прошлый проект, перенес сюда.
    }

    public void onClickNewActivity(View view)
    {

        EditText name1 = findViewById(R.id.name1);
        String name = name1.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
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