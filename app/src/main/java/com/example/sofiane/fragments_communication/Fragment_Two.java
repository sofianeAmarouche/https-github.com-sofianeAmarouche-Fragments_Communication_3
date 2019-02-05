package com.example.sofiane.fragments_communication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Two extends Fragment {


    private TextView updateText;

    public Fragment_Two() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        updateText = (TextView)view.findViewById(R.id.text_update);
        return view;
    }

    public void updateTextField(String newText){
        updateText.setText(newText);
    }
}
