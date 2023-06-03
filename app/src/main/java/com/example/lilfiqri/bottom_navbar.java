package com.example.lilfiqri;

//Tanggal  : 25-05-2023
//NIM      : 10120795
//Nama     : FIQRI HAIKAL
//Kelas    : IF - 9

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lilfiqri.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class bottom_navbar extends AppCompatActivity {

    BottomNavigationView bot_nav;
    page_homeFragment page_homeFragment = new page_homeFragment();
    page_activityFragment page_activityFragment = new page_activityFragment();
    page_galleryFragment page_galleryFragment = new page_galleryFragment();
    page_favoriteFragment page_favoriteFragment = new page_favoriteFragment();
    page_aboutFragment page_aboutFragment = new page_aboutFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_navbar);

        bot_nav = findViewById(R.id.bot_nav);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, page_homeFragment).commit();

        bot_nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, page_homeFragment).commit();
                        return true;
                    case R.id.activity:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, page_activityFragment).commit();
                        return true;
                    case R.id.gallery:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, page_galleryFragment).commit();
                        return true;
                    case R.id.favorite:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, page_favoriteFragment).commit();
                        return true;
                    case R.id.about:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, page_aboutFragment).commit();
                        return true;
                }

                return false;
            }
        });
    }


}
