package com.example.administrator.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreHOU = 0;

    int scoreGSW = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForHOU(View v) {
        scoreHOU = scoreHOU + 3;
        displayForHOU(scoreHOU);
    }

    public void addTwoForHOU(View v) {
        scoreHOU = scoreHOU + 2;
        displayForHOU(scoreHOU);
    }

    public void addOneForHOU(View v) {
        scoreHOU = scoreHOU + 1;
        displayForHOU(scoreHOU);
    }

    public void addThreeForGSW(View v) {
        scoreGSW = scoreGSW + 3;
        displayForGSW(scoreGSW);
    }

    public void addTwoForGSW(View v) {
        scoreGSW = scoreGSW + 2;
        displayForGSW(scoreGSW);
    }

    public void addOneForGSW(View v) {
        scoreGSW = scoreGSW + 1;
        displayForGSW(scoreGSW);
    }

    public void resetScore(View v) {
        scoreHOU = 0;
        scoreGSW = 0;
        displayForHOU(scoreHOU);
        displayForGSW(scoreGSW);
    }

    /**
     * Displays the given score for HOU.
     */
    public void displayForHOU(int score) {
        TextView scoreView = (TextView) findViewById(R.id.hou_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for GSW.
     */
    public void displayForGSW(int score) {
        TextView scoreView = (TextView) findViewById(R.id.gsw_score);
        scoreView.setText(String.valueOf(score));
    }
}