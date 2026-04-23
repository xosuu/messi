package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u31 implements a31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xq f9358a;

    public u31(xq xqVar) {
        this.f9358a = xqVar;
        if (!((i61) xqVar.f10633h).f5510a.isEmpty()) {
            p61 p61Var = (p61) q61.f8120b.f8122a.get();
            p61Var = p61Var == null ? q61.f8121c : p61Var;
            tc1.j(xqVar);
            p61Var.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.a31
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        xq xqVar = this.f9358a;
        if (length > 5) {
            List listEmptyList = (List) ((Map) xqVar.f10630b).get(tb1.a(Arrays.copyOf(bArr, 5)));
            if (listEmptyList == null) {
                listEmptyList = Collections.emptyList();
            }
            Iterator it = listEmptyList.iterator();
            while (it.hasNext()) {
                try {
                    return ((a31) ((d71) it.next()).f3592a).a(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        List listEmptyList2 = (List) ((Map) xqVar.f10630b).get(tb1.a(tc1.P));
        if (listEmptyList2 == null) {
            listEmptyList2 = Collections.emptyList();
        }
        Iterator it2 = listEmptyList2.iterator();
        while (it2.hasNext()) {
            try {
                return ((a31) ((d71) it2.next()).f3592a).a(bArr, bArr2);
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
