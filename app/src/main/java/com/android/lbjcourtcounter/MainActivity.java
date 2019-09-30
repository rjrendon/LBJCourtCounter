package com.android.lbjcourtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int pointsA = 0;
    int pointsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * For Team A
     * this methods is called when 3points, 2points and 1point for team  button is clicked.
     */

    public void threePointsa(View view) {
        pointsA = pointsA + 3;
        displayA(pointsA);
    }


    public void twoPointsa(View view) {
        pointsA = pointsA + 2;
        displayA(pointsA);
    }

    public void onePointa(View view) {
        pointsA = pointsA + 1;
        displayA(pointsA);
    }


    /**
     * For Team B
     * this methods is called when 3points, 2points and 1point for team  button is clicked.
     */

    public void threePointsb(View view) {
        pointsB = pointsB + 3;
        displayB(pointsB);
    }


    public void twoPointsb(View view) {
        pointsB = pointsB + 2;
        displayB(pointsB);
    }

    public void onePointb(View view) {
        pointsB = pointsB + 1;
        displayB(pointsB);
    }

/**
 * this method reset the score to zero.
 */

public void resetButton(View view){
    int resetScore= 0;
    pointsA=resetScore*0;
    pointsB=resetScore*0;
    displayA(resetScore*0);
    displayB(resetScore*0);


}
    /**
     * this method is called For team A text view Points
     */
    private void displayA(int pointsforA) {
        TextView pointsForA = (TextView) findViewById(R.id.score_a);
        pointsForA.setText("" + pointsforA);
    }

    /**
     * This method is called For team B text view Points
     */
    private void displayB(int pointsforB) {
        TextView pointsForB = (TextView) findViewById(R.id.score_b);
        pointsForB.setText("" + pointsforB);
    }

}
