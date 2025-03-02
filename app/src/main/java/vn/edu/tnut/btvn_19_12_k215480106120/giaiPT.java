package vn.edu.tnut.btvn_19_12_k215480106120;

import android.webkit.JavascriptInterface;

public class giaiPT {
    @JavascriptInterface
    public String solve(double a, double b, double c) {
        if (a == 0) {
            return (b == 0) ? "Phương trình có vô số nghiệm" : "One root: " + (-c / b);
        }
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return "Phương trình vô nghiệm";
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return "Phương trình có nghiệm kép: " + x;
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return "Phương trình có 2 nghiệm phân biệt: " + x1 + " và " + x2;
        }
    }
}
