package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u71 implements e71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u71 f9411a = new u71();

    @Override // com.google.android.gms.internal.ads.e71
    public final Object a(xq xqVar) throws GeneralSecurityException {
        if (((d71) xqVar.f10631d) == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = ((Map) xqVar.f10630b).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new t71();
    }

    @Override // com.google.android.gms.internal.ads.e71
    public final Class zza() {
        return s71.class;
    }

    @Override // com.google.android.gms.internal.ads.e71
    public final Class zzb() {
        return s71.class;
    }
}
