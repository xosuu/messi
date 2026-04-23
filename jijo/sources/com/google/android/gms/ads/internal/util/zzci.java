package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.eg;
import f.g0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzci {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f2169e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2167c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f2166b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f2165a = new g0(3, this);

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void zzb(Context context) {
        try {
            if (this.f2167c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f2169e = applicationContext;
            if (applicationContext == null) {
                this.f2169e = context;
            }
            eg.a(this.f2169e);
            this.f2168d = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4155v3)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.ba)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.f2169e.registerReceiver(this.f2165a, intentFilter);
            } else {
                this.f2169e.registerReceiver(this.f2165a, intentFilter, 4);
            }
            this.f2167c = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void zzc(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f2168d) {
            this.f2166b.put(broadcastReceiver, intentFilter);
            return;
        }
        eg.a(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.ba)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void zzd(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f2168d) {
            this.f2166b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
