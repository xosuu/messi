package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* JADX INFO: loaded from: classes.dex */
public final class am implements AdapterStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdapterStatus.State f2730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2732c;

    public am(AdapterStatus.State state, String str, int i10) {
        this.f2730a = state;
        this.f2731b = str;
        this.f2732c = i10;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.f2731b;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return this.f2730a;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.f2732c;
    }
}
