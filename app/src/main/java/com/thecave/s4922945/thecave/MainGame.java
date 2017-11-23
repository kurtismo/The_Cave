package com.thecave.s4922945.thecave;


import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainGame extends AppCompatActivity {

    private String playerName;
    private String hiddenvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        //Set the font
         TextView lblStory = findViewById(R.id.lblStory);
         Typeface font = Typeface.createFromAsset(getAssets(), "fonts/TitleFont.ttf");

         //Make a variable for confirm button
         Button btnConfirm = findViewById(R.id.btnConfirm);

        lblStory.setText(getResources().getString(R.string.StoryIntro1));
        lblStory.setTypeface(font);
        //Sets a listener for button
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //When button pressed, creates a variable for the text field then stores the text into playerName
                EditText txtInput = findViewById(R.id.txtInput);
                playerName = txtInput.getText().toString();
                mainGame(false);
            }
        });
    }
    public void mainGame(boolean doneBefore) {
        //Sets first part of story
        Button btnConfirm = findViewById(R.id.btnConfirm);
        btnConfirm.setVisibility(View.GONE);
        EditText txtInput = findViewById(R.id.txtInput);
        txtInput.setVisibility(View.GONE);
        String StoryIntro2 = getResources().getString(R.string.StoryIntro2, playerName);
        TextView lblStory = findViewById(R.id.lblStory);
        if(!doneBefore) {
            lblStory.setText(StoryIntro2);
        }
        else {
            lblStory.setText(getResources().getString(R.string.beenBefore));
        }


        //Stand up and look around
        Button btnOptionA = findViewById(R.id.btnOptionA);
        btnOptionA.setVisibility(View.VISIBLE);
        btnOptionA.setText(getResources().getString(R.string.StartOption1));

        //Pat around to see what you can find
        Button btnOptionB = findViewById(R.id.btnOptionB);
        btnOptionB.setVisibility(View.VISIBLE);
        btnOptionB.setText(getResources().getString(R.string.StartOption2));

        //Lay down and cry
        Button btnOptionC = findViewById(R.id.btnOptionC);
        btnOptionC.setVisibility(View.VISIBLE);
        btnOptionC.setText(getResources().getString(R.string.StartOption3));

        btnOptionA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startOption1Track();
            }
        });

        btnOptionB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startOption2Track();
            }
        });

    }

    public void startOption1Track () {
        TextView lblStory = findViewById(R.id.lblStory);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/TitleFont.ttf");

        //Too dark, what do?
        lblStory.setText(getResources().getString(R.string.Track1Intro));
        lblStory.setTypeface(font);

        //Find a wall
        Button btnOptionA = findViewById(R.id.btnOptionA);
        btnOptionA.setText(getResources().getString(R.string.Track1StartOption1));

        //Pat around
        Button btnOptionB = findViewById(R.id.btnOptionB);
        btnOptionB.setText(getResources().getString(R.string.Track1StartOption2));

        //Look harder?
        Button btnOptionC = findViewById(R.id.btnOptionC);
        btnOptionC.setText(getResources().getString(R.string.Track1StartOption3));

        btnOptionA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Track1_1();
            }
        });

        btnOptionB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startOption2Track();
            }
        });

    }

    public void Track1_1() {
        TextView lblStory = findViewById(R.id.lblStory);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/TitleFont.ttf");

        lblStory.setText(getResources().getString(R.string.Track1Option1story));
        lblStory.setTypeface(font);

        Button btnOptionA = findViewById(R.id.btnOptionA);
        btnOptionA.setText(getResources().getString(R.string.Track1_1_1));

        Button btnOptionB = findViewById(R.id.btnOptionB);
        btnOptionB.setText(getResources().getString(R.string.Track1_1_2));

        Button btnOptionC = findViewById(R.id.btnOptionC);
        btnOptionC.setText(getResources().getString(R.string.Track1_1_3));

        btnOptionA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //When button pressed, creates a variable for the text field then stores the text into playerName
                Track1_1_1();
            }
        });

        btnOptionB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startOption2Track();
            }
        });
    }

    public void Track1_2() {
        TextView lblStory = findViewById(R.id.lblStory);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/TitleFont.ttf");

        lblStory.setText(getResources().getString(R.string.Track1Option1story));
        lblStory.setTypeface(font);

        Button btnOptionA = findViewById(R.id.btnOptionA);
        btnOptionA.setText(getResources().getString(R.string.Track1_1_1));

        Button btnOptionB = findViewById(R.id.btnOptionB);
        btnOptionB.setText(getResources().getString(R.string.Track1_1_2));

        Button btnOptionC = findViewById(R.id.btnOptionC);
        btnOptionC.setText(getResources().getString(R.string.Track1_1_3));

        btnOptionB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startOption2Track();
            }
        });

    }

    public void Track1_1_1() {
        TextView lblStory = findViewById(R.id.lblStory);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/TitleFont.ttf");

        lblStory.setText(getResources().getString(R.string.Track1_1_1story));
        lblStory.setTypeface(font);

        Button btnOptionA = findViewById(R.id.btnOptionA);
        btnOptionA.setText(getResources().getString(R.string.Track1_1_1_1));

        Button btnOptionB = findViewById(R.id.btnOptionB);
        btnOptionB.setText(getResources().getString(R.string.Track1_1_1_2));

        Button btnOptionC = findViewById(R.id.btnOptionC);
        btnOptionC.setText(getResources().getString(R.string.Track1_1_1_3));

        btnOptionB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startOption2Track();
            }
        });
    }


    public void startOption2Track() {
        //When they choose pat around they always go here!
        TextView lblStory = findViewById(R.id.lblStory);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/TitleFont.ttf");

        lblStory.setText(getResources().getString(R.string.Track2Intro, playerName));
        lblStory.setTypeface(font);

        Button btnOptionB = findViewById(R.id.btnOptionB);
        btnOptionB.setText(getResources().getString(R.string.Track2StartOption1));

        Button btnOptionA = findViewById(R.id.btnOptionA);
        btnOptionA.setText(getResources().getString(R.string.Track2StartOption2));

        Button btnOptionC = findViewById(R.id.btnOptionC);
        btnOptionC.setText(getResources().getString(R.string.Track2StartOption2));

        btnOptionB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Track_2_1_1();
            }
        });

        btnOptionA.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mainGame(true);
            }
        });

        btnOptionC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mainGame(true);
            }
        });

    }

    public void Track_2_1_1() {
        //Lever pulled, door opens, giant about to give chase
        TextView lblStory = findViewById(R.id.lblStory);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/TitleFont.ttf");

        lblStory.setText(getResources().getString(R.string.Track2_1_0));
        lblStory.setTypeface(font);

        Button btnOptionA = findViewById(R.id.btnOptionA);
        btnOptionA.setText(getResources().getString(R.string.Track2_1_1));

        Button btnOptionB = findViewById(R.id.btnOptionB);
        btnOptionB.setText(getResources().getString(R.string.Track2_1_2));

        Button btnOptionC = findViewById(R.id.btnOptionC);
        btnOptionC.setText(getResources().getString(R.string.Track2_1_3));

        btnOptionA.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startMilestone1BadEnding(true);
            }
        });
        btnOptionB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startMilestone1BadEnding(false);
            }
        });
        btnOptionC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Track_2_1_1_3();
            }
        });
    }

    public void startMilestone1BadEnding(Boolean hidden) {

        if (hidden) {
            TextView lblStory = findViewById(R.id.lblStory);
            Typeface font = Typeface.createFromAsset(getAssets(), "fonts/TitleFont.ttf");

            lblStory.setText(getResources().getString(R.string.Milestone1BadEndingHiddenIntro));
            lblStory.setTypeface(font);
            hiddenvar = "hidden";
        }
        else {
            TextView lblStory = findViewById(R.id.lblStory);
            Typeface font = Typeface.createFromAsset(getAssets(), "fonts/TitleFont.ttf");

            lblStory.setText(getResources().getString(R.string.Milestone1BadEnding));
            lblStory.setTypeface(font);
            hiddenvar = "calm and still";
        }

        Button btnOptionA = findViewById(R.id.btnOptionA);
        btnOptionA.setText(getResources().getString(R.string.m1be_1, hiddenvar));

        Button btnOptionB = findViewById(R.id.btnOptionB);
        btnOptionB.setText(getResources().getString(R.string.m1be_2));

        Button btnOptionC = findViewById(R.id.btnOptionC);
        btnOptionC.setText(getResources().getString(R.string.m1be_3));

        btnOptionA.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startMilestone1BadEnding2();
            }
        });
        btnOptionB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startMilestone1BadEnding2();
            }
        });
        btnOptionC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startMilestone1BadEnding2();
            }
        });
    }

    public void startMilestone1BadEnding2() {
        TextView lblStory = findViewById(R.id.lblStory);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/TitleFont.ttf");

        lblStory.setText(getResources().getString(R.string.m1beDeath));
        lblStory.setTypeface(font);

        Button btnOptionA = findViewById(R.id.btnOptionA);
        btnOptionA.setVisibility(View.INVISIBLE);

        Button btnOptionB = findViewById(R.id.btnOptionB);
        btnOptionB.setText(getResources().getString(R.string.die));

        Button btnOptionC = findViewById(R.id.btnOptionC);
        btnOptionC.setVisibility(View.INVISIBLE);

        btnOptionB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainGame.this, StartScreen.class);
                startActivity(intent);
            }
        });

        btnOptionA.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }
        });

        btnOptionC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }
        });
    }

    public void Track_2_1_1_3() {
        TextView lblStory = findViewById(R.id.lblStory);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/TitleFont.ttf");

        lblStory.setText(getResources().getString(R.string.Track_2_1_1_3_0));
        lblStory.setTypeface(font);

        Button btnOptionA = findViewById(R.id.btnOptionA);
        btnOptionA.setText(getResources().getString(R.string.Track_2_1_1_3_1));

        Button btnOptionB = findViewById(R.id.btnOptionB);
        btnOptionB.setText(getResources().getString(R.string.Track_2_1_1_3_2));

        Button btnOptionC = findViewById(R.id.btnOptionC);
        btnOptionC.setText(getResources().getString(R.string.Track_2_1_1_3_3));

        btnOptionA.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                milestone1GoodEnding(false);
            }
        });
        btnOptionB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView lblStory = findViewById(R.id.lblStory);
                Typeface font = Typeface.createFromAsset(getAssets(),"fonts/TitleFont.ttf");
                lblStory.setText(getResources().getString(R.string.m1beRun));
                lblStory.setTypeface(font);

                Button btnOptionA = findViewById(R.id.btnOptionA);
                btnOptionA.setVisibility(View.INVISIBLE);

                Button btnOptionB = findViewById(R.id.btnOptionB);
                btnOptionB.setText(getResources().getString(R.string.cont));

                Button btnOptionC = findViewById(R.id.btnOptionC);
                btnOptionC.setVisibility(View.INVISIBLE);

                btnOptionB.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        startMilestone1BadEnding2();
                    }
                });
            }
        });
        btnOptionC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                milestone1GoodEnding(true);
            }
        });
    }

    public void milestone1GoodEnding(boolean scream){
        TextView lblStory = findViewById(R.id.lblStory);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/TitleFont.ttf");
        lblStory.setTypeface(font);
        if(scream) {
            lblStory.setText(getResources().getString(R.string.m1ge));
            Button btnOptionA = findViewById(R.id.btnOptionA);
            btnOptionA.setVisibility(View.INVISIBLE);

            Button btnOptionB = findViewById(R.id.btnOptionB);
            btnOptionB.setText(getResources().getString(R.string.cont));

            Button btnOptionC = findViewById(R.id.btnOptionC);
            btnOptionC.setVisibility(View.INVISIBLE);

            btnOptionB.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    TextView lblStory = findViewById(R.id.lblStory);
                    Typeface font = Typeface.createFromAsset(getAssets(), "fonts/TitleFont.ttf");
                    lblStory.setTypeface(font);

                    lblStory.setText(getResources().getString(R.string.m1ge2));
                }
            });
        }
        else{
            startMilestone1BadEnding2();
        }


    }
}