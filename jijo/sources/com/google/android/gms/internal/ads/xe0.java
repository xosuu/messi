package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xe0 implements y11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbvb f10543b;

    public /* synthetic */ xe0(zzbvb zzbvbVar, int i10) {
        this.f10542a = i10;
        this.f10543b = zzbvbVar;
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final n5.a zza(Object obj) {
        int i10 = this.f10542a;
        zzbvb zzbvbVar = this.f10543b;
        switch (i10) {
            case 0:
                return tc1.d0(new yf0(zzbvbVar, (InputStream) obj));
            case 1:
                return tc1.d0(new yf0(zzbvbVar, (InputStream) obj));
            default:
                zzbvbVar.f11583v = new String(q01.a((InputStream) obj), fx0.f4681c);
                return tc1.d0(zzbvbVar);
        }
    }
}
