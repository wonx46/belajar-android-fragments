package com.example.fragment.component;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

@SuppressLint("AppCompatCustomView")
public class CompButton extends Button {

    private String idnya;

    public String getIdnya() {
        return idnya;
    }

    public void setIdnya(String idnya) {
        this.idnya = idnya;
    }


    public CompButton(Context context) {
        super(context);
    }

    public CompButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CompButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CompButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
