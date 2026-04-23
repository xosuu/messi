package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class gd extends PushbackInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ur0 f4883a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(ur0 ur0Var, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        this.f4883a = ur0Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        l7.d((l7) this.f4883a.f9602f);
        super.close();
    }
}
