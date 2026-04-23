package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.eg;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(28)
public class zzy extends zzw {
    @Override // com.google.android.gms.ads.internal.util.zzab
    public final int zzj(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final void zzk(final Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.W0)).booleanValue() && com.google.android.gms.ads.internal.zzu.zzo().d().zzm() == null && !activity.isInMultiWindowMode()) {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (1 != attributes.layoutInDisplayCutoutMode) {
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this) { // from class: com.google.android.gms.ads.internal.util.zzx
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    Activity activity2 = activity;
                    if (com.google.android.gms.ads.internal.zzu.zzo().d().zzm() == null) {
                        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                        String strConcat = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        if (displayCutout != null) {
                            zzj zzjVarD = com.google.android.gms.ads.internal.zzu.zzo().d();
                            for (Rect rect : displayCutout.getBoundingRects()) {
                                String str = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("|");
                                }
                                strConcat = strConcat.concat(String.valueOf(str));
                            }
                            zzjVarD.zzD(strConcat);
                        } else {
                            com.google.android.gms.ads.internal.zzu.zzo().d().zzD(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        }
                    }
                    Window window2 = activity2.getWindow();
                    WindowManager.LayoutParams attributes2 = window2.getAttributes();
                    if (2 != attributes2.layoutInDisplayCutoutMode) {
                        attributes2.layoutInDisplayCutoutMode = 2;
                        window2.setAttributes(attributes2);
                    }
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }
}
