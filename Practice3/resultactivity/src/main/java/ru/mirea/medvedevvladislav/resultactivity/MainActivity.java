package ru.mirea.medvedevvladislav.resultactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final int REQUEST_CODE = 143;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.textViewResult);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null)
        {
            String university = data.getStringExtra("name");
            setUniversityTextView(university);
        }
    }

    public void onClickSend(View view)
    {
        Intent intent = new Intent(this,DataActivity.class);
        startActivityForResult(intent,REQUEST_CODE);
    }

    private void setUniversityTextView(String university){
        tvResult.setText(university);
    }

}