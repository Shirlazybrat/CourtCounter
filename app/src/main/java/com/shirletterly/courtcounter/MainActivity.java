package com.shirletterly.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;

//    increase the score by three
    public void addThreeForteamA(View v){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    //    increase the score by two
    public void addTwoForteamA(View v){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    //    increase the score by one
    public void addOneForteamA(View v){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }



    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
