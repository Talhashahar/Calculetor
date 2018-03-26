package com.shenkar.hashahar.tal.calculetor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText mEdit = (EditText)findViewById(R.id.editText);
    Button buttonOne = (Button) findViewById(R.id.button1);
    Button buttonTwo = (Button) findViewById(R.id.button2);


    buttonOne.setOnClickListener(new Button.OnClickListener() {
        public void onClick() {

            //Do stuff here
        }
    });


    buttonTwo.setOnClickListener(new Button.OnClickListener() {
        public void onClick(View v) {
            //Do stuff here
        }
    });
}
