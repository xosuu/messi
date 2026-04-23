package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e20 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e20 f3817e = new e20(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3821d;

    public e20(int i10, int i11, int i12) {
        this.f3818a = i10;
        this.f3819b = i11;
        this.f3820c = i12;
        this.f3821d = yn0.d(i12) ? yn0.s(i12, i11) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e20)) {
            return false;
        }
        e20 e20Var = (e20) obj;
        return this.f3818a == e20Var.f3818a && this.f3819b == e20Var.f3819b && this.f3820c == e20Var.f3820c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3818a), Integer.valueOf(this.f3819b), Integer.valueOf(this.f3820c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.f3818a);
        sb.append(", channelCount=");
        sb.append(this.f3819b);
        sb.append(", encoding=");
        return l.a0.h(sb, this.f3820c, "]");
    }
}
