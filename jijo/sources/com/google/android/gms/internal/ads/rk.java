package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rk implements wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8628a;

    public /* synthetic */ rk(int i10) {
        this.f8628a = i10;
    }

    public static final Integer a(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            zzm.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:313:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cc  */
    @Override // com.google.android.gms.internal.ads.wk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r19, java.util.Map r20) {
        /*
            Method dump skipped, instruction units count: 2822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rk.b(java.lang.Object, java.util.Map):void");
    }
}
