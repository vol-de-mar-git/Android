package ru.mirea.medvedevvladislav.dialog;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;

import java.util.Calendar;

public class MyTimePicker {
    Context context;

    int hours,minutes;

    public MyTimePicker(Context context) {
        this.context = context;
    }

    public void getTimePickerDialog()
    {
        final Calendar cal = Calendar.getInstance();
        hours = cal.get(Calendar.HOUR_OF_DAY);
        minutes = cal.get(Calendar.MINUTE);

        TimePickerDialog tp = new TimePickerDialog(context,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        String p = hourOfDay + " : " + minute;
                        MainActivity.editTextTime.setText(p);
                    }
                }, hours,minutes, false);
        tp.show();
    }
}
