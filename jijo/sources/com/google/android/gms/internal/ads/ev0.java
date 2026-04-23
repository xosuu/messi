package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class ev0 implements v3.b, v3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sv0 f4305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4306b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4307d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f4308f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HandlerThread f4309h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cv0 f4310q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f4311s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f4312t;

    public ev0(Context context, int i10, String str, String str2, cv0 cv0Var) {
        this.f4306b = str;
        this.f4312t = i10;
        this.f4307d = str2;
        this.f4310q = cv0Var;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f4309h = handlerThread;
        handlerThread.start();
        this.f4311s = System.currentTimeMillis();
        sv0 sv0Var = new sv0(context, handlerThread.getLooper(), this, this, 19621000);
        this.f4305a = sv0Var;
        this.f4308f = new LinkedBlockingQueue();
        sv0Var.checkAvailabilityAndConnect();
    }

    public final void a() {
        sv0 sv0Var = this.f4305a;
        if (sv0Var != null) {
            if (sv0Var.isConnected() || sv0Var.isConnecting()) {
                sv0Var.disconnect();
            }
        }
    }

    public final void b(int i10, long j10, Exception exc) {
        this.f4310q.b(i10, System.currentTimeMillis() - j10, exc);
    }

    @Override // v3.b
    public final void m(int i10) {
        try {
            b(4011, this.f4311s, null);
            this.f4308f.put(new zzfqa(1, null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // v3.b
    public final void r(Bundle bundle) {
        tv0 tv0VarN;
        long j10 = this.f4311s;
        HandlerThread handlerThread = this.f4309h;
        try {
            tv0VarN = this.f4305a.n();
        } catch (DeadObjectException | IllegalStateException unused) {
            tv0VarN = null;
        }
        if (tv0VarN != null) {
            try {
                zzfpy zzfpyVar = new zzfpy(1, 1, this.f4312t - 1, this.f4306b, this.f4307d);
                Parcel parcelM = tv0VarN.m();
                qb.c(parcelM, zzfpyVar);
                Parcel parcelT = tv0VarN.t(parcelM, 3);
                zzfqa zzfqaVar = (zzfqa) qb.a(parcelT, zzfqa.CREATOR);
                parcelT.recycle();
                b(5011, j10, null);
                this.f4308f.put(zzfqaVar);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // v3.c
    public final void t(ConnectionResult connectionResult) {
        try {
            b(4012, this.f4311s, null);
            this.f4308f.put(new zzfqa(1, null, 1));
        } catch (InterruptedException unused) {
        }
    }
}
