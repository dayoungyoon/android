package com.example.jejuuniversity;

import android.content.Intent;
import android.graphics.Color;
import android.provider.ContactsContract;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bus=(ImageView)findViewById(R.id.bus);
        ImageView fork=(ImageView)findViewById(R.id.fork);
        ImageView library=(ImageView)findViewById(R.id.library);
        ImageView university=(ImageView)findViewById(R.id.university);
        bus.setOnClickListener(this);
        fork.setOnClickListener(this);
        library.setOnClickListener(this);
        university.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {


        if (view.getId()==R.id.bus){
            Intent intent=new Intent(this,BusActivity.class);
            startActivity(intent);


        }
        else if (view.getId()==R.id.fork){

            Intent intent=new Intent(this,FoodActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.library){

            Intent intent=new Intent(this,LibrarySeatActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.university){

            Intent intent=new Intent(this,JejuUniversityActivity.class);
            startActivity(intent);
        }
    }
}
