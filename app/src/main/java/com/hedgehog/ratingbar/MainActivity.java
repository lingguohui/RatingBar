package com.hedgehog.ratingbar;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RatingBar mRatingBar = (RatingBar) findViewById(R.id.ratingbar);
        mRatingBar.setOnRatingChangeListener(
                new RatingBar.OnRatingChangeListener() {
                    @Override
                    public void onRatingChange(int RatingCount) {
                            Toast.makeText(MainActivity.this,"the fill star is"+RatingCount,Toast.LENGTH_LONG).show();
                    }
                }
        );

//        mRatingBar.setStar(5);
//        mRatingBar.setmClickable(true);
//        mRatingBar.setStarImageSize(16f);
//        mRatingBar.setStarEmptyDrawable(getResources().getDrawable(R.mipmap.ic_star_empty));
//        mRatingBar.setStarFillDrawable(getResources().getDrawable(R.mipmap.ic_star_fill));
    }
}
