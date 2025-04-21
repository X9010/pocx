package com.example.zoopluspoc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView view = new TextView(this);
        view.setPadding(32, 64, 32, 64);
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data != null) {
            view.setText("PoC App Triggered via: " + data.toString());
        } else {
            view.setText("PoC App Launched (no link)");
        }
        setContentView(view);
    }
}