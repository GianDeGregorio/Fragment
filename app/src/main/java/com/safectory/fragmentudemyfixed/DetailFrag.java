package com.safectory.fragmentudemyfixed;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailFrag extends Fragment {

    TextView textView;

    public DetailFrag() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        textView = (TextView) view.findViewById(R.id.tvDescription);
        // Inflate the layout for this fragment
        return view;
    }

    public void updateTextview(int pos){

        ArrayList<String> descriptions = new ArrayList<String>();
        descriptions.add("1. This is descriptions 1");
        descriptions.add("2. This is descriptions 2");
        descriptions.add("3. This is descriptions 3");

        textView.setText(descriptions.get(pos));
    }
}