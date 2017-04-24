package com.dce.puja.settings;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.widget.Toast;


/**
 * Created by Devendra on 4/24/2017.
 */

public class Settingactivity extends   PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferanc);

        EditTextPreference edit = (EditTextPreference) findPreference("password");
        edit.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                String n = (String) newValue;
                if(n.length() < 3){
                    Toast.makeText(Settingactivity.this, "more than 3", Toast.LENGTH_LONG).show();
                    return false;

                }
                return true;

            }
        });

    }



}


