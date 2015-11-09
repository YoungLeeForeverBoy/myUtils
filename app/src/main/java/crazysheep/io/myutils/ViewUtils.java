package crazysheep.io.myutils;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.View;

/**
 * utility for view.
 *
 * Created by crazysheep on 15/11/10.
 */
public class ViewUtils {

    public static final String TAG = ViewUtils.class.getSimpleName();

    /**
     * I DO NOT want use findViewById(), you can use butterknife, or this
     * */
    public static <T extends View> T find(@NonNull Activity activity, int resId) {
        return (T) activity.findViewById(resId);
    }

    public static <T extends View> T find(@NonNull View parent, int resId) {
        return (T) parent.findViewById(resId);
    }

}
