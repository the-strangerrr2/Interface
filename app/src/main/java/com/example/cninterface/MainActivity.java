package com.example.cninterface;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements NavigationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new FragmentA())
                .commit();
    }

    @Override
    public void goToB() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new FragmentB())
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void goToA() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new FragmentA())
                .commit();
    }
}
