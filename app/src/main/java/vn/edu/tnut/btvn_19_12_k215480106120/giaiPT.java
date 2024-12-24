package vn.edu.tnut.btvn_19_12_k215480106120;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.JavascriptInterface;
import androidx.appcompat.app.AppCompatActivity;

public class giaiPT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);


        WebView webView = findViewById(R.id.mainView);
        // Thêm WebViewClient để kiểm tra lỗi trong WebView
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                Log.e("WebView", "Lỗi khi tải trang: " + description);
            }
        });

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Đăng ký PTInterface
        webView.addJavascriptInterface(new PTInterface(), "PTInterface");

        // Tải trang HTML từ assets
        webView.loadUrl("file:///android_asset/index.html");

    }

    // Lớp PTInterface để gọi phương thức Java từ JavaScript
    public static class PTInterface {

        // Phương thức giải phương trình bậc 1
        @JavascriptInterface
        public double bac1(double a, double b) {
            if (a == 0) {
                throw new IllegalArgumentException("a không thể bằng 0");
            }
            return -b / a;
        }
        // Phương thức giải phương trình bậc 2
        @JavascriptInterface
        public double[] bac2(double a, double b, double c) {
            double delta = Math.pow(b, 2) - 4 * a * c;
            double x1, x2;

            if (delta > 0) {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
            } else if (delta == 0) {
                x1 = x2 = -b / (2 * a);
            } else {
                x1 = x2 = 0;  // Không có nghiệm thực
            }

            return new double[]{delta, x1, x2};
        }
    }
}
