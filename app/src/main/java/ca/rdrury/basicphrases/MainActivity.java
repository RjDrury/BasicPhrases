package ca.rdrury.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void clicked(View view){

        int id = view.getId();


        String ourId = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(ourId,"raw",getPackageName());
        Log.i("button Tapped",ourId);


        mPlayer = MediaPlayer.create(this, resourceId);

        mPlayer.start();

    }
}
