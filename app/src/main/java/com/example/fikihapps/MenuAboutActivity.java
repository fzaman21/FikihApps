package com.example.fikihapps;
//Tanggal Pengerjaan : 30 April 2019
//NIM  : 10116050
//Nama : Fikih Zaman
//Kelas: IF-2 AKB-2

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MenuAboutActivity extends Fragment {
    View v;
    public MenuAboutActivity() {}
    AlertDialog.Builder dialog;
    LayoutInflater inflater;
    View dialogView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_menu_about, container, false);

        Button btnAbout = (Button) v.findViewById(R.id.btnAbout);

        btnAbout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //Toast.makeText(getActivity().getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();
                showAlert();
            }
        });

        return v;
    }
    public void showAlert(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View alertDialogView = inflater.inflate(R.layout.customdialog, null);
        alertDialog.setView(alertDialogView);
        alertDialog.setPositiveButton("OK", null);
        alertDialog.show();

    }

}
