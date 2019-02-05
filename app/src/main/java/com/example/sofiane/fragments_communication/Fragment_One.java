package com.example.sofiane.fragments_communication;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Fragment_One extends Fragment {


    private SendMessage sendMessage;
    private EditText userInput;
    private String userData;

    public Fragment_One() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        userInput = (EditText)view.findViewById(R.id.user_input);
        Button update = (Button)view.findViewById(R.id.button);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userInput.getText().toString().equals("")){
                    Toast.makeText(getActivity(), "User input value must be filled", Toast.LENGTH_LONG).show();
                    return;
                }
                userData = userInput.getText().toString();
                onButtonPressed(userData);
            }
        });
        return view;
    }

    public void onButtonPressed(String userContent) {
        if (sendMessage != null) {
            sendMessage.send(userContent);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            sendMessage = (SendMessage) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement SendMessage");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        sendMessage = null;
    }

    public interface SendMessage {
        public void send(String userContent);
    }
}
