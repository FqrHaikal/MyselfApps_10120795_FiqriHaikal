package com.example.lilfiqri;

//Tanggal  : 25-05-2023
//NIM      : 10120795
//Nama     : FIQRI HAIKAL
//Kelas    : IF - 9

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class VPAdapter extends FragmentStateAdapter {

    private String[] title = new String[] {"page1","page2","page3"};

    public VPAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
       switch (position) {
           case 0:
                return new fragment1_viewPager();
           case 1:
               return new fragment2_viewPager();
           case 2:
               return new fragment3_viewPager();
       }
       return new fragment1_viewPager();
    }

    @Override
    public int getItemCount() {
        return title.length;
    }
}
