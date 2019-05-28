package io.stormx.ayestudios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ayetstudios.publishersdk.AyetSdk;

public class MainActivity extends AppCompatActivity {

    boolean started = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AyetSdk.init(getApplication());
        AyetSdk.showOfferwall(getApplication());
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (started) {
            Log.d("LOG_AYE", "onResume");
            started = false;
            this.finish();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        started = true;
        Log.d("LOG_AYE", "onPause");
    }
}
