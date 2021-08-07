package com.safectory.fragmentudemyfixed;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class ListFrag extends ListFragment {

    PositionListener activity;

    ListView listView;

    public interface PositionListener {

        public void onPositionChange(int index);
    }

    public ListFrag() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<String> data = new ArrayList<String>();
        data.add("1. This is Item 1");
        data.add("2. This is Item 2");
        data.add("3. This is Item 3");
        listView=(ListView)view.findViewById(R.id.lvList);

        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data));
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {

        activity.onPositionChange(position);

    }

    public void setPositionChangeListener(PositionListener activity) {
        this.activity = activity;
    }


}