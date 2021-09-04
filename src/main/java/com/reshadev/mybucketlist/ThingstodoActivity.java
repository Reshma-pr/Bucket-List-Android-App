package com.reshadev.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingstodoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thingstodo);
        setupList();
    }

    private void setupList() {
        RecyclerView list = findViewById(R.id.recycler_view_thingstodo);
        Project[] projects={
                new Project("Work For Google ", "Not just for the money but also the pride and the experience is even unbelievable to think of as a 20 year old.If I ever got the chance to work there for even a day,that will be the highest achievement in my life. ", R.drawable.googlejob),
                new Project("AR/VR Engineer", "Sounds cool right? I dream of many things talk about many but Augmentated and Virtual Reality hasn't left my mind. How cool would it be to work in a AR/VR/XR company with all the co-workers not sitting in a place just moving around with their headgears on!", R.drawable.arvr),
                new Project("Dream Home", "\nA spacious enough home where no one can complain about it's space.Home Luxury Sweet Home it will be!", R.drawable.home),
                new Project("Notable Alumni", "This supposedly isn't a goal but moreover a wish.Always being the audience of successful people around me, I wish to surprise people and also be a pride to my alma mater", R.drawable.alumni),
                new Project("Luxury", "Having enough money had never been the situation in my family. Not having enough money but more than that to experience the luxuries in life is my ultimate goal in life.Using the luxury of time I am confident enough to attain material luxury in life", R.drawable.lux)

        };
        BucketListAdapter adapter = new BucketListAdapter(projects);
        list.setAdapter(adapter);

    }
}