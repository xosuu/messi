package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import org.jasypt.digest.StandardStringDigester;

/* JADX INFO: loaded from: classes.dex */
public final class rr0 {
    public static final String a(byte[] bArr, byte[] bArr2, String str, cd0 cd0Var) {
        ep epVarP;
        try {
            epVarP = en1.P(new rk0(25, new ByteArrayInputStream(Base64.decode(str, 11))));
        } catch (IOException | GeneralSecurityException e10) {
            zze.zza("Failed to get keysethandle".concat(e10.toString()));
            zzu.zzo().i("CryptoUtils.getHandle", e10);
            epVarP = null;
        }
        if (epVarP == null) {
            return null;
        }
        try {
            byte[] bArrA = ((a31) epVarP.r()).a(bArr, bArr2);
            cd0Var.f3253a.put("ds", "1");
            return new String(bArrA, StandardStringDigester.MESSAGE_CHARSET);
        } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e11) {
            zze.zza("Failed to decrypt ".concat(e11.toString()));
            zzu.zzo().i("CryptoUtils.decrypt", e11);
            cd0Var.f3253a.put("dsf", e11.toString());
            return null;
        }
    }
}
