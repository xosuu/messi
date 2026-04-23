package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l00 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n00 f6450b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Throwable f6451d;

    public /* synthetic */ l00(n00 n00Var, Throwable th, int i10) {
        this.f6449a = i10;
        this.f6450b = n00Var;
        this.f6451d = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6449a;
        Throwable th = this.f6451d;
        n00 n00Var = this.f6450b;
        switch (i10) {
            case 0:
                n00Var.getClass();
                boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.u9)).booleanValue();
                Context context = n00Var.f7087a;
                if (!zBooleanValue) {
                    dr drVarA = cr.a(context);
                    n00Var.f7094h = drVarA;
                    drVarA.e("AttributionReportingSampled", th);
                } else {
                    dr drVarC = cr.c(context);
                    n00Var.f7095i = drVarC;
                    drVarC.e("AttributionReporting", th);
                }
                break;
            default:
                n00Var.getClass();
                boolean zBooleanValue2 = ((Boolean) zzba.zzc().a(eg.u9)).booleanValue();
                Context context2 = n00Var.f7087a;
                if (!zBooleanValue2) {
                    dr drVarA2 = cr.a(context2);
                    n00Var.f7094h = drVarA2;
                    drVarA2.e("AttributionReportingSampled.getUpdatedUrlAndRegisterSource", th);
                } else {
                    dr drVarC2 = cr.c(context2);
                    n00Var.f7095i = drVarC2;
                    drVarC2.e("AttributionReporting.getUpdatedUrlAndRegisterSource", th);
                }
                break;
        }
    }
}
