package com.example.tony.crunchtime;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Spinner selection = (Spinner) findViewById(R.id.exerciseSelection);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.exercises_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        selection.setAdapter(adapter);

        final EditText w = (EditText) findViewById(R.id.weight);

        selection.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                TextView unit = (TextView) findViewById(R.id.unit);
                switch (pos) {
                    case 0:
                        unit.setText("Reps");
                        break;
                    case 1:
                        unit.setText("Reps");
                        break;
                    case 2:
                        unit.setText("Mins");
                        break;
                    case 3:
                        unit.setText("Mins");
                        break;
                    case 4:
                        unit.setText("Reps");
                        break;
                    case 5:
                        unit.setText("Mins");
                        break;
                    case 6:
                        unit.setText("Mins");
                        break;
                    case 7:
                        unit.setText("Reps");
                        break;
                    case 8:
                        unit.setText("Mins");
                        break;
                    case 9:
                        unit.setText("Mins");
                        break;
                    case 10:
                        unit.setText("Mins");
                        break;
                    case 11:
                        unit.setText("Mins");
                        break;
                }
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        Button calculate = (Button) findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float weight = 0, amountExercise = 0;
                String sweight = w.getText().toString();
                if (sweight.matches("")) {
                    w.setError("You need to enter a weight");
                    return;
                } else {
                    weight = Float.parseFloat(sweight);
                }
                EditText amount = (EditText) findViewById(R.id.amount);
                String typeExercise = selection.getSelectedItem().toString();
                String samount = amount.getText().toString();
                if (samount.matches("")) {
                    amount.setError("You need to enter the amount of exercises");
                    return;
                } else {
                    amountExercise = Float.parseFloat(amount.getText().toString());
                }
                float caloriesBurnt = 0;
                float pushup, situp, jj, jogging;
                TextView pushupAmount = (TextView) findViewById(R.id.pushupAmount);
                TextView situpAmount = (TextView) findViewById(R.id.situpAmount);
                TextView jjAmount = (TextView) findViewById(R.id.jjAmount);
                TextView joggingAmount = (TextView) findViewById(R.id.joggingAmount);
                float squats, legLift, plank, pullup, cycling, walking, swimming, stairClimbing;
                TextView squatsAmount = (TextView) findViewById(R.id.squatsAmount);
                TextView legliftAmount = (TextView) findViewById(R.id.legliftAmount);
                TextView plankAmount = (TextView) findViewById(R.id.plankAmount);
                TextView pullupAmount = (TextView) findViewById(R.id.pullupAmount);
                TextView cyclingAmount = (TextView) findViewById(R.id.cyclingAmount);
                TextView walkingAmount = (TextView) findViewById(R.id.walkingAmount);
                TextView swimAmount = (TextView) findViewById(R.id.swimAmount);
                TextView scAmount = (TextView) findViewById(R.id.scAmount);

                switch (typeExercise) {
                    case "Pushup":
                        caloriesBurnt = (amountExercise / 350 * 100) * (weight / 150);
                        pushupAmount.setText(amount.getText().toString());
                        situp = amountExercise / 350 * 200;
                        situpAmount.setText(Float.toString(situp));
                        jj = amountExercise / 350 * 10;
                        jjAmount.setText(Float.toString(jj));
                        jogging = amountExercise / 350 * 12;
                        joggingAmount.setText(Float.toString(jogging));
                        squats = amountExercise / 350 * 225;
                        squatsAmount.setText(Float.toString(squats));
                        legLift = amountExercise / 350 * 25;
                        legliftAmount.setText(Float.toString(legLift));
                        plank = amountExercise / 350 * 25;
                        plankAmount.setText(Float.toString(plank));
                        pullup = amountExercise / 350 * 100;
                        pullupAmount.setText(Float.toString(pullup));
                        cycling = amountExercise / 350 * 12;
                        cyclingAmount.setText(Float.toString(cycling));
                        walking = amountExercise / 350 * 20;
                        walkingAmount.setText(Float.toString(walking));
                        swimming = amountExercise / 350 * 13;
                        swimAmount.setText(Float.toString(swimming));
                        stairClimbing = amountExercise / 350 * 15;
                        scAmount.setText(Float.toString(stairClimbing));
                        break;
                    case "Situp":
                        caloriesBurnt = (amountExercise / 200 * 100) * (weight / 150);
                        situpAmount.setText(amount.getText().toString());
                        pushup = amountExercise / 200 * 350;
                        pushupAmount.setText(Float.toString(pushup));
                        jj = amountExercise / 200 * 10;
                        jjAmount.setText(Float.toString(jj));
                        jogging = amountExercise / 200 * 12;
                        joggingAmount.setText(Float.toString(jogging));
                        squats = amountExercise / 200 * 225;
                        squatsAmount.setText(Float.toString(squats));
                        legLift = amountExercise / 200 * 25;
                        legliftAmount.setText(Float.toString(legLift));
                        plank = amountExercise / 200 * 25;
                        plankAmount.setText(Float.toString(plank));
                        pullup = amountExercise / 200 * 100;
                        pullupAmount.setText(Float.toString(pullup));
                        cycling = amountExercise / 200 * 12;
                        cyclingAmount.setText(Float.toString(cycling));
                        walking = amountExercise / 200 * 20;
                        walkingAmount.setText(Float.toString(walking));
                        swimming = amountExercise / 200 * 13;
                        swimAmount.setText(Float.toString(swimming));
                        stairClimbing = amountExercise / 200 * 15;
                        scAmount.setText(Float.toString(stairClimbing));
                        break;
                    case "Jumping Jacks":
                        caloriesBurnt = (amountExercise / 10 * 100) * (weight / 150);
                        jjAmount.setText(amount.getText().toString());
                        situp = amountExercise / 10 * 200;
                        situpAmount.setText(Float.toString(situp));
                        pushup = amountExercise / 10 * 350;
                        pushupAmount.setText(Float.toString(pushup));
                        jogging = amountExercise / 10 * 12;
                        joggingAmount.setText(Float.toString(jogging));
                        squats = amountExercise / 10 * 225;
                        squatsAmount.setText(Float.toString(squats));
                        legLift = amountExercise / 10 * 25;
                        legliftAmount.setText(Float.toString(legLift));
                        plank = amountExercise / 10 * 25;
                        plankAmount.setText(Float.toString(plank));
                        pullup = amountExercise / 10 * 100;
                        pullupAmount.setText(Float.toString(pullup));
                        cycling = amountExercise / 10 * 12;
                        cyclingAmount.setText(Float.toString(cycling));
                        walking = amountExercise / 10 * 20;
                        walkingAmount.setText(Float.toString(walking));
                        swimming = amountExercise / 10 * 13;
                        swimAmount.setText(Float.toString(swimming));
                        stairClimbing = amountExercise / 10 * 15;
                        scAmount.setText(Float.toString(stairClimbing));
                        break;
                    case "Jogging":
                        caloriesBurnt = (amountExercise / 12 * 100) * (weight / 150);
                        joggingAmount.setText(amount.getText().toString());
                        situp = amountExercise / 12 * 200;
                        situpAmount.setText(Float.toString(situp));
                        pushup = amountExercise / 12 * 350;
                        pushupAmount.setText(Float.toString(pushup));
                        jj = amountExercise / 12 * 10;
                        jjAmount.setText(Float.toString(jj));
                        squats = amountExercise / 12 * 225;
                        squatsAmount.setText(Float.toString(squats));
                        legLift = amountExercise / 12 * 25;
                        legliftAmount.setText(Float.toString(legLift));
                        plank = amountExercise / 12 * 25;
                        plankAmount.setText(Float.toString(plank));
                        pullup = amountExercise / 12 * 100;
                        pullupAmount.setText(Float.toString(pullup));
                        cycling = amountExercise / 12 * 12;
                        cyclingAmount.setText(Float.toString(cycling));
                        walking = amountExercise / 12 * 20;
                        walkingAmount.setText(Float.toString(walking));
                        swimming = amountExercise / 12 * 13;
                        swimAmount.setText(Float.toString(swimming));
                        stairClimbing = amountExercise / 12 * 15;
                        scAmount.setText(Float.toString(stairClimbing));
                        break;
                    case "Squats":
                        caloriesBurnt = (amountExercise / 225 * 100) * (weight / 150);
                        squatsAmount.setText(amount.getText().toString());
                        situp = amountExercise / 225 * 200;
                        situpAmount.setText(Float.toString(situp));
                        pushup = amountExercise / 225 * 350;
                        pushupAmount.setText(Float.toString(pushup));
                        jj = amountExercise / 225 * 10;
                        jjAmount.setText(Float.toString(jj));
                        jogging = amountExercise / 225 * 12;
                        joggingAmount.setText(Float.toString(jogging));
                        legLift = amountExercise / 225 * 25;
                        legliftAmount.setText(Float.toString(legLift));
                        plank = amountExercise / 225 * 25;
                        plankAmount.setText(Float.toString(plank));
                        pullup = amountExercise / 225 * 100;
                        pullupAmount.setText(Float.toString(pullup));
                        cycling = amountExercise / 225 * 12;
                        cyclingAmount.setText(Float.toString(cycling));
                        walking = amountExercise / 225 * 20;
                        walkingAmount.setText(Float.toString(walking));
                        swimming = amountExercise / 225 * 13;
                        swimAmount.setText(Float.toString(swimming));
                        stairClimbing = amountExercise / 225 * 15;
                        scAmount.setText(Float.toString(stairClimbing));
                        break;
                    case "Leg-lift":
                        caloriesBurnt = (amountExercise / 25 * 100) * (weight / 150);
                        legliftAmount.setText(amount.getText().toString());
                        situp = amountExercise / 25 * 200;
                        situpAmount.setText(Float.toString(situp));
                        pushup = amountExercise / 25 * 350;
                        pushupAmount.setText(Float.toString(pushup));
                        jj = amountExercise / 25 * 10;
                        jjAmount.setText(Float.toString(jj));
                        squats = amountExercise / 25 * 225;
                        squatsAmount.setText(Float.toString(squats));
                        jogging = amountExercise / 25 * 12;
                        joggingAmount.setText(Float.toString(jogging));
                        plank = amountExercise / 25 * 25;
                        plankAmount.setText(Float.toString(plank));
                        pullup = amountExercise / 25 * 100;
                        pullupAmount.setText(Float.toString(pullup));
                        cycling = amountExercise / 25 * 12;
                        cyclingAmount.setText(Float.toString(cycling));
                        walking = amountExercise / 25 * 20;
                        walkingAmount.setText(Float.toString(walking));
                        swimming = amountExercise / 25 * 13;
                        swimAmount.setText(Float.toString(swimming));
                        stairClimbing = amountExercise / 25 * 15;
                        scAmount.setText(Float.toString(stairClimbing));
                        break;
                    case "Plank":
                        caloriesBurnt = (amountExercise / 25 * 100) * (weight / 150);
                        legliftAmount.setText(amount.getText().toString());
                        situp = amountExercise / 25 * 200;
                        situpAmount.setText(Float.toString(situp));
                        pushup = amountExercise / 25 * 350;
                        pushupAmount.setText(Float.toString(pushup));
                        jj = amountExercise / 25 * 10;
                        jjAmount.setText(Float.toString(jj));
                        squats = amountExercise / 25 * 225;
                        squatsAmount.setText(Float.toString(squats));
                        jogging = amountExercise / 25 * 12;
                        joggingAmount.setText(Float.toString(jogging));
                        plank = amountExercise / 25 * 25;
                        plankAmount.setText(Float.toString(plank));
                        pullup = amountExercise / 25 * 100;
                        pullupAmount.setText(Float.toString(pullup));
                        cycling = amountExercise / 25 * 12;
                        cyclingAmount.setText(Float.toString(cycling));
                        walking = amountExercise / 25 * 20;
                        walkingAmount.setText(Float.toString(walking));
                        swimming = amountExercise / 25 * 13;
                        swimAmount.setText(Float.toString(swimming));
                        stairClimbing = amountExercise / 25 * 15;
                        scAmount.setText(Float.toString(stairClimbing));
                        break;
                    case "Pullup":
                        caloriesBurnt = (amountExercise / 100 * 100) * (weight / 150);
                        pullupAmount.setText(amount.getText().toString());
                        situp = amountExercise / 100 * 200;
                        situpAmount.setText(Float.toString(situp));
                        pushup = amountExercise / 100 * 350;
                        pushupAmount.setText(Float.toString(pushup));
                        jj = amountExercise / 100 * 10;
                        jjAmount.setText(Float.toString(jj));
                        squats = amountExercise / 100 * 225;
                        squatsAmount.setText(Float.toString(squats));
                        jogging = amountExercise / 100 * 12;
                        joggingAmount.setText(Float.toString(jogging));
                        plank = amountExercise / 100 * 25;
                        plankAmount.setText(Float.toString(plank));
                        legLift = amountExercise / 100 * 25;
                        legliftAmount.setText(Float.toString(legLift));
                        cycling = amountExercise / 100 * 12;
                        cyclingAmount.setText(Float.toString(cycling));
                        walking = amountExercise / 100 * 20;
                        walkingAmount.setText(Float.toString(walking));
                        swimming = amountExercise / 100 * 13;
                        swimAmount.setText(Float.toString(swimming));
                        stairClimbing = amountExercise / 100 * 15;
                        scAmount.setText(Float.toString(stairClimbing));
                        break;
                    case "Cycling":
                        caloriesBurnt = (amountExercise / 12 * 100) * (weight / 150);
                        cyclingAmount.setText(amount.getText().toString());
                        situp = amountExercise / 12 * 200;
                        situpAmount.setText(Float.toString(situp));
                        pushup = amountExercise / 12 * 350;
                        pushupAmount.setText(Float.toString(pushup));
                        jj = amountExercise / 12 * 10;
                        jjAmount.setText(Float.toString(jj));
                        squats = amountExercise / 12 * 225;
                        squatsAmount.setText(Float.toString(squats));
                        jogging = amountExercise / 12 * 12;
                        joggingAmount.setText(Float.toString(jogging));
                        plank = amountExercise / 12 * 25;
                        plankAmount.setText(Float.toString(plank));
                        pullup = amountExercise / 12 * 100;
                        pullupAmount.setText(Float.toString(pullup));
                        legLift = amountExercise / 12 * 25;
                        legliftAmount.setText(Float.toString(legLift));
                        walking = amountExercise / 12 * 20;
                        walkingAmount.setText(Float.toString(walking));
                        swimming = amountExercise / 12 * 13;
                        swimAmount.setText(Float.toString(swimming));
                        stairClimbing = amountExercise / 12 * 15;
                        scAmount.setText(Float.toString(stairClimbing));
                        break;
                    case "Walking":
                        caloriesBurnt = (amountExercise / 20 * 100) * (weight / 150);
                        walkingAmount.setText(amount.getText().toString());
                        situp = amountExercise / 20 * 200;
                        situpAmount.setText(Float.toString(situp));
                        pushup = amountExercise / 20 * 350;
                        pushupAmount.setText(Float.toString(pushup));
                        jj = amountExercise / 20 * 10;
                        jjAmount.setText(Float.toString(jj));
                        squats = amountExercise / 20 * 225;
                        squatsAmount.setText(Float.toString(squats));
                        jogging = amountExercise / 20 * 12;
                        joggingAmount.setText(Float.toString(jogging));
                        plank = amountExercise / 20 * 25;
                        plankAmount.setText(Float.toString(plank));
                        pullup = amountExercise / 20 * 100;
                        pullupAmount.setText(Float.toString(pullup));
                        cycling = amountExercise / 20 * 12;
                        cyclingAmount.setText(Float.toString(cycling));
                        legLift = amountExercise / 20 * 25;
                        legliftAmount.setText(Float.toString(legLift));
                        swimming = amountExercise / 20 * 13;
                        swimAmount.setText(Float.toString(swimming));
                        stairClimbing = amountExercise / 20 * 15;
                        scAmount.setText(Float.toString(stairClimbing));
                        break;
                    case "Swimming":
                        caloriesBurnt = (amountExercise / 13 * 100) * (weight / 150);
                        swimAmount.setText(amount.getText().toString());
                        situp = amountExercise / 13 * 200;
                        situpAmount.setText(Float.toString(situp));
                        pushup = amountExercise / 13 * 350;
                        pushupAmount.setText(Float.toString(pushup));
                        jj = amountExercise / 13 * 10;
                        jjAmount.setText(Float.toString(jj));
                        squats = amountExercise / 13 * 225;
                        squatsAmount.setText(Float.toString(squats));
                        jogging = amountExercise / 13 * 12;
                        joggingAmount.setText(Float.toString(jogging));
                        plank = amountExercise / 13 * 25;
                        plankAmount.setText(Float.toString(plank));
                        pullup = amountExercise / 13 * 100;
                        pullupAmount.setText(Float.toString(pullup));
                        cycling = amountExercise / 13 * 12;
                        cyclingAmount.setText(Float.toString(cycling));
                        walking = amountExercise / 13 * 20;
                        walkingAmount.setText(Float.toString(walking));
                        legLift = amountExercise / 13 * 25;
                        legliftAmount.setText(Float.toString(legLift));
                        stairClimbing = amountExercise / 13 * 15;
                        scAmount.setText(Float.toString(stairClimbing));
                        break;
                    case "Stair-Climbing":
                        caloriesBurnt = (amountExercise / 15 * 100) * (weight / 150);
                        scAmount.setText(amount.getText().toString());
                        situp = amountExercise / 15 * 200;
                        situpAmount.setText(Float.toString(situp));
                        pushup = amountExercise / 15 * 350;
                        pushupAmount.setText(Float.toString(pushup));
                        jj = amountExercise / 15 * 10;
                        jjAmount.setText(Float.toString(jj));
                        squats = amountExercise / 15 * 225;
                        squatsAmount.setText(Float.toString(squats));
                        jogging = amountExercise / 15 * 12;
                        joggingAmount.setText(Float.toString(jogging));
                        plank = amountExercise / 15 * 25;
                        plankAmount.setText(Float.toString(plank));
                        pullup = amountExercise / 15 * 100;
                        pullupAmount.setText(Float.toString(pullup));
                        cycling = amountExercise / 15 * 12;
                        cyclingAmount.setText(Float.toString(cycling));
                        walking = amountExercise / 15 * 20;
                        walkingAmount.setText(Float.toString(walking));
                        swimming = amountExercise / 15 * 13;
                        swimAmount.setText(Float.toString(swimming));
                        legLift = amountExercise / 15 * 25;
                        legliftAmount.setText(Float.toString(legLift));
                        break;
                }
                EditText calories = (EditText) findViewById(R.id.calories);
                calories.setText(Float.toString(caloriesBurnt));
            }
        });

        Button update = (Button) findViewById(R.id.update);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float weight = 0, caloriesToBurn = 0;
                String sweight = w.getText().toString();
                if (sweight.matches("")) {
                    w.setError("You need to enter a weight");
                    return;
                } else {
                    weight = Float.parseFloat(sweight);
                }
                EditText calories = (EditText) findViewById(R.id.calories);
                String scalorie = calories.getText().toString();
                if (scalorie.matches("")) {
                    calories.setError("You need to enter calories to burn");
                    return;
                } else {
                    caloriesToBurn = Float.parseFloat(scalorie);
                }
                String typeExercise = selection.getSelectedItem().toString();
                float pushupAmount, situpAmount, squatsAmount, legliftAmount, plankAmount, jjAmount;
                float pullupAmount, cycleAmount, walkAmount, jogAmount, swimAmount, scAmount;
                EditText amount = (EditText) findViewById(R.id.amount);

                pushupAmount = (caloriesToBurn / 100 * 350) * (150 / weight);
                situpAmount = (caloriesToBurn / 100 * 200) * (150 / weight);
                jjAmount = (caloriesToBurn / 100 * 10) * (150 / weight);
                jogAmount = (caloriesToBurn / 100 * 12) * (150 / weight);
                squatsAmount = (caloriesToBurn / 100 * 225) * (150 / weight);
                legliftAmount = (caloriesToBurn / 100 * 25) * (150 / weight);
                plankAmount = (caloriesToBurn / 100 * 25) * (150 / weight);
                pullupAmount = (caloriesToBurn / 100 * 100) * (150 / weight);
                cycleAmount = (caloriesToBurn / 100 * 12) * (150 / weight);
                walkAmount = (caloriesToBurn / 100 * 20) * (150 / weight);
                swimAmount = (caloriesToBurn / 100 * 13) * (150 / weight);
                scAmount = (caloriesToBurn / 100 * 15) * (150 / weight);

                switch (typeExercise) {
                    case "Pushup":
                        amount.setText(Float.toString(pushupAmount));
                        break;
                    case "Situp":
                        amount.setText(Float.toString(situpAmount));
                        break;
                    case "Jumping Jacks":
                        amount.setText(Float.toString(jjAmount));
                        break;
                    case "Jogging":
                        amount.setText(Float.toString(jogAmount));
                        break;
                    case "Squats":
                        amount.setText(Float.toString(squatsAmount));
                        break;
                    case "Leg-lift":
                        amount.setText(Float.toString(legliftAmount));
                        break;
                    case "Plank":
                        amount.setText(Float.toString(plankAmount));
                        break;
                    case "Pullup":
                        amount.setText(Float.toString(pullupAmount));
                        break;
                    case "Cycling":
                        amount.setText(Float.toString(cycleAmount));
                        break;
                    case "Walking":
                        amount.setText(Float.toString(walkAmount));
                        break;
                    case "Swimming":
                        amount.setText(Float.toString(swimAmount));
                        break;
                    case "Stair-Climbing":
                        amount.setText(Float.toString(scAmount));
                        break;
                }

                TextView pushupTxt = (TextView) findViewById(R.id.pushupAmount);
                TextView situpTxt = (TextView) findViewById(R.id.situpAmount);
                TextView jjTxt = (TextView) findViewById(R.id.jjAmount);
                TextView joggingTxt = (TextView) findViewById(R.id.joggingAmount);
                TextView squatsTxt = (TextView) findViewById(R.id.squatsAmount);
                TextView legliftTxt = (TextView) findViewById(R.id.legliftAmount);
                TextView plankTxt = (TextView) findViewById(R.id.plankAmount);
                TextView pullupTxt = (TextView) findViewById(R.id.pullupAmount);
                TextView cyclingTxt = (TextView) findViewById(R.id.cyclingAmount);
                TextView walkingTxt = (TextView) findViewById(R.id.walkingAmount);
                TextView swimTxt = (TextView) findViewById(R.id.swimAmount);
                TextView scTxt = (TextView) findViewById(R.id.scAmount);
                pushupTxt.setText(Float.toString(pushupAmount));
                situpTxt.setText(Float.toString(situpAmount));
                jjTxt.setText(Float.toString(jjAmount));
                joggingTxt.setText(Float.toString(jogAmount));
                squatsTxt.setText(Float.toString(squatsAmount));
                legliftTxt.setText(Float.toString(legliftAmount));
                plankTxt.setText(Float.toString(plankAmount));
                pullupTxt.setText(Float.toString(pullupAmount));
                cyclingTxt.setText(Float.toString(cycleAmount));
                walkingTxt.setText(Float.toString(walkAmount));
                swimTxt.setText(Float.toString(swimAmount));
                scTxt.setText(Float.toString(scAmount));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
