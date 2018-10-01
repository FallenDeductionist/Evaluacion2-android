package com.fallendeductionist.evaluacion2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        ExampleResult exampleResult = intent.getParcelableExtra("Example Result");

        int imageRes = exampleResult.getImageResource();
        String line1 = exampleResult.getText1();
        String line2 = exampleResult.getText2();
        String line3 = exampleResult.getText3();
        float stars = exampleResult.getRating();

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(imageRes);

        TextView textView1 = findViewById(R.id.textView1);
        textView1.setText(line1);

        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(line2);

        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText(line3);

        RatingBar ratingBar = findViewById(R.id.ratingBar);
        ratingBar.setRating(stars);

    }
}

