package com.example.andrey.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void openSpotifyStreamer(View view) {
        ShowToast("This button will open Spotify Streamer!");
    }

    private void ShowToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void openScoresApp(View view) {
        ShowToast("This button will open Scores App!");
    }

    public void openLibraryApp(View view) {
        ShowToast("This button will open Library App!");
    }

    public void openBuildItBigger(View view) {
        ShowToast("This button will open Build It Bigger!");
    }

    public void openXyzReader(View view) {
        ShowToast("This button will open XYZ Reader!");
    }

    public void openCapstone(View view) {
        ShowToast("This button will do something special!");
    }
}
