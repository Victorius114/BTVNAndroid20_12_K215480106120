package vn.edu.tnut.btvn_19_12_k215480106120;

import static java.lang.Math.pow;

import androidx.appcompat.app.AppCompatActivity;

public class giaiPT extends AppCompatActivity {
    protected static double bac1(double a, double b, double sum){
        double x = (sum - b)/a;
        return x;
    }

    protected static void bac2(double a, double b, double c, double sum){
        double delta = Math.pow(b, 2) - 4*a*c;
        double x, x1, x2;
        if (delta>0){
            x1 = (-b - Math.sqrt(delta))/2*a;
            x2 = (-b + Math.sqrt(delta))/2*a;
        }

        if (delta == 0){
            x1 = -b / 2*a;
            x2=x1;
            x = x2;
        }

        if (delta < 0){
            x = 0;
        }
    }
}
