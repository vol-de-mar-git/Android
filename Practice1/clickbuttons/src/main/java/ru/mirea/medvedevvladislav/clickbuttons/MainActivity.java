package ru.mirea.medvedevvladislav.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.widget.TextView.*;


public class MainActivity extends AppCompatActivity {

    private TextView tvOut;
    private Button buttonCancel;
    private Button buttonOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        buttonCancel = (Button) findViewById(R.id.btnCancel);
        buttonOK = (Button) findViewById(R.id.btnOK);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка Ок");

            }
        };
        buttonOK.setOnClickListener(oclBtnOk);

        View.OnClickListener oclBtnCancel = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка Cancel");
            }
        };
        buttonCancel.setOnClickListener(oclBtnCancel);


    }

}