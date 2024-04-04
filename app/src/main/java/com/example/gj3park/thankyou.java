package com.example.gj3park;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gj3park.R;

public class thankyou extends AppCompatActivity
{

    //Button goToProfileButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the "Go to Profile" button
       /* goToProfileButton = findViewById(R.id.signin);

        goToProfileButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
            }
        });*/
    }
}
