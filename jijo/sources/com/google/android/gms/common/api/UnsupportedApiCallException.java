package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Feature f2485a;

    public UnsupportedApiCallException(Feature feature) {
        this.f2485a = feature;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f2485a));
    }
}
