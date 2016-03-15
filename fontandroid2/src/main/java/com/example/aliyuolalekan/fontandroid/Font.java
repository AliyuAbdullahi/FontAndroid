package com.example.aliyuolalekan.fontandroid;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by aliyuolalekan on 15/03/2016.
 */
/*
A font class used for changing fonts for buttons, editText and textViews
 */
public class Font {
  Context context;
  int type;
  /*

   */
  public Font(Context context, int type) {
    this.type = type;
    this.context = context;
  }

  public void changeFont(View view, int fontType) {
    switch (fontType) {
      case FontTypes.ALLURA:

    }
  }

  private void setTextViewTypeFace (TextView textView,  String path){
    Typeface type = Typeface.createFromAsset(context.getAssets(),path);
    textView.setTypeface (type);
  }

  private void setButtonTypeFace (Button buttonTypeFace, String path) {
    Typeface typeface = Typeface.createFromAsset (context.getAssets (), path);
    buttonTypeFace.setTypeface (typeface);
  }

  private void setEditTextTypeFace (EditText editText, String path) {
    Typeface typeface = Typeface.createFromAsset (context.getAssets (), path);
    editText.setTypeface (typeface);
  }

}
