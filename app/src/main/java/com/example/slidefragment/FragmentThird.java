package com.example.slidefragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class FragmentThird extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_3p, container, false);

        ImageView banner = rootView.findViewById(R.id.imgBanner3);

        banner.setImageResource(R.drawable.top3banner_watermelon);

        banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WATERMELON.class);
                startActivity(intent);
            }
        });

        return rootView;
    }

}