package ru.mirea.medvedevvladislav.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import androidx.fragment.app.DialogFragment;

public class AlertDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("ЗдравствуйМИРЭА!")
                .setMessage("Успехблизок?")
                .setIcon(R.mipmap.ic_launcher_round)
                .setPositiveButton("Идудальше", new DialogInterface.OnClickListener()
                {public void onClick(DialogInterface dialog, int id) {
                    ((MainActivity)getActivity()).onOkClicked();
                }})
                .setNeutralButton("Отдыхаю",new DialogInterface.OnClickListener()
                {public void onClick(DialogInterface dialog,int id) {
                    ((MainActivity)getActivity()).onNeutralClicked();
                }})
                .setNegativeButton("Нет",new DialogInterface.OnClickListener() {public void onClick(DialogInterface dialog,int id) {
                    ((MainActivity)getActivity()).onCancelClicked();
                }});
        return builder.create();
    }
}
