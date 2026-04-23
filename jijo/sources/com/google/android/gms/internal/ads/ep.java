package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nonagon.signalgeneration.zzap;
import com.google.android.gms.ads.nonagon.signalgeneration.zzr;
import com.google.android.gms.ads.nonagon.signalgeneration.zzs;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ep implements MediationAdLoadCallback, zzr, k21, NativeAd.OnNativeAdLoadedListener, rs0, g4.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4269b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4270d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f4271f;

    public /* synthetic */ ep(int i10) {
        this.f4268a = 24;
        this.f4269b = null;
        this.f4270d = null;
        this.f4271f = q71.f8134e;
    }

    public static final ep g(l31 l31Var) throws GeneralSecurityException {
        char c10;
        int i10;
        h31 h31Var = new h31();
        g31 g31Var = new g31(l31Var);
        f3 f3Var = f3.f4365q;
        g31Var.f4807c = f3Var;
        char c11 = 1;
        g31Var.f4805a = true;
        ArrayList<g31> arrayList = h31Var.f5196a;
        Iterator it = arrayList.iterator();
        while (true) {
            c10 = 0;
            if (!it.hasNext()) {
                break;
            }
            ((g31) it.next()).f4805a = false;
        }
        arrayList.add(g31Var);
        if (h31Var.f5198c) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        h31Var.f5198c = true;
        ea1 ea1VarC = ha1.C();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i11 = 0;
        while (i11 < arrayList.size() - 1) {
            int i12 = i11 + 1;
            if (((g31) arrayList.get(i11)).f4807c == f3Var && ((g31) arrayList.get(i12)).f4807c != f3Var) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i11 = i12;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (g31 g31Var2 : arrayList) {
            g31Var2.getClass();
            f3 f3Var2 = g31Var2.f4807c;
            if (f3Var2 == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i13 = 3;
            int i14 = 4;
            if (f3Var2 == f3Var) {
                i10 = 0;
                while (true) {
                    if (i10 != 0 && !hashSet.contains(Integer.valueOf(i10))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[i14];
                    int i15 = 0;
                    while (i15 == 0) {
                        secureRandom.nextBytes(bArr);
                        i15 = ((bArr[c11] & 255) << 16) | ((bArr[c10] & 255) << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                        c10 = 0;
                        i14 = 4;
                    }
                    i10 = i15;
                }
            } else {
                i10 = 0;
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException(fb1.h("Id ", i10, " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            l31 l31Var2 = g31Var2.f4806b;
            t.a aVarA = m61.f6878b.a(l31Var2, c11 != l31Var2.a() ? null : numValueOf);
            Object obj = f31.f4381b;
            i31 i31Var = new i31(aVarA);
            f71 f71Var = (f71) t61.f9074b.c(aVarA);
            Integer num2 = f71Var.f4426f;
            if (num2 != null && num2.intValue() != i10) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            if (!obj.equals(obj)) {
                if (f31.f4382c.equals(obj)) {
                    i13 = 4;
                } else {
                    if (!f31.f4383d.equals(obj)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i13 = 5;
                }
            }
            fa1 fa1VarC = ga1.C();
            y91 y91VarA = z91.A();
            y91VarA.d();
            f3 f3Var3 = f3Var;
            z91.F((z91) y91VarA.f9462b, f71Var.f4421a);
            y91VarA.d();
            z91.G((z91) y91VarA.f9462b, f71Var.f4423c);
            y91VarA.d();
            ((z91) y91VarA.f9462b).zze = g1.a.d(f71Var.f4424d);
            fa1VarC.d();
            ga1.E((ga1) fa1VarC.f9462b, (z91) y91VarA.b());
            fa1VarC.d();
            ga1.J((ga1) fa1VarC.f9462b, i13);
            fa1VarC.d();
            ((ga1) fa1VarC.f9462b).zzf = i10;
            fa1VarC.d();
            ((ga1) fa1VarC.f9462b).zzg = f71Var.f4425e.a();
            ga1 ga1Var = (ga1) fa1VarC.b();
            ea1VarC.d();
            ha1.H((ha1) ea1VarC.f9462b, ga1Var);
            if (g31Var2.f4805a) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = numValueOf;
            }
            arrayList2.add(i31Var);
            f3Var = f3Var3;
            c11 = 1;
            c10 = 0;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        int iIntValue = num.intValue();
        ea1VarC.d();
        ((ha1) ea1VarC.f9462b).zzc = iIntValue;
        ha1 ha1Var = (ha1) ea1VarC.b();
        if (ha1Var.A() > 0) {
            return new ep(ha1Var, arrayList2, h31Var.f5197b);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        ((q11) ((n00) this.f4271f).f7091e).a(new fd(this, th, (vt0) this.f4269b, (String) this.f4270d, 1));
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo4a(Object obj) {
        ((q11) ((n00) this.f4271f).f7091e).a(new m00((vt0) this.f4269b, (String) obj, 0));
    }

    public final tl0 b(Callable callable) {
        List list = (List) this.f4270d;
        zy0 zy0Var = bz0.f3132b;
        list.getClass();
        bz0 bz0VarK = bz0.k(list);
        wf wfVar = new wf(7);
        mu muVar = nu.f7388f;
        c21 c21Var = new c21(bz0VarK, true, false);
        c21Var.B = new b21(c21Var, wfVar, muVar);
        c21Var.w();
        p21 p21Var = ((us0) this.f4271f).f9604a;
        c21 c21Var2 = new c21(bz0VarK, true, false);
        c21Var2.B = new b21(c21Var2, callable, p21Var);
        c21Var2.w();
        return new tl0((us0) this.f4271f, this.f4269b, null, c21Var, (List) this.f4270d, c21Var2);
    }

    public final synchronized String c() {
        zzdn zzdnVar;
        try {
            zzdnVar = (zzdn) this.f4271f;
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return zzdnVar != null ? zzdnVar.zzg() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.ads.hr0 r3, com.google.android.gms.internal.ads.fr0 r4, int r5, com.google.android.gms.internal.ads.zzeex r6, long r7) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f4271f
            com.google.android.gms.internal.ads.ed0 r0 = (com.google.android.gms.internal.ads.ed0) r0
            com.google.android.gms.internal.ads.m20 r0 = r0.a()
            java.lang.String r1 = "gqi"
            java.lang.String r3 = r3.f5371b
            r0.f(r1, r3)
            java.lang.String r3 = r4.f4644w
            java.lang.String r1 = "aai"
            r0.f(r1, r3)
            java.lang.String r3 = "request_id"
            java.lang.String r1 = r4.f4627n0
            r0.f(r3, r1)
            int r3 = r4.f4602b
            java.lang.String r3 = com.google.android.gms.internal.ads.fr0.a(r3)
            java.lang.String r1 = "ad_format"
            r0.f(r1, r3)
            java.lang.String r3 = "action"
            java.lang.String r1 = "adapter_status"
            r0.f(r3, r1)
            java.lang.String r3 = "adapter_l"
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r0.f(r3, r7)
            java.lang.String r3 = "sc"
            java.lang.String r5 = java.lang.Integer.toString(r5)
            r0.f(r3, r5)
            r3 = 0
            if (r6 == 0) goto L77
            com.google.android.gms.ads.internal.client.zze r5 = r6.f11606b
            int r5 = r5.zza
            java.lang.String r5 = java.lang.Integer.toString(r5)
            java.lang.String r7 = "arec"
            r0.f(r7, r5)
            java.lang.Object r5 = r2.f4269b
            com.google.android.gms.internal.ads.sr0 r5 = (com.google.android.gms.internal.ads.sr0) r5
            java.lang.String r6 = r6.getMessage()
            java.util.regex.Pattern r5 = r5.f8967a
            if (r5 == 0) goto L6f
            if (r6 != 0) goto L60
            goto L6f
        L60:
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L6f
            java.lang.String r5 = r5.group()
            goto L70
        L6f:
            r5 = r3
        L70:
            if (r5 == 0) goto L77
            java.lang.String r6 = "areec"
            r0.f(r6, r5)
        L77:
            java.lang.Object r5 = r2.f4270d
            com.google.android.gms.internal.ads.qc0 r5 = (com.google.android.gms.internal.ads.qc0) r5
            java.util.List r4 = r4.f4638t
            java.util.Iterator r4 = r4.iterator()
        L81:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L94
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            com.google.android.gms.internal.ads.pc0 r6 = r5.a(r6)
            if (r6 == 0) goto L81
            r3 = r6
        L94:
            if (r3 == 0) goto Lb7
            java.lang.String r4 = "ancn"
            java.lang.String r5 = r3.f7853a
            r0.f(r4, r5)
            com.google.android.gms.internal.ads.zzbra r4 = r3.f7854b
            if (r4 == 0) goto Laa
            java.lang.String r5 = "adapter_v"
            java.lang.String r4 = r4.toString()
            r0.f(r5, r4)
        Laa:
            com.google.android.gms.internal.ads.zzbra r3 = r3.f7855c
            if (r3 == 0) goto Lb7
            java.lang.String r4 = "adapter_sv"
            java.lang.String r3 = r3.toString()
            r0.f(r4, r3)
        Lb7:
            r0.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ep.d(com.google.android.gms.internal.ads.hr0, com.google.android.gms.internal.ads.fr0, int, com.google.android.gms.internal.ads.zzeex, long):void");
    }

    public final void e(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.f4269b = Integer.valueOf(i10);
    }

    public final long f() {
        switch (this.f4268a) {
            case 26:
                return ((lm1) this.f4270d).f6665l;
            default:
                h0 h0Var = (h0) this.f4271f;
                if (h0Var != null) {
                    return h0Var.zzf();
                }
                return -1L;
        }
    }

    public final hr0 h() {
        return (hr0) ((kr0) this.f4269b).f6383b.f10631d;
    }

    public final synchronized String i() {
        zzdn zzdnVar;
        try {
            zzdnVar = (zzdn) this.f4271f;
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return zzdnVar != null ? zzdnVar.zzg() : null;
    }

    public final void j(int i10) throws GeneralSecurityException {
        if (i10 < 10 || i10 > 16) {
            throw new GeneralSecurityException(fb1.g("Invalid tag size for AesCmacParameters: ", i10));
        }
        this.f4270d = Integer.valueOf(i10);
    }

    public final kr0 k() {
        switch (this.f4268a) {
        }
        return (kr0) this.f4269b;
    }

    public final c41 l() throws GeneralSecurityException {
        mx0 mx0Var;
        tb1 tb1VarB;
        g41 g41Var = (g41) this.f4269b;
        if (g41Var == null || (mx0Var = (mx0) this.f4270d) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (g41Var.f4813a != mx0Var.b()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (g41Var.a() && ((Integer) this.f4271f) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((g41) this.f4269b).a() && ((Integer) this.f4271f) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        e41 e41Var = ((g41) this.f4269b).f4815c;
        if (e41Var == e41.f3857d) {
            tb1VarB = u61.f9405a;
        } else if (e41Var == e41.f3856c) {
            tb1VarB = u61.a(((Integer) this.f4271f).intValue());
        } else {
            if (e41Var != e41.f3855b) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(((g41) this.f4269b).f4815c)));
            }
            tb1VarB = u61.b(((Integer) this.f4271f).intValue());
        }
        return new c41((g41) this.f4269b, (mx0) this.f4270d, tb1VarB, (Integer) this.f4271f);
    }

    public final h41 m() throws GeneralSecurityException {
        mx0 mx0Var;
        tb1 tb1VarB;
        k41 k41Var = (k41) this.f4269b;
        if (k41Var == null || (mx0Var = (mx0) this.f4270d) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (k41Var.f6177a != mx0Var.b()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (k41Var.a() && ((Integer) this.f4271f) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((k41) this.f4269b).a() && ((Integer) this.f4271f) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        j41 j41Var = ((k41) this.f4269b).f6178b;
        if (j41Var == j41.f5799d) {
            tb1VarB = u61.f9405a;
        } else if (j41Var == j41.f5798c) {
            tb1VarB = u61.a(((Integer) this.f4271f).intValue());
        } else {
            if (j41Var != j41.f5797b) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(((k41) this.f4269b).f6178b)));
            }
            tb1VarB = u61.b(((Integer) this.f4271f).intValue());
        }
        return new h41((k41) this.f4269b, (mx0) this.f4270d, tb1VarB, (Integer) this.f4271f);
    }

    public final l41 n() throws GeneralSecurityException {
        mx0 mx0Var;
        tb1 tb1VarB;
        p41 p41Var = (p41) this.f4269b;
        if (p41Var == null || (mx0Var = (mx0) this.f4270d) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (p41Var.f7803a != mx0Var.b()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (p41Var.a() && ((Integer) this.f4271f) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((p41) this.f4269b).a() && ((Integer) this.f4271f) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        n41 n41Var = ((p41) this.f4269b).f7804b;
        if (n41Var == n41.f7142d) {
            tb1VarB = u61.f9405a;
        } else if (n41Var == n41.f7141c) {
            tb1VarB = u61.a(((Integer) this.f4271f).intValue());
        } else {
            if (n41Var != n41.f7140b) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(((p41) this.f4269b).f7804b)));
            }
            tb1VarB = u61.b(((Integer) this.f4271f).intValue());
        }
        return new l41((p41) this.f4269b, (mx0) this.f4270d, tb1VarB, (Integer) this.f4271f);
    }

    public final o71 o() throws GeneralSecurityException {
        mx0 mx0Var;
        tb1 tb1VarA;
        r71 r71Var = (r71) this.f4269b;
        if (r71Var == null || (mx0Var = (mx0) this.f4270d) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (r71Var.f8430a != mx0Var.b()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (r71Var.a() && ((Integer) this.f4271f) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((r71) this.f4269b).a() && ((Integer) this.f4271f) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        q71 q71Var = ((r71) this.f4269b).f8432c;
        if (q71Var == q71.f8134e) {
            tb1VarA = u61.f9405a;
        } else if (q71Var == q71.f8133d || q71Var == q71.f8132c) {
            tb1VarA = u61.a(((Integer) this.f4271f).intValue());
        } else {
            if (q71Var != q71.f8131b) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(((r71) this.f4269b).f8432c)));
            }
            tb1VarA = u61.b(((Integer) this.f4271f).intValue());
        }
        return new o71((r71) this.f4269b, (mx0) this.f4270d, tb1VarA, (Integer) this.f4271f);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            ((zo) this.f4269b).zzf(adError.zza());
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        ((te0) this.f4269b).u1(nativeAd, (String) this.f4270d, (String) this.f4271f);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
        if (mediationRewardedAd == null) {
            zzm.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                ((zo) this.f4269b).a("Adapter returned null.");
                return null;
            } catch (RemoteException e10) {
                zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                return null;
            }
        }
        try {
            ((fp) this.f4271f).f4590d = mediationRewardedAd;
            ((zo) this.f4269b).zzg();
        } catch (RemoteException e11) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
        }
        return new rk0(8, (wn) this.f4270d);
    }

    public final r71 p() throws GeneralSecurityException {
        Integer num = (Integer) this.f4269b;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f4270d) == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (((q71) this.f4271f) != null) {
            return new r71(num.intValue(), ((Integer) this.f4270d).intValue(), (q71) this.f4271f);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public final v71 q() throws GeneralSecurityException {
        mx0 mx0Var;
        tb1 tb1VarA;
        a81 a81Var = (a81) this.f4269b;
        if (a81Var == null || (mx0Var = (mx0) this.f4270d) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (a81Var.f2620a != mx0Var.b()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (a81Var.a() && ((Integer) this.f4271f) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((a81) this.f4269b).a() && ((Integer) this.f4271f) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        z71 z71Var = ((a81) this.f4269b).f2622c;
        if (z71Var == z71.f11181e) {
            tb1VarA = u61.f9405a;
        } else if (z71Var == z71.f11180d || z71Var == z71.f11179c) {
            tb1VarA = u61.a(((Integer) this.f4271f).intValue());
        } else {
            if (z71Var != z71.f11178b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(((a81) this.f4269b).f2622c)));
            }
            tb1VarA = u61.b(((Integer) this.f4271f).intValue());
        }
        return new v71((a81) this.f4269b, (mx0) this.f4270d, tb1VarA, (Integer) this.f4271f);
    }

    public final Object r() throws GeneralSecurityException {
        Class clsA;
        int i10 = o31.f7500a;
        try {
            clsA = s61.f8810b.a();
        } catch (GeneralSecurityException unused) {
            clsA = null;
        }
        if (clsA == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(a31.class.getName()));
        }
        int i11 = q31.f8100a;
        ha1 ha1Var = (ha1) this.f4269b;
        int iB = ha1Var.B();
        int i12 = 0;
        boolean z9 = false;
        boolean z10 = true;
        for (ga1 ga1Var : ha1Var.F()) {
            if (ga1Var.I() == 3) {
                if (!ga1Var.H()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(ga1Var.A())));
                }
                if (ga1Var.D() == ua1.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(ga1Var.A())));
                }
                if (ga1Var.I() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(ga1Var.A())));
                }
                if (ga1Var.A() == iB) {
                    if (z9) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z9 = true;
                }
                z10 &= ga1Var.B().B() == 4;
                i12++;
            }
        }
        if (i12 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z9 && !z10) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        qp0 qp0Var = new qp0(clsA);
        i61 i61Var = (i61) this.f4271f;
        if (((Map) qp0Var.f8252d) == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        qp0Var.f8255q = i61Var;
        for (int i13 = 0; i13 < ((List) this.f4270d).size(); i13++) {
            ga1 ga1VarD = ((ha1) this.f4269b).D(i13);
            if (ga1VarD.I() == 3) {
                i31 i31Var = (i31) ((List) this.f4270d).get(i13);
                if (i31Var == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i13 + " and type_url " + ga1VarD.B().E() + " failed, unable to get primitive");
                }
                try {
                    Object objB = s61.f8810b.b(i31Var.f5470a, clsA);
                    if (ga1VarD.A() == ((ha1) this.f4269b).B()) {
                        qp0Var.k(objB, ga1VarD, true);
                    } else {
                        qp0Var.k(objB, ga1VarD, false);
                    }
                } catch (GeneralSecurityException e10) {
                    throw new GeneralSecurityException("Unable to get primitive " + clsA.toString() + " for key of type " + ga1VarD.B().E() + ", see https://developers.google.com/tink/faq/registration_errors", e10);
                }
            }
        }
        Map map = (Map) qp0Var.f8252d;
        if (map == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        xq xqVar = new xq(map, (d71) qp0Var.f8254h, (i61) qp0Var.f8255q, (Class) qp0Var.f8251b);
        qp0Var.f8252d = null;
        int i14 = o31.f7500a;
        HashMap map2 = ((c71) s61.f8810b.f8811a.get()).f3227b;
        if (!map2.containsKey(a31.class)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(a31.class.toString()));
        }
        e71 e71Var = (e71) map2.get(a31.class);
        if (((Class) xqVar.f10632f).equals(e71Var.zza()) && e71Var.zza().equals((Class) xqVar.f10632f)) {
            return e71Var.a(xqVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }

    public final synchronized void s(zzl zzlVar, int i10) {
        this.f4271f = null;
        rl0 rl0Var = new rl0(i10);
        i10 i10Var = new i10(26, this);
        ((ql0) this.f4269b).b(zzlVar, (String) this.f4270d, rl0Var, i10Var);
    }

    public final synchronized void t(fs0 fs0Var, es0 es0Var) {
        try {
            as0 as0Var = (as0) ((ConcurrentHashMap) this.f4269b).get(fs0Var);
            ((y3.b) zzu.zzB()).getClass();
            es0Var.f4288d = System.currentTimeMillis();
            if (as0Var == null) {
                zzfhb zzfhbVar = (zzfhb) this.f4270d;
                as0 as0Var2 = new as0(zzfhbVar.f11620h, zzfhbVar.f11621q * 1000);
                if (((ConcurrentHashMap) this.f4269b).size() == ((zzfhb) this.f4270d).f11619f) {
                    int i10 = ((zzfhb) this.f4270d).f11625v;
                    int i11 = i10 - 1;
                    fs0 fs0Var2 = null;
                    if (i10 == 0) {
                        throw null;
                    }
                    long j10 = Long.MAX_VALUE;
                    if (i11 == 0) {
                        for (Map.Entry entry : ((ConcurrentHashMap) this.f4269b).entrySet()) {
                            if (((as0) entry.getValue()).f2784d.f7661a < j10) {
                                j10 = ((as0) entry.getValue()).f2784d.f7661a;
                                fs0Var2 = (fs0) entry.getKey();
                            }
                        }
                        if (fs0Var2 != null) {
                            ((ConcurrentHashMap) this.f4269b).remove(fs0Var2);
                        }
                    } else if (i11 == 1) {
                        for (Map.Entry entry2 : ((ConcurrentHashMap) this.f4269b).entrySet()) {
                            if (((as0) entry2.getValue()).f2784d.f7663c < j10) {
                                j10 = ((as0) entry2.getValue()).f2784d.f7663c;
                                fs0Var2 = (fs0) entry2.getKey();
                            }
                        }
                        if (fs0Var2 != null) {
                            ((ConcurrentHashMap) this.f4269b).remove(fs0Var2);
                        }
                    } else if (i11 == 2) {
                        int i12 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : ((ConcurrentHashMap) this.f4269b).entrySet()) {
                            if (((as0) entry3.getValue()).f2784d.f7664d < i12) {
                                i12 = ((as0) entry3.getValue()).f2784d.f7664d;
                                fs0Var2 = (fs0) entry3.getKey();
                            }
                        }
                        if (fs0Var2 != null) {
                            ((ConcurrentHashMap) this.f4269b).remove(fs0Var2);
                        }
                    }
                    r rVar = (r) this.f4271f;
                    rVar.f8336b++;
                    ((bs0) rVar.f8340f).f3094b = true;
                }
                ((ConcurrentHashMap) this.f4269b).put(fs0Var, as0Var2);
                r rVar2 = (r) this.f4271f;
                rVar2.f8335a++;
                ((bs0) rVar2.f8340f).f3093a = true;
                as0Var = as0Var2;
            }
            os0 os0Var = as0Var.f2784d;
            os0Var.getClass();
            ((y3.b) zzu.zzB()).getClass();
            os0Var.f7663c = System.currentTimeMillis();
            os0Var.f7664d++;
            as0Var.a();
            LinkedList linkedList = as0Var.f2781a;
            if (linkedList.size() != as0Var.f2782b) {
                linkedList.add(es0Var);
            }
            Object obj = this.f4271f;
            ((r) obj).f8339e++;
            bs0 bs0Var = (bs0) ((r) obj).f8340f;
            bs0 bs0VarClone = bs0Var.clone();
            bs0Var.f3093a = false;
            bs0Var.f3094b = false;
            ns0 ns0Var = as0Var.f2784d.f7662b;
            ns0 ns0VarClone = ns0Var.clone();
            ns0Var.f7379a = false;
            ns0Var.f7380b = 0;
            oe oeVarA = ve.A();
            me meVarC = ne.C();
            meVarC.d();
            ne.D((ne) meVarC.f9462b);
            te teVarC = ue.C();
            boolean z9 = bs0VarClone.f3093a;
            teVarC.d();
            ue.D((ue) teVarC.f9462b, z9);
            boolean z10 = bs0VarClone.f3094b;
            teVarC.d();
            ue.A((ue) teVarC.f9462b, z10);
            int i13 = ns0VarClone.f7380b;
            teVarC.d();
            ue.B((ue) teVarC.f9462b, i13);
            meVarC.d();
            ne.B((ne) meVarC.f9462b, (ue) teVarC.b());
            oeVarA.d();
            ve.B((ve) oeVarA.f9462b, (ne) meVarC.b());
            es0Var.f4285a.zzb().f4372f.E((ve) oeVarA.b());
            x();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String toString() {
        switch (this.f4268a) {
            case 17:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f4269b);
                sb.append('{');
                cj0 cj0Var = (cj0) ((cj0) this.f4270d).f3302d;
                String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                while (cj0Var != null) {
                    Object obj = cj0Var.f3301b;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
                    }
                    cj0Var = (cj0) cj0Var.f3302d;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 18:
                int i10 = q31.f8100a;
                ia1 ia1VarA = la1.A();
                ha1 ha1Var = (ha1) this.f4269b;
                int iB = ha1Var.B();
                ia1VarA.d();
                ((la1) ia1VarA.f9462b).zzc = iB;
                for (ga1 ga1Var : ha1Var.F()) {
                    ja1 ja1VarA = ka1.A();
                    String strE = ga1Var.B().E();
                    ja1VarA.d();
                    ka1.B((ka1) ja1VarA.f9462b, strE);
                    int I = ga1Var.I();
                    ja1VarA.d();
                    ka1.E((ka1) ja1VarA.f9462b, I);
                    ua1 ua1VarD = ga1Var.D();
                    ja1VarA.d();
                    ((ka1) ja1VarA.f9462b).zzf = ua1VarD.a();
                    int iA = ga1Var.A();
                    ja1VarA.d();
                    ((ka1) ja1VarA.f9462b).zze = iA;
                    ka1 ka1Var = (ka1) ja1VarA.b();
                    ia1VarA.d();
                    la1.C((la1) ia1VarA.f9462b, ka1Var);
                }
                return ((la1) ia1VarA.b()).toString();
            default:
                return super.toString();
        }
    }

    public final void u(hw0 hw0Var, Uri uri, Map map, long j10, long j11, i0 i0Var) throws zzwj {
        boolean z9;
        a0 a0Var = new a0(hw0Var, j10, j11);
        this.f4271f = a0Var;
        if (((g0) this.f4270d) != null) {
            return;
        }
        g0[] g0VarArrH = ((j0) this.f4269b).h(uri, map);
        int length = g0VarArrH.length;
        zy0 zy0Var = bz0.f3132b;
        yy0 yy0Var = new yy0(length);
        boolean z10 = true;
        if (length == 1) {
            this.f4270d = g0VarArrH[0];
        } else {
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                g0 g0Var = g0VarArrH[i10];
                try {
                    if (g0Var.f(a0Var)) {
                        this.f4270d = g0Var;
                        a0Var.f2546q = 0;
                        break;
                    } else {
                        yy0Var.c(g0Var.zzd());
                        z9 = ((g0) this.f4270d) != null || a0Var.f2544f == j10;
                    }
                } catch (EOFException unused) {
                    z9 = ((g0) this.f4270d) != null || a0Var.f2544f == j10;
                } catch (Throwable th) {
                    if (((g0) this.f4270d) == null && a0Var.f2544f != j10) {
                        z10 = false;
                    }
                    tc1.W(z10);
                    a0Var.f2546q = 0;
                    throw th;
                }
                tc1.W(z9);
                a0Var.f2546q = 0;
                i10++;
            }
            if (((g0) this.f4270d) == null) {
                Iterator it = tp1.V(bz0.l(g0VarArrH), new b3(23)).iterator();
                StringBuilder sb = new StringBuilder();
                en1.s0(sb, it, ", ");
                String strI = fb1.i("None of the available extractors (", sb.toString(), ") could read the stream.");
                wz0 wz0VarG = yy0Var.g();
                zzwj zzwjVar = new zzwj(strI, null, false, 1);
                bz0.k(wz0VarG);
                throw zzwjVar;
            }
        }
        ((g0) this.f4270d).e(i0Var);
    }

    public final synchronized boolean v() {
        return ((ql0) this.f4269b).zza();
    }

    public final synchronized boolean w(fs0 fs0Var) {
        as0 as0Var = (as0) ((ConcurrentHashMap) this.f4269b).get(fs0Var);
        if (as0Var == null) {
            return true;
        }
        zzfhb zzfhbVar = (zzfhb) this.f4270d;
        as0Var.a();
        return as0Var.f2781a.size() < zzfhbVar.f11620h;
    }

    public final void x() {
        if (((Boolean) zzba.zzc().a(eg.H5)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(((zzfhb) this.f4270d).f11618d);
            sb.append(" PoolCollection");
            r rVar = (r) this.f4271f;
            sb.append("\n\tPool does not exist: " + rVar.f8337c + "\n\tNew pools created: " + rVar.f8335a + "\n\tPools removed: " + rVar.f8336b + "\n\tEntries added: " + rVar.f8339e + "\n\tNo entries retrieved: " + rVar.f8338d + "\n");
            int i10 = 0;
            for (Map.Entry entry : ((ConcurrentHashMap) this.f4269b).entrySet()) {
                i10++;
                sb.append(i10);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((fs0) entry.getKey()).hashCode());
                sb.append("    ");
                int i11 = 0;
                while (true) {
                    as0 as0Var = (as0) entry.getValue();
                    as0Var.a();
                    if (i11 >= as0Var.f2781a.size()) {
                        break;
                    }
                    sb.append("[O]");
                    i11++;
                }
                as0 as0Var2 = (as0) entry.getValue();
                as0Var2.a();
                for (int size = as0Var2.f2781a.size(); size < ((zzfhb) this.f4270d).f11620h; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                as0 as0Var3 = (as0) entry.getValue();
                StringBuilder sb2 = new StringBuilder("Created: ");
                os0 os0Var = as0Var3.f2784d;
                sb2.append(os0Var.f7661a);
                sb2.append(" Last accessed: ");
                sb2.append(os0Var.f7663c);
                sb2.append(" Accesses: ");
                sb2.append(os0Var.f7664d);
                sb2.append("\nEntries retrieved: Valid: ");
                sb2.append(os0Var.f7665e);
                sb2.append(" Stale: ");
                sb2.append(os0Var.f7666f);
                sb.append(sb2.toString());
                sb.append("\n");
            }
            while (i10 < ((zzfhb) this.f4270d).f11619f) {
                i10++;
                sb.append(i10);
                sb.append(".\n");
            }
            zzm.zze(sb.toString());
        }
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzr
    public final /* synthetic */ zzr zza(z30 z30Var) {
        this.f4270d = z30Var;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzr
    public final /* synthetic */ zzr zzb(zzap zzapVar) {
        this.f4271f = zzapVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzr
    public final zzs zzc() {
        tp1.h0((z30) this.f4270d, z30.class);
        tp1.h0((zzap) this.f4271f, zzap.class);
        return new pz((zy) this.f4269b, (zzap) this.f4271f, (z30) this.f4270d);
    }

    public /* synthetic */ ep(int i10, int i11) {
        this.f4268a = i10;
        this.f4269b = null;
        this.f4270d = null;
        this.f4271f = null;
    }

    @Override // g4.t0
    public final /* bridge */ /* synthetic */ Object zza() {
        return new g4.v0((g4.g) ((g4.t0) this.f4269b).zza(), ((g4.a1) ((g4.t0) this.f4270d)).zza(), (g4.l) ((g4.t0) this.f4271f).zza());
    }

    public ep(j0 j0Var) {
        this.f4268a = 27;
        this.f4269b = j0Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }

    public ep(tl0 tl0Var, String str) {
        this.f4268a = 13;
        this.f4269b = tl0Var;
        this.f4270d = str;
    }

    public ep(kr0 kr0Var, fr0 fr0Var, String str) {
        this.f4268a = 5;
        this.f4269b = kr0Var;
        this.f4270d = fr0Var;
        this.f4271f = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public /* synthetic */ ep(us0 us0Var, ws0 ws0Var, List list) {
        this.f4268a = 16;
        this.f4271f = us0Var;
        this.f4269b = ws0Var;
        this.f4270d = list;
    }

    @Override // com.google.android.gms.internal.ads.rs0
    public final Object zza(Object obj) {
        lh0 lh0Var = (lh0) this.f4269b;
        com.google.android.gms.ads.internal.util.client.zzr zzrVar = (com.google.android.gms.ads.internal.util.client.zzr) this.f4270d;
        String str = (String) this.f4271f;
        lh0Var.getClass();
        ((mu) lh0Var.f6628b).execute(new l0.a((SQLiteDatabase) obj, str, zzrVar, 16, 0));
        return null;
    }

    public /* synthetic */ ep(ha1 ha1Var, ArrayList arrayList, i61 i61Var) {
        this.f4268a = 18;
        this.f4269b = ha1Var;
        this.f4270d = arrayList;
        this.f4271f = i61Var;
    }

    public /* synthetic */ ep(Object obj, Object obj2, Object obj3, int i10) {
        this.f4268a = i10;
        this.f4269b = obj2;
        this.f4270d = obj3;
        this.f4271f = obj;
    }

    public /* synthetic */ ep(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f4268a = i10;
        this.f4269b = obj;
        this.f4270d = obj2;
        this.f4271f = obj3;
    }

    public ep() {
        this.f4268a = 28;
        this.f4269b = new HashMap();
        this.f4270d = new HashMap();
    }

    public ep(m20 m20Var) {
        this.f4268a = 1;
        View view = (View) m20Var.f6809b;
        this.f4269b = view;
        this.f4270d = (Map) m20Var.f6810d;
        ut utVarD = xq.d(view.getContext());
        this.f4271f = utVarD;
        if (utVarD == null || ((Map) this.f4270d).isEmpty()) {
            return;
        }
        try {
            ((ut) this.f4271f).zzg(new zzbtl(new a4.b((View) this.f4269b), new a4.b((Map) this.f4270d)));
        } catch (RemoteException unused) {
            zzm.zzg("Failed to call remote method.");
        }
    }

    public ep(r90 r90Var, ed0 ed0Var) {
        this.f4268a = 14;
        this.f4269b = r90Var;
        final kl0 kl0Var = new kl0(ed0Var);
        this.f4270d = kl0Var;
        final fm fmVar = ((r90) this.f4269b).f8541e;
        this.f4271f = new n40() { // from class: com.google.android.gms.internal.ads.ol0
            @Override // com.google.android.gms.internal.ads.n40
            public final void t(zze zzeVar) {
                kl0Var.t(zzeVar);
                fm fmVar2 = fmVar;
                if (fmVar2 != null) {
                    try {
                        em emVar = (em) fmVar2;
                        Parcel parcelM = emVar.m();
                        qb.c(parcelM, zzeVar);
                        emVar.a0(parcelM, 3);
                    } catch (RemoteException e10) {
                        zzm.zzl("#007 Could not call remote method.", e10);
                    }
                }
                if (fmVar2 != null) {
                    try {
                        int i10 = zzeVar.zza;
                        em emVar2 = (em) fmVar2;
                        Parcel parcelM2 = emVar2.m();
                        parcelM2.writeInt(i10);
                        emVar2.a0(parcelM2, 2);
                    } catch (RemoteException e11) {
                        zzm.zzl("#007 Could not call remote method.", e11);
                    }
                }
            }
        };
    }

    public ep(zzfhb zzfhbVar) {
        this.f4268a = 15;
        this.f4269b = new ConcurrentHashMap(zzfhbVar.f11620h);
        this.f4270d = zzfhbVar;
        this.f4271f = new r();
    }

    public ep(ha1 ha1Var, List list) {
        this.f4268a = 18;
        this.f4269b = ha1Var;
        this.f4270d = list;
        this.f4271f = i61.f5509b;
    }

    public /* synthetic */ ep(String str) {
        this.f4268a = 17;
        cj0 cj0Var = new cj0(7);
        this.f4270d = cj0Var;
        this.f4271f = cj0Var;
        this.f4269b = str;
    }

    public ep(e30[] e30VarArr) {
        this.f4268a = 26;
        lm1 lm1Var = new lm1();
        lm1Var.f6666m = 0;
        lm1Var.f6668o = 0;
        lm1Var.f6669p = 0;
        byte[] bArr = yn0.f10949f;
        lm1Var.f6667n = bArr;
        lm1Var.f6670q = bArr;
        y30 y30Var = new y30();
        y30Var.f10738c = 1.0f;
        y30Var.f10739d = 1.0f;
        e20 e20Var = e20.f3817e;
        y30Var.f10740e = e20Var;
        y30Var.f10741f = e20Var;
        y30Var.f10742g = e20Var;
        y30Var.f10743h = e20Var;
        ByteBuffer byteBuffer = e30.f3848a;
        y30Var.f10746k = byteBuffer;
        y30Var.f10747l = byteBuffer.asShortBuffer();
        y30Var.f10748m = byteBuffer;
        y30Var.f10737b = -1;
        e30[] e30VarArr2 = new e30[2];
        this.f4269b = e30VarArr2;
        System.arraycopy(e30VarArr, 0, e30VarArr2, 0, 0);
        this.f4270d = lm1Var;
        this.f4271f = y30Var;
        e30[] e30VarArr3 = (e30[]) this.f4269b;
        e30VarArr3[0] = lm1Var;
        e30VarArr3[1] = y30Var;
    }
}
