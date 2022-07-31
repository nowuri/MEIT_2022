package com.example.kiosk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class CartActivity2 extends AppCompatActivity {
    Button btn;
    TextView textView;
    LinearLayout linearLayout;
    int quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart2);

        textView = (TextView) findViewById(R.id.textView2);
        btn = (Button) findViewById(R.id.button);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //결제창 띄우기
            }
        });

        ///////// 주문 리스트 출력 /////////
        int i=0;

        for (String s : ((MainActivity) MainActivity.main_mContext).MenuList) {
            TextView newText = new TextView(getApplicationContext());
            newText.setText(s);
            newText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            newText.setId(i++);
            newText.setTextSize(20);
            linearLayout.addView(newText);
        }
        int m_iTotalPrice = 0;          // 총 결제금액

        ////총 결제 금액 계산////
        for (Integer k : ((MainActivity) MainActivity.main_mContext).PriceList) {
            m_iTotalPrice += k;
        }

        ////총 결제 금액 출력////
        TextView newText = new TextView(getApplicationContext());
        String tmp = String.valueOf(m_iTotalPrice);
        newText.setText("Total Price : " + tmp);
        newText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        newText.setTextSize(30);
        linearLayout.addView(newText);

    }


}