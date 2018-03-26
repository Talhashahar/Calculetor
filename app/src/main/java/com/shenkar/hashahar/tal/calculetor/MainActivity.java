package com.shenkar.hashahar.tal.calculetor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView mScreen;
    private Button mButtonOne;
    private Button mButtonTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mScreen = (TextView) findViewById(R.id.screen);
        mButtonOne = (Button) findViewById(R.id.button1);
        mButtonTwo = (Button) findViewById(R.id.button2);


        mButtonOne.setOnClickListener(this);
        mButtonTwo.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view instanceof Button) {
            mScreen.setText(((Button)view).getText());
        }
    }
}

