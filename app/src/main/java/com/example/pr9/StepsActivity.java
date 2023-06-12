package com.example.pr9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.net.URLEncoder;

public class StepsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps);
    }
    public void startNewActivity(View v) {
        Uri uri = Uri.parse("https://developer.android.com");
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}