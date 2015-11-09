package crazysheep.io.myutils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

/**
 * utility class for activity or fragment.
 *
 * Created by crazysheep on 15/11/10.
 */
public class ActivityUtils {

    public static final String TAG = ActivityUtils.class.getSimpleName();

    /**
     * start activity
     * */
    public static void start(@NonNull Context context, @NonNull Class<? extends Activity> clazz) {
        context.startActivity(new Intent(context, clazz));
    }

    /**
     * build intent
     * */
    public static Intent buildIntent(@NonNull Context context, Class<? extends Activity> clazz) {
        return new Intent(context, clazz);
    }

    /**
     * start activity for result from activity
     * */
    public static void startForResult(@NonNull Activity activity, int requestCode,
                                      @NonNull Intent intent) {
        activity.startActivityForResult(intent, requestCode);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public static void startForResult(@NonNull Activity activity, int requestCode,
                                      @NonNull Intent intent, Bundle options) {
        activity.startActivityForResult(intent, requestCode, options);
    }

    /**
     * start activity for result from fragment
     * */
    public static void startForResult(@NonNull Fragment ft, int requestCode,
                                      @NonNull Intent intent) {
        ft.startActivityForResult(intent, requestCode);
    }
}
