package com.example.whatnumberamithinkingof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    //private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =  findViewById(R.id.normal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNormal();
            }
        });

        button =  findViewById(R.id.hard);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHard();
            }
        });

        button =  findViewById(R.id.goodluck);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoodLuck();
            }
        });

        button =  findViewById(R.id.scores);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScores();
            }
        });

        }

        public void openNormal() {
            Intent intent = new Intent(this, Normal.class);
            startActivity(intent);

        }

        public void openHard() {
            Intent intent = new Intent(this, Hard.class);
            startActivity(intent);

        }

        public void openGoodLuck() {
            Intent intent = new Intent(this, GoodLuck.class);
            startActivity(intent);

        }

        public void openScores() {
            Intent intent = new Intent(this, Scores.class);
            startActivity(intent);

        }
    }
