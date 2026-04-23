package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class mx0 implements px0, on1, q, db1, qx0, qe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7073a;

    public /* synthetic */ mx0() {
        this.f7073a = l90.f6542a;
    }

    public static mp1 d(ow owVar, int[] iArr, bz0 bz0Var) {
        mp1 mp1Var = new mp1(owVar, iArr);
        bz0.k(bz0Var);
        return mp1Var;
    }

    public static mx0 g(byte[] bArr) {
        return new mx0(tb1.a(bArr));
    }

    public static mx0 h(int i10) {
        b4.h hVar = h71.f5230a;
        byte[] bArr = new byte[i10];
        ((SecureRandom) h71.f5230a.get()).nextBytes(bArr);
        return new mx0(tb1.a(bArr));
    }

    @Override // com.google.android.gms.internal.ads.q
    public void a() {
    }

    public int b() {
        return ((tb1) this.f7073a).f9109a.length;
    }

    @Override // com.google.android.gms.internal.ads.q
    public void c() {
        ((b) this.f7073a).r0(0, 1);
    }

    @Override // com.google.android.gms.internal.ads.q
    public void e() {
        tc1.A(((b) this.f7073a).T0);
        b bVar = (b) this.f7073a;
        Surface surface = bVar.T0;
        m20 m20Var = bVar.K0;
        Handler handler = (Handler) m20Var.f6809b;
        if (handler != null) {
            handler.post(new n(m20Var, surface, SystemClock.elapsedRealtime()));
        }
        bVar.V0 = true;
    }

    @Override // com.google.android.gms.internal.ads.px0
    public /* synthetic */ Iterator f(ks0 ks0Var, CharSequence charSequence) {
        return new lx0(this, charSequence);
    }

    public byte[] i() {
        return ((tb1) this.f7073a).b();
    }

    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza */
    public Object mo3zza() {
        return (dj1) this.f7073a;
    }

    public /* synthetic */ mx0(Object obj) {
        this.f7073a = obj;
    }

    @Override // com.google.android.gms.internal.ads.on1
    public int zza(Object obj) {
        cn1 cn1Var = (cn1) obj;
        Pattern pattern = pn1.f7924a;
        y1 y1Var = (y1) this.f7073a;
        cn1Var.getClass();
        String str = y1Var.f10714m;
        String str2 = cn1Var.f3344b;
        return ((str2.equals(str) || str2.equals(pn1.b(y1Var))) && cn1Var.i(y1Var, false)) ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.db1
    public Object zza(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        eb1 eb1Var = eb1.f3896b;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 3; i10++) {
            Provider provider = Security.getProvider(strArr[i10]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((nb1) this.f7073a).c(str, (Provider) it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // com.google.android.gms.internal.ads.qe0
    /* JADX INFO: renamed from: zza */
    public void mo0zza(Object obj) {
        ((dk1) obj).o(((ui1) this.f7073a).D);
    }
}
