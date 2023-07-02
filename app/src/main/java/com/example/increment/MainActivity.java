package com.example.increment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.increment.R;

public class MainActivity extends AppCompatActivity {

    private Button incrementbtn;
    private Button decrimentbtn;
    private Button otherperationbtn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incrementbtn = findViewById(R.id.incrementbtn);
        decrimentbtn= findViewById(R.id.decrimentbtn);

        otherperationbtn = findViewById(R.id.otheroperationbtn);




    }
    public void incrementOnClick(View btn){

        int num= counter++;

        incrementbtn.setText(num + " ");

    }
    public void decrimentOnclick(View btn){

        int num= counter--;

        decrimentbtn.setText(num + " ");

    }


    public void otheroperationOnclick(View btn){

        int num= counter;

        otherperationbtn.setText(num * 2 + " ");

    }

}