package com.example.fragment;

import android.app.Activity;
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

import com.example.fragment.annotation.WonxWidget;
import com.example.fragment.component.CompButton;
import com.example.fragment.component.CompTextView;
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
      tes.setSampletext("hello automatic world");


      linearLayout = WidgetFactory.createFragment(ObjFirstFragment.class, linearLayout,this, tes);

      //get component
//        CompButton btn = (CompButton) WidgetFactory.getComponent("btnSample",linearLayout);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tesOnClick();
//            }
//        });

        return view;
    }

    public void tesOnClick(View view, WonxWidget ann, Activity parent){
        // get component lain
      CompTextView txt = (CompTextView) WidgetFactory.getComponent("txtSample", (ViewGroup) view.getParent());
      if(txt != null){
        Toast.makeText(parent.getApplicationContext(), txt.getText(), Toast.LENGTH_LONG).show();
      }

    }

  public void addComponent(View viewComp) {
    this.linearLayout.addView(viewComp);
  }

}
