package com.example.grieshmehndiratta.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "OnCreate", Toast.LENGTH_LONG).show();
    }
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(getApplicationContext(), "OnStart", Toast.LENGTH_LONG).show();

    }
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(getApplicationContext(), "OnResume", Toast.LENGTH_LONG).show();

    }
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(getApplicationContext(), "OnPause", Toast.LENGTH_LONG).show();

    }
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(getApplicationContext(), "OnStop", Toast.LENGTH_LONG).show();

    }
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "OnDestroy", Toast.LENGTH_LONG).show();

    }
}
