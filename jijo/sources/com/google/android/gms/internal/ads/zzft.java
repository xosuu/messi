package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class zzft extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11643a;

    public zzft(int i10) {
        this.f11643a = i10;
    }

    public zzft(String str, int i10) {
        super(str);
        this.f11643a = i10;
    }

    public zzft(int i10, String str, Throwable th) {
        super(str, th);
        this.f11643a = i10;
    }

    public zzft(int i10, Throwable th) {
        super(th);
        this.f11643a = i10;
    }
}
