package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.courtcounter.R.id.team_a_1pt_stat;
import static com.example.android.courtcounter.R.id.team_a_2pt_stat;
import static com.example.android.courtcounter.R.id.team_a_3pt_stat;
import static com.example.android.courtcounter.R.id.team_b_1pt_stat;
import static com.example.android.courtcounter.R.id.team_b_2pt_stat;
import static com.example.android.courtcounter.R.id.team_b_3pt_stat;

public class MainActivity extends AppCompatActivity {


    /**
     * Instantiation of the variables used.
     */
    int scoreTeamA;
    int made3ptShotsTeamA = 0;
    int all3ptShotsTeamA = 0;
    int made2ptShotsTeamA = 0;
    int all2ptShotsTeamA = 0;
    int made1ptShotsTeamA = 0;
    int all1ptShotsTeamA = 0;
    int scoreTeamB = 0;
    int made3ptShotsTeamB = 0;
    int all3ptShotsTeamB = 0;
    int made2ptShotsTeamB = 0;
    int all2ptShotsTeamB = 0;
    int made1ptShotsTeamB = 0;
    int all1ptShotsTeamB = 0;

    /**
     * Instantiation of views used.
     */
    TextView scoreViewA;
    TextView statViewA1pt;
    TextView statViewA2pt;
    TextView statViewA3pt;
    TextView scoreViewB;
    TextView statViewB1pt;
    TextView statViewB2pt;
    TextView statViewB3pt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreViewA = (TextView) findViewById(R.id.team_a_score);
        statViewA1pt = (TextView) findViewById(team_a_1pt_stat);
        statViewA2pt = (TextView) findViewById(team_a_2pt_stat);
        statViewA3pt = (TextView) findViewById(team_a_3pt_stat);
        scoreViewB = (TextView) findViewById(R.id.team_b_score);
        statViewB1pt = (TextView) findViewById(team_b_1pt_stat);
        statViewB2pt = (TextView) findViewById(team_b_2pt_stat);
        statViewB3pt = (TextView) findViewById(team_b_3pt_stat);
    }

    /**
     * Below are methods that increase score and number of accurate shots made for team A.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        all1ptShotsTeamA = all1ptShotsTeamA + 1;
        made1ptShotsTeamA = made1ptShotsTeamA + 1;
        displayForTeamA(scoreTeamA);
        display1ptStatForTeamA(Math.round(made1ptShotsTeamA * 100 / all1ptShotsTeamA));
    }

    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        all2ptShotsTeamA = all2ptShotsTeamA + 1;
        made2ptShotsTeamA = made2ptShotsTeamA + 1;
        displayForTeamA(scoreTeamA);
        display2ptStatForTeamA(Math.round(made2ptShotsTeamA * 100 / all2ptShotsTeamA));
    }

    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        all3ptShotsTeamA = all3ptShotsTeamA + 1;
        made3ptShotsTeamA = made3ptShotsTeamA + 1;
        displayForTeamA(scoreTeamA);
        display3ptStatForTeamA(Math.round(made3ptShotsTeamA * 100 / all3ptShotsTeamA));
    }

    /**
     * Below are methods that increase number of shot attempts for team A;
     * while number accurate shots remains unchanged.
     */
    public void attemptOneForTeamA(View v) {
        all1ptShotsTeamA = all1ptShotsTeamA + 1;
        display1ptStatForTeamA(Math.round(made1ptShotsTeamA * 100 / all1ptShotsTeamA));
    }

    public void attemptTwoForTeamA(View v) {
        all2ptShotsTeamA = all2ptShotsTeamA + 1;
        display2ptStatForTeamA(Math.round(made2ptShotsTeamA * 100 / all2ptShotsTeamA));
    }

    public void attemptThreeForTeamA(View v) {
        all3ptShotsTeamA = all3ptShotsTeamA + 1;
        display3ptStatForTeamA(Math.round(made3ptShotsTeamA * 100 / all3ptShotsTeamA));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        scoreViewA.setText(String.valueOf(score));
    }

    /**
     * Below are methods that display additional statistics for Team A.
     * Statistics = accuracy of shots in %.
     */
    public void display1ptStatForTeamA(int score) {
        statViewA1pt.setText(String.valueOf(score) + "%");
    }

    public void display2ptStatForTeamA(int score) {
        statViewA2pt.setText(String.valueOf(score) + "%");
    }

    public void display3ptStatForTeamA(int score) {
        statViewA3pt.setText(String.valueOf(score) + "%");
    }

    /**
     * Below are methods that increase score and number of accurate shots made for team B.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        all1ptShotsTeamB = all1ptShotsTeamB + 1;
        made1ptShotsTeamB = made1ptShotsTeamB + 1;
        displayForTeamB(scoreTeamB);
        display1ptStatForTeamB(Math.round(made1ptShotsTeamB * 100 / all1ptShotsTeamB));
    }

    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        all2ptShotsTeamB = all2ptShotsTeamB + 1;
        made2ptShotsTeamB = made2ptShotsTeamB + 1;
        displayForTeamB(scoreTeamB);
        display2ptStatForTeamB(Math.round(made2ptShotsTeamB * 100 / all2ptShotsTeamB));
    }

    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        all3ptShotsTeamB = all3ptShotsTeamB + 1;
        made3ptShotsTeamB = made3ptShotsTeamB + 1;
        displayForTeamB(scoreTeamB);
        display3ptStatForTeamB(Math.round(made3ptShotsTeamB * 100 / all3ptShotsTeamB));
    }

    /**
     * Below are methods that increase number of shot attempts for team B;
     * while number accurate shots remains unchanged.
     */
    public void attemptOneForTeamB(View v) {
        all1ptShotsTeamB = all1ptShotsTeamB + 1;
        display1ptStatForTeamB(Math.round(made1ptShotsTeamB * 100 / all1ptShotsTeamB));
    }

    public void attemptTwoForTeamB(View v) {
        all2ptShotsTeamB = all2ptShotsTeamB + 1;
        display2ptStatForTeamB(Math.round(Math.round(made2ptShotsTeamB * 100 / all2ptShotsTeamB)));
    }

    public void attemptThreeForTeamB(View v) {
        all3ptShotsTeamB = all3ptShotsTeamB + 1;
        display3ptStatForTeamB(Math.round(made3ptShotsTeamB * 100 / all3ptShotsTeamB));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        scoreViewB.setText(String.valueOf(score));
    }

    /**
     * Below are methods that display additional statistics for Team B.
     * Statistics = accuracy of shots in %.
     */
    public void display1ptStatForTeamB(int score) {
        statViewB1pt.setText(String.valueOf(score) + "%");
    }

    public void display2ptStatForTeamB(int score) {
        statViewB2pt.setText(String.valueOf(score) + "%");
    }

    public void display3ptStatForTeamB(int score) {
        statViewB3pt.setText(String.valueOf(score) + "%");
    }

    /**
     * Below are methods that display more detailed statistics of both teams.
     * Statistics = number of accurate shots made vs total number of attempts.
     */
    public void moreStat(View v) {
        displayMoreStatForA1(made1ptShotsTeamA + "/" + all1ptShotsTeamA);
        displayMoreStatForA2(made2ptShotsTeamA + "/" + all2ptShotsTeamA);
        displayMoreStatForA3(made3ptShotsTeamA + "/" + all3ptShotsTeamA);
        displayMoreStatForB1(made1ptShotsTeamB + "/" + all1ptShotsTeamB);
        displayMoreStatForB2(made2ptShotsTeamB + "/" + all2ptShotsTeamB);
        displayMoreStatForB3(made3ptShotsTeamB + "/" + all3ptShotsTeamB);
    }

    public void displayMoreStatForA1(String a1) {
        statViewA1pt.setText(String.valueOf(a1));
    }

    public void displayMoreStatForA2(String a2) {
        statViewA2pt.setText(String.valueOf(a2));
    }

    public void displayMoreStatForA3(String a3) {
        statViewA3pt.setText(String.valueOf(a3));
    }

    public void displayMoreStatForB1(String b1) {
        statViewB1pt.setText(String.valueOf(b1));
    }

    public void displayMoreStatForB2(String b2) {
        statViewB2pt.setText(String.valueOf(b2));
    }

    public void displayMoreStatForB3(String b3) {
        statViewB3pt.setText(String.valueOf(b3));
    }

    /**
     * Resets all scores and statistics of both teams.
     */
    public void resetScores(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        made3ptShotsTeamA = 0;
        all3ptShotsTeamA = 0;
        made2ptShotsTeamA = 0;
        all2ptShotsTeamA = 0;
        made1ptShotsTeamA = 0;
        all1ptShotsTeamA = 0;
        made3ptShotsTeamB = 0;
        all3ptShotsTeamB = 0;
        made2ptShotsTeamB = 0;
        all2ptShotsTeamB = 0;
        made1ptShotsTeamB = 0;
        all1ptShotsTeamB = 0;
        display3ptStatForTeamA(0);
        display2ptStatForTeamA(0);
        display1ptStatForTeamA(0);
        display3ptStatForTeamB(0);
        display2ptStatForTeamB(0);
        display1ptStatForTeamB(0);
    }

    /**
     * Saves all variables in order to recreate them after screen rotation.
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreTeamA", scoreTeamA);
        outState.putInt("made3ptShotsTeamA", made3ptShotsTeamA);
        outState.putInt("all3ptShotsTeamA", all3ptShotsTeamA);
        outState.putInt("made2ptShotsTeamA", made2ptShotsTeamA);
        outState.putInt("all2ptShotsTeamA", all2ptShotsTeamA);
        outState.putInt("made1ptShotsTeamA", made1ptShotsTeamA);
        outState.putInt("all1ptShotsTeamA", all1ptShotsTeamA);
        outState.putInt("scoreTeamB", scoreTeamB);
        outState.putInt("made3ptShotsTeamB", made3ptShotsTeamB);
        outState.putInt("all3ptShotsTeamB", all3ptShotsTeamB);
        outState.putInt("made2ptShotsTeamB", made2ptShotsTeamB);
        outState.putInt("all2ptShotsTeamB", all2ptShotsTeamB);
        outState.putInt("made1ptShotsTeamB", made1ptShotsTeamB);
        outState.putInt("all1ptShotsTeamB", all1ptShotsTeamB);
    }

    /**
     * Recreates variables after screen rotation.
     */
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt("scoreTeamA");
            made3ptShotsTeamA = savedInstanceState.getInt("made3ptShotsTeamA");
            all3ptShotsTeamA = savedInstanceState.getInt("all3ptShotsTeamA");
            made2ptShotsTeamA = savedInstanceState.getInt("made2ptShotsTeamA");
            all2ptShotsTeamA = savedInstanceState.getInt("all2ptShotsTeamA");
            made1ptShotsTeamA = savedInstanceState.getInt("made1ptShotsTeamA");
            all1ptShotsTeamA = savedInstanceState.getInt("all1ptShotsTeamA");
            scoreTeamB = savedInstanceState.getInt("scoreTeamB");
            made3ptShotsTeamB = savedInstanceState.getInt("made3ptShotsTeamB");
            all3ptShotsTeamB = savedInstanceState.getInt("all3ptShotsTeamB");
            made2ptShotsTeamB = savedInstanceState.getInt("made2ptShotsTeamB");
            all2ptShotsTeamB = savedInstanceState.getInt("all2ptShotsTeamB");
            made1ptShotsTeamB = savedInstanceState.getInt("made1ptShotsTeamB");
            all1ptShotsTeamB = savedInstanceState.getInt("all1ptShotsTeamB");
        }
    }
}

