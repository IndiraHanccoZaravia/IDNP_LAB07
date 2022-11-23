package com.example.idnp_lab07;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

public class Fragment2 extends Fragment {
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        view =inflater.inflate(R.layout.l_fragment2,container,false);

        Button button= view.findViewById(R.id.sendto1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = view.findViewById(R.id.data2);
                Bundle result = new Bundle();
                result.putString("df2",editText.getText().toString());
                getParentFragmentManager().setFragmentResult("dataFrom2",result);
                editText.setText("");
            }
        });

        getParentFragmentManager().setFragmentResultListener("dataFrom1", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {

                String data = result.getString("df1");
                TextView textView = view.findViewById(R.id.dataFrom1);
                textView.setText(data);
            }
        });



        return view;
    }
}
