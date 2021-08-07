package com.safectory.fragmentudemyfixed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.LayoutInflater;

public class MainActivity extends FragmentActivity {

    ListFrag fragmentA;
    DetailFrag fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        fragmentA = (ListFrag) manager.findFragmentById(R.id.listFrag);
        fragmentB = (DetailFrag) manager.findFragmentById(R.id.DetailFrag);

        fragmentA.setPositionChangeListener(new ListFrag.PositionListener() {
            @Override
            public void onPositionChange(int index) {
                fragmentB.updateTextview(index);
            }
        });
    }
}