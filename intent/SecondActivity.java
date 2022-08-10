package com.sangwan2016.intent;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button button2;
    String name;
    int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        age = intent.getIntExtra("age", 0);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button2 = (Button) findViewById(R.id.button2);

        button2.setText("name:" + name + ", age:" + age);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}