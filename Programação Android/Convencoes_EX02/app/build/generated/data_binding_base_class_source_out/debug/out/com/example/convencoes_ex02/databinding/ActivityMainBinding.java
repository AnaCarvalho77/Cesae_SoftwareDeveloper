// Generated by view binder compiler. Do not edit!
package com.example.convencoes_ex02.databinding;

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
import com.example.convencoes_ex02.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonLogin;

  @NonNull
  public final EditText editPassword;

  @NonNull
  public final EditText editUsername;

  @NonNull
  public final TextView textPassword;

  @NonNull
  public final TextView textUsername;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull Button buttonLogin,
      @NonNull EditText editPassword, @NonNull EditText editUsername,
      @NonNull TextView textPassword, @NonNull TextView textUsername) {
    this.rootView = rootView;
    this.buttonLogin = buttonLogin;
    this.editPassword = editPassword;
    this.editUsername = editUsername;
    this.textPassword = textPassword;
    this.textUsername = textUsername;
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
      id = R.id.button_login;
      Button buttonLogin = ViewBindings.findChildViewById(rootView, id);
      if (buttonLogin == null) {
        break missingId;
      }

      id = R.id.edit_password;
      EditText editPassword = ViewBindings.findChildViewById(rootView, id);
      if (editPassword == null) {
        break missingId;
      }

      id = R.id.edit_username;
      EditText editUsername = ViewBindings.findChildViewById(rootView, id);
      if (editUsername == null) {
        break missingId;
      }

      id = R.id.text_password;
      TextView textPassword = ViewBindings.findChildViewById(rootView, id);
      if (textPassword == null) {
        break missingId;
      }

      id = R.id.text_username;
      TextView textUsername = ViewBindings.findChildViewById(rootView, id);
      if (textUsername == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, buttonLogin, editPassword,
          editUsername, textPassword, textUsername);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
