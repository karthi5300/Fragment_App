package com.karthick.fragmentapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    //INITIATE FRAGMENT MANAGER
    FragmentManager fragmentManager = getSupportFragmentManager();

    //INITIATE TRANSACTION
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

    //GET NEW INSTANCE OF FRAGMENTS
    static LeftFragment leftFragment = new LeftFragment();
    static RightFragment rightFragment = new RightFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //REPLACE FRAGMENTS TO THE LAYOUT & COMMIT
        fragmentTransaction.replace(R.id.leftLayout, leftFragment);
        fragmentTransaction.replace(R.id.rightLayout, rightFragment);
        fragmentTransaction.commit();
    }
}