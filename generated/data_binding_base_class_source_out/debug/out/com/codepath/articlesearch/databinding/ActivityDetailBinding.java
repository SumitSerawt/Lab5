// Generated by view binder compiler. Do not edit!
package com.codepath.articlesearch.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.codepath.articlesearch.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout detailLayout;

  @NonNull
  public final TextView mediaAbstract;

  @NonNull
  public final TextView mediaByline;

  @NonNull
  public final ImageView mediaImage;

  @NonNull
  public final TextView mediaTitle;

  private ActivityDetailBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout detailLayout, @NonNull TextView mediaAbstract,
      @NonNull TextView mediaByline, @NonNull ImageView mediaImage, @NonNull TextView mediaTitle) {
    this.rootView = rootView;
    this.detailLayout = detailLayout;
    this.mediaAbstract = mediaAbstract;
    this.mediaByline = mediaByline;
    this.mediaImage = mediaImage;
    this.mediaTitle = mediaTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout detailLayout = (ConstraintLayout) rootView;

      id = R.id.mediaAbstract;
      TextView mediaAbstract = ViewBindings.findChildViewById(rootView, id);
      if (mediaAbstract == null) {
        break missingId;
      }

      id = R.id.mediaByline;
      TextView mediaByline = ViewBindings.findChildViewById(rootView, id);
      if (mediaByline == null) {
        break missingId;
      }

      id = R.id.mediaImage;
      ImageView mediaImage = ViewBindings.findChildViewById(rootView, id);
      if (mediaImage == null) {
        break missingId;
      }

      id = R.id.mediaTitle;
      TextView mediaTitle = ViewBindings.findChildViewById(rootView, id);
      if (mediaTitle == null) {
        break missingId;
      }

      return new ActivityDetailBinding((ConstraintLayout) rootView, detailLayout, mediaAbstract,
          mediaByline, mediaImage, mediaTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
