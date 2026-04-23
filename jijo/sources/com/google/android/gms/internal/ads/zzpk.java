package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzpk extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11658b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y1 f11659d;

    public zzpk(int i10, y1 y1Var, boolean z9) {
        super(fb1.g("AudioTrack write failed: ", i10));
        this.f11658b = z9;
        this.f11657a = i10;
        this.f11659d = y1Var;
    }
}
