package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class s30 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f8783b;

    public /* synthetic */ s30(jh1 jh1Var, int i10) {
        this.f8782a = i10;
        this.f8783b = jh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        int i10 = this.f8782a;
        qh1 qh1Var = this.f8783b;
        switch (i10) {
            case 0:
                return ((k10) qh1Var).zzb();
            case 1:
                return new j40(((oh1) qh1Var).zzb());
            case 2:
                v40 v40Var = new v40(((oh1) qh1Var).zzb());
                v40Var.f9770b = false;
                return v40Var;
            case 3:
                return new z40(((oh1) qh1Var).zzb());
            case 4:
                return new b50(((oh1) qh1Var).zzb());
            case 5:
                return new d50(((oh1) qh1Var).zzb());
            case 6:
                return new i50(((oh1) qh1Var).zzb());
            case 7:
                return new j50(((oh1) qh1Var).zzb());
            case 8:
                return new l50(((oh1) qh1Var).zzb());
            case 9:
                return new e60(((oh1) qh1Var).zzb());
            case 10:
                return new g60(((oh1) qh1Var).zzb());
            case 11:
                return new j60(((oh1) qh1Var).zzb());
            case 12:
                return new n60(((oh1) qh1Var).zzb());
            case 13:
                return new q60(((oh1) qh1Var).zzb());
            case 14:
                return new j70(((oh1) qh1Var).zzb());
            case 15:
                return new l70(((oh1) qh1Var).zzb());
            case 16:
                return new p70(((oh1) qh1Var).zzb());
            case 17:
                return new r70(((oh1) qh1Var).zzb());
            case 18:
                return new t70(((oh1) qh1Var).zzb());
            case 19:
                return new w70(((oh1) qh1Var).zzb());
            case 20:
                Set setSingleton = Collections.singleton(new n70((r30) qh1Var.zzb(), nu.f7388f));
                tp1.b0(setSingleton);
                return setSingleton;
            case sf.zzm /* 21 */:
                return new n70((at0) qh1Var.zzb(), nu.f7388f);
            case 22:
                return new n70((at0) qh1Var.zzb(), nu.f7388f);
            case 23:
                Set setSingleton2 = Collections.singleton(new n70((r30) qh1Var.zzb(), nu.f7388f));
                tp1.b0(setSingleton2);
                return setSingleton2;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                return new n70((k80) qh1Var.zzb(), nu.f7387e);
            case 25:
                return new n70((k80) qh1Var.zzb(), nu.f7387e);
            case 26:
                return new n70((k80) qh1Var.zzb(), nu.f7387e);
            case 27:
                return new n70((ac0) qh1Var.zzb(), nu.f7388f);
            case 28:
                Set setSingleton3 = Collections.singleton(new n70((r30) qh1Var.zzb(), nu.f7388f));
                tp1.b0(setSingleton3);
                return setSingleton3;
            default:
                n80 n80Var = (n80) qh1Var.zzb();
                mu muVar = nu.f7383a;
                tp1.b0(muVar);
                return new n70(n80Var, muVar);
        }
    }

    public s30(nh1 nh1Var) {
        this.f8782a = 29;
        this.f8783b = nh1Var;
    }

    public /* synthetic */ s30(nh1 nh1Var, int i10) {
        this.f8782a = i10;
        this.f8783b = nh1Var;
    }
}
