package com.reshadev.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupClickListeners();
    }

    private void setupClickListeners() {
      CardView  places= findViewById(R.id.places_to_go_card_view);
      CardView thingstodo=findViewById(R.id.things_to_do_card_view);
        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent placestogoIntent = new Intent(MainActivity.this,PlacesActivity.class);
                startActivity(placestogoIntent);
            }
        });

        thingstodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thingstodoIntent = new Intent(MainActivity.this,ThingstodoActivity.class);
                startActivity(thingstodoIntent);
            }
        });
    }

}