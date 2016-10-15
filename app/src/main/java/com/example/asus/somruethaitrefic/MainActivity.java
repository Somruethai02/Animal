package com.example.asus.somruethaitrefic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit การประกาศตัวแแปร
    private ListView listView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind Widget
        listView= (ListView) findViewById(R.id.livTraffic);
        button= (Button) findViewById(R.id.button);

        //Button Controller
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),
                        R.raw.mosquito);
                mediaPlayer.start();

                //show WebView
                String url = "https://youtu.be/dvzHsEqkOkU";
                Intent intent = new Intent(Intent.ACTION_VIEW);

                intent.setData(Uri.parse(url));
                startActivity(intent);

            }   //Onclick
        });


    }   // Main Method
}   // Main Class นี้คือ คลาสหลัก


