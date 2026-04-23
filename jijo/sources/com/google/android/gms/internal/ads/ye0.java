package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ye0 implements y11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractSafeParcelable f10861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10863d;

    public /* synthetic */ ye0(Object obj, AbstractSafeParcelable abstractSafeParcelable, int i10, int i11) {
        this.f10860a = i11;
        this.f10863d = obj;
        this.f10861b = abstractSafeParcelable;
        this.f10862c = i10;
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final n5.a zza(Object obj) {
        int i10 = this.f10860a;
        int i11 = this.f10862c;
        AbstractSafeParcelable abstractSafeParcelable = this.f10861b;
        Object obj2 = this.f10863d;
        switch (i10) {
            case 0:
                xq xqVar = (xq) obj2;
                zzbvb zzbvbVar = (zzbvb) abstractSafeParcelable;
                if (zzbvbVar != null) {
                    xqVar.getClass();
                    Bundle bundle = zzbvbVar.f11586y;
                    if (bundle != null) {
                        bundle.putBoolean("ls", true);
                    }
                }
                return tc1.q0(((sg0) ((eh1) xqVar.f10633h).zzb()).v1(zzbvbVar, i11), new xe0(zzbvbVar, 0), (p21) xqVar.f10631d);
            case 1:
                ff0 ff0Var = (ff0) obj2;
                zzbvb zzbvbVar2 = (zzbvb) abstractSafeParcelable;
                if (zzbvbVar2 != null) {
                    ff0Var.getClass();
                    Bundle bundle2 = zzbvbVar2.f11586y;
                    if (bundle2 != null) {
                        bundle2.putBoolean("ls", true);
                    }
                }
                return tc1.q0(((sg0) ff0Var.f4516e.zzb()).w1(zzbvbVar2, i11), new xe0(zzbvbVar2, 1), ff0Var.f4513b);
            default:
                return ((tg0) ((eh1) ((xq) obj2).f10633h).zzb()).u1((zzbug) abstractSafeParcelable, i11);
        }
    }
}
