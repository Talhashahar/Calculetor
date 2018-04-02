package com.shenkar.hashahar.tal.calculetor;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

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
    private Button mButtonZero;

    private Button mButtonPlus;
    private Button mButtonMinus;
    private Button mButtonMulti;
    private Button mButtonDiv;

    private Button mButtonEqual;
    private Button mButtonClear;

    private String temp;
    private char[] tempchar;
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
        mButtonZero = (Button) findViewById(R.id.button0);

        mButtonPlus = (Button) findViewById(R.id.buttonPlus);
        mButtonMinus = (Button) findViewById(R.id.buttonMinus);
        mButtonMulti = (Button) findViewById(R.id.buttonMulti);
        mButtonDiv = (Button) findViewById(R.id.buttonDiv);

        mButtonEqual = (Button) findViewById(R.id.buttonEqual);
        mButtonClear = (Button) findViewById(R.id.buttonClear);

        mButtonOne.setOnClickListener(this);
        mButtonTwo.setOnClickListener(this);
        mButtonThree.setOnClickListener(this);
        mButtonFour.setOnClickListener(this);
        mButtonFive.setOnClickListener(this);
        mButtonSix.setOnClickListener(this);
        mButtonSeven.setOnClickListener(this);
        mButtonNine.setOnClickListener(this);
        mButtonTen.setOnClickListener(this);
        mButtonZero.setOnClickListener(this);

        mButtonPlus.setOnClickListener(this);
        mButtonMinus.setOnClickListener(this);
        mButtonMulti.setOnClickListener(this);
        mButtonDiv.setOnClickListener(this);

        mButtonEqual.setOnClickListener(this);
        mButtonClear.setOnClickListener(this);

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
                    String[] numbers = temp.split("\\+");
                    total = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
                    mScreen.setText(Long.toString(total));
                    return;
                }
                if (temp.contains("-")){
                    String[] numbers = temp.split("\\-");
                    total = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
                    mScreen.setText(Long.toString(total));
                    return;
                }
                if (temp.contains("*")){
                    String[] numbers = temp.split("\\*");
                    total = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
                    mScreen.setText(Long.toString(total));
                    return;
                }
                if (temp.contains("/")){
                    String[] numbers = temp.split("\\/");
                    if (Integer.parseInt(numbers[1]) == 0)
                    {
                        mScreen.setText("Cant divide by zero");
                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        mScreen.setText("");
                        return;
                    }
                    total = Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
                    mScreen.setText(Long.toString(total));
                    return;
                }

            }
            if ((Button)view == mButtonClear)
            {
                mScreen.setText("");
                return;
            }
            temp = (String) mScreen.getText();
            if (((Button)view).getText().equals("+")){
                if (temp.charAt(temp.length() -1) == '+')
                {
                    return;
                }
                else{
                    if ((temp.charAt(temp.length() -1) == '-') || (temp.charAt(temp.length() -1) == '*') || (temp.charAt(temp.length() -1) == '/'))
                    {
                        tempchar = temp.toCharArray();
                        tempchar[temp.length() -1] = '+';
                        temp = String.valueOf(tempchar);
                        mScreen.setText(temp);
                        return;
                    }
                }
            }
            if (((Button)view).getText().equals("-")){
                if (temp.charAt(temp.length() -1) == '-')
                {
                    return;
                }
                else{
                    if ((temp.charAt(temp.length() -1) == '+') || (temp.charAt(temp.length() -1) == '*') || (temp.charAt(temp.length() -1) == '/'))
                    {
                        tempchar = temp.toCharArray();
                        tempchar[temp.length() -1] = '-';
                        temp = String.valueOf(tempchar);
                        mScreen.setText(temp);
                        return;
                    }
                }
            }
            if (((Button)view).getText().equals("*")){
                if (temp.charAt(temp.length() -1) == '*')
                {
                    return;
                }
                else{
                    if ((temp.charAt(temp.length() -1) == '-') || (temp.charAt(temp.length() -1) == '+') || (temp.charAt(temp.length() -1) == '/'))
                    {
                        tempchar = temp.toCharArray();
                        tempchar[temp.length() -1] = '*';
                        temp = String.valueOf(tempchar);
                        mScreen.setText(temp);
                        return;
                    }
                }
            }
            if (((Button)view).getText().equals("/")){
                if (temp.charAt(temp.length() -1) == '/')
                {
                    return;
                }
                else{
                    if ((temp.charAt(temp.length() -1) == '-') || (temp.charAt(temp.length() -1) == '*') || (temp.charAt(temp.length() -1) == '+'))
                    {
                        tempchar = temp.toCharArray();
                        tempchar[temp.length() -1] = '/';
                        temp = String.valueOf(tempchar);
                        mScreen.setText(temp);
                        return;
                    }
                }
            }

            mScreen.setText(temp.concat((String)((Button)view).getText()));
        }
    }
}