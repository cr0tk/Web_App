package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
        import android.webkit.WebSettings;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;
public class MainActivity extends AppCompatActivity {
    private WebView myapplication;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myapplication = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = myapplication.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myapplication.loadUrl("https://www.harryscart.com/");
        myapplication.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed(){
        if (myapplication.canGoBack())
        {
            myapplication.goBack();
        }
        else{
            super.onBackPressed();
        }
    }
}
