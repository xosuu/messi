package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.eg;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(DateTimeConstants.HOURS_PER_DAY)
public class zzv extends zzu {
    @Override // com.google.android.gms.ads.internal.util.zzab
    public final boolean zzd(Activity activity, Configuration configuration) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4089o4)).booleanValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4108q4)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        int iZzy = com.google.android.gms.ads.internal.util.client.zzf.zzy(activity, configuration.screenHeightDp);
        int iZzy2 = com.google.android.gms.ads.internal.util.client.zzf.zzy(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzu.zzp();
        DisplayMetrics displayMetricsZzt = zzt.zzt(windowManager);
        int i10 = displayMetricsZzt.heightPixels;
        int i11 = displayMetricsZzt.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4069m4)).intValue() * ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d));
        return !(Math.abs(i10 - (iZzy + dimensionPixelSize)) <= iIntValue) || Math.abs(i11 - iZzy2) > iIntValue;
    }
}
