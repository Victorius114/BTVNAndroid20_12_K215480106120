package vn.edu.tnut.btvn_19_12_k215480106120;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        webView = findViewById(R.id.web_scr);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Thêm đối tượng Java vào WebView
        webView.addJavascriptInterface(new giaiPT(), "AndroidFunction");

        // Load trang HTML từ assets
        webView.loadUrl("file:///android_asset/index.html");
    }
}
