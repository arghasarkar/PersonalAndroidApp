package com.example.arghasarkar.cablechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebBrowser extends AppCompatActivity {

    // Version of the Android app running on this phone.
    private String appVersion = "1.1";
    // Version of Android OS running on the phone.
    private String androidVersion = android.os.Build.VERSION.SDK_INT + "";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_browser);

        // Initialising the web view
        WebView browser = (WebView) findViewById(R.id.webView);
        browser.loadUrl("http://arghasarkar.co.uk/?&r=androidv_" + androidVersion + "-appv_" + appVersion);

    }
}
