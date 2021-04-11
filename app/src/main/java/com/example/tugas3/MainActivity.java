package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton Logo;
    Button Submit;
    EditText InputNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logo = findViewById(R.id.IB1);
        Submit = findViewById(R.id.B1);
        InputNama = findViewById(R.id.ET1);

        Logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent website = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.formula1.com/"));
                startActivity(website);
            }
        });

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nama = new Intent(MainActivity.this, TeamListActivity.class);
                nama.putExtra("nama",InputNama.getText().toString());
                startActivity(nama);
            }
        });
    }
}