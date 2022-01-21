package com.example.proiectfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.text.Html;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TaskActivity extends AppCompatActivity {

    private WebView webView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galerie);
        webView2 = findViewById(R.id.webView2);
        webView2.setWebViewClient(new WebViewClient());
        webView2.loadUrl("https://learn.upit.ro/login/index.php");
    }

    @Override
    public void onBackPressed() {
        if(webView2.canGoBack())
            webView2.goBack();
        else
            super.onBackPressed();
    }
}