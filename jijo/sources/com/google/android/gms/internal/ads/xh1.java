package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class xh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1 f10557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y1 f10558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10560e;

    public xh1(String str, y1 y1Var, y1 y1Var2, int i10, int i11) {
        boolean z9 = true;
        if (i10 != 0) {
            if (i11 == 0) {
                i11 = 0;
            } else {
                z9 = false;
            }
        }
        tc1.K(z9);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f10556a = str;
        this.f10557b = y1Var;
        y1Var2.getClass();
        this.f10558c = y1Var2;
        this.f10559d = i10;
        this.f10560e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xh1.class == obj.getClass()) {
            xh1 xh1Var = (xh1) obj;
            if (this.f10559d == xh1Var.f10559d && this.f10560e == xh1Var.f10560e && this.f10556a.equals(xh1Var.f10556a) && this.f10557b.equals(xh1Var.f10557b) && this.f10558c.equals(xh1Var.f10558c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10558c.hashCode() + ((this.f10557b.hashCode() + ((this.f10556a.hashCode() + ((((this.f10559d + 527) * 31) + this.f10560e) * 31)) * 31)) * 31);
    }
}
