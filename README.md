# RatingBar
##android中一个评分的控件
![image](https://github.com/hedge-hog/RatingBar/blob/master/ic_demo.png)
# 如何使用
###Android Studio下：
```groovy
    dependencies {
        compile 'com.hedgehog.ratingbar:app:1.0.2'
    }
```
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
```
    xmlns:hedgehog="http://schemas.android.com/apk/res-auto"
```
###2，在java代码中

       RatingBar mRatingBar = (RatingBar) findViewById(R.id.ratingbar);
        mRatingBar.setOnRatingChangeListener(
                new RatingBar.OnRatingChangeListener() {
                    @Override
                    public void onRatingChange(int RatingCount) {
                            Toast.makeText(MainActivity.this,"the fill star is"+RatingCount,Toast.LENGTH_LONG).show();
                    }
                }
        );
       mRatingBar.setStar(5);
       mRatingBar.setmClickable(true);
       mRatingBar.setStarImageSize(16f);
       mRatingBar.setStarEmptyDrawable(getResources().getDrawable(R.mipmap.ic_star_empty));
       mRatingBar.setStarFillDrawable(getResources().getDrawable(R.mipmap.ic_star_fill));
###关于
    因为项目中需要，但是android本身对这个控件的支持并不是很好
    所以打算用一个开源的，可是并没有找到称心如意的
    然后发现了这个
    [MultiMarkdown 文档](https://github.com/fletcher/MultiMarkdown/wiki/MultiMarkdown-Syntax-Guide#footnotes) 
     [Android_custom_ratingbarview]（https://github.com/JackWong025/Android_custom_ratingbarview) O(∩_∩)O~ 
    在他的基础上做了些许修改后发布
    而且让使用Android Studio的同学更加容易引入，不用在这个小东西上浪费时间
    同时我也学习了如何用Android Studio发布开源项目到Jcenter
###最后
    感谢JackWong的开源项目

    
