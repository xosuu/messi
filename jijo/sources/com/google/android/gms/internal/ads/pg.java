package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p.g f7874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p.e f7875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rh1 f7876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ur0 f7877d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i10 = 0; i10 < listQueryIntentActivities.size(); i10++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(tc1.f(context));
                    }
                }
            }
        }
        return false;
    }
}
