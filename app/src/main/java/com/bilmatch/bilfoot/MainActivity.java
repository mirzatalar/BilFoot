package com.bilmatch.bilfoot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.bilmatch.bilfoot.controllers.AuthenticationController;
import com.bilmatch.bilfoot.view.registration.PositionSelectionActivity;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private AuthenticationController authenticationController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();


        authenticationController = new AuthenticationController(mAuth);
        //startActivity(new Intent(this, ProfileScreenActivity.class));
        //startActivity(new Intent(this, AuthenticationActivity.class));
        startActivity(new Intent(this, PositionSelectionActivity.class));


    }
}
