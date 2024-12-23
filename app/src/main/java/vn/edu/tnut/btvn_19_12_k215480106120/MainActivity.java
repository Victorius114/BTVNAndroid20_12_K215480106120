package vn.edu.tnut.btvn_19_12_k215480106120;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);  // Thay R.layout.activity_giai_pt bằng layout của bạn

        // Khởi tạo WebView
        WebView webView = findViewById(R.id.mainView);  // ID của WebView trong layout XML của bạn
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);  // Bật JavaScript trong WebView

        // Expose PTInterface cho JavaScript
        webView.addJavascriptInterface(new giaiPT.PTInterface(), "PTInterface");

        // Tải trang HTML (nằm trong thư mục assets)
        webView.loadUrl("file:///android_asset/index.html");  // Đảm bảo file giaipt.html có trong thư mục assets
    }
}
