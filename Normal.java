package com.example.whatnumberamithinkingof;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Normal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
    }

    public void NormalClicked(View v) {
        EditText input = (EditText) findViewById(R.id.inputBox);
        String inputA = input.getText().toString();

        double i = NormalModel.toDoubleNormal(inputA);
        double answerA = NormalModel.answerNormal(i);
        String responseA = NormalModel.formatAnswerNormal(answerA);
        ((TextView) findViewById(R.id.answer)).setText(responseA);
    }



}
