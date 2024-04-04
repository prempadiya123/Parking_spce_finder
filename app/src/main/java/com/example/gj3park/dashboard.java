package com.example.gj3park;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class dashboard extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    SearchFragment searchFragment = new SearchFragment();
    LocationFragment locationFragment = new LocationFragment();
    ProfileFragment profileFragment = new ProfileFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        getSupportFragmentManager().beginTransaction().replace(R.id.fream, homeFragment).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.home) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fream, homeFragment).commit();
                return true;
            } else if (itemId == R.id.search) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fream, searchFragment).commit();
                return true;
            } else if (itemId == R.id.location) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fream, locationFragment).commit();
                return true;
            } else if (itemId == R.id.profile) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fream, profileFragment).commit();
                return true;
            }

            return false;
        });
    }
}
