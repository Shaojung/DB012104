package com.example.student.db012104;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final int MENU_ID_SETTINGS = 1;
    final int MENU_ID_AABB = 2;
    final int MENU_ID_ABOUT = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, MENU_ID_SETTINGS, 0, R.string.action_settings);
        menu.add(0, MENU_ID_AABB, 1, R.string.action_aabb);
        menu.add(0, MENU_ID_ABOUT, 2, R.string.action_about);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == MENU_ID_SETTINGS)
        {
            Toast.makeText(MainActivity.this, "Settings被按下", Toast.LENGTH_SHORT).show();
        }

        if (item.getItemId() == MENU_ID_AABB)
        {
            Toast.makeText(MainActivity.this, "AABB被按下", Toast.LENGTH_SHORT).show();
        }

        if (item.getItemId() == MENU_ID_ABOUT)
        {
            Toast.makeText(MainActivity.this, "About被按下", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
