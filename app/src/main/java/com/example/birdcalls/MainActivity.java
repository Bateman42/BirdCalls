package com.example.birdcalls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5;
    MediaPlayer mpsound1, mpsound2, mpsound3, mpsound4;
    int currentlyPlaying;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.btn_amplay);
        button2 = (Button) findViewById(R.id.btn_bsplay);
        button3 = (Button) findViewById(R.id.btn_hairywplay);
        button4 = (Button) findViewById(R.id.btn_housewrenplay);
        button5 = (Button) findViewById(R.id.btn_credits);


        mpsound1 = new MediaPlayer();
        mpsound1 = MediaPlayer.create(this, R.raw.npsamericanrobin);
        mpsound1.setLooping(true);

        mpsound2 = new MediaPlayer();
        mpsound2 = MediaPlayer.create(this, R.raw.npsbarnswallow);
        mpsound2.setLooping(true);

        mpsound3 = new MediaPlayer();
        mpsound3 = MediaPlayer.create(this, R.raw.npshairywoodpecker);
        mpsound3.setLooping(true);

        mpsound4 = new MediaPlayer();
        mpsound4 = MediaPlayer.create(this, R.raw.npshousewren);
        mpsound4.setLooping(true);

        currentlyPlaying = 0;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentlyPlaying == 0) {
                    currentlyPlaying = 1;
                    button1.setText("Stop");
                    mpsound1.start ();
                    button2.setVisibility (View.INVISIBLE);
                    button3.setVisibility (View.INVISIBLE);
                    button4.setVisibility (View.INVISIBLE);
                }
                else {
                    currentlyPlaying = 0;
                    mpsound1.pause();
                    button1.setText("Play");
                    button2.setVisibility (View.VISIBLE);
                    button3.setVisibility (View.VISIBLE);
                    button4.setVisibility (View.VISIBLE);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentlyPlaying == 0) {
                    currentlyPlaying = 1;
                    button2.setText("Stop");
                    mpsound2.start();
                    button1.setVisibility(View.INVISIBLE);
                    button3.setVisibility(View.INVISIBLE);
                    button4.setVisibility(View.INVISIBLE);
                }
                else {
                    currentlyPlaying = 0;
                    button2.setText("Play");
                    mpsound2.pause();
                    button1.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);
                    button4.setVisibility(View.VISIBLE);

                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentlyPlaying == 0) {
                    currentlyPlaying = 1;
                    button3.setText("Stop");
                    mpsound3.start();
                    button1.setVisibility(View.INVISIBLE);
                    button2.setVisibility(View.INVISIBLE);
                    button4.setVisibility(View.INVISIBLE);
                } else {
                    currentlyPlaying = 0;
                    button3.setText("Play");
                    mpsound3.pause();
                    button1.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                    button4.setVisibility(View.VISIBLE);
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentlyPlaying == 0) {
                    currentlyPlaying = 1;
                    button4.setText("Stop");
                    mpsound4.start();
                    button1.setVisibility(View.INVISIBLE);
                    button2.setVisibility(View.INVISIBLE);
                    button3.setVisibility(View.INVISIBLE);
                } else {
                    currentlyPlaying = 0;
                    button4.setText("Play");
                    mpsound4.pause();
                    button1.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CreditsActivity.class));
            }
        });
    }
}