package com.google.android.gms.common.api;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class ApiException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f2476a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ApiException(Status status) {
        int i10 = status.f2481a;
        String str = status.f2482b;
        super(i10 + ": " + (str == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str));
        this.f2476a = status;
    }
}
