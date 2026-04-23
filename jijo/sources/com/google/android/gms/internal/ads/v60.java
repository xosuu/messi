package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class v60 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9789a;

    public /* synthetic */ v60(int i10) {
        this.f9789a = i10;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        switch (this.f9789a) {
            case 0:
                Set setEmptySet = Collections.emptySet();
                tp1.b0(setEmptySet);
                return setEmptySet;
            case 1:
                Set setEmptySet2 = Collections.emptySet();
                tp1.b0(setEmptySet2);
                return setEmptySet2;
            case 2:
                Set setEmptySet3 = Collections.emptySet();
                tp1.b0(setEmptySet3);
                return setEmptySet3;
            case 3:
                Set setEmptySet4 = Collections.emptySet();
                tp1.b0(setEmptySet4);
                return setEmptySet4;
            case 4:
                Set setEmptySet5 = Collections.emptySet();
                tp1.b0(setEmptySet5);
                return setEmptySet5;
            case 5:
                return new g70();
            case 6:
                return md.INTERSTITIAL;
            case 7:
                return "interstitial";
            case 8:
                return md.AD_LOADER;
            case 9:
                return "native";
            case 10:
                return null;
            case 11:
                return new ll0();
            case 12:
            case 13:
            case 14:
                return null;
            case 15:
                return new xb0();
            case 16:
                return new nc0();
            case 17:
                return new qc0();
            case 18:
                mu muVar = nu.f7383a;
                tp1.b0(muVar);
                return new tc0(muVar);
            case 19:
                return new vc0(11, 12, 1007);
            case 20:
                return new vc0(19, 20, 1008);
            case sf.zzm /* 21 */:
                return new vc0(13, 14, 1004);
            case 22:
                return new vc0(1001, 1002, 1003);
            case 23:
                return new vc0(15, 16, 1005);
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                return new vc0(17, 18, 1006);
            case 25:
                return new fd0("ttc", ws0.f10328b);
            case 26:
                return new fd0("t_load_as", ws0.L);
            case 27:
                return new ce0();
            case 28:
                return new ot();
            default:
                return new ue0();
        }
    }

    public /* synthetic */ v60(int i10, int i11) {
        this.f9789a = i10;
    }
}
