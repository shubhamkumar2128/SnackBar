package com.example.snackbar;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class DialogFrag extends DialogFragment {
    EditText editText;

    public DialogFrag() {

    }

    ViewGroup vg;


    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        View v = layoutInflater.inflate(R.layout.dialogview, null);
        builder.setView(v);

        AlertDialog alertDialog = builder.create();
        return alertDialog;
    }


}
