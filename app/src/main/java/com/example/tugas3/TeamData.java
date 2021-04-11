package com.example.tugas3;

import java.util.ArrayList;

public class TeamData {
    private static String[] title = new String[]{
            "Mercedes", "Red Bull", "Mclaren", "Ferrari", "Alpha Tauri", "Aston Martin", "Alfa Romeo", "Alpine", "Williams", "Haas"
    };
    private static int[] thumbnail = new int[] {
            R.drawable.mercedes, R.drawable.redbull, R.drawable.mclaren, R.drawable.ferrari, R.drawable.alphatauri,
            R.drawable.astonmartin, R.drawable.alfaromeo, R.drawable.alpine, R.drawable.williams, R.drawable.haas
    };

    public static ArrayList<TeamModel> getListData(){
        TeamModel teamModel = null;

        ArrayList<TeamModel> list = new ArrayList<>();

        for (int i = 0; i<title.length; i++){
            teamModel = new TeamModel();
            teamModel.setLogoTeam(thumbnail[i]);
            teamModel.setNamaTeam(title[i]);
            list.add(teamModel);
        }
        return list;
    };
}
