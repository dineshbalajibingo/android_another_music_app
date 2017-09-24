package com.example.dineshbalajivenkataraman.mymusicapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
public class ProfileActivity extends AppCompatActivity {
    Toolbar mActionBarToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        mActionBarToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar_profile);
        mActionBarToolbar.setTitle("My Profile");
        setSupportActionBar(mActionBarToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button now_playing = (Button)findViewById(R.id.now_playing);
        now_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(getApplicationContext(), NowPlaying.class);
                startActivity(playIntent);
            }
        });
        Button view_playlist = (Button)findViewById(R.id.view_my_playlist);
        view_playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistusr = new Intent(getApplicationContext(), UserPlaylistActivity.class);
                startActivity(playlistusr);
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
