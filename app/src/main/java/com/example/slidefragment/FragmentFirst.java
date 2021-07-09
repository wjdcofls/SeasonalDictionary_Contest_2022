package com.example.slidefragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class FragmentFirst extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_1p, container, false);

        ImageView banner = rootView.findViewById(R.id.imgBanner1);

        banner.setImageResource(R.drawable.top3banner_tomato);

        return rootView;

        imgBanner1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TOMATO.class);
                startActivity(intent);
            }
        });
    }


}