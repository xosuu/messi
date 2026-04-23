package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class gl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4957c;

    public final hl1 a() {
        if (this.f4955a || !(this.f4956b || this.f4957c)) {
            return new hl1(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
