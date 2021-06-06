package ru.mirea.medvedevvladislav.resultactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class DataActivity extends AppCompatActivity {
    private EditText univText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        univText = findViewById(R.id.editTextTextPersonName);
    }

    public void onClickSendResult(View view)
    {
        Intent intent = new Intent();
        intent.putExtra("name", univText.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}