package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TeamList extends AppCompatActivity {

    TextView Nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);

        Nama = findViewById(R.id.TV3);

        String nama = getIntent().getStringExtra("nama");
        Nama.setText(nama);
    }
}