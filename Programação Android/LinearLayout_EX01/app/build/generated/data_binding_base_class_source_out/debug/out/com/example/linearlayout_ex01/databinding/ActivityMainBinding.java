// Generated by view binder compiler. Do not edit!
package com.example.linearlayout_ex01.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.linearlayout_ex01.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonConverter;

  @NonNull
  public final EditText editValorEuros;

  @NonNull
  public final TextView textValorDolares;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull Button buttonConverter,
      @NonNull EditText editValorEuros, @NonNull TextView textValorDolares) {
    this.rootView = rootView;
    this.buttonConverter = buttonConverter;
    this.editValorEuros = editValorEuros;
    this.textValorDolares = textValorDolares;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_converter;
      Button buttonConverter = ViewBindings.findChildViewById(rootView, id);
      if (buttonConverter == null) {
        break missingId;
      }

      id = R.id.edit_valor_euros;
      EditText editValorEuros = ViewBindings.findChildViewById(rootView, id);
      if (editValorEuros == null) {
        break missingId;
      }

      id = R.id.text_valor_dolares;
      TextView textValorDolares = ViewBindings.findChildViewById(rootView, id);
      if (textValorDolares == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, buttonConverter, editValorEuros,
          textValorDolares);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
