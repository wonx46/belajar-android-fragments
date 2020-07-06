package com.example.fragment.annotation;

import android.graphics.Color;

import com.example.fragment.enumz.JenisWidgetEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface WonxWidget {

  public JenisWidgetEnum widget();

  public String id();

  public String text() default "";

  public String layout_width() default "wrap_content";

  public String layout_height() default "wrap_content";

  public String layout_centerHorizontal() default "true";

  public String layout_marginTop() default "100dp";

  public int textColor() default Color.BLACK;

  public int textSize() default 25;

  public String layout_centerInParent() default "true";

  public String layout_marginLeft() default "20dp";

  public String layout_marginRight() default "20dp";

  public int background() default Color.GREEN;;

  public String textStyle() default "bold";

  public String onClick() default "";


}
