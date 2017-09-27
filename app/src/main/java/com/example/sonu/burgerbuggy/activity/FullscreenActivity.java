package com.example.sonu.burgerbuggy.activity;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sonu.burgerbuggy.R;
import com.example.sonu.burgerbuggy.animation.StandUpAnimator;
import com.example.sonu.burgerbuggy.animation.YoYo;

import java.util.Timer;
import java.util.TimerTask;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {

    TextView alreadyLogin, btn_logIn,textTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        btn_logIn = (TextView)findViewById(R.id.btn_login);
        alreadyLogin = (TextView)findViewById(R.id.already_login);
        textTitle = (TextView)findViewById(R.id.text_title);

        YoYo.with(new StandUpAnimator())
                .duration(2300)
                .pivot(YoYo.CENTER_PIVOT, YoYo.CENTER_PIVOT)
                .interpolate(new AccelerateDecelerateInterpolator())
                .withListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {
                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                })
                .playOn(textTitle);

        final int screenHeight = getScreenDimensions(this).y;
        final int waveImgheight = getResources().getDrawable(R.drawable.pizza).getIntrinsicHeight();
        Log.e("height",waveImgheight+"__"+screenHeight);
        int animatedViewHeight = 0;
        while (animatedViewHeight < screenHeight) {
            animatedViewHeight += waveImgheight;
        }

//        animatedViewHeight += waveImgheight;
        animatedViewHeight = 30000;

        Log.e("final",animatedViewHeight+"");
//frist animation
        View animatedView = findViewById(R.id.animated_view);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)animatedView.getLayoutParams();
        layoutParams.height = animatedViewHeight;
        animatedView.setLayoutParams(layoutParams);

        Animation waveAnimation = new TranslateAnimation(0, 0, -140, waveImgheight);
        waveAnimation.setInterpolator(new LinearInterpolator());
        waveAnimation.setRepeatCount(Animation.INFINITE);
        waveAnimation.setDuration(30000);
        animatedView.startAnimation(waveAnimation);

//second animation
        View animatedView1 = findViewById(R.id.animated_view1);
        layoutParams = (LinearLayout.LayoutParams)animatedView1.getLayoutParams();
        layoutParams.height = animatedViewHeight;
        animatedView1.setLayoutParams(layoutParams);

        Animation waveAnimation1 = new TranslateAnimation(0, 0, 140, -waveImgheight);
        waveAnimation1.setInterpolator(new LinearInterpolator());
        waveAnimation1.setRepeatCount(Animation.INFINITE);
        waveAnimation.setRepeatMode(Animation.RESTART);
        waveAnimation1.setDuration(30000);

        animatedView1.startAnimation(waveAnimation1);

// third animation
        View animatedView2 = findViewById(R.id.animated_view2);
        layoutParams = (LinearLayout.LayoutParams)animatedView2.getLayoutParams();
        layoutParams.height = animatedViewHeight;
        animatedView2.setLayoutParams(layoutParams);

        Animation waveAnimation2 = new TranslateAnimation(0, 0, -140, waveImgheight);
        waveAnimation2.setInterpolator(new LinearInterpolator());
        waveAnimation2.setRepeatCount(Animation.INFINITE);
        waveAnimation.setRepeatMode(Animation.RESTART);
        waveAnimation2.setDuration(30000);
        animatedView2.startAnimation(waveAnimation2);

        btn_logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FullscreenActivity.this,LoginActivity.class);
                startActivity(i);

            }
        });

        alreadyLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }

    public static Point getScreenDimensions(Context context) {
        int width = context.getResources().getDisplayMetrics().widthPixels;
        int height = context.getResources().getDisplayMetrics().heightPixels;
        return new Point(width, height);
    }

}
