package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class zzbu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f2152a = new ConcurrentHashMap();

    public zzbu() {
        new AtomicInteger(0);
    }

    public final Bitmap zza(Integer num) {
        return (Bitmap) this.f2152a.get(num);
    }
}
