package com.example.student.db012104;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.action_settings);
        menu.add(0, 1, 1, R.string.action_aabb);
        menu.add(0, 2, 2, R.string.action_about);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == 0)
        {
            Toast.makeText(MainActivity.this, "Settings被按下", Toast.LENGTH_SHORT).show();
        }

        if (item.getItemId() == 1)
        {
            Toast.makeText(MainActivity.this, "AABB被按下", Toast.LENGTH_SHORT).show();
        }

        if (item.getItemId() == 2)
        {
            Toast.makeText(MainActivity.this, "About被按下", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
