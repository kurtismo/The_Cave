package com.thecave.s4922945.thecave;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        //Set the fonts
        TextView titleFont = findViewById(R.id.txtTitleScreen);
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/TitleFont.ttf");
        titleFont.setTypeface(font);
        TextView startGame = findViewById(R.id.txtStartGame);
        startGame.setTypeface(font);
    }

    public boolean onTouchEvent(MotionEvent e) {
        //When you tap, moves to the next screen
        Intent intent = new Intent(this, MainGame.class);
        startActivity(intent);
        return true;
    }
}
