
package com.example.pasek;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Pasek");
        }

        BottomNavigationView bottomNavigation =
                findViewById(R.id.bottomNavigation);

        View layoutForm = findViewById(R.id.layoutForm);
        View layoutSettings = findViewById(R.id.layoutSettings);

        bottomNavigation.setOnItemSelectedListener(item -> {

            int id = item.getItemId();

            if (id == R.id.nav_form) {
                layoutForm.setVisibility(View.VISIBLE);
                layoutSettings.setVisibility(View.GONE);
                return true;

            } else if (id == R.id.nav_settings) {
                layoutForm.setVisibility(View.GONE);
                layoutSettings.setVisibility(View.VISIBLE);
                return true;
            }

            return false;
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.menu_settings) {
            BottomNavigationView bottomNavigation =
                    findViewById(R.id.bottomNavigation);
            bottomNavigation.setSelectedItemId(R.id.nav_settings);
            return true;

        } else if (id == R.id.menu_about) {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
            return true;

        } else if (id == R.id.menu_exit) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
