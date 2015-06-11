# RatingBar
android中一个评分的控件
# 如何使用
###1，在XML中
    <com.hedgehog.ratingbar.RatingBar
        android:layout_marginTop="50dp"
        android:layout_gravity="center"
        android:id="@+id/ratingbar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        hedgehog:starCount="5"
        hedgehog:clickable="true"
        hedgehog:starEmpty="@mipmap/ic_star_empty"
        hedgehog:starFill="@mipmap/ic_star_fill"
        hedgehog:starImageSize="30dp"
        />
###注意：别忘了命名空间

###2，在java代码中
RatingBar mRatingBar= (RatingBar) findViewById(R.id.ratingbar);
        mRatingBar.setOnRatingListener(
                new RatingBar.OnRatingListener() {
                    @Override
                    public void onRating(Object bindObject, int RatingCount) {
                        Toast.makeText(MainActivity.this,"fill start is"+RatingCount,Toast.LENGTH_LONG).show();
                    }
                }
        );

