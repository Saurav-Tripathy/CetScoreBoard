package com.example.android.cetscoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class UpdateScoreActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Bundle b = getIntent().getExtras();
        String name = b.getString("abc");

        Bundle bb = getIntent().getExtras();
        String nm = b.getString("efg");


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_score);

        TextView text = (TextView) findViewById(R.id.team1_text);
        text.setText(name);
        TextView text1 = (TextView) findViewById(R.id.team2_text);
        text1.setText(nm);



        displayForTeamA(0);
    }


    public void addThreeForTeamA(View v){
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View v){
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View v){
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamB(View v){
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View v){
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View v){
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View v){



        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}
