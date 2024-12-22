package vn.edu.tnut.btvn_19_12_k215480106120;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
                TextView kq = findViewById(R.id.textView4);
                Button solve1 = findViewById(R.id.giai1);

                solve1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String a1_1 = a_1.getText().toString();
                        String b1_1 = b_1.getText().toString();
                        int a = Integer.parseInt(a1_1);
                        int b = Integer.parseInt(b1_1);
                        double x = giaiPT.bac1(a, b);
                        kq.setText("Phương trình "+"\n"+a+"x"+"+"+b+"="+0+" \ncó nghiệm là: " + x);
                    }
                });
            }
        });

        giaipt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.pt2);
                EditText a_2 = findViewById(R.id.a2);
                EditText b_2 = findViewById(R.id.b2);
                EditText c = findViewById(R.id.c);
                TextView kq = findViewById(R.id.textView11);
                Button solve2 = findViewById(R.id.giai2);
                solve2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String a2_1 = a_2.getText().toString();
                        String b2_1 = b_2.getText().toString();
                        String c_1 = c.getText().toString();

                        giaiPT nghiem = new giaiPT();

                        float a = Float.parseFloat(a2_1);
                        float b = Float.parseFloat(b2_1);
                        float c = Float.parseFloat(c_1);
                        double x [] = giaiPT.bac2(a, b, c);
                        double delta = x[2];
                        if (x[0] < 0){
                            kq.setText("Phương trình vô nghiệm");
                        }
                        if (x[0] == 0){
                            kq.setText("Phương trình có nghiệm kép x1 = x2 = "+x[1]);
                        }
                        else{
                            kq.setText("Nghiệm của phương trình là: " + x[1] +" và " + x[2]);
                        }
                    }
                });
            }
        });
    }
}