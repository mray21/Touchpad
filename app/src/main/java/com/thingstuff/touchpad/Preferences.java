package com.thingstuff.touchpad;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

/**
 * Created by Ray on 5/25/2015.
 */
public class Preferences extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       addPreferencesFromResource(R.xml.preferences);
       PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
    }
}
