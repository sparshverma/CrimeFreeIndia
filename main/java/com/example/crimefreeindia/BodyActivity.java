package com.example.crimefreeindia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BodyActivity extends AppCompatActivity {
    private Button info;
    private Button news;
    private Button malware;
    private Button geofencing;
    private Button fir;
    private Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body);


        info = findViewById(R.id.btn_info);
        malware = findViewById(R.id.btn_malware);
        news = findViewById(R.id.btn_news);
        geofencing = findViewById(R.id.btn_geofencing);
        fir = findViewById(R.id.btn_fir);
        about = findViewById(R.id.btn_about);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewsActivity();
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfoActivity();
            }
        });
        malware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMalwareActivity();
            }
        });

    }

    private void openMalwareActivity() {
        Intent intent = new Intent(this, MalwareActivity.class);
        startActivity(intent);
    }

    private void openNewsActivity() {
        Intent intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
    }

    private void openInfoActivity() {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
        }
}