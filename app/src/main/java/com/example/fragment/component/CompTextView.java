package com.example.fragment.component;


import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

@SuppressLint("AppCompatCustomView")
public class CompTextView extends TextView {

  private String idnya;

  public String getIdnya() {
    return idnya;
  }

  public void setIdnya(String idnya) {
    this.idnya = idnya;
  }

  public CompTextView(Context context) {
    super(context);
  }

  public CompTextView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public CompTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  public CompTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
  }
}
