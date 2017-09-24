package com.example.dineshbalajivenkataraman.mymusicapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
public class HomeActivity extends AppCompatActivity {
    Toolbar mActionBarToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mActionBarToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar_home);
        mActionBarToolbar.setTitle("My Music App");
        setSupportActionBar(mActionBarToolbar);
        ImageView playImage = (ImageView) findViewById(R.id.playButton);
        playImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(getApplicationContext(), NowPlaying.class);
                startActivity(playIntent);
            }
        });
        ImageView playlist = (ImageView) findViewById(R.id.userPlaylist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistusr = new Intent(getApplicationContext(), UserPlaylistActivity.class);
                startActivity(playlistusr);
            }
        });
        ImageView buyInt = (ImageView) findViewById(R.id.cartBuy);
        buyInt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buyIntent = new Intent(getApplicationContext(), BuyActivity.class);
                startActivity(buyIntent);
            }
        });
        ImageView profile = (ImageView) findViewById(R.id.userProfile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent usrProfile = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(usrProfile);
            }
        });
    }
}
