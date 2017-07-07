package com.example.mufasa.webviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class moreInfo extends AppCompatActivity {

    WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_info);

        webView2=(WebView)findViewById(R.id.webView);

        webView2.loadUrl("file:///android_asset/moreInfo.html");

    }
}
