package com.wecan.toast;


import android.content.Context;
import android.widget.Toast;

public class alert {
    public static void toastMessage(Context context, String message ){
    Toast.makeText(context, message, Toast.LENGTH_LONG ).show();
    }

}
