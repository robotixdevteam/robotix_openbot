// Generated by view binder compiler. Do not edit!
package org.openbot.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openbot.R;

public final class LayoutBottomSheetBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Spinner baudRateSpinner;

  @NonNull
  public final ImageView bottomSheetArrow;

  @NonNull
  public final LinearLayout bottomSheetLayout;

  @NonNull
  public final SwitchCompat cameraToggleSwitch;

  @NonNull
  public final TextView cameraToggleText;

  @NonNull
  public final TextView connection;

  @NonNull
  public final SwitchCompat connectionSwitch;

  @NonNull
  public final TextView control;

  @NonNull
  public final TextView controlInfo;

  @NonNull
  public final Spinner controlModeSpinner;

  @NonNull
  public final TextView cropInfo;

  @NonNull
  public final Spinner deviceSpinner;

  @NonNull
  public final Spinner driveModeSpinner;

  @NonNull
  public final TextView frameInfo;

  @NonNull
  public final LinearLayout gestureLayout;

  @NonNull
  public final TextView inferenceInfo;

  @NonNull
  public final TextView labelBattery;

  @NonNull
  public final TextView labelSonar;

  @NonNull
  public final TextView labelSpeed;

  @NonNull
  public final Spinner logSpinner;

  @NonNull
  public final TextView logger;

  @NonNull
  public final SwitchCompat loggerSwitch;

  @NonNull
  public final ImageView minus;

  @NonNull
  public final Spinner modelSpinner;

  @NonNull
  public final SwitchCompat networkSwitch;

  @NonNull
  public final ImageView plus;

  @NonNull
  public final TextView sonarInfo;

  @NonNull
  public final TextView speedInfo;

  @NonNull
  public final Spinner speedModeSpinner;

  @NonNull
  public final TextView threads;

  @NonNull
  public final TextView voltageInfo;

  private LayoutBottomSheetBinding(@NonNull LinearLayout rootView, @NonNull Spinner baudRateSpinner,
      @NonNull ImageView bottomSheetArrow, @NonNull LinearLayout bottomSheetLayout,
      @NonNull SwitchCompat cameraToggleSwitch, @NonNull TextView cameraToggleText,
      @NonNull TextView connection, @NonNull SwitchCompat connectionSwitch,
      @NonNull TextView control, @NonNull TextView controlInfo, @NonNull Spinner controlModeSpinner,
      @NonNull TextView cropInfo, @NonNull Spinner deviceSpinner, @NonNull Spinner driveModeSpinner,
      @NonNull TextView frameInfo, @NonNull LinearLayout gestureLayout,
      @NonNull TextView inferenceInfo, @NonNull TextView labelBattery, @NonNull TextView labelSonar,
      @NonNull TextView labelSpeed, @NonNull Spinner logSpinner, @NonNull TextView logger,
      @NonNull SwitchCompat loggerSwitch, @NonNull ImageView minus, @NonNull Spinner modelSpinner,
      @NonNull SwitchCompat networkSwitch, @NonNull ImageView plus, @NonNull TextView sonarInfo,
      @NonNull TextView speedInfo, @NonNull Spinner speedModeSpinner, @NonNull TextView threads,
      @NonNull TextView voltageInfo) {
    this.rootView = rootView;
    this.baudRateSpinner = baudRateSpinner;
    this.bottomSheetArrow = bottomSheetArrow;
    this.bottomSheetLayout = bottomSheetLayout;
    this.cameraToggleSwitch = cameraToggleSwitch;
    this.cameraToggleText = cameraToggleText;
    this.connection = connection;
    this.connectionSwitch = connectionSwitch;
    this.control = control;
    this.controlInfo = controlInfo;
    this.controlModeSpinner = controlModeSpinner;
    this.cropInfo = cropInfo;
    this.deviceSpinner = deviceSpinner;
    this.driveModeSpinner = driveModeSpinner;
    this.frameInfo = frameInfo;
    this.gestureLayout = gestureLayout;
    this.inferenceInfo = inferenceInfo;
    this.labelBattery = labelBattery;
    this.labelSonar = labelSonar;
    this.labelSpeed = labelSpeed;
    this.logSpinner = logSpinner;
    this.logger = logger;
    this.loggerSwitch = loggerSwitch;
    this.minus = minus;
    this.modelSpinner = modelSpinner;
    this.networkSwitch = networkSwitch;
    this.plus = plus;
    this.sonarInfo = sonarInfo;
    this.speedInfo = speedInfo;
    this.speedModeSpinner = speedModeSpinner;
    this.threads = threads;
    this.voltageInfo = voltageInfo;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutBottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_bottom_sheet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutBottomSheetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.baud_rate_spinner;
      Spinner baudRateSpinner = rootView.findViewById(id);
      if (baudRateSpinner == null) {
        break missingId;
      }

      id = R.id.bottom_sheet_arrow;
      ImageView bottomSheetArrow = rootView.findViewById(id);
      if (bottomSheetArrow == null) {
        break missingId;
      }

      LinearLayout bottomSheetLayout = (LinearLayout) rootView;

      id = R.id.camera_toggle_switch;
      SwitchCompat cameraToggleSwitch = rootView.findViewById(id);
      if (cameraToggleSwitch == null) {
        break missingId;
      }

      id = R.id.camera_toggle_text;
      TextView cameraToggleText = rootView.findViewById(id);
      if (cameraToggleText == null) {
        break missingId;
      }

      id = R.id.connection;
      TextView connection = rootView.findViewById(id);
      if (connection == null) {
        break missingId;
      }

      id = R.id.connection_switch;
      SwitchCompat connectionSwitch = rootView.findViewById(id);
      if (connectionSwitch == null) {
        break missingId;
      }

      id = R.id.control;
      TextView control = rootView.findViewById(id);
      if (control == null) {
        break missingId;
      }

      id = R.id.control_info;
      TextView controlInfo = rootView.findViewById(id);
      if (controlInfo == null) {
        break missingId;
      }

      id = R.id.control_mode_spinner;
      Spinner controlModeSpinner = rootView.findViewById(id);
      if (controlModeSpinner == null) {
        break missingId;
      }

      id = R.id.crop_info;
      TextView cropInfo = rootView.findViewById(id);
      if (cropInfo == null) {
        break missingId;
      }

      id = R.id.device_spinner;
      Spinner deviceSpinner = rootView.findViewById(id);
      if (deviceSpinner == null) {
        break missingId;
      }

      id = R.id.drive_mode_spinner;
      Spinner driveModeSpinner = rootView.findViewById(id);
      if (driveModeSpinner == null) {
        break missingId;
      }

      id = R.id.frame_info;
      TextView frameInfo = rootView.findViewById(id);
      if (frameInfo == null) {
        break missingId;
      }

      id = R.id.gesture_layout;
      LinearLayout gestureLayout = rootView.findViewById(id);
      if (gestureLayout == null) {
        break missingId;
      }

      id = R.id.inference_info;
      TextView inferenceInfo = rootView.findViewById(id);
      if (inferenceInfo == null) {
        break missingId;
      }

      id = R.id.label_battery;
      TextView labelBattery = rootView.findViewById(id);
      if (labelBattery == null) {
        break missingId;
      }

      id = R.id.label_sonar;
      TextView labelSonar = rootView.findViewById(id);
      if (labelSonar == null) {
        break missingId;
      }

      id = R.id.label_speed;
      TextView labelSpeed = rootView.findViewById(id);
      if (labelSpeed == null) {
        break missingId;
      }

      id = R.id.log_spinner;
      Spinner logSpinner = rootView.findViewById(id);
      if (logSpinner == null) {
        break missingId;
      }

      id = R.id.logger;
      TextView logger = rootView.findViewById(id);
      if (logger == null) {
        break missingId;
      }

      id = R.id.logger_switch;
      SwitchCompat loggerSwitch = rootView.findViewById(id);
      if (loggerSwitch == null) {
        break missingId;
      }

      id = R.id.minus;
      ImageView minus = rootView.findViewById(id);
      if (minus == null) {
        break missingId;
      }

      id = R.id.model_spinner;
      Spinner modelSpinner = rootView.findViewById(id);
      if (modelSpinner == null) {
        break missingId;
      }

      id = R.id.network_switch;
      SwitchCompat networkSwitch = rootView.findViewById(id);
      if (networkSwitch == null) {
        break missingId;
      }

      id = R.id.plus;
      ImageView plus = rootView.findViewById(id);
      if (plus == null) {
        break missingId;
      }

      id = R.id.sonar_info;
      TextView sonarInfo = rootView.findViewById(id);
      if (sonarInfo == null) {
        break missingId;
      }

      id = R.id.speed_info;
      TextView speedInfo = rootView.findViewById(id);
      if (speedInfo == null) {
        break missingId;
      }

      id = R.id.speed_mode_spinner;
      Spinner speedModeSpinner = rootView.findViewById(id);
      if (speedModeSpinner == null) {
        break missingId;
      }

      id = R.id.threads;
      TextView threads = rootView.findViewById(id);
      if (threads == null) {
        break missingId;
      }

      id = R.id.voltage_info;
      TextView voltageInfo = rootView.findViewById(id);
      if (voltageInfo == null) {
        break missingId;
      }

      return new LayoutBottomSheetBinding((LinearLayout) rootView, baudRateSpinner,
          bottomSheetArrow, bottomSheetLayout, cameraToggleSwitch, cameraToggleText, connection,
          connectionSwitch, control, controlInfo, controlModeSpinner, cropInfo, deviceSpinner,
          driveModeSpinner, frameInfo, gestureLayout, inferenceInfo, labelBattery, labelSonar,
          labelSpeed, logSpinner, logger, loggerSwitch, minus, modelSpinner, networkSwitch, plus,
          sonarInfo, speedInfo, speedModeSpinner, threads, voltageInfo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}