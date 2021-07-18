package com.example.moviesuccessprediction;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity5 extends AppCompatActivity {
    ImageView movie,series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        movie=findViewById(R.id.movie);
        series=findViewById(R.id.series);

        movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity5.this,Activity2.class);
                startActivity(intent);
            }
        });

        series.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity5.this,Activity6.class);
                startActivity(intent);
            }
        });





    }
}