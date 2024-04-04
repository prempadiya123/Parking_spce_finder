package com.example.gj3park;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

public class signin extends Activity {

   /* private EditText phoneNumberEditText;
    private EditText passwordEditText;
    private Button signInButton;
    private Button forgotPasswordButton;
    private Button createAccountButton;*/

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

       /* phoneNumberEditText = findViewById(R.id.editTextTextPassword);
        passwordEditText = findViewById(R.id.editTextTextPassword2);
        signInButton = findViewById(R.id.signin);
        forgotPasswordButton = findViewById(R.id.forgotPasswordButton);
        createAccountButton = findViewById(R.id.createAccountButton);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your code here for handling the sign-in button click
            }
        });

        forgotPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        }); */
    }
}
