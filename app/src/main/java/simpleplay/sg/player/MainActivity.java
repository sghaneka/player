package simpleplay.sg.player;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import simpleplay.sg.musicservice.Hello;

public class MainActivity extends AppCompatActivity {

    String dummy = Hello.Msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
