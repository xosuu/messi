package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class sr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fg f8960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f8964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8966i;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public sr(Object obj, int i10, fg fgVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f8958a = obj;
        this.f8959b = i10;
        this.f8960c = fgVar;
        this.f8961d = obj2;
        this.f8962e = i11;
        this.f8963f = j10;
        this.f8964g = j11;
        this.f8965h = i12;
        this.f8966i = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sr.class == obj.getClass()) {
            sr srVar = (sr) obj;
            if (this.f8959b == srVar.f8959b && this.f8962e == srVar.f8962e && this.f8963f == srVar.f8963f && this.f8964g == srVar.f8964g && this.f8965h == srVar.f8965h && this.f8966i == srVar.f8966i && tp1.P(this.f8960c, srVar.f8960c) && tp1.P(this.f8958a, srVar.f8958a) && tp1.P(this.f8961d, srVar.f8961d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8958a, Integer.valueOf(this.f8959b), this.f8960c, this.f8961d, Integer.valueOf(this.f8962e), Long.valueOf(this.f8963f), Long.valueOf(this.f8964g), Integer.valueOf(this.f8965h), Integer.valueOf(this.f8966i)});
    }
}
