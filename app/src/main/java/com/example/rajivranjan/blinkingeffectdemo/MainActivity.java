package com.example.rajivranjan.blinkingeffectdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView2);
        startBtn = (Button)findViewById(R.id.button);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView.setVisibility(TextView.VISIBLE);

                Animation fadeInAnimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim);
                textView.startAnimation(fadeInAnimation);

                fadeInAnimation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        Toast.makeText(MainActivity.this, "Animation Started", Toast.LENGTH_SHORT).show();
                        startBtn.setText("END ANimation");
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Toast.makeText(MainActivity.this, "Animation Ended", Toast.LENGTH_SHORT).show();
                        startBtn.setText("START ANimation");
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });



            }
        });





    }

    }

