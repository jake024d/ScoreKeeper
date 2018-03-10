package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Global Variables
    int aTeamScore = 0;
    int aTeamPenalties = 0;

    int bTeamScore = 0;
    int bTeamPenalties = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//Team A Methods
    /**
     * Called when Team A's Touchdown(+6) button is clicked
     */
    public void touchdownTeamA (View view) {
        aTeamScore = aTeamScore + 6;
        displayForTeamA(aTeamScore);
    }

    /**
     * Called when Team A's Field Goal(+3) button is clicked
     */
    public void fieldGoalTeamA (View view) {
        aTeamScore = aTeamScore + 3;
        displayForTeamA(aTeamScore);
    }

    /**
     * Called when Team A's Safety(+2) button is clicked
     */
    public void safetyTeamA (View view) {
        aTeamScore = aTeamScore + 2;
        displayForTeamA(aTeamScore);
    }

    /**
     * Called when Team A's One Point (+1) button is clicked
     */
    public void singleTeamA (View view) {
        aTeamScore = aTeamScore + 1;
        displayForTeamA(aTeamScore);
    }

    /**
     * Displays score for Team A
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Called when Team A Penalty button is clicked
     */
    public void penaltyTeamA (View view) {
        aTeamPenalties = aTeamPenalties + 1;
        displayPenaltiesTeamA(aTeamPenalties);
    }


    /**
     * Displays Penalties for Team A
     */
    public void displayPenaltiesTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_penalties);
        scoreView.setText(String.valueOf(score));
    }

//Team B Methods
    /**
     * Called when Team B's Touchdown(+6) button is clicked
     */
    public void touchdownTeamB (View view) {
        bTeamScore = bTeamScore + 6;
        displayForTeamB(bTeamScore);
    }

    /**
     * Called when Team B's Field Goal(+3) button is clicked
     */
    public void fieldGoalTeamB (View view) {
        bTeamScore = bTeamScore + 3;
        displayForTeamB(bTeamScore);
    }

    /**
     * Called when Team B's Safety(+2) button is clicked
     */
    public void safetyTeamB (View view) {
        bTeamScore = bTeamScore + 2;
        displayForTeamB(bTeamScore);
    }

    /**
     * Called when Team A's One Point (+1) button is clicked
     */
    public void singleTeamB (View view) {
        bTeamScore = bTeamScore + 1;
        displayForTeamB(bTeamScore);
    }

    /**
     *
     * Displays score for Team B
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Called when Team B Penalty button is clicked
     */
    public void penaltyTeamB (View view) {
        bTeamPenalties = bTeamPenalties + 1;
        displayPenaltiesTeamB(bTeamPenalties);
    }


    /**
     * Displays Penalties for Team B
     */
    public void displayPenaltiesTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_penalties);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset Method
     */
    public void resetAll(View view) {
        aTeamScore = 0;
        aTeamPenalties = 0;
        bTeamScore = 0;
        bTeamPenalties = 0;
        displayForTeamA(aTeamScore);
        displayPenaltiesTeamA(aTeamPenalties);
        displayForTeamB(bTeamScore);
        displayPenaltiesTeamB(bTeamPenalties);
    }
}
