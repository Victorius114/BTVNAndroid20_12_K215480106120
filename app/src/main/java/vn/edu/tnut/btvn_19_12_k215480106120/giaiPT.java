package vn.edu.tnut.btvn_19_12_k215480106120;

import static java.lang.Math.pow;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class giaiPT extends AppCompatActivity {
    protected static double bac1(double a, double b){
        double x = -b/a;
        return x;
    }
    protected static double[] bac2(double a, double b, double c) {

        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1, x2;

        if (delta > 0) {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
        }

        if (delta == 0) {
            x1 = x2 = -b / (2 * a);
        }
        else {
            x1 = x2 = 0;
        }

        return new double[] {delta, x1, x2};
    }
}
