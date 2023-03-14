package com.example.firstproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculator calculator = new Calculator();
        TriangleSquare triangleSquare = new TriangleSquare();
        DepositCalculator depositCalculator = new DepositCalculator();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.calculator){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment, calculator).commit();
                }
                else if (item.getItemId() == R.id.squareCalculator){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment, triangleSquare).commit();
                }
                else if (item.getItemId() == R.id.depositCalculator){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment, depositCalculator).commit();
                }

                return true;
            }
        });
    }
}