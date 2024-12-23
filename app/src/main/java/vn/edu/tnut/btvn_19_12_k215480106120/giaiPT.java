package vn.edu.tnut.btvn_19_12_k215480106120;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.JavascriptInterface;

import androidx.appcompat.app.AppCompatActivity;

public class giaiPT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = new WebView(this);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Đăng ký interface để gọi Java từ JavaScript
        webView.addJavascriptInterface(new PTInterface(), "PTSolver");

        // Tải file HTML/JS từ thư mục assets
        webView.loadUrl("file:///android_asset/index.html");

        // Đảm bảo xử lý sự kiện trong WebView
        webView.setWebViewClient(new WebViewClient());
    }

    // Lớp cho phép gọi các phương thức Java
    public class PTInterface {
        @JavascriptInterface
        public double solveBac1(double a, double b) {
            return bac1(a, b);
        }

        @JavascriptInterface
        public double[] solveBac2(double a, double b, double c) {
            return bac2(a, b, c);
        }
    }

    protected static double bac1(double a, double b) {
        return -b / a;
    }

    protected static double[] bac2(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1, x2;

        if (delta > 0) {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
        } else if (delta == 0) {
            x1 = x2 = -b / (2 * a);
        } else {
            x1 = x2 = 0;
        }

        return new double[]{delta, x1, x2};
    }
}
