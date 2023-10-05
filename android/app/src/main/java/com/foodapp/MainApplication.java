package com.foodapp;

import android.app.Application;
import android.util.Log;
import android.support.annotation.NonNull;

import com.facebook.react.ReactApplication;
import com.bitgo.randombytes.RandomBytesPackage;
import com.imagepicker.ImagePickerPackage;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.reactnativenavigation.NavigationApplication;
import com.oblador.vectoricons.VectorIconsPackage;
import com.BV.LinearGradient.LinearGradientPackage;
import com.lugg.ReactNativeConfig.ReactNativeConfigPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

// public class MainApplication extends Application implements ReactApplication {
public class MainApplication extends NavigationApplication {

  // private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
  //   @Override
  //   protected boolean getUseDeveloperSupport() {
  //     return BuildConfig.DEBUG;
  //   }
  //
  //   @Override
  //   protected List<ReactPackage> getPackages() {
  //     return Arrays.<ReactPackage>asList(
  //         new MainReactPackage(),
            // new RNWordpressEditorPackage(),
            // new RandomBytesPackage(),
            // new NavigationReactPackage(),
            // new ImagePickerPackage()
  //     );
  //   }
  // };
  //
  // @Override
  // public ReactNativeHost getReactNativeHost() {
  //     return mReactNativeHost;
  // }

  @Override
  public boolean isDebug() {
    return BuildConfig.DEBUG;
  }

  @NonNull
  @Override
  public List<ReactPackage> createAdditionalReactPackages() {
    // Add the packages you require here.
    // No need to add RnnPackage and MainReactPackage
    return Arrays.<ReactPackage>asList(
		new VectorIconsPackage(),
		new LinearGradientPackage(),
		new ReactNativeConfigPackage(),
    new RandomBytesPackage(),
    new ImagePickerPackage()
    );
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
