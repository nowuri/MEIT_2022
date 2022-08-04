package com.example.kiosk;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MenuBurger#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuBurger extends Fragment implements View.OnClickListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private static Context mContext;

    public MenuBurger(Context context){
        mContext = context;
    }

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;




    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MenuBurger.
     */
    // TODO: Rename and change types and number of parameters
    public static MenuBurger newInstance(String param1, String param2) {
        MenuBurger fragment = new MenuBurger(mContext);
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        long TimeLeft = ((MainActivity)MainActivity.main_tContext).TimeLeft;
        View view = inflater.inflate(R.layout.fragment_menu_burger,container,false);
        ImageButton bt1= (ImageButton) view.findViewById(R.id.bigmac);
        ImageButton bt2 = (ImageButton) view.findViewById(R.id.bulgogi);
        ImageButton bt3 = (ImageButton) view.findViewById(R.id.burger);
        ImageButton bt4 = (ImageButton) view.findViewById(R.id.crispyoriental);
        ImageButton bt5 = (ImageButton) view.findViewById(R.id.doublebulgogi);
        ImageButton bt6 = (ImageButton) view.findViewById(R.id.goldenpotato);
        ImageButton bt7 = (ImageButton) view.findViewById(R.id.macspicyshanghai);
        ImageButton bt8 = (ImageButton) view.findViewById(R.id.quaterpounder);
        ImageButton bt9 = (ImageButton) view.findViewById(R.id.supremeshrimp);


        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "빅맥's을 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).MenuList.add("빅맥");
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).PriceList.add(5600);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;

            }
        });

        bt2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "불고기 버거를 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).MenuList.add("불고기버거");
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).PriceList.add(5000);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;
            }
        });

        bt3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "1955 버거를 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).MenuList.add("1955버거");
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).PriceList.add(5900);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;
            }
        });

        bt4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "크리스피 오리엔탈 치킨버거를 장바구니에 \n담았습니다.", Toast.LENGTH_SHORT).show();
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).MenuList.add("크리스피 오리엔탈 치킨버거");
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).PriceList.add(5600);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;

            }
        });

        bt5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "더블 불고기 버거를 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).MenuList.add("더블 불고기 버거");
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).PriceList.add(5600);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;

            }
        });

        bt6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "골든 포테이토 버거를 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).MenuList.add("골든 포테이토 버거");
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).PriceList.add(5600);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;

            }
        });

        bt7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "맥스파이시's 상하이 버거를 장바구니에 \n담았습니다.", Toast.LENGTH_SHORT).show();
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).MenuList.add("맥스파이시");
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).PriceList.add(5600);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;
            }
        });

        bt8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "쿼터파운더 버거를 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).MenuList.add("쿼터파운더 버거");
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).PriceList.add(5600);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;
            }
        });

        bt9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "슈슈 버거를 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).MenuList.add("슈슈버거");
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).PriceList.add(5600);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;

            }
        });
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}