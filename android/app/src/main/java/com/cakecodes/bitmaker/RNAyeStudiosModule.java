package com.cakecodes.bitmaker;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

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
        AyetSdk.init(getApplication());
        AyetSdk.showOfferwall(getApplication());
    }

}
