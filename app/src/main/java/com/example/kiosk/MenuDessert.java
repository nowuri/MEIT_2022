package com.example.kiosk;

import android.content.Context;
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
 * Use the {@link MenuDessert#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuDessert extends Fragment implements View.OnClickListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private static Context mContext;

    public MenuDessert(Context context){
        mContext = context;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MenuDessert.
     */
    // TODO: Rename and change types and number of parameters
    public static MenuDessert newInstance(String param1, String param2) {
        MenuDessert fragment = new MenuDessert(mContext);
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

        View view = inflater.inflate(R.layout.fragment_menu_dessert,container,false);
        ImageButton bt1 = (ImageButton) view.findViewById(R.id.icecream);
        ImageButton bt2 = (ImageButton) view.findViewById(R.id.chocolate);
        ImageButton bt3 = (ImageButton) view.findViewById(R.id.strawberry);
        ImageButton bt4 = (ImageButton) view.findViewById(R.id.oreo);
        ImageButton bt5 = (ImageButton) view.findViewById(R.id.chocooreo);
        ImageButton bt6 = (ImageButton) view.findViewById(R.id.strawberryooreo);
        ImageButton bt7 = (ImageButton) view.findViewById(R.id.verystrawberry);
        ImageButton bt8 = (ImageButton) view.findViewById(R.id.hersheypretzel);

        bt1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "아이스크림콘을 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).MenuList.add("아이스크림콘");
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).PriceList.add(1500);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*1;
            }
        });

        bt2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "초코콘을 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).MenuList.add("초코콘");
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).PriceList.add(2000);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;}
        });

        bt3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "스트로베리콘을 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).MenuList.add("스트로베리콘");
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).PriceList.add(2000);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;}
        });

        bt4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "오레오 맥플러리를 장바구니 담았습니다.", Toast.LENGTH_SHORT).show();
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).MenuList.add("오레오 맥플러리");
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).PriceList.add(2800);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;}
        });

        bt5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "초코오레오 맥플러리를 장바구니에 \n담았습니다.", Toast.LENGTH_SHORT).show();
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).MenuList.add("초코오레오 맥플러리");
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).PriceList.add(2800);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;}
        });

        bt6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "딸기오레오 맥플러리를 장바구니에 \n담았습니다.", Toast.LENGTH_SHORT).show();
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).MenuList.add("딸기오레오 맥플러리");
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).PriceList.add(2800);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;}
        });

        bt7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "베리스트로베리 맥플러리를 장바구니에 \n담았습니다.", Toast.LENGTH_SHORT).show();
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).MenuList.add("베리스트로베리 맥플러리");
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).PriceList.add(3800);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;}
        });

        bt8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "허쉬 프레첼 맥플러리을 장바구니에 \n담았습니다.", Toast.LENGTH_SHORT).show();
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).MenuList.add("허쉬프레첼 맥플러리");
                ((GeneralMenuActivity)GeneralMenuActivity.main_mContext).PriceList.add(3800);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;}
        });
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}