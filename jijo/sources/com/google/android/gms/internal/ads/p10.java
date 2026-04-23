package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p10 implements e50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f7761b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ VersionInfoParcel f7762d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fr0 f7763f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ or0 f7764h;

    public /* synthetic */ p10(Context context, VersionInfoParcel versionInfoParcel, fr0 fr0Var, or0 or0Var, int i10) {
        this.f7760a = i10;
        this.f7761b = context;
        this.f7762d = versionInfoParcel;
        this.f7763f = fr0Var;
        this.f7764h = or0Var;
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final void zzs() {
        int i10 = this.f7760a;
        Context context = this.f7761b;
        or0 or0Var = this.f7764h;
        fr0 fr0Var = this.f7763f;
        VersionInfoParcel versionInfoParcel = this.f7762d;
        switch (i10) {
            case 0:
                zzu.zzs().zzn(context, versionInfoParcel.afmaVersion, fr0Var.C.toString(), or0Var.f7646f);
                break;
            default:
                zzu.zzs().zzn(context, versionInfoParcel.afmaVersion, fr0Var.C.toString(), or0Var.f7646f);
                break;
        }
    }
}
