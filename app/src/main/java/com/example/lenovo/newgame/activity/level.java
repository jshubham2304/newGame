package com.example.lenovo.newgame.activity;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;

public class level extends AppCompatActivity {

    static int levels_f,moves_f,goal_f,result_f,number_f;
    char op;
    static level level_all(int levels, int moves, int goal, int result, String op, int number)
    {
        switch(op) {
            case "*":
                result = result * number;
                result_f = result;
                break;
            case "-":
                result = result - number;
                result_f = result;
                break;
            case "+":
                result = result + number;
                result_f = result;
                break;
            case "/":
                result = result / number;
                result_f = result;
                break;

            case "<<":
                result = result % 10;
                result_f = result;
                break;

            case "->":       
                result = convert1To2Rec( result );
                result_f = result;
                break;
            default:
        }
        --moves;
        moves_f = moves;
        return null;
    }

    private static int convert1To2Rec(int num) {
        // Base case
        if (num == 0)
            return 0;

        // Extraxt the last digit and change it if needed
        int digit = num % 10;
        if (digit == 1)
            digit = 2;

        return convert1To2Rec(num / 10) * 10 + digit;
    }
}
