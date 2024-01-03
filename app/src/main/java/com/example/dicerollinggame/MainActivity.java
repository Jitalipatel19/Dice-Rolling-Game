package com.example.dicerollinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView im1;
    Button btnrdc;
    Dice d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im1=(ImageView) findViewById(R.id.imgdc);
        btnrdc=(Button) findViewById(R.id.btnrdc);
        d = new Dice();
        btnrdc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int res = d.roll();
        switch (res) {
            case 1:
                im1.setImageResource(R.drawable.d1);
                break;
            case 2:
                im1.setImageResource(R.drawable.d2);
                break;
            case 3:
                im1.setImageResource(R.drawable.d3);
                break;
            case 4:
                im1.setImageResource(R.drawable.d4);
                break;
            case 5:
                im1.setImageResource(R.drawable.d5);
                break;
            case 6:
                im1.setImageResource(R.drawable.d6);
                break;
        }
    }
}