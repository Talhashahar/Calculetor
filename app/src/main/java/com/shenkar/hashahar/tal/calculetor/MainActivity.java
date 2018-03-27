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
    private Button mButtonThree;
    private Button mButtonFour;
    private Button mButtonFive;
    private Button mButtonSix;
    private Button mButtonSeven;
    private Button mButtonNine;
    private Button mButtonTen;

    private Button mButtonPlus;

    private  int Number1;
    private  int Number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mScreen = (TextView) findViewById(R.id.screen);
        mButtonOne = (Button) findViewById(R.id.button1);
        mButtonTwo = (Button) findViewById(R.id.button2);
        mButtonThree = (Button) findViewById(R.id.button3);
        mButtonFour = (Button) findViewById(R.id.button4);
        mButtonFive = (Button) findViewById(R.id.button5);
        mButtonSix = (Button) findViewById(R.id.button6);
        mButtonSeven = (Button) findViewById(R.id.button7);
        mButtonNine = (Button) findViewById(R.id.button8);
        mButtonTen = (Button) findViewById(R.id.button9);

        mButtonPlus = (Button) findViewById(R.id.buttonPlus);


        mButtonOne.setOnClickListener(this);
        mButtonTwo.setOnClickListener(this);
        mButtonThree.setOnClickListener(this);
        mButtonFour.setOnClickListener(this);
        mButtonFive.setOnClickListener(this);
        mButtonSix.setOnClickListener(this);
        mButtonSeven.setOnClickListener(this);
        mButtonNine.setOnClickListener(this);
        mButtonTen.setOnClickListener(this);

        mButtonPlus.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view instanceof Button) {
            if ((Button)view == mButtonPlus)
            {

                Number1 = Integer.parseInt((String) mScreen.getText());
            }
            String temp = (String) mScreen.getText();
            mScreen.setText(temp.concat((String)((Button)view).getText()));
        }
    }
}

