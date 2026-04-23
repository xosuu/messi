package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzau;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q30 implements gx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8099d;

    public /* synthetic */ q30(Context context, VersionInfoParcel versionInfoParcel, or0 or0Var) {
        this.f8096a = 0;
        this.f8097b = context;
        this.f8098c = versionInfoParcel;
        this.f8099d = or0Var;
    }

    @Override // com.google.android.gms.internal.ads.gx0
    public final Object apply(Object obj) {
        int i10 = this.f8096a;
        Object obj2 = this.f8099d;
        Object obj3 = this.f8098c;
        Object obj4 = this.f8097b;
        switch (i10) {
            case 0:
                fr0 fr0Var = (fr0) obj;
                zzau zzauVar = new zzau((Context) obj4);
                zzauVar.zzp(fr0Var.B);
                zzauVar.zzq(fr0Var.C.toString());
                zzauVar.zzo(((VersionInfoParcel) obj3).afmaVersion);
                zzauVar.zzn(((or0) obj2).f7646f);
                return zzauVar;
            case 1:
                fx fxVar = (fx) obj4;
                if (((fr0) obj3).M) {
                    fxVar.R();
                }
                fxVar.n0();
                fxVar.onPause();
                return ((c10) obj2).q0();
            case 2:
                fx fxVar2 = (fx) obj4;
                if (((fr0) obj3).M) {
                    fxVar2.R();
                }
                fxVar2.n0();
                fxVar2.onPause();
                return ((a80) obj2).q0();
            default:
                fx fxVar3 = (fx) obj4;
                if (((fr0) obj3).M) {
                    fxVar3.R();
                }
                fxVar3.n0();
                fxVar3.onPause();
                return ((cc0) obj2).q0();
        }
    }

    public /* synthetic */ q30(nx nxVar, fr0 fr0Var, b4.f fVar, int i10) {
        this.f8096a = i10;
        this.f8097b = nxVar;
        this.f8098c = fr0Var;
        this.f8099d = fVar;
    }
}
