package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class TeamListActivity extends AppCompatActivity {

    TextView Nama;

    private RecyclerView rv;
    private ArrayList<TeamModel> teammodel = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);

        Nama = findViewById(R.id.TV3);

        String nama = getIntent().getStringExtra("nama");
        Nama.setText(nama);

        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        teammodel.addAll(TeamData.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        rv.setLayoutManager(new LinearLayoutManager(this));
        TeamAdapter teamadapter = new TeamAdapter(this);
        teamadapter.setTeamModel(teammodel);
        rv.setAdapter(teamadapter);


    }
}