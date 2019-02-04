package com.pmdm.preferencias02;

import android.os.Bundle;
import android.preference.PreferenceActivity;


public class MisPreferencias extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_mis_preferencias);

        addPreferencesFromResource(R.xml.preferencias);
    }

}
