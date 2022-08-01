package com.example.kiosk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class CartActivity3 extends AppCompatActivity {
    Button btn;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart3);

        btn = (Button) findViewById(R.id.chargeButton);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //결제창 띄우기
            }
        });

        ///////// 주문 리스트 출력 /////////
        int i=0;

        for (String s : ((EasyMenuActivity) EasyMenuActivity.main_mContext).MenuList) {
            int tmp = ((EasyMenuActivity) EasyMenuActivity.main_mContext).PriceList.get(i);
            String s_tmp = s + " - " + tmp;
            TextView newText = new TextView(getApplicationContext());
            newText.setWidth(1000);
            newText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            newText.setText(s_tmp);
            newText.setId(i++);
            newText.setTextSize(20);
            linearLayout.addView(newText);
        }
        int m_iTotalPrice = 0;          // 총 결제금액

        ////총 결제 금액 계산////
        for (Integer k : ((EasyMenuActivity) EasyMenuActivity.main_mContext).PriceList) {
            m_iTotalPrice += k;
        }

        ////총 결제 금액 출력////
        TextView newText = new TextView(getApplicationContext());
        String tmp = String.valueOf(m_iTotalPrice);
        newText.setText("Total Price : " + tmp);
        newText.setWidth(1000);
        newText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        newText.setTextSize(30);
        linearLayout.addView(newText);
    }
}