package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RadioButton rb1, rb2, rb3;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rb1 = findViewById(R.id.rbApple);
        rb2 = findViewById(R.id.rbBanana);
        rb3 = findViewById(R.id.rbOrange);
        imgView = findViewById(R.id.imgShow);

        rb1.setOnClickListener(this);
        rb2.setOnClickListener(this);
        rb3.setOnClickListener(this);


    }
        @Override
            public void onClick(View view){
                switch (view.getId()){
                    case R.id.rbApple:
                        imgView.setImageResource(R.drawable.apple);
                        break;

                    case R.id.rbBanana:
                        imgView.setImageResource(R.drawable.banana);
                        break;

                    case R.id.rbOrange:
                        imgView.setImageResource(R.drawable.orange);
                        break;
                }

    }
}
