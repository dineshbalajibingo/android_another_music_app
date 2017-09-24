package com.example.dineshbalajivenkataraman.mymusicapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
public class NowPlaying extends AppCompatActivity {
    Toolbar mActionBarToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        mActionBarToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar_mymusic);
        mActionBarToolbar.setTitle("Now Playing");
        setSupportActionBar(mActionBarToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        Button buy_act = (Button)findViewById(R.id.buy_song);
        buy_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(getApplicationContext(), BuyActivity.class);
                startActivity(playIntent);
            }
        });
        Button user_profile = (Button)findViewById(R.id.edit_user_profile);
        user_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent usrProfile = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(usrProfile);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
