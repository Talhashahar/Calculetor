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

    private Button mButtonEqual;

    private String tempnumber;
    private String temp;
    private long Number1;
    private long Number2;
    private long total;

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

        mButtonPlus = (Button) findViewById(R.id.buttonEqual);


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

        mButtonEqual.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view instanceof Button) {
            if ((Button)view == mButtonEqual)
            {
                temp = (String) mScreen.getText();
                if (temp.length() == 0){
                    return;
                }
                if (temp.contains("+")){
                    String[] numbers = temp.split("+");
                    mScreen.setText(Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]));
                    return;
            }
            }

            mScreen.setText(temp.concat((String)((Button)view).getText()));
        }
    }
}

