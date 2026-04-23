package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f3770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f3771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3772c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3775f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3778i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3773d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3774e = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3776g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3777h = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3779j = 1.0f;

    public e(Context context, d dVar) {
        this.f3770a = dVar;
        this.f3771b = new j(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(long r26, long r28, long r30, long r32, boolean r34, androidx.emoji2.text.v r35) throws com.google.android.gms.internal.ads.zzhw {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e.a(long, long, long, long, boolean, androidx.emoji2.text.v):int");
    }

    public final void b() {
        this.f3772c = true;
        this.f3775f = yn0.u(SystemClock.elapsedRealtime());
        j jVar = this.f3771b;
        jVar.f5738d = true;
        jVar.f5747m = 0L;
        jVar.f5750p = -1L;
        jVar.f5748n = -1L;
        h hVar = jVar.f5736b;
        if (hVar != null) {
            i iVar = jVar.f5737c;
            iVar.getClass();
            iVar.f5446b.sendEmptyMessage(1);
            Looper looperMyLooper = Looper.myLooper();
            tc1.A(looperMyLooper);
            Handler handler = new Handler(looperMyLooper, null);
            DisplayManager displayManager = hVar.f5119a;
            displayManager.registerDisplayListener(hVar, handler);
            j.a(hVar.f5120b, displayManager.getDisplay(0));
        }
        jVar.d(false);
    }

    public final void c() {
        this.f3772c = false;
        this.f3777h = -9223372036854775807L;
        j jVar = this.f3771b;
        jVar.f5738d = false;
        h hVar = jVar.f5736b;
        if (hVar != null) {
            hVar.f5119a.unregisterDisplayListener(hVar);
            i iVar = jVar.f5737c;
            iVar.getClass();
            iVar.f5446b.sendEmptyMessage(2);
        }
        jVar.b();
    }

    public final void d(float f10) {
        j jVar = this.f3771b;
        jVar.f5740f = f10;
        yq1 yq1Var = jVar.f5735a;
        yq1Var.f11015a.b();
        yq1Var.f11016b.b();
        yq1Var.f11017c = false;
        yq1Var.f11018d = -9223372036854775807L;
        yq1Var.f11019e = 0;
        jVar.c();
    }

    public final void e(int i10) {
        this.f3773d = Math.min(this.f3773d, i10);
    }
}
