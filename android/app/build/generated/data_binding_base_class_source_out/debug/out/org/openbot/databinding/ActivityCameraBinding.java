// Generated by view binder compiler. Do not edit!
package org.openbot.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openbot.R;

public final class ActivityCameraBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final LayoutBottomSheetBinding bottomSheetLayout;

  @NonNull
  public final FrameLayout container;

  @NonNull
  public final Toolbar toolbar;

  private ActivityCameraBinding(@NonNull CoordinatorLayout rootView,
      @NonNull LayoutBottomSheetBinding bottomSheetLayout, @NonNull FrameLayout container,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.bottomSheetLayout = bottomSheetLayout;
    this.container = container;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCameraBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCameraBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_camera, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCameraBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottom_sheet_layout;
      View bottomSheetLayout = rootView.findViewById(id);
      if (bottomSheetLayout == null) {
        break missingId;
      }
      LayoutBottomSheetBinding binding_bottomSheetLayout = LayoutBottomSheetBinding.bind(bottomSheetLayout);

      id = R.id.container;
      FrameLayout container = rootView.findViewById(id);
      if (container == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityCameraBinding((CoordinatorLayout) rootView, binding_bottomSheetLayout,
          container, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
