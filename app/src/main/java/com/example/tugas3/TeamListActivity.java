package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class TeamListActivity extends AppCompatActivity {

    TextView Nama;
    Button Kembali;

    private RecyclerView recycle;
    private ArrayList<TeamModel> teamModel = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);

        Nama = findViewById(R.id.TV3);

        String nama = getIntent().getStringExtra("nama");
        Nama.setText(nama);

        recycle = findViewById(R.id.rv);
        recycle.setHasFixedSize(true);
        teamModel.addAll(TeamData.getListData());
        showRecycleList();

        Kembali = findViewById(R.id.B2);

        Kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kembali = new Intent (TeamListActivity.this,MainActivity.class);
                startActivity(kembali);
            }
        });
    }

    private void showRecycleList() {
        recycle.setLayoutManager(new LinearLayoutManager(this));
        TeamAdapter teamAdapter = new TeamAdapter(this);
        teamAdapter.setTeamModel(teamModel);
        recycle.setAdapter(teamAdapter);
    }


}