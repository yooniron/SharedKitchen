package com.example.sharedkitchen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FifthMenuinfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuinfo_fifth);



        //후기작성 액티비티 이동
        Button insertReview = (Button) findViewById(R.id.insertReview);
        insertReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReviewActivity.class);
                startActivity(intent);
            }
        });

        // "<" 버튼 클릭 이전 메뉴 이동

        Button previousBtn = (Button) findViewById(R.id.previousBtn);
        previousBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), FourthMenuinfoActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // ">" 버튼 클릭 이전 메뉴 이동

        Button nextBtn = (Button) findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), SixthMenuinfoActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}