package com.sangwan2016.project8_2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String[] menus = new String[] {"짬뽕", "짜장", "뽁음밥"};
                AlertDialog.Builder dlg =
                        new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("제목");
                //dlg.setMessage("내용");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setItems(menus,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                button1.setText(menus[i]);
                            }
                        }
                );
                dlg.setPositiveButton("확인",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this,
                                        "확인을 눌렀네요!",
                                        Toast.LENGTH_LONG).show();
                            }
                        });
                dlg.show();
            }
        });

    }
}
