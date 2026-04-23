package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class hb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja f5245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5247c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class[] f5249e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Method f5248d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CountDownLatch f5250f = new CountDownLatch(1);

    public hb(ja jaVar, String str, String str2, Class... clsArr) {
        this.f5245a = jaVar;
        this.f5246b = str;
        this.f5247c = str2;
        this.f5249e = clsArr;
        jaVar.f5851b.submit(new s9(3, this));
    }
}
