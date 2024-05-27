package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class EtudeActivity extends AppCompatActivity {

    CardView imageCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etude);

        imageCard = findViewById(R.id.imageCard);

        imageCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EtudeActivity.this, ImageActivity.class);
                startActivity(intent);
            }
        });
    }
}