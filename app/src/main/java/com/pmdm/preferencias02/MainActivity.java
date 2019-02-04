package com.pmdm.preferencias02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void editarPreferencias(View view) {
        startActivity(new Intent(this, MisPreferencias.class));
    }

    public void onResume() {
        super.onResume();
        String nickname;
        boolean gustan;

        TextView tv_nickname = (TextView) findViewById(R.id.textViewNombre);
        TextView tv_gustar = (TextView) findViewById(R.id.textViewGustar);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);

        nickname = prefs.getString("nickname", "<campo vacío>");
        gustan = prefs.getBoolean("gustanSuperheroes", true);

        tv_nickname.setText("Nickname: " + nickname);
        tv_gustar.setText("¿Te gustan los superheroes? " + new Boolean(gustan).toString());
    }
}
