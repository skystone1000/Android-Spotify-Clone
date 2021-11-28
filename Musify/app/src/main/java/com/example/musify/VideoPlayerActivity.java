package com.example.musify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        VideoView videoPlayer = findViewById(R.id.videoView);
        videoPlayer.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.birds);
        MediaController mediaController = new MediaController(this);
        videoPlayer.setMediaController(mediaController);
        mediaController.setAnchorView(videoPlayer);
        videoPlayer.start();
    }
}