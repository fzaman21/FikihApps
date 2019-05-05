package com.example.fikihapps;
//Tanggal Pengerjaan : 30 April 2019
//NIM  : 10116050
//Nama : Fikih Zaman
//Kelas: IF-2 AKB-2
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class ProfileActivity extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v  = inflater.inflate(R.layout.profile_activitybar, container, false);

        TabLayout tablayout = v.findViewById(R.id.tabLayout);
        ViewPager viewPager = v.findViewById(R.id.viewPager);

        setupViewPager(viewPager);
        tablayout.setupWithViewPager(viewPager);

        return v;
    }
    private void setupViewPager(ViewPager viewPager) {
        PagerAdapter viewPagerAdapter = new PagerAdapter(getChildFragmentManager());
        viewPagerAdapter.AddFragment(new MenuHomeActivity(), "Profil");
        viewPagerAdapter.AddFragment(new MenuContactActivity(), "Contact");
        viewPagerAdapter.AddFragment(new MenuFindMeActivity(), "Find Me");
        viewPagerAdapter.AddFragment(new MenuAboutActivity(), "About");

        viewPager.setAdapter(viewPagerAdapter);
    }
}
