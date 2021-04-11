package com.example.tugas3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.viewHolder>{

    private Context context;
    private ArrayList<TeamModel> teamModel;

    public TeamAdapter(Context context) {
        this.context = context;
    }


    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<TeamModel> getTeamModel() {
        return teamModel;
    }

    public void setTeamModel(ArrayList<TeamModel> teamModel) {
        this.teamModel = teamModel;
    }


    @NonNull
    @Override
    public TeamAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.team_layout, viewGroup, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamAdapter.viewHolder holder, int i) {
        Glide.with(context).load(getTeamModel().get(i).getLogoTeam()).into(holder.ivlogo);
        holder.tvnama.setText(getTeamModel().get(i).getNamaTeam());
    }

    @Override
    public int getItemCount() {
        return getTeamModel().size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        private ImageView ivlogo;
        private TextView tvnama;
        public viewHolder (@NonNull View itemView){
            super(itemView);
            ivlogo = itemView.findViewById(R.id.IVLogo);
            tvnama = itemView.findViewById(R.id.TVNama);
        }
    }
}
