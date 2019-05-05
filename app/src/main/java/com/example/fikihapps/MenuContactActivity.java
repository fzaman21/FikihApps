package com.example.fikihapps;
//Tanggal Pengerjaan : 30 April 2019
//NIM  : 10116050
//Nama : Fikih Zaman
//Kelas: IF-2 AKB-2

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MenuContactActivity extends Fragment {
    View v;

    public MenuContactActivity() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_menu_contact, container, false);
        Button btnContact = (Button) v.findViewById(R.id.btnContact);
        Button btnEmail = (Button) v.findViewById(R.id.btnEmail);
        Button btnFB = (Button) v.findViewById(R.id.btnFB);
        btnContact.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                String p = "tel:082262560663";
                i.setData(Uri.parse(p));
                startActivity(i);
            }
        });
        btnEmail.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "fikihzaman@gmail.com", null));
                startActivity(Intent.createChooser(i, "Kirim Email"));
            }
        });
        btnFB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/fikih.zaman")));
            }
        });
        return v;
    }
}