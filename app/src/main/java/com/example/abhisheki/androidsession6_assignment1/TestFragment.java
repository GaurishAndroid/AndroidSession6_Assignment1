package com.example.abhisheki.androidsession6_assignment1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class TestFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    TextView txt;
    EditText edttxt;
    public TestFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test,
                container, false);
        Button button = (Button) view.findViewById(R.id.btnClick);
        txt = (TextView) view.findViewById(R.id.txtView);
        edttxt  = (EditText) view.findViewById(R.id.edittext);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                txt.setText(edttxt.getText());
          }
        });

        return view;
    }


}
