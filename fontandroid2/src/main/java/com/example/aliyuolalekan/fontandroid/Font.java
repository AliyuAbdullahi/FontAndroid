package com.example.aliyuolalekan.fontandroid;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.BrokenBarrierException;

/**
 * Created by aliyuolalekan on 15/03/2016.
 */
/*
A font class used for changing fonts for buttons, editText and textViews
 */
public class Font {
  Context context;
  int type;

  /**
   *
   * @param context
   * @param type
   */
  public Font(Context context, int type) {
    this.type = type;
    this.context = context;
  }

  /**
   *
   * @param view
   * @param fontType
   */
  public void changeFont(View view, int fontType) {
    switch (fontType) {
      case FontTypes.ALLURA:
      setTypeface (view, FontPaths.ALLURA);
        break;
      case FontTypes.ALPHABET_FANTACY:
        setTypeface (view, FontPaths.ALPHABET_FANTACY);
        break;
      case FontTypes.BLACK_JACK:
        setTypeface (view, FontPaths.BLACK_JACK);
        break;
      case FontTypes.BONDONI:
        setTypeface (view, FontPaths.BONDONI);
        break;
      case FontTypes.CAPTURE_IT:
        setTypeface (view, FontPaths.CAPTURE_IT);
        break;
      case FontTypes.CONSISTENCY_MEASURE:
        setTypeface (view, FontPaths.CONSISTENCY_MEASURE);
        break;
      case FontTypes.GOOD_DOG:
        setTypeface (view, FontPaths.GOOD_DOG);
        break;
      case FontTypes.GREATE_VIBES:
        setTypeface (view, FontPaths.GREATE_VIBES);
        break;
      case FontTypes.KENTUKY:
        setTypeface (view, FontPaths.KENTUKY);
        break;
      case FontTypes.LEARNING_CURVE:
        setTypeface (view, FontPaths.LEARNING_CURVE);
        break;
      case FontTypes.LOBSTER_REGULAR:
        setTypeface (view, FontPaths.LOBSTER_REGULAR);
        break;
      case FontTypes.PACIFICO:
        setTypeface (view, FontPaths.PACIFICO);
        break;
      case FontTypes.PLANET:
        setTypeface (view, FontPaths.PLANET);
        break;
      case FontTypes.REGENCY_SCRIPT:
        setTypeface (view, FontPaths.REGENCY_SCRIPT);
        break;
      case FontTypes.ROBOTO:
        setTypeface (view, FontPaths.ROBOTO);
        break;
      case FontTypes.SAIL:
        setTypeface (view, FontPaths.SAIL);
        break;
      case FontTypes.SNIFFING_PAINT:
        setTypeface (view, FontPaths.SNIFFING_PAINT);
        break;
      case FontTypes.TITANIUM:
        setTypeface (view, FontPaths.TITILLIUM);
        break;
    }
  }

  /**
   *
   * @param textView is a textview widget
   * @param path is the string path to the location of the font in the asset folder
   */
  private void setTextViewTypeFace (TextView textView,  String path){
    Typeface type = Typeface.createFromAsset(context.getAssets(),path);
    textView.setTypeface (type);
  }

  /**
   *
   * @param buttonTypeFace is the button widget whose typeface is to be changed
   * @param path is a string that represent the path to the location of the font in the asset
   *             folder
   */
  private void setButtonTypeFace (Button buttonTypeFace, String path) {
    Typeface typeface = Typeface.createFromAsset (context.getAssets (), path);
    buttonTypeFace.setTypeface (typeface);
  }

  /**
   *
   * @param editText is an EditText widget whose typeface is to be changed.
   * @param path is a string representing the path to the font to be used, located in asset folder
   */
  private void setEditTextTypeFace (EditText editText, String path) {
    Typeface typeface = Typeface.createFromAsset (context.getAssets (), path);
    editText.setTypeface (typeface);
  }

  /**
   *
   * @param view represents the widget whose font is to be changed
   * @param path is a string representing the path of the font in the asset folder
   */
  public void setTypeface (View view, String path) {
    if(view instanceof  Button) {
      setButtonTypeFace ((Button)view, FontPaths.ALPHABET_FANTACY);
    }
    else if(view instanceof TextView) {
      setTextViewTypeFace ((TextView)view, FontPaths.ALPHABET_FANTACY);
    }
    else if (view instanceof  EditText) {
      setEditTextTypeFace ((EditText) view, FontPaths.ALPHABET_FANTACY);
    }
  }

}
