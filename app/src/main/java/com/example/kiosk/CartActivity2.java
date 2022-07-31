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

        CreateTextView();

    }

    private void CreateTextView(){
        for(int i=0; i<quantity; i++){
            TextView newText = new TextView(getApplicationContext());
            //newText.setText(arr[i]);
            newText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            newText.setId(i);
            newText.setTextSize(20);
            linearLayout.addView(newText);
        }
    }
}