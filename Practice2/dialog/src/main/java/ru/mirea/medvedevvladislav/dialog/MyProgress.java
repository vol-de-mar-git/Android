package ru.mirea.medvedevvladislav.dialog;

import android.app.ProgressDialog;
import android.content.Context;

public class MyProgress {
    Context context;

    public MyProgress(Context context) {
        this.context = context;
    }

    public ProgressDialog getProgressDialog()
    {
        ProgressDialog pd = new ProgressDialog(context);
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        pd.setMessage("Please Wait....");
        return pd;
    }
}
