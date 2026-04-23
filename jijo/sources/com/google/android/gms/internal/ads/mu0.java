package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.zzcd;

/* JADX INFO: loaded from: classes.dex */
public final class mu0 implements s60, qx0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mu0 f7055b = new mu0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f7056a;

    public boolean a(Intent intent) {
        if (intent != null) {
            return !this.f7056a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
        }
        throw new NullPointerException("Intent can not be null");
    }

    public boolean b() {
        wf wfVar = new wf(0);
        Context context = this.f7056a;
        return ((Boolean) zzcd.zza(context, wfVar)).booleanValue() && z3.b.a(context).f16692a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza */
    public Object mo3zza() {
        return new aq1(this.f7056a);
    }

    public mu0(Context context) {
        if (context == null) {
            throw new NullPointerException("Context can not be null");
        }
        this.f7056a = context;
    }

    @Override // com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public void mo5zza(Object obj) {
        ((x40) obj).L(this.f7056a);
    }
}
