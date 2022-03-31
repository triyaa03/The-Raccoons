package com.example.whatnumberamithinkingof;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Hard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);
    }

    public void HardClicked(View v) {
        EditText input = (EditText) findViewById(R.id.inputBox2);
        String inputA = input.getText().toString();

        double i = HardModel.toDoubleHard(inputA);
        double answerA = HardModel.answerHard(i);
        String responseA = HardModel.formatAnswerHard(answerA);
        ((TextView) findViewById(R.id.answer2)).setText(responseA);
    }


}
