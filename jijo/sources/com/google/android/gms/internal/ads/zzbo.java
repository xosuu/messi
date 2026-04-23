package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class zzbo extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11511b;

    public zzbo(String str, RuntimeException runtimeException, boolean z9, int i10) {
        super(str, runtimeException);
        this.f11510a = z9;
        this.f11511b = i10;
    }

    public static zzbo a(String str, RuntimeException runtimeException) {
        return new zzbo(str, runtimeException, true, 1);
    }

    public static zzbo b(String str) {
        return new zzbo(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sbK = l.a0.k(super.getMessage(), "{contentIsMalformed=");
        sbK.append(this.f11510a);
        sbK.append(", dataType=");
        return l.a0.h(sbK, this.f11511b, "}");
    }
}
