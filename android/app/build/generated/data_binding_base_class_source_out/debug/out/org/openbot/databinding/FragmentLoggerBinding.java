// Generated by view binder compiler. Do not edit!
package org.openbot.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openbot.R;

public final class FragmentLoggerBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final TextView analyseText;

  @NonNull
  public final ImageView cameraToggle;

  @NonNull
  public final ControlButtonsBinding controllerContainer;

  @NonNull
  public final TextView cropInfo;

  @NonNull
  public final TextView frameInfo;

  @NonNull
  public final TextView ipAddress;

  @NonNull
  public final ConstraintLayout linearLayout2;

  @NonNull
  public final ConstraintLayout loggerBottomSheet;

  @NonNull
  public final SwitchCompat loggerSwitch;

  @NonNull
  public final Spinner modelSpinner;

  @NonNull
  public final CheckBox previewCheckBox;

  @NonNull
  public final TextView previewText;

  @NonNull
  public final Spinner resolutionSpinner;

  @NonNull
  public final Button sensorDataButton;

  @NonNull
  public final TextView server;

  @NonNull
  public final Spinner serverSpinner;

  @NonNull
  public final CheckBox trainingDataCheckBox;

  @NonNull
  public final CheckBox usbToggle;

  @NonNull
  public final View view;

  private FragmentLoggerBinding(@NonNull CoordinatorLayout rootView, @NonNull TextView analyseText,
      @NonNull ImageView cameraToggle, @NonNull ControlButtonsBinding controllerContainer,
      @NonNull TextView cropInfo, @NonNull TextView frameInfo, @NonNull TextView ipAddress,
      @NonNull ConstraintLayout linearLayout2, @NonNull ConstraintLayout loggerBottomSheet,
      @NonNull SwitchCompat loggerSwitch, @NonNull Spinner modelSpinner,
      @NonNull CheckBox previewCheckBox, @NonNull TextView previewText,
      @NonNull Spinner resolutionSpinner, @NonNull Button sensorDataButton,
      @NonNull TextView server, @NonNull Spinner serverSpinner,
      @NonNull CheckBox trainingDataCheckBox, @NonNull CheckBox usbToggle, @NonNull View view) {
    this.rootView = rootView;
    this.analyseText = analyseText;
    this.cameraToggle = cameraToggle;
    this.controllerContainer = controllerContainer;
    this.cropInfo = cropInfo;
    this.frameInfo = frameInfo;
    this.ipAddress = ipAddress;
    this.linearLayout2 = linearLayout2;
    this.loggerBottomSheet = loggerBottomSheet;
    this.loggerSwitch = loggerSwitch;
    this.modelSpinner = modelSpinner;
    this.previewCheckBox = previewCheckBox;
    this.previewText = previewText;
    this.resolutionSpinner = resolutionSpinner;
    this.sensorDataButton = sensorDataButton;
    this.server = server;
    this.serverSpinner = serverSpinner;
    this.trainingDataCheckBox = trainingDataCheckBox;
    this.usbToggle = usbToggle;
    this.view = view;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLoggerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLoggerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_logger, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLoggerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.analyseText;
      TextView analyseText = rootView.findViewById(id);
      if (analyseText == null) {
        break missingId;
      }

      id = R.id.camera_toggle;
      ImageView cameraToggle = rootView.findViewById(id);
      if (cameraToggle == null) {
        break missingId;
      }

      id = R.id.controllerContainer;
      View controllerContainer = rootView.findViewById(id);
      if (controllerContainer == null) {
        break missingId;
      }
      ControlButtonsBinding binding_controllerContainer = ControlButtonsBinding.bind(controllerContainer);

      id = R.id.crop_info;
      TextView cropInfo = rootView.findViewById(id);
      if (cropInfo == null) {
        break missingId;
      }

      id = R.id.frame_info;
      TextView frameInfo = rootView.findViewById(id);
      if (frameInfo == null) {
        break missingId;
      }

      id = R.id.ipAddress;
      TextView ipAddress = rootView.findViewById(id);
      if (ipAddress == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      ConstraintLayout linearLayout2 = rootView.findViewById(id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.loggerBottomSheet;
      ConstraintLayout loggerBottomSheet = rootView.findViewById(id);
      if (loggerBottomSheet == null) {
        break missingId;
      }

      id = R.id.logger_switch;
      SwitchCompat loggerSwitch = rootView.findViewById(id);
      if (loggerSwitch == null) {
        break missingId;
      }

      id = R.id.model_spinner;
      Spinner modelSpinner = rootView.findViewById(id);
      if (modelSpinner == null) {
        break missingId;
      }

      id = R.id.previewCheckBox;
      CheckBox previewCheckBox = rootView.findViewById(id);
      if (previewCheckBox == null) {
        break missingId;
      }

      id = R.id.previewText;
      TextView previewText = rootView.findViewById(id);
      if (previewText == null) {
        break missingId;
      }

      id = R.id.resolution_spinner;
      Spinner resolutionSpinner = rootView.findViewById(id);
      if (resolutionSpinner == null) {
        break missingId;
      }

      id = R.id.sensorDataButton;
      Button sensorDataButton = rootView.findViewById(id);
      if (sensorDataButton == null) {
        break missingId;
      }

      id = R.id.server;
      TextView server = rootView.findViewById(id);
      if (server == null) {
        break missingId;
      }

      id = R.id.server_spinner;
      Spinner serverSpinner = rootView.findViewById(id);
      if (serverSpinner == null) {
        break missingId;
      }

      id = R.id.trainingDataCheckBox;
      CheckBox trainingDataCheckBox = rootView.findViewById(id);
      if (trainingDataCheckBox == null) {
        break missingId;
      }

      id = R.id.usbToggle;
      CheckBox usbToggle = rootView.findViewById(id);
      if (usbToggle == null) {
        break missingId;
      }

      id = R.id.view;
      View view = rootView.findViewById(id);
      if (view == null) {
        break missingId;
      }

      return new FragmentLoggerBinding((CoordinatorLayout) rootView, analyseText, cameraToggle,
          binding_controllerContainer, cropInfo, frameInfo, ipAddress, linearLayout2,
          loggerBottomSheet, loggerSwitch, modelSpinner, previewCheckBox, previewText,
          resolutionSpinner, sensorDataButton, server, serverSpinner, trainingDataCheckBox,
          usbToggle, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
