package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

public class DocumentControllerModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public DocumentControllerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "DocumentController";
    }

    @ReactMethod
    public void show(final ReadableMap args) {
        // TODO: Implement some actually useful functionality
    }
}
