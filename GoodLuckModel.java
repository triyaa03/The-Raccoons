package com.example.whatnumberamithinkingof;

public class GoodLuckModel {
    public static double toDoubleGoodLuck(String s) {

        return Double.parseDouble(s);
    }

    public static double answerGoodLuck(double guess) {
        int tries = 5;
        int i;
        int number = 1 + (int)(100 * Math.random());
        String answer = "";

        for (i = 0; i < tries; i++) {
            if (guess == number) {
                answer = "Congratulations! You guessed the number.";
            }
            else if (number > guess) {
                answer = "The number is greater than " + guess;
            }
            else if (number < guess) {
                answer = "The number is less than " + guess;
            }
        }

        if (i == tries) {
            answer = "You have exhausted " + tries + " trials. The number was " + number;
        }
        double response = Double.parseDouble(answer);
        return response;
    }

    public static String formatAnswerGoodLuck(double answer) {
        return String.valueOf(answer);

    }
}
