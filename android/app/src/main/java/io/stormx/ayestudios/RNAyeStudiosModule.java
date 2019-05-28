package io.stormx.ayestudios;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import android.content.Intent;

import com.ayetstudios.publishersdk.AyetSdk;

public class RNAyeStudiosModule extends ReactContextBaseJavaModule {

    public RNAyeStudiosModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "RNAyeStudios";
    }

    @ReactMethod
    public void showOfferwall() {
        ReactApplicationContext context = getReactApplicationContext();
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

}
