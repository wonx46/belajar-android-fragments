package com.example.fragment.factory;

import android.app.Activity;
import android.app.Fragment;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.fragment.annotation.WonxWidget;
import com.example.fragment.enumz.JenisWidgetEnum;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


public class WidgetFactory {

  public static LinearLayout createFragment(Class clazz, LinearLayout layout , Fragment fragment, Object obj){
    Field[] field		= clazz.getDeclaredFields();


    for (Field field2 : field) {
      Annotation[] annotation		= field2.getAnnotations();
      for (Annotation annotation2 : annotation) {
        if(annotation2 instanceof  WonxWidget){
          WonxWidget ann = (WonxWidget) annotation2;
          layout.addView(generateComponent(ann, field2, fragment.getActivity(), obj));

        }
      }
    }

return layout;
  }

  private static View generateComponent(WonxWidget ann,  Field field, Activity parent, Object obj) {
    if(ann.widget() == JenisWidgetEnum.TEXTVIEW){
       TextView t =  getGenerateText( ann, field ,parent, obj);
       return t;
    }
    if(ann.widget() == JenisWidgetEnum.BUTTON){
      Button t =  getGenerateButton( ann,field,parent, obj);
      return t;
    }
    return  null;
  }

  private static TextView getGenerateText(WonxWidget ann,  Field field, Activity parent, Object obj) {
    TextView t = new TextView(parent);

    t.setTextColor(ann.textColor());
    t.setTextSize(TypedValue.COMPLEX_UNIT_SP, ann.textSize());

//    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
//      LinearLayout.LayoutParams.WRAP_CONTENT,
//      LinearLayout.LayoutParams.WRAP_CONTENT
//    );
//    params.setMargins(left, top, right, bottom);
//    t.setLayoutParams(params);


    ViewGroup.MarginLayoutParams params1 =
      new ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
  t.setLayoutParams(params1);
//    t.setText("tezzzzz");

    if(obj!=null){
      try {
        Property property = Property.of(obj.getClass(), field.getType(), field.getName());
        String ox = (String) property.get(obj);
        if(ox!=null){
          t.setText(ox);
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    return t;
  }

  private static Button getGenerateButton(WonxWidget ann, Field field, Activity parent, Object obj) {
    Button t = new Button(parent);

    t.setTextColor(ann.textColor());
    t.setTextSize(TypedValue.COMPLEX_UNIT_SP, ann.textSize());

//    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
//      LinearLayout.LayoutParams.WRAP_CONTENT,
//      LinearLayout.LayoutParams.WRAP_CONTENT
//    );
//    params.setMargins(left, top, right, bottom);
//    t.setLayoutParams(params);


    ViewGroup.MarginLayoutParams params1 =
      new ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    t.setLayoutParams(params1);
    t.setText(ann.text());
    t.setBackgroundColor(ann.background());

//    if(obj!=null){
//      try {
//        Object ox = PropertyUtils.getProperty(obj,name );
//        if(ox!=null){
//          t.setText((String) ox);
//        }
//      } catch (Exception e) {
//        e.printStackTrace();
//      }
//    }

    return t;
  }
}
