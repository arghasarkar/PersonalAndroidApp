package com.example.arghasarkar.cablechecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebBrowser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_browser);

        // Initialising the web view
        WebView browser = (WebView) findViewById(R.id.webView);
        browser.loadUrl("http://arghasarkar.co.uk");

    }
}
