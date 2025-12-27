package com.example.cninterface;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentA extends Fragment {

    NavigationListener navigationListener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        navigationListener = (NavigationListener) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        Button btn = view.findViewById(R.id.btnToB);

        btn.setOnClickListener(v -> navigationListener.goToB());

        return view;
    }
}
