package com.owner.library.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by GaoJian on 2017/4/26.
 */

public class ToastUtils {
    public static void showShort(Context context, String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }

    public static void showShort(Context context, int msgResId){
        Toast.makeText(context,msgResId,Toast.LENGTH_SHORT).show();
    }
}
