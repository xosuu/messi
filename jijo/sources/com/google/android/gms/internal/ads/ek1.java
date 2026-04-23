package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ek1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wv f4223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jo1 f4225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wv f4227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo1 f4229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f4230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f4231j;

    public ek1(long j10, wv wvVar, int i10, jo1 jo1Var, long j11, wv wvVar2, int i11, jo1 jo1Var2, long j12, long j13) {
        this.f4222a = j10;
        this.f4223b = wvVar;
        this.f4224c = i10;
        this.f4225d = jo1Var;
        this.f4226e = j11;
        this.f4227f = wvVar2;
        this.f4228g = i11;
        this.f4229h = jo1Var2;
        this.f4230i = j12;
        this.f4231j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ek1.class == obj.getClass()) {
            ek1 ek1Var = (ek1) obj;
            if (this.f4222a == ek1Var.f4222a && this.f4224c == ek1Var.f4224c && this.f4226e == ek1Var.f4226e && this.f4228g == ek1Var.f4228g && this.f4230i == ek1Var.f4230i && this.f4231j == ek1Var.f4231j && tp1.P(this.f4223b, ek1Var.f4223b) && tp1.P(this.f4225d, ek1Var.f4225d) && tp1.P(this.f4227f, ek1Var.f4227f) && tp1.P(this.f4229h, ek1Var.f4229h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4222a), this.f4223b, Integer.valueOf(this.f4224c), this.f4225d, Long.valueOf(this.f4226e), this.f4227f, Integer.valueOf(this.f4228g), this.f4229h, Long.valueOf(this.f4230i), Long.valueOf(this.f4231j)});
    }
}
