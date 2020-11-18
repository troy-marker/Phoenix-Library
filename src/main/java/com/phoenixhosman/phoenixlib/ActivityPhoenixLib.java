package com.phoenixhosman.phoenixlib;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;




import static android.view.View.inflate;

public class ActivityPhoenixLib extends Activity {

    /**
     * While not needed, this constructor makes calls to the member method of the class
     * to clear errors in the editor.
     */
    public ActivityPhoenixLib() {

        String dummy = InputDialog(this, "");


        if (dummy.equals("")) {
            Error(this, "", false);
            Success(this,"",0);
        }
    }

    /**
     * This method displays a dialog box with an error message and a close button.
     * @param strError the error message to display
     */
    public void Error(Context context, @NonNull String strError, Boolean exit) {
        if (strError.equals("")) {
            return;
        }
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(context);
        View view = inflate(context, R.layout.dialog_error, null);
        Button btnExit = view.findViewById(R.id.btnExitButton);
        Button btnError = view.findViewById(R.id.btnErrorMessage);
        btnError.setText(strError);
        mBuilder.setView(view);
        AlertDialog dialog = mBuilder.create();
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.show();
        btnExit.setOnClickListener(v -> {
            dialog.dismiss();
            if (exit) System.exit(0);
        });
    }

    /**
     * This method displays a dialog box with a message and a close button.
     * It also has an auto close function to auto close after a specified number of seconds.
     * @param strMessage the message to display
     */
    public void Success(Context context, @NonNull String strMessage, Integer autoclose) {
        if (strMessage.equals("")) {
            return;
        }
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(context);
        View view = inflate(context, R.layout.dialog_success, null);
        Button btnExit = view.findViewById(R.id.btnButton);
        Button btnError = view.findViewById(R.id.btnMessage);
        btnError.setText(strMessage);
        mBuilder.setView(view);
        AlertDialog dialog = mBuilder.create();
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.show();
        btnExit.setOnClickListener(v -> dialog.dismiss());
        new Handler().postDelayed(dialog::dismiss, autoclose * 1000);
    }

    /**
     * This method show an input box to get string input from the user.
     * @param strPrompt - the dialog prompt
     */
    public String InputDialog(Context context, String strPrompt) {
        if (strPrompt.equals("")) {
            return "";
        }
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(context);
        final String[] retval = new String[1];
        View view = inflate(context, R.layout.dialog_input, null);
        TextView txtPrompt = view.findViewById(R.id.txtPrompt);
        EditText edtLockPass = view.findViewById(R.id.edtLockPass);
        Button btnEnter = view.findViewById(R.id.btnEnter);
        txtPrompt.setText(getString(R.string.input_prompt, strPrompt));
        mBuilder.setView(view);
        AlertDialog dialog = mBuilder.create();
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.show();
        btnEnter.setOnClickListener(v -> {
            if (edtLockPass.getText().toString().equals("")) {
                retval[0] = "";
            } else {
                retval[0] = edtLockPass.getText().toString();
            }
        });
        dialog.dismiss();
        return retval[0];
    }
}