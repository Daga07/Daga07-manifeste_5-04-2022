package com.example.menusandimages.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.menusandimages.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragmentA#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragmentA extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BlankFragmentA() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragmentA.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragmentA newInstance(String param1, String param2) {
        BlankFragmentA fragment = new BlankFragmentA();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank_a, container, false);
        ImageView imageView = v.findViewById(R.id.imageView);
        Glide.with(this)
                .load("data:image/png;base64,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")
                .into(imageView);
        return v;
    }
}