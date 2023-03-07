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
 * Use the {@link EasyMenuMuffin#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EasyMenuMuffin extends Fragment implements View.OnClickListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    //private static Context mContext;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    //public EasyMenuMuffin(Context context) {mContext = context;}

    public EasyMenuMuffin(){

    }
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EasyMenuMuffin.
     */
    // TODO: Rename and change types and number of parameters
    public static EasyMenuMuffin newInstance(String param1, String param2) {
        EasyMenuMuffin fragment = new EasyMenuMuffin();
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

        View view = inflater.inflate(R.layout.fragment_easy_menu_muffin,container,false);
        ImageButton bt1 = (ImageButton) view.findViewById(R.id.egg);
        ImageButton bt2 = (ImageButton) view.findViewById(R.id.baconegg);
        ImageButton bt3 = (ImageButton) view.findViewById(R.id.chickencheese);


        bt1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "에그 맥머핀을 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).MenuList.add("에그맥머핀");
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).PriceList.add(3900);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;}
        });

        bt2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "베이컨에그 맥머핀을 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).MenuList.add("베이컨에그 맥머핀");
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).PriceList.add(3900);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;}
        });

        bt3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "치킨치크 머핀을 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).MenuList.add("치킨치크 머핀");
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).PriceList.add(3900);
                ((MainActivity) MainActivity.main_tContext).TimeLeft  = ((MainActivity) MainActivity.main_tContext).TimeLeft + 60000*2;}
        });
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}