package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class pa {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f7839e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f7840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f7841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7843d;

    public static pa a(Context context, ExecutorService executorService) {
        String[] strArr = f7839e;
        pa paVar = new pa();
        paVar.f7840a = 0L;
        paVar.f7841b = 0L;
        paVar.f7842c = -1L;
        paVar.f7843d = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executorService, new oa(paVar));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
        return paVar;
    }
}
