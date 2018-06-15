package com.example.arif.app02_buttonclickevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn3, btn4, btn5, btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);

        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

        // This method is not recommended because for every button you need to create extra listener
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Defining a listener programatically on the OnCreate method Button 5", Toast.LENGTH_SHORT).show();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Defining a listener programatically on the OnCreate method Button 6", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void process(View view)
    {
        switch (view.getId())
        {
            case R.id.btn1:
                Toast.makeText(getApplicationContext(), "Onclick method called Button 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(getApplicationContext(), "Onclick method called Button 2", Toast.LENGTH_SHORT).show();
                break;
        }
    }


    // we will use this method if we implements View.OnClickListener
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn3:
                Toast.makeText(getApplicationContext(), "implement View.OnClickListener Button 3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn4:
                Toast.makeText(getApplicationContext(), "implement View.OnClickListener Button 4", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
