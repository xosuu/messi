package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import l5.f;

/* JADX INFO: loaded from: classes.dex */
public final class zzg extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11674a;

    public zzg(int i10, String str) {
        super(str);
        this.f11674a = i10;
    }

    public final f a() {
        if (getCause() == null) {
            super.getMessage();
        } else {
            super.getMessage();
            getCause();
        }
        return new f(this.f11674a, super.getMessage());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage();
    }

    public zzg(int i10, String str, IOException iOException) {
        super(str, iOException);
        this.f11674a = i10;
    }
}
