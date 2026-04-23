package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g21 implements ix0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4797a;

    @Override // com.google.android.gms.internal.ads.ix0
    public final boolean zza(Object obj) {
        switch (this.f4797a) {
            case 0:
                if (((Map.Entry) obj).getKey() != null) {
                }
                break;
            default:
                if (((String) obj) != null) {
                }
                break;
        }
        return false;
    }
}
