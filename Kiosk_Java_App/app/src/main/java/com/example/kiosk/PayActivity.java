package com.example.kiosk;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PayActivity extends AppCompatActivity {
    Button CardButton;
    Button CouponButton;
    Button MobileCouponButton;
    //Intent intent = new Intent(getApplicationContext(), ENDActivity2.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        CardButton = (Button)findViewById(R.id.CardButton);
        CouponButton = (Button) findViewById(R.id.CouponButton);
        MobileCouponButton = (Button) findViewById(R.id.MobileCouponButton);

        CardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show();
            }
        });

        CouponButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_C();
            }
        });

        MobileCouponButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_M();
            }
        });

    }
    void show(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("CARD");
        //타이틀설정
        String tv_text = "카드를 넣어주세요";
        builder.setMessage(tv_text);
        //내용설정
        builder.setPositiveButton("결제",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        try {
                            for (int i = 0; i < 2; i++) {
                                Thread.sleep(3000);
                                Toast.makeText(getApplicationContext(),"결제완료",Toast.LENGTH_LONG).show();
                                ((MainActivity) MainActivity.main_tContext).FinalTime = ((MainActivity) MainActivity.main_tContext).FinalTime + ((MainActivity) MainActivity.main_tContext).TimeLeft;
                                ((MainActivity) MainActivity.main_tContext).TimeLeft=0;
                                Intent intent1 = new Intent(getApplicationContext(), ENDActivity2.class);
                                startActivity(intent1);
                            }
                        }catch(Exception e) {
                            System.out.println(e);
                        }
                    }
                });

        builder.setNegativeButton("취소",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"결제실패",Toast.LENGTH_LONG).show();
                        Intent intent4 = new Intent(getApplicationContext(), ENDActivity3.class);
                        startActivity(intent4);
                    }
                });
        builder.show();

    }
    void show_C(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("COUPON");
        //타이틀설정
        String tv_text = "번호를 입력해주세요";
        builder.setMessage(tv_text);

        final EditText number = new EditText(this);
        builder.setView(number);

        builder.setPositiveButton("확인",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        try {
                            for (int i = 0; i < 2; i++) {
                                String num = number.getText().toString();
                                Thread.sleep(3000);
                                Toast.makeText(getApplicationContext(),"결제완료",Toast.LENGTH_LONG).show();
                                ((MainActivity) MainActivity.main_tContext).FinalTime = ((MainActivity) MainActivity.main_tContext).FinalTime + ((MainActivity) MainActivity.main_tContext).TimeLeft;
                                ((MainActivity) MainActivity.main_tContext).TimeLeft=0;
                                Intent intent1 = new Intent(getApplicationContext(), ENDActivity2.class);
                                startActivity(intent1);
                            }
                        }catch(Exception e) {
                            System.out.println(e);
                        }
                    }
                });

        builder.setNegativeButton("취소",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"결제실패",Toast.LENGTH_LONG).show();
                        Intent intent4 = new Intent(getApplicationContext(), ENDActivity3.class);
                        startActivity(intent4);
                    }
                });
        builder.show();
    }

    void show_M(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("MOBILE");
        //타이틀설정
        String tv_text = "바코드를 가까이 대주세요";
        builder.setMessage(tv_text);
        //내용설정
        builder.setPositiveButton("결제",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        try {
                            for (int i = 0; i < 2; i++) {
                                Thread.sleep(3000);
                                Toast.makeText(getApplicationContext(),"결제완료",Toast.LENGTH_LONG).show();
                                ((MainActivity) MainActivity.main_tContext).FinalTime = ((MainActivity) MainActivity.main_tContext).FinalTime + ((MainActivity) MainActivity.main_tContext).TimeLeft;
                                ((MainActivity) MainActivity.main_tContext).TimeLeft=0;
                                Intent intent1 = new Intent(getApplicationContext(), ENDActivity2.class);
                                startActivity(intent1);
                            }
                        }catch(Exception e) {
                            System.out.println(e);
                        }
                    }
                });

        builder.setNegativeButton("취소",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"결제실패",Toast.LENGTH_LONG).show();
                        Intent intent4 = new Intent(getApplicationContext(), ENDActivity3.class);
                        startActivity(intent4);
                    }
                });
        builder.show();
    }
}
