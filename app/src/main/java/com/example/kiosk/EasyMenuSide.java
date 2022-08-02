package com.example.kiosk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EasyMenuSide#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EasyMenuSide extends Fragment implements View.OnClickListener{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EasyMenuSide() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EasyMenuSide.
     */
    // TODO: Rename and change types and number of parameters
    public static EasyMenuSide newInstance(String param1, String param2) {
        EasyMenuSide fragment = new EasyMenuSide();
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
        View view = inflater.inflate(R.layout.fragment_easy_menu_side,container,false);
        ImageButton bt1 = (ImageButton) view.findViewById(R.id.frenchfries);
        ImageButton bt2 = (ImageButton) view.findViewById(R.id.cheesestick);
        ImageButton bt3 = (ImageButton) view.findViewById(R.id.hashbrown);
        ImageButton bt4 = (ImageButton) view.findViewById(R.id.mcnuggets);
        ImageButton bt5 = (ImageButton) view.findViewById(R.id.mcwings);
        ImageButton bt6 = (ImageButton) view.findViewById(R.id.shanghaichickensnack);
        ImageButton bt7 = (ImageButton) view.findViewById(R.id.chickentomatosnack);
        ImageButton bt8 = (ImageButton) view.findViewById(R.id.coleslaw);

        bt1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "후렌치 후라이를 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((EasyMenuActivity) EasyMenuActivity.main_mContext).MenuList.add("후렌치 후라이");
                ((EasyMenuActivity) EasyMenuActivity.main_mContext).PriceList.add(1800);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "골든 모짜렐라 치즈스틱을 장바구니에 \n담았습니다.", Toast.LENGTH_SHORT).show();
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).MenuList.add("골든 모짜렐라 치즈스틱");
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).PriceList.add(2100);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "해시 브라운을 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).MenuList.add("해시 브라운");
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).PriceList.add(1800);}
        });

        bt4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "맥너겟을 장바구니 담았습니다.", Toast.LENGTH_SHORT).show();
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).MenuList.add("맥 너겟");
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).PriceList.add(2800);}
        });

        bt5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "멕윙을 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).MenuList.add("맥윙");
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).PriceList.add(3200);}
        });

        bt6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "상하이 치킨 스낵랩을 장바구니에 \n담았습니다.", Toast.LENGTH_SHORT).show();
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).MenuList.add("상하이 치킨 스낵랩");
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).PriceList.add(3800);}
        });

        bt7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "치킨 토마토 스낵랩을 장바구니에 \n담았습니다.", Toast.LENGTH_SHORT).show();
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).MenuList.add("치킨 토마토 스낵랩");
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).PriceList.add(3800);}
        });

        bt8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "코올슬로를 장바구니에 담았습니다.", Toast.LENGTH_SHORT).show();
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).MenuList.add("코울슬로");
                ((EasyMenuActivity)EasyMenuActivity.main_mContext).PriceList.add(1600);}
        });
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}