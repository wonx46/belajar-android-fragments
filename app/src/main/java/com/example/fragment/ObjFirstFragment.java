package com.example.fragment;

import android.graphics.Color;

import com.example.fragment.annotation.WonxWidget;
import com.example.fragment.enumz.JenisWidgetEnum;

public class ObjFirstFragment {

  @WonxWidget(widget = JenisWidgetEnum.TEXTVIEW,id = "txtSample")
  private String sampletext;

  @WonxWidget(widget = JenisWidgetEnum.BUTTON,id="btnSample",text = "Fragmen satu",
    textColor = Color.WHITE, background = Color.DKGRAY,
  classAction = "com.example.fragment.FirstFragmentTes", methodAction = "tesOnClick")
  private String sampelbutton;

  public String getSampletext() {
    return sampletext;
  }

  public void setSampletext(String sampletext) {
    this.sampletext = sampletext;
  }

  public String getSampelbutton() {
    return sampelbutton;
  }

  public void setSampelbutton(String sampelbutton) {
    this.sampelbutton = sampelbutton;
  }
}
