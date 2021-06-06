package ru.mirea.medvedevvladislav.dialog;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class MyDatePicker {
    public MyDatePicker(Context context) {
        this.context = context;

    }

    int year,month,day;
    String param;
    Context context;
    public void getDatePickerDialog() {

        final Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dp = new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
             param = dayOfMonth + "." + (month + 1) + "." + year;
                MainActivity.editTextDate.setText(param);
            }

        }, year, month, day);

        dp.show();

    }


}
