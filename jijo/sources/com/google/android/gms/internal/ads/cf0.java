package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import java.security.GeneralSecurityException;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class cf0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3259a;

    public /* synthetic */ cf0(int i10) {
        this.f3259a = i10;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        switch (this.f3259a) {
            case 0:
                xf xfVar = eg.f3933a;
                return zzba.zza().a();
            case 1:
                zzu.zzp();
                String string = UUID.randomUUID().toString();
                tp1.b0(string);
                return string;
            case 2:
                return new dh0();
            case 3:
                mu muVar = nu.f7383a;
                tp1.b0(muVar);
                return new zk0(muVar);
            case 4:
                return new ml0();
            case 5:
                return new nm0();
            case 6:
                mu muVar2 = nu.f7383a;
                tp1.b0(muVar2);
                return new kn0(muVar2, 0, 0);
            case 7:
                mu muVar3 = nu.f7383a;
                tp1.b0(muVar3);
                return new kn0(muVar3, 2, 0);
            case 8:
                mu muVar4 = nu.f7383a;
                tp1.b0(muVar4);
                return new kn0(muVar4, 3, 0);
            case 9:
                mu muVar5 = nu.f7383a;
                tp1.b0(muVar5);
                return new kn0(muVar5, 5, 0);
            case 10:
                return new mr0();
            case 11:
                return new lr0();
            case 12:
                return new nr0();
            case 13:
                rr0 rr0Var = new rr0();
                try {
                    r31.a();
                    break;
                } catch (GeneralSecurityException e10) {
                    zze.zza("Failed to Configure Aead. ".concat(e10.toString()));
                    zzu.zzo().i("CryptoUtils.registerAead", e10);
                }
                return rr0Var;
            case 14:
                return new sr0();
            case 15:
                return y3.b.f20451a;
            case 16:
                zr0 zr0Var = new zr0();
                zr0Var.f11316a = null;
                return zr0Var;
            case 17:
                return new js0();
            case 18:
                mu muVar6 = nu.f7387e;
                tp1.b0(muVar6);
                return muVar6;
            case 19:
                mu muVarW = tp1.w();
                tp1.b0(muVarW);
                return muVarW;
            case 20:
                mu muVar7 = nu.f7383a;
                tp1.b0(muVar7);
                return muVar7;
            case sf.zzm /* 21 */:
                mu muVar8 = nu.f7387e;
                tp1.b0(muVar8);
                return muVar8;
            case 22:
                mu muVar9 = nu.f7384b;
                tp1.b0(muVar9);
                return muVar9;
            default:
                return new lt();
        }
    }

    public /* synthetic */ cf0(int i10, int i11) {
        this.f3259a = i10;
    }
}
