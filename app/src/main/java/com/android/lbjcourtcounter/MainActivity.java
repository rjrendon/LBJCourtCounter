package com.android.lbjcourtcounter;

import static android.app.PendingIntent.getActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
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

    public void threePointsA(View view) {
        pointsA = pointsA + 3;
        displayA(pointsA);
    }


    public void twoPointsA(View view) {
        pointsA = pointsA + 2;
        displayA(pointsA);
    }

    public void onePointA(View view) {
        pointsA = pointsA + 1;
        displayA(pointsA);
    }

    public void minOnePointA(View view) {
        pointsA--;
        if (pointsA < 0) {
            pointsA = 0;
        }
        displayA(pointsA);

    }

    /**
     * For Team B
     * this methods is called when 3points, 2points and 1point for team  button is clicked.
     */

    public void threePointsB(View view) {
        pointsB = pointsB + 3;
        displayB(pointsB);
    }


    public void twoPointsB(View view) {
        pointsB = pointsB + 2;
        displayB(pointsB);
    }

    public void onePointB(View view) {
        pointsB = pointsB + 1;
        displayB(pointsB);
    }

    public void minOnePointB(View view) {
        pointsB--;
        if (pointsB < 0) {
            pointsB = 0;
        }
        displayB(pointsB);

    }

    /**
     * this method reset the score to zero.
     */


    public void resetButton(View view) {


        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Confirm");
        builder.setMessage("Are you sure?");

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                pointsA = 0;
                pointsB = 0;
                displayA(pointsA);
                displayB(pointsB);
                dialog.dismiss();
            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
    }


    /**
     * this method is called For team A text view Points
     */
    private void displayA(int pointsForA) {
        TextView textPointsForA = findViewById(R.id.score_a);
        textPointsForA.setText("" + pointsForA);
    }

    /**
     * This method is called For team B text view Points
     */
    private void displayB(int pointsForB) {
        TextView textPointsForB = findViewById(R.id.score_b);
        textPointsForB.setText("" + pointsForB);
    }

}
