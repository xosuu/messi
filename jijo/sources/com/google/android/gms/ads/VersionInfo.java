package com.google.android.gms.ads;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class VersionInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1906c;

    public VersionInfo(int i10, int i11, int i12) {
        this.f1904a = i10;
        this.f1905b = i11;
        this.f1906c = i12;
    }

    public int getMajorVersion() {
        return this.f1904a;
    }

    public int getMicroVersion() {
        return this.f1906c;
    }

    public int getMinorVersion() {
        return this.f1905b;
    }

    public String toString() {
        return String.format(Locale.US, "%d.%d.%d", Integer.valueOf(this.f1904a), Integer.valueOf(this.f1905b), Integer.valueOf(this.f1906c));
    }
}
