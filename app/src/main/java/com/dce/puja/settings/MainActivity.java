package com.dce.puja.settings;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onPause() {
        super.onPause();

        // to save the some data
    }

    @Override
    protected void onResume() {
        super.onResume();
        // u check any settings got changed if yest update....


        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);

        boolean bt = pref.getBoolean("btsett",false);

        TextView textView = (TextView) findViewById(R.id.usertextview);
        String status = bt?"on":"off";
        textView.setText("Bluetooth is "+status);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add("Settings").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent = new Intent(MainActivity.this, Settingactivity.class);
                startActivity(intent);
                return true;
            }
        });
        return true;
    }
}





