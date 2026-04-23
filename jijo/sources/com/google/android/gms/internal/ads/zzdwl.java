package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class zzdwl extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11605a;

    public zzdwl(int i10) {
        this.f11605a = i10;
    }

    public zzdwl(int i10, String str) {
        super(str);
        this.f11605a = i10;
    }

    public zzdwl(String str, Throwable th) {
        super(str, th);
        this.f11605a = 1;
    }
}
