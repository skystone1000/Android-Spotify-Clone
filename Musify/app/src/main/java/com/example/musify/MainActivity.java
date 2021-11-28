package com.example.musify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToAudioPlayer(View view){
        // Creating a Toast
        Context context = getApplicationContext();
        CharSequence text = "Audio Player starting!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        // Building an Intent
        Intent intent = new Intent(this, AudioPlayerActivity.class);
        startActivity(intent);
    }

    public void goToVideoPlayer(View view){
        // Creating a Toast
        Context context = getApplicationContext();
        CharSequence text = "Video Player starting!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        // Building an Intent
        Intent intent = new Intent(this, VideoPlayerActivity.class);
        startActivity(intent);
    }

}