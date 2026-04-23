package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class ab1 implements ob1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b4.h f2632d = new b4.h(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f2633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2635c;

    public ab1(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!tp1.N(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        sb1.a(bArr.length);
        this.f2633a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f2632d.get()).getBlockSize();
        this.f2635c = blockSize;
        if (i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f2634b = i10;
    }
}
