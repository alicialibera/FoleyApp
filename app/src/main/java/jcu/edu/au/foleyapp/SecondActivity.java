package jcu.edu.au.foleyapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import java.util.Locale;

public class SecondActivity extends AppCompatActivity {
    private float x;
    private float y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        getImage();
    }

    public void getImage() {
        String buttonText = getIntent().getStringExtra("BUTTON_TEXT");
        ImageView imageView = findViewById(R.id.image);
        switch (buttonText) {
            case "alarm":
                imageView.setBackgroundResource(R.drawable.alarm);
                break;
            case "car":
                imageView.setBackgroundResource(R.drawable.car);
                break;
            case "crickets":
                imageView.setBackgroundResource(R.drawable.crickets);
                break;
            case "dog":
                imageView.setBackgroundResource(R.drawable.dog);
                break;
            case "fireplace":
                imageView.setBackgroundResource(R.drawable.fireplace);
                break;
            case "guinea pig":
                imageView.setBackgroundResource(R.drawable.guinea_pig);
                break;
            case "hyena":
                imageView.setBackgroundResource(R.drawable.hyena);
                break;
            case "old record player":
                imageView.setBackgroundResource(R.drawable.old_record_player);
                break;
            case "school bell":
                imageView.setBackgroundResource(R.drawable.school_bell);
                break;
            case "seagulls":
                imageView.setBackgroundResource(R.drawable.seagulls);
                break;
            case "tea pot whistle":
                imageView.setBackgroundResource(R.drawable.tea_pot_whistle);
                break;
            case "water":
                imageView.setBackgroundResource(R.drawable.water);
                break;
        }
    }

    public void playSound(View view) {
        String buttonText = getIntent().getStringExtra("BUTTON_TEXT");
        MediaPlayer mp;
        switch (buttonText) {
            case "alarm":
                mp = MediaPlayer.create(this, R.raw.alarm);
                mp.start();
                break;
            case "car":
                mp = MediaPlayer.create(this, R.raw.car);
                mp.start();
                break;
            case "crickets":
                mp = MediaPlayer.create(this, R.raw.crickets);
                mp.start();
                break;
            case "dog":
                mp = MediaPlayer.create(this, R.raw.dog);
                mp.start();
                break;
            case "fireplace":
                mp = MediaPlayer.create(this, R.raw.fireplace);
                mp.start();
                break;
            case "guinea pig":
                mp = MediaPlayer.create(this, R.raw.guinea_pig);
                mp.start();
                break;
            case "hyena":
                mp = MediaPlayer.create(this, R.raw.hyena);
                mp.start();
                break;
            case "old record player":
                mp = MediaPlayer.create(this, R.raw.old_record_player);
                mp.start();
                break;
            case "school bell":
                mp = MediaPlayer.create(this, R.raw.school_bell);
                mp.start();
                break;
            case "seagulls":
                mp = MediaPlayer.create(this, R.raw.seagulls);
                mp.start();
                break;
            case "tea pot whistle":
                mp = MediaPlayer.create(this, R.raw.tea_pot_whistle);
                mp.start();
                break;
            case "water":
                mp = MediaPlayer.create(this, R.raw.water);
                mp.start();
                break;
        }
    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        x = event.getX();
//        y = event.getY();
//        System.out.println(x + " " + y);
//        String action = "";
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                action = "started";
//                break;
//            case MotionEvent.ACTION_MOVE:
//                action = "moved";
//                break;
//            case MotionEvent.ACTION_UP:
//                action = "ended";
//                break;
//        }
//        System.out.println(action);
//        Log.i("TouchableActivity", String.format(Locale.getDefault(),
//                "%.2f %.2f %s", x, y, action));
//        System.out.println("X: " + x + " Y: " + y);
//        return true;
//    }
}
