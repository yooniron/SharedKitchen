package com.example.sharedkitchen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class FourthCoinfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coinfo_fourth);

        //입점문의 액티비티 이동 버튼
        Button proposeBtn = (Button) findViewById(R.id.proposeBtn);
        proposeBtn.setOnClickListener(new View.OnClickListener() { //입점 문의 버튼 클릭 시 화면이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProposeActivity.class);
                startActivity(intent);
            }
        });

        //메뉴1 상세정보 액티비티 이동
        ImageButton menu1Btn = (ImageButton) findViewById(R.id.menu1);
        menu1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FirstMenuinfoActivity.class);
                startActivity(intent);
            }
        });
        //메뉴2 상세정보 액티비티 이동
        ImageButton menu2Btn = (ImageButton) findViewById(R.id.menu2);
        menu2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondMenuinfoActivity.class);
                startActivity(intent);
            }
        });
        //메뉴3 상세정보 액티비티 이동
        ImageButton menu3Btn = (ImageButton) findViewById(R.id.menu3);
        menu3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ThirdMenuinfoActivity.class);
                startActivity(intent);
            }
        });
        //메뉴4 상세정보 액티비티 이동
        ImageButton menu4Btn = (ImageButton) findViewById(R.id.menu4);
        menu4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FourthMenuinfoActivity.class);
                startActivity(intent);
            }
        });
        //메뉴5 상세정보 액티비티 이동
        ImageButton menu5Btn = (ImageButton) findViewById(R.id.menu5);
        menu5Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FifthMenuinfoActivity.class);
                startActivity(intent);
            }
        });
        //메뉴6 상세정보 액티비티 이동
        ImageButton menu6Btn = (ImageButton) findViewById(R.id.menu6);
        menu6Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SixthMenuinfoActivity.class);
                startActivity(intent);
            }
        });
    }
}