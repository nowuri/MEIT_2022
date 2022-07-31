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
 * Use the {@link MenuMuffin#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuMuffin extends Fragment implements View.OnClickListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private static Context mContext;

    public MenuMuffin(Context context){
        mContext = context;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MenuMuffin.
     */
    // TODO: Rename and change types and number of parameters
    public static MenuMuffin newInstance(String param1, String param2) {
        MenuMuffin fragment = new MenuMuffin(mContext);
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
        View view = inflater.inflate(R.layout.fragment_menu_muffin,container,false);
        ImageButton bt1 = (ImageButton) view.findViewById(R.id.egg);
        ImageButton bt2 = (ImageButton) view.findViewById(R.id.baconegg);
        ImageButton bt3 = (ImageButton) view.findViewById(R.id.chickencheese);

        //장바구니 버튼 누르면 CartActivity2로 이동
        Button mBtn = (Button) view.findViewById(R.id.cartButton);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)MainActivity.main_mContext).NextPage();
            }
        });

        bt1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "에그 맥머핀을 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((MainActivity)MainActivity.main_mContext).MenuList.add("에그맥머핀");
                ((MainActivity)MainActivity.main_mContext).PriceList.add(3900);}
        });

        bt2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "베이컨에그 맥머핀을 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((MainActivity)MainActivity.main_mContext).MenuList.add("베이컨에그 맥머핀");
                ((MainActivity)MainActivity.main_mContext).PriceList.add(3900);}
        });

        bt3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "치킨치크 머핀을 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((MainActivity)MainActivity.main_mContext).MenuList.add("치킨치크 머핀");
                ((MainActivity)MainActivity.main_mContext).PriceList.add(3900);}
        });
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}