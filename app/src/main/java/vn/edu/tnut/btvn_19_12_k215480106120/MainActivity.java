package vn.edu.tnut.btvn_19_12_k215480106120;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends giaiPT  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button giaipt1 = findViewById(R.id.pt1_button);
        Button giaipt2 = findViewById(R.id.pt2_button);

        giaipt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.pt1);
                EditText a_1 = findViewById(R.id.a1);
                EditText b_1 = findViewById(R.id.b1);
                EditText sum_1 = findViewById(R.id.sum1);
                TextView kq = findViewById(R.id.textView4);
                Button solve1 = findViewById(R.id.giai1);

                solve1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String a1_1 = a_1.getText().toString();
                        String b1_1 = b_1.getText().toString();
                        String sum1_1 = sum_1.getText().toString();
                        int a = Integer.parseInt(a1_1);
                        int b = Integer.parseInt(b1_1);
                        int sum = Integer.parseInt(sum1_1);
                        double x = giaiPT.bac1(a, b, sum);
                        kq.setText("Phương trình "+"\n"+a+"x"+"+"+b+"="+sum+" \ncó nghiệm là: " + x);
                    }
                });
            }
        });

        giaipt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}