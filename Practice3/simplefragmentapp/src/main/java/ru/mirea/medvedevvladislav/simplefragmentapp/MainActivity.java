package ru.mirea.medvedevvladislav.simplefragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

import ru.mirea.medvedevvladislav.systemintentsapp.BlankFragment1;
import ru.mirea.medvedevvladislav.systemintentsapp.BlankFragment2;


public class MainActivity extends AppCompatActivity {

    Fragment fragment1,fragment2;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment1 = new BlankFragment1();
        fragment2 = new BlankFragment2();


    }

    public void onClickToF1(View view)
    {
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment1).commit();
    }

    public void onClickToF2(View view)
    {
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment2).commit();
    }
}