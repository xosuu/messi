package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.internal.ads.eg;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(30)
public final class zzz extends zzy {
    @Override // com.google.android.gms.ads.internal.util.zzab
    public final int zzm(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.L7)).booleanValue()) {
            return 0;
        }
        return super.zzm(context);
    }
}
