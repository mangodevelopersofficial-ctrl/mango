package com.mango;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView = new WebView(this);
        setContentView(webView);
        
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        // Dashboard yahan "DEFAULT_URL" ko replace karega
        String webUrl = "DEFAULT_URL"; 

        if (webUrl.equals("none") || webUrl.isEmpty()) {
            webView.loadUrl("file:///android_asset/index.html");
        } else {
            webView.loadUrl(webUrl);
        }
    }
}
