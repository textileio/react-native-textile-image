package io.textile.textileimage;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class TextileImageViewModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public TextileImageViewModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "TextileImageView";
  }
}