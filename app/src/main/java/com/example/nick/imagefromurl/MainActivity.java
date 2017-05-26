package com.example.nick.imagefromurl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = (ImageView)findViewById(R.id.iv);
        Glide.with(this).load("https://media.expedia.com/hotels/1000000/530000/526600/526559/526559_105_z.jpg").into(iv);
    }
}
