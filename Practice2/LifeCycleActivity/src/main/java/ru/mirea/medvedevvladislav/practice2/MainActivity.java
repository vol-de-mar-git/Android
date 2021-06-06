package ru.mirea.medvedevvladislav.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override protected void onStart()
    {
        super.onStart();
        Log.i(TAG,"onStart()");
    }

    @Override protected void onRestart()
    {
        super.onRestart();
    }

    @Override protected void onResume(){
        super.onResume();
        Log.i(TAG,"onResume()");
    }

    @Override protected void onPause(){
        super.onPause();
        Log.i(TAG,"onPause()");
    }
    @Override protected void onStop(){
        super.onStop();
        Log.i(TAG,"onStop()");
    }
    @Override protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }
}
