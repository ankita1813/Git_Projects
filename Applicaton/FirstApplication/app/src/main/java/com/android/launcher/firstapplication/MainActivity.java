package com.android.launcher.firstapplication;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import android.view.View;

import android.widget.TextView;


public class MainActivity extends Activity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                player.start();

                goToSecondActivity();

            }

        });
    }

    private void goToSecondActivity() {



        Intent intent = new Intent(this, SecondActivity.class);

        startActivity(intent);

    }
}
