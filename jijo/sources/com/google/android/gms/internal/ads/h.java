package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;

/* JADX INFO: loaded from: classes.dex */
public final class h implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayManager f5119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f5120b;

    public h(j jVar, DisplayManager displayManager) {
        this.f5120b = jVar;
        this.f5119a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        if (i10 == 0) {
            j.a(this.f5120b, this.f5119a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
