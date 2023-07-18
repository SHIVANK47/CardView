package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  CardView cardView = findViewById(R.id.cardview);

        // cardview using java activity
       /* cardView.setCardElevation(5.0f);
        cardView.setRadius(11.0f);
        cardView.setUseCompatPadding(true); */
    }
}