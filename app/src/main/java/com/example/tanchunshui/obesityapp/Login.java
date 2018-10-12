package com.example.tanchunshui.obesityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    private Button button2, button3;
    private ImageView img;
    private TextView tv21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        img = (ImageView) findViewById(R.id.imageView3);
        button2 = (Button) findViewById(R.id.button2);
        tv21 = (TextView) findViewById(R.id.textView21);
        button3 = (Button) findViewById(R.id.button3);

        imgFadeIn();
        button3.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
             Intent i = new Intent(Login.this,Register1.class);
             startActivity(i);
           }
        });
    }

    public void imgFadeIn(){
        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(2000);

        AnimationSet animation = new AnimationSet(true);
        animation.addAnimation(fadeIn);
        img.setAnimation(animation);
        button2.setAnimation(animation);
        button3.setAnimation(animation);
        tv21.setAnimation(animation);
    }
}
