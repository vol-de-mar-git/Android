package ru.mirea.medvedevvladislav.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    String s = null;

    public static EditText editTextDate;
    public static EditText editTextTime;
    int hours,minutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextDate = (EditText) findViewById(R.id.editTextTextPersonName);
        editTextTime = (EditText) findViewById(R.id.editTextTextPersonName2);
    }

    public void onClickShow(View view) {
        AlertDialogFragment dialogFragment = new AlertDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onOkClicked()
    {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку\"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onCancelClicked(){
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку\"Нет\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onNeutralClicked(){
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку\"Напаузе\"!",
                Toast.LENGTH_LONG).show();
    }


    public void onClickDate(View view)
    {
        MyDatePicker dp = new MyDatePicker(this);
        dp.getDatePickerDialog();

    }




    public void onClickTime(View view){
        MyTimePicker tp = new MyTimePicker(this);
        tp.getTimePickerDialog();
    }



    public void onClickProgress(View view){
        MyProgress mp = new MyProgress(this);
        mp.getProgressDialog().show();
    }

}