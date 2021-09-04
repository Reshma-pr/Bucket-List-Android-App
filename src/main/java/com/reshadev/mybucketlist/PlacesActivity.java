package com.reshadev.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        setupList();
    }

    private void setupList() {
        RecyclerView list = findViewById(R.id.recycler_views_places_to_go);
        Project[] project = {
                new Project("Seoul", "Are you even surprised? If yes then probably we aren't friends. This is 'The' dream destination of my girls squad.The country as a whole not only Seoul,the food,the culture..Oh come on can't wait to be there.", R.drawable.southkorea),
                new Project("Switzerland", "This is in everyone's BucketList.The country of love with beautiful castles, waterfalls and the snowy mountains. Okay I'm an Indian who didn't get to witness snow!.Chocolate,Cheese another reason to go!", R.drawable.swiztz),
                new Project("Newyork", "\nTimes Square it is!\n If it's USA its NYC and times Square for me.I know its even on your list!", R.drawable.nyc),
                new Project("Bali", "All I wish is I get wealthy enough to have weekend getaways in this Island. The Bali Swing, beaches,waterfalls,waterparks.... This is what I call Aesthetic ", R.drawable.bali_6_17_28_pm),
                new Project("Paris", "A bucket list without this city is just trash.The city of love,lights, everyone dreams to be there woth their loved one and it's the same for me.Dream Destination it is!", R.drawable.paris)

        };
        BucketListAdapter adapter = new BucketListAdapter(project);
        list.setAdapter(adapter);
    }
}