package ir.filmNet.hiringTest.ui.main.activity;

import android.os.Bundle;

import dagger.android.support.DaggerAppCompatActivity;
import ir.filmNet.hiringTest.R;

public class MainActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}