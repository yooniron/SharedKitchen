package com.example.sharedkitchen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //입점문의 액티비티 이동 버튼
        Button proposeBtn = (Button) findViewById(R.id.proposeBtn);
        proposeBtn.setOnClickListener(new View.OnClickListener() { //입점 문의 버튼 클릭 시 화면이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProposeActivity.class);
                startActivity(intent);
            }
        });

        //상봉점 액티비이 이동
        ImageButton coThumnails1 = (ImageButton) findViewById(R.id.coThumnails1);
        coThumnails1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v1) {
                Intent intent = new Intent(getApplicationContext(), FisrtCoinfoActivity.class);
                startActivity(intent);
            }
        });

        //망우점 액티비이 이동
        ImageButton coThumnails2 = (ImageButton) findViewById(R.id.coThumnails2);
        coThumnails2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v2) {
                Intent intent = new Intent(getApplicationContext(), SecondCoinfoActivity.class);
                startActivity(intent);
            }
        });

        //면목점 액티비이 이동
        ImageButton coThumnails3 = (ImageButton) findViewById(R.id.coThumnails3);
        coThumnails3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v3) {
                Intent intent = new Intent(getApplicationContext(), ThirdCoinfoActivity.class);
                startActivity(intent);
            }
        });

        //서일점 액티비이 이동
        ImageButton coThumnails4 = (ImageButton) findViewById(R.id.coThumnails4);
        coThumnails4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v4) {
                Intent intent = new Intent(getApplicationContext(), FourthCoinfoActivity.class);
                startActivity(intent);
            }
        });

        //사가정점 액티비이 이동
        ImageButton coThumnails5 = (ImageButton) findViewById(R.id.coThumnails5);
        coThumnails5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v5) {
                Intent intent = new Intent(getApplicationContext(), FifthCoinfoActivity.class);
                startActivity(intent);
            }
        });

        //상동점 액티비이 이동
        ImageButton coThumnails6 = (ImageButton) findViewById(R.id.coThumnails6);
        coThumnails6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v6) {
                Intent intent = new Intent(getApplicationContext(), SixthCoinfoActivity.class);
                startActivity(intent);
            }
        });

    }
}