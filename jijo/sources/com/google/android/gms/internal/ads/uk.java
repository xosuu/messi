package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uk implements y11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n00 f9524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9525c;

    public /* synthetic */ uk(n00 n00Var, String str, int i10) {
        this.f9523a = i10;
        this.f9524b = n00Var;
        this.f9525c = str;
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final n5.a zza(Object obj) {
        int i10 = this.f9523a;
        String str = this.f9525c;
        n00 n00Var = this.f9524b;
        switch (i10) {
            case 0:
                String str2 = (String) obj;
                rk rkVar = vk.f9877a;
                return (((Boolean) zzba.zzc().a(eg.f4010g9)).booleanValue() && n00Var != null && n00.b(str)) ? n00Var.a(str2, zzay.zze()) : tc1.d0(str2);
            default:
                n00Var.getClass();
                ((q11) n00Var.f7091e).a(new l00(n00Var, (Throwable) obj, 1));
                return tc1.d0(str);
        }
    }
}
