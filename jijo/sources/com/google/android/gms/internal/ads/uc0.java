package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class uc0 implements u50, e50, n40, w40, zza, p60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kd f9459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9460b = false;

    public uc0(kd kdVar, qq0 qq0Var) {
        this.f9459a = kdVar;
        kdVar.b(2);
        if (qq0Var != null) {
            kdVar.b(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void E(ve veVar) {
        kd kdVar = this.f9459a;
        synchronized (kdVar) {
            if (kdVar.f6261c) {
                try {
                    kdVar.f6260b.e(veVar);
                } catch (NullPointerException e10) {
                    zzu.zzo().i("AdMobClearcutLogger.modify", e10);
                }
            }
        }
        this.f9459a.b(1102);
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void J(zzbvb zzbvbVar) {
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void S(ve veVar) {
        kd kdVar = this.f9459a;
        synchronized (kdVar) {
            if (kdVar.f6261c) {
                try {
                    kdVar.f6260b.e(veVar);
                } catch (NullPointerException e10) {
                    zzu.zzo().i("AdMobClearcutLogger.modify", e10);
                }
            }
        }
        this.f9459a.b(1103);
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void T(ve veVar) {
        kd kdVar = this.f9459a;
        synchronized (kdVar) {
            if (kdVar.f6261c) {
                try {
                    kdVar.f6260b.e(veVar);
                } catch (NullPointerException e10) {
                    zzu.zzo().i("AdMobClearcutLogger.modify", e10);
                }
            }
        }
        this.f9459a.b(1104);
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void b(kr0 kr0Var) {
        this.f9459a.a(new rk0(15, kr0Var));
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void h(boolean z9) {
        this.f9459a.b(true != z9 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void k(boolean z9) {
        this.f9459a.b(true != z9 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.f9460b) {
            this.f9459a.b(8);
        } else {
            this.f9459a.b(7);
            this.f9460b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final void t(zze zzeVar) {
        int i10 = zzeVar.zza;
        kd kdVar = this.f9459a;
        switch (i10) {
            case 1:
                kdVar.b(101);
                break;
            case 2:
                kdVar.b(102);
                break;
            case 3:
                kdVar.b(5);
                break;
            case 4:
                kdVar.b(103);
                break;
            case 5:
                kdVar.b(104);
                break;
            case 6:
                kdVar.b(105);
                break;
            case 7:
                kdVar.b(106);
                break;
            default:
                kdVar.b(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void zzh() {
        this.f9459a.b(1109);
    }

    @Override // com.google.android.gms.internal.ads.w40
    public final synchronized void zzr() {
        this.f9459a.b(6);
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final void zzs() {
        this.f9459a.b(3);
    }
}
