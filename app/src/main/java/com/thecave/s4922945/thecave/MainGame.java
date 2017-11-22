package com.thecave.s4922945.thecave;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainGame extends AppCompatActivity {

    private String playerName;

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
                mainGame();
            }
        });
    }
    public void mainGame() {
        //Sets next part of story
        String StoryIntro2 = getResources().getString(R.string.StoryIntro2, playerName);
        TextView lblStory = findViewById(R.id.lblStory);
        lblStory.setText(StoryIntro2);
    }
}