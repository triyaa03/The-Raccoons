package com.example.whatnumberamithinkingof;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GoodLuck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_luck);
    }

    public void GoodLuckClicked(View v) {
        EditText input = (EditText) findViewById(R.id.inputBox3);
        String inputA = input.getText().toString();

        double i = GoodLuckModel.toDoubleGoodLuck(inputA);
        double answerA = GoodLuckModel.answerGoodLuck(i);
        String responseA = GoodLuckModel.formatAnswerGoodLuck(answerA);
        ((TextView) findViewById(R.id.answer3)).setText(responseA);
    }
}
