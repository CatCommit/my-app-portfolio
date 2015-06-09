package com.example.android.androidportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

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

    public void ButtonOnClick (View view){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "blank";
        switch (view.getId()) {
            case R.id.buttonSpotifyStreamer:
                text = "This will open the Spotify Streamer App!";
                break;
            case R.id.buttonScoresApp:
                text = "This will open the Football Scores App!";
                break;
            case R.id.buttonLibraryApp:
                text = "This will open the Library App!";
                break;
            case R.id.buttonBuildItBigger:
                text = "This will open the Build It Bigger!";
                break;
            case R.id.buttonXYZApp:
                text = "This will open the XYZ App!";
                break;
            case R.id.buttonCappstoneApp:
                text = "This will open the Cappstone App!";
                break;
        }
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
