package com.appbeaw.rambostudio.learnactivity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(MainActivity.this, "onStart", Toast.LENGTH_SHORT).show();
        Log.e("Activity", "onStart");

    }   //  onStart

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(MainActivity.this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.e("Activity", "onCreate");


    }   //  onCreate


    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(MainActivity.this, "onResume", Toast.LENGTH_SHORT).show();
        Log.e("Activity", "onResume");
    }   //  onResume

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(MainActivity.this, "onPause", Toast.LENGTH_SHORT).show();
        Log.e("Activity", "onPause");
    }   //  onPause

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "onStop", Toast.LENGTH_SHORT).show();
        Log.e("Activity", "onStop");
    }   //  onStop

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "onDestroy", Toast.LENGTH_SHORT).show();
        Log.e("Activity", "onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}   //  Main Activity
