package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class zzyw extends IOException {
    public zzyw(Throwable th) {
        super(fb1.i("Unexpected ", th.getClass().getSimpleName(), th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), th);
    }
}
