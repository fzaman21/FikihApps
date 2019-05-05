package com.example.fikihapps;
//Tanggal Pengerjaan : 30 April 2019
//NIM  : 10116050
//Nama : Fikih Zaman
//Kelas: IF-2 AKB-2
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class MenuGalleryActivity extends Fragment {
    public MenuGalleryActivity(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.activity_menu_gallery, container, false);

        getActivity().setTitle("Gallery");

        return view;
    }
}
