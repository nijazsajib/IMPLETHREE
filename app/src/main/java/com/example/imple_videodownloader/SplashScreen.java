package com.example.imple_videodownloader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;


public class SplashScreen extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash_screen);
            Toast.makeText(getApplicationContext(),"Welcome to IMPLE - Video Downloader", Toast.LENGTH_LONG).show();
            Thread myThread = new Thread(){
                @Override
                public void run() {
                    try{
                        sleep(2000);
                        Intent myInt = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(myInt);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            myThread.start();
        }
}
