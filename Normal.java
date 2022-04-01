package com.example.whatnumberamithinkingof;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Normal extends AppCompatActivity {
    Button playAgainButt;
    NormalModel A = new NormalModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        playAgainButt = findViewById(R.id.playA);

    }
    public void NormalClicked(View v) {
        EditText input = (EditText) findViewById(R.id.inputBox);
        String inputA = input.getText().toString();

        int userGuess = Integer.parseInt(inputA);
        A.answerNormal(userGuess);
        ((TextView) findViewById(R.id.answer)).setText(A.getMsg());
        if(A.isGameOver() == true){
            playAgainButt.setVisibility(View.VISIBLE);
        }

        }
    public void playAgainClicked(View v) {
        A = new NormalModel();
        ((TextView) findViewById(R.id.answer)).setText("New Game");
        playAgainButt.setVisibility(View.INVISIBLE);
    }

}




