package com.example.proiectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.upit.ro/ro/academia-reorganizata/facultatea-de-stiinte-educatie-fizica-si-informatica/departamente-la-nivelul-facultatii-de-stiinte-educatie-fizica-si-informatica/departamentul-matematica-informatica2/licente-departamentul-matematica-informatica2/informatica2");
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack())
            webView.goBack();
        else
            super.onBackPressed();
    }
}