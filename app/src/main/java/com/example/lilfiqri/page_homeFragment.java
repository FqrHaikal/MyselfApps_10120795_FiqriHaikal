package com.example.lilfiqri;

//Tanggal  : 25-05-2023
//NIM      : 10120795
//Nama     : FIQRI HAIKAL
//Kelas    : IF - 9

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.lilfiqri.R;

public class page_homeFragment extends Fragment {

    private ImageView imageView_hobby, imageView_mikes;
    private Button btn_next_hobby, btn_prev_hobby, btn_next_mikes, btn_prev_mikes;
    private int i = 0;
    private int n = 0;
    private final int[] textureArrayWin ={R.drawable.travel, R.drawable.hiking,
                                    R.drawable.film, R.drawable.video, R.drawable.camp};

    private final int[] mikesArray ={R.drawable.cofee, R.drawable.avocado};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        imageView_hobby = view.findViewById(R.id.img_hobby);
        imageView_mikes = view.findViewById(R.id.img_mikes);
        btn_next_hobby = view.findViewById(R.id.btn_next_card_hobby);
        btn_prev_hobby = view.findViewById(R.id.btn_prev_card_hobby);
        btn_next_mikes = view.findViewById(R.id.btn_next_card_mikes);
        btn_prev_mikes = view.findViewById(R.id.btn_prev_card_mikes);

        if (i==0) {
            btn_prev_hobby.setVisibility(View.INVISIBLE);
        }
        if (i==4) {
            btn_next_hobby.setVisibility(View.INVISIBLE);
        }

        btn_prev_hobby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView_hobby.setImageResource(textureArrayWin[i]);
                i--;

                if (i == 0) {
                    btn_prev_hobby.setVisibility(View.INVISIBLE);
                } else {
                    btn_prev_hobby.setVisibility(View.VISIBLE);
                }
                if (i == 4) {
                    btn_next_hobby.setVisibility(View.INVISIBLE);
                } else {
                    btn_next_hobby.setVisibility(View.VISIBLE);
                }
            }
        });

        btn_next_hobby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView_hobby.setImageResource(textureArrayWin[i]);
                i++;

                if (i == 0) {
                    btn_prev_hobby.setVisibility(View.INVISIBLE);
                } else {
                    btn_prev_hobby.setVisibility(View.VISIBLE);
                }
                if (i == 4) {
                    btn_next_hobby.setVisibility(View.INVISIBLE);
                } else {
                    btn_next_hobby.setVisibility(View.VISIBLE);
                }
            }
        });

        if (n==0) {
            btn_prev_mikes.setVisibility(View.INVISIBLE);
        }
        if (n==1) {
            btn_next_mikes.setVisibility(View.INVISIBLE);
        }

        btn_prev_mikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView_mikes.setImageResource(mikesArray[n]);
                n--;

                if (n == 0) {
                    btn_prev_mikes.setVisibility(View.INVISIBLE);
                } else {
                    btn_prev_mikes.setVisibility(View.VISIBLE);
                }
                if (n == 1) {
                    btn_next_mikes.setVisibility(View.INVISIBLE);
                } else {
                    btn_next_mikes.setVisibility(View.VISIBLE);
                }
            }
        });

        btn_next_mikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView_mikes.setImageResource(mikesArray[n]);
                n++;

                if (n == 0) {
                    btn_prev_mikes.setVisibility(View.INVISIBLE);
                } else {
                    btn_prev_mikes.setVisibility(View.VISIBLE);
                }
                if (n == 1) {
                    btn_next_mikes.setVisibility(View.INVISIBLE);
                } else {
                    btn_next_mikes.setVisibility(View.VISIBLE);
                }
            }
        });

        return view;
    }
}