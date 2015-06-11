package com.hedgehog.ratingbar;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RatingBar mRatingBar= (RatingBar) findViewById(R.id.ratingbar);
        mRatingBar.setOnRatingListener(
                new RatingBar.OnRatingListener() {
                    @Override
                    public void onRating(Object bindObject, int RatingCount) {
                        Toast.makeText(MainActivity.this,"fill start is"+RatingCount,Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

}
