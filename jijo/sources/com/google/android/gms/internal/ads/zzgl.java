package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class zzgl extends zzft {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11644b;

    public zzgl() {
        super(b(2008, 1));
        this.f11644b = 1;
    }

    public static zzgl a(IOException iOException, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !tc1.g(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new zzgk("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007, 1) : new zzgl(iOException, i11, i10);
    }

    public static int b(int i10, int i11) {
        return i10 == 2000 ? i11 != 1 ? 2000 : 2001 : i10;
    }

    public zzgl(IOException iOException, int i10, int i11) {
        super(b(i10, i11), iOException);
        this.f11644b = i11;
    }

    public zzgl(String str, int i10, int i11) {
        super(str, b(i10, i11));
        this.f11644b = i11;
    }

    public zzgl(String str, IOException iOException, int i10, int i11) {
        super(b(i10, i11), str, iOException);
        this.f11644b = i11;
    }
}
