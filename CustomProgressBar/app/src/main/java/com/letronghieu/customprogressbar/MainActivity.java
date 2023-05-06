package com.letronghieu.customprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

import com.github.ybq.android.spinkit.style.ChasingDots;
import com.github.ybq.android.spinkit.style.Circle;
import com.github.ybq.android.spinkit.style.CubeGrid;
import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.github.ybq.android.spinkit.style.FadingCircle;
import com.github.ybq.android.spinkit.style.MultiplePulse;
import com.github.ybq.android.spinkit.style.RotatingCircle;
import com.github.ybq.android.spinkit.style.RotatingPlane;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressBar progressBar1 = findViewById(R.id.progressBar1);
        ProgressBar progressBar2 = findViewById(R.id.progressBar2);
        ProgressBar progressBar3 = findViewById(R.id.progressBar3);
        ProgressBar progressBar4 = findViewById(R.id.progressBar4);
        ProgressBar progressBar5 = findViewById(R.id.progressBar5);
        ProgressBar progressBar6 = findViewById(R.id.progressBar6);
        ProgressBar progressBar7 = findViewById(R.id.progressBar7);
        ProgressBar progressBar8 = findViewById(R.id.progressBar8);
        ProgressBar progressBar9 = findViewById(R.id.progressBar9);

        progressBar1.setIndeterminateDrawable(new RotatingCircle());
        progressBar2.setIndeterminateDrawable(new RotatingPlane());
        progressBar3.setIndeterminateDrawable(new DoubleBounce());
        progressBar4.setIndeterminateDrawable(new Circle());
        progressBar5.setIndeterminateDrawable(new CubeGrid());
        progressBar6.setIndeterminateDrawable(new ChasingDots());
        progressBar7.setIndeterminateDrawable(new FadingCircle());
        progressBar8.setIndeterminateDrawable(new MultiplePulse());
        progressBar9.setIndeterminateDrawable(new MultiplePulse());
    }
}