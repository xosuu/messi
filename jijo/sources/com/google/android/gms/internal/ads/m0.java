package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f6793j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m20 f6794k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zzbk f6795l;

    public m0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, m20 m20Var, zzbk zzbkVar) {
        this.f6784a = i10;
        this.f6785b = i11;
        this.f6786c = i12;
        this.f6787d = i13;
        this.f6788e = i14;
        this.f6789f = d(i14);
        this.f6790g = i15;
        this.f6791h = i16;
        this.f6792i = c(i16);
        this.f6793j = j10;
        this.f6794k = m20Var;
        this.f6795l = zzbkVar;
    }

    public static int c(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j10 = this.f6793j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f6788e);
    }

    public final y1 b(byte[] bArr, zzbk zzbkVar) {
        bArr[4] = -128;
        zzbk zzbkVar2 = this.f6795l;
        if (zzbkVar2 != null) {
            zzbkVar = zzbkVar2.e(zzbkVar);
        }
        q0 q0Var = new q0();
        q0Var.f("audio/flac");
        int i10 = this.f6787d;
        if (i10 <= 0) {
            i10 = -1;
        }
        q0Var.f8053m = i10;
        q0Var.f8065y = this.f6790g;
        q0Var.f8066z = this.f6788e;
        q0Var.A = yn0.r(this.f6791h);
        q0Var.f8054n = Collections.singletonList(bArr);
        q0Var.f8050j = zzbkVar;
        return new y1(q0Var);
    }

    public m0(byte[] bArr, int i10) {
        d1 d1Var = new d1(bArr, bArr.length);
        d1Var.k(i10 * 8);
        this.f6784a = d1Var.e(16);
        this.f6785b = d1Var.e(16);
        this.f6786c = d1Var.e(24);
        this.f6787d = d1Var.e(24);
        int iE = d1Var.e(20);
        this.f6788e = iE;
        this.f6789f = d(iE);
        this.f6790g = d1Var.e(3) + 1;
        int iE2 = d1Var.e(5) + 1;
        this.f6791h = iE2;
        this.f6792i = c(iE2);
        this.f6793j = d1Var.g(36);
        this.f6794k = null;
        this.f6795l = null;
    }
}
