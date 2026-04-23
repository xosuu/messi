package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final class pm0 implements to0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p21 f7919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f7920c;

    public /* synthetic */ pm0(Context context, mu muVar, int i10) {
        this.f7918a = i10;
        this.f7920c = context;
        this.f7919b = muVar;
    }

    public final Intent a() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.ba)).booleanValue();
        Context context = this.f7920c;
        return (!zBooleanValue || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        switch (this.f7918a) {
            case 0:
                return 61;
            case 1:
                return 13;
            case 2:
                return 14;
            case 3:
                return 18;
            case 4:
                return 57;
            case 5:
                return 37;
            case 6:
                return 59;
            case 7:
                return 38;
            default:
                return 39;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.to0
    public final n5.a zzb() {
        String str = null;
        int i10 = this.f7918a;
        p21 p21Var = this.f7919b;
        switch (i10) {
            case 0:
                int i11 = 0;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                if (!((Boolean) zzba.zzc().a(eg.Tb)).booleanValue()) {
                    return tc1.d0(new qm0(i11, str, objArr3 == true ? 1 : 0));
                }
                ContentResolver contentResolver = this.f7920c.getContentResolver();
                if (contentResolver == null) {
                    return tc1.d0(new qm0(objArr2 == true ? 1 : 0, str, objArr == true ? 1 : 0));
                }
                return ((q11) p21Var).b(new du(8, contentResolver));
            case 1:
                return ((q11) p21Var).b(new du(11, this));
            case 2:
                return ((q11) p21Var).b(new du(12, this));
            case 3:
                return ((q11) p21Var).b(new du(14, this));
            case 4:
                return ((q11) p21Var).b(new du(15, this));
            case 5:
                return ((q11) p21Var).b(new du(24, this));
            case 6:
                if (!((Boolean) dh.f3650b.k()).booleanValue()) {
                    return tc1.d0(null);
                }
                return ((q11) p21Var).b(new du(25, this));
            case 7:
                return ((q11) p21Var).b(new du(26, this));
            default:
                return ((q11) p21Var).b(new du(27, this));
        }
    }

    public /* synthetic */ pm0(mu muVar, Context context, int i10) {
        this.f7918a = i10;
        this.f7919b = muVar;
        this.f7920c = context;
    }
}
