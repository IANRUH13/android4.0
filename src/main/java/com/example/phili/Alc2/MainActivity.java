package com.example.phili.alc2;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonone,web;
    Button buttontwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonone = (Button) findViewById(R.id.web);
        buttontwo = (Button) findViewById(R.id.profile);

        buttonone = (Button) findViewById(R.id.web);
        buttonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Webview.class);
                startActivity(intent);
            }
        });

        buttontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ProfileIntent = new Intent(getApplicationContext(),Profile.class);
                startActivity(ProfileIntent);
            }
        });
    }
}