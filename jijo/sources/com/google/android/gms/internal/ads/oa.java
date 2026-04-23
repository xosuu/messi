package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* JADX INFO: loaded from: classes.dex */
public final class oa implements AppOpsManager.OnOpActiveChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pa f7545a;

    public oa(pa paVar) {
        this.f7545a = paVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i10, String str2, boolean z9) {
        if (z9) {
            this.f7545a.f7840a = System.currentTimeMillis();
            this.f7545a.f7843d = true;
            return;
        }
        pa paVar = this.f7545a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (paVar.f7841b > 0) {
            pa paVar2 = this.f7545a;
            long j10 = paVar2.f7841b;
            if (jCurrentTimeMillis >= j10) {
                paVar2.f7842c = jCurrentTimeMillis - j10;
            }
        }
        this.f7545a.f7843d = false;
    }
}
