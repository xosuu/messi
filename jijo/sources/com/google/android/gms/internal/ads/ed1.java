package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.jasypt.digest.StandardStringDigester;

/* JADX INFO: loaded from: classes.dex */
public abstract class ed1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f3910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f3911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f3912c;

    static {
        Charset.forName(StandardStringDigester.DIGEST_CHARSET);
        f3910a = Charset.forName(StandardStringDigester.MESSAGE_CHARSET);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f3911b = bArr;
        f3912c = ByteBuffer.wrap(bArr);
        ic1.e(bArr, 0, 0, false);
    }
}
