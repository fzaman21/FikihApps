package com.example.fikihapps;
//Tanggal Pengerjaan : 30 April 2019
//NIM  : 10116050
//Nama : Fikih Zaman
//Kelas: IF-2 AKB-2
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MenuFindMeActivity extends Fragment implements OnMapReadyCallback{
    View v;

    public MenuFindMeActivity() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_menu_find_me, container, false);

        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        return v;
    }
    public void onMapReady(GoogleMap googleMap) {
        // Add a marker in Sydney, Australia,
        // and move the map's camera to the same location.
        LatLng myloc = new LatLng(-6.880995, 107.616140);
        googleMap.addMarker(new MarkerOptions().position(myloc)
                .title("My location"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(myloc, 20));
    }
}
