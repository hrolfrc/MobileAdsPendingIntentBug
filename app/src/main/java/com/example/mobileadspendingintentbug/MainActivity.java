package com.example.mobileadspendingintentbug;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* MobileAds.initialize(this, initializationStatus ->
                Log.d("MainActivity", "Mobile Ads SDK initialization complete"));
*/
    }
}