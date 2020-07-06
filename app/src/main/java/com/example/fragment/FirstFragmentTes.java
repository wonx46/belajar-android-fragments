package com.example.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fragment.component.CompButton;
import com.example.fragment.factory.WidgetFactory;

//import androidx.annotation.Nullable;

public class FirstFragmentTes extends Fragment {


    View view;
    LinearLayout linearLayout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.first_fragment_tes, container, false);
        linearLayout = (LinearLayout)view.findViewById(R.id.layoutlin);


      ObjFirstFragment tes = new ObjFirstFragment();
      tes.setSampletext("Ya salam");


      linearLayout = WidgetFactory.createFragment(ObjFirstFragment.class, linearLayout,this, tes);

      //get component
        CompButton btn = (CompButton) WidgetFactory.getComponent("btnSample",linearLayout);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tesOnClick();
            }
        });
        return view;
    }

    public void tesOnClick(){
        Toast.makeText(getActivity(), "First Fragment", Toast.LENGTH_LONG).show();
    }

  public void addComponent(View viewComp) {
    this.linearLayout.addView(viewComp);
  }
//
//  @Nullable
//  @Override
//  public View getView() {
//    return view;
//  }
//
//  public void setView(View view) {
//    this.view = view;
//  }
//
//  public LinearLayout getLinearLayout() {
//    return linearLayout;
//  }
//
//  public void setLinearLayout(LinearLayout linearLayout) {
//    this.linearLayout = linearLayout;
//  }
}
