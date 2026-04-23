package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Base64;
import android.util.JsonReader;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class xq implements c4, k21, tu, jd, j80 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static ut f10628q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10630b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10631d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f10632f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f10633h;

    public /* synthetic */ xq() {
        this.f10629a = 24;
        this.f10630b = null;
        this.f10631d = null;
        this.f10632f = null;
        this.f10633h = e41.f3857d;
    }

    public static String J(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        g9 g9VarA = h9.A();
        g9VarA.d();
        h9.D((h9) g9VarA.f9462b);
        cc1 cc1VarQ = ec1.q(0, bArr, bArr.length);
        g9VarA.d();
        h9.B((h9) g9VarA.f9462b, cc1VarQ);
        return Base64.encodeToString(((h9) g9VarA.b()).d(), 11);
    }

    public static xq b(Reader reader, zzbvb zzbvbVar) {
        try {
            try {
                return new xq(new JsonReader(reader), zzbvbVar);
            } finally {
                y3.c.b(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e10) {
            throw new zzfep("unable to parse ServerResponse", e10);
        }
    }

    public static ut d(Context context) {
        ut utVar;
        synchronized (xq.class) {
            try {
                if (f10628q == null) {
                    f10628q = zzay.zza().zzr(context, new pn());
                }
                utVar = f10628q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return utVar;
    }

    public final jt A() {
        tp1.h0((Context) this.f10630b, Context.class);
        tp1.h0((y3.a) this.f10631d, y3.a.class);
        tp1.h0((zzg) this.f10632f, zzg.class);
        tp1.h0((mt) this.f10633h, mt.class);
        Context context = (Context) this.f10630b;
        y3.a aVar = (y3.a) this.f10631d;
        zzg zzgVar = (zzg) this.f10632f;
        mt mtVar = (mt) this.f10633h;
        jt jtVar = new jt();
        jtVar.f6072a = aVar;
        jtVar.f6073b = kh1.a(context);
        kh1 kh1VarA = kh1.a(zzgVar);
        jtVar.f6074c = kh1VarA;
        jtVar.f6075d = ih1.b(new ft((nh1) jtVar.f6073b, kh1VarA, 0));
        jtVar.f6076e = kh1.a(aVar);
        kh1 kh1VarA2 = kh1.a(mtVar);
        jtVar.f6077f = kh1VarA2;
        nh1 nh1Var = (nh1) jtVar.f6076e;
        int i10 = 1;
        nh1 nh1VarB = ih1.b(new wg(nh1Var, (nh1) jtVar.f6074c, (nh1) kh1VarA2, i10));
        jtVar.f6078g = nh1VarB;
        ht htVar = new ht(nh1Var, nh1VarB);
        jtVar.f6079h = htVar;
        jtVar.f6080i = ih1.b(new ft((nh1) jtVar.f6073b, htVar, i10));
        return jtVar;
    }

    public final gs0 B() {
        or0 or0VarZzg = ((x30) this.f10631d).zzg();
        zzl zzlVar = or0VarZzg.f7644d;
        String str = or0VarZzg.f7646f;
        zzw zzwVar = or0VarZzg.f7650j;
        ep epVar = (ep) this.f10630b;
        return new gs0(zzlVar, str, new ur(((zzfhb) epVar.f4270d).f11616a).a().f9958j, ((zzfhb) epVar.f4270d).f11622s, zzwVar);
    }

    public final w31 C() throws GeneralSecurityException {
        tb1 tb1VarB;
        b41 b41Var = (b41) this.f10630b;
        if (b41Var == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        mx0 mx0Var = (mx0) this.f10631d;
        if (mx0Var == null || ((mx0) this.f10632f) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (b41Var.f2891a != mx0Var.b()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (b41Var.f2892b != ((mx0) this.f10632f).b()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (((b41) this.f10630b).a() && ((Integer) this.f10633h) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((b41) this.f10630b).a() && ((Integer) this.f10633h) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        a41 a41Var = ((b41) this.f10630b).f2895e;
        if (a41Var == a41.f2579d) {
            tb1VarB = u61.f9405a;
        } else if (a41Var == a41.f2578c) {
            tb1VarB = u61.a(((Integer) this.f10633h).intValue());
        } else {
            if (a41Var != a41.f2577b) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(((b41) this.f10630b).f2895e)));
            }
            tb1VarB = u61.b(((Integer) this.f10633h).intValue());
        }
        return new w31((b41) this.f10630b, (mx0) this.f10631d, (mx0) this.f10632f, tb1VarB, (Integer) this.f10633h);
    }

    public final g41 D() throws GeneralSecurityException {
        Integer num = (Integer) this.f10630b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f10631d) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((e41) this.f10633h) == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (((Integer) this.f10632f) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = ((Integer) this.f10631d).intValue();
        ((Integer) this.f10632f).intValue();
        return new g41(iIntValue, iIntValue2, (e41) this.f10633h);
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        ft0 ft0Var;
        switch (this.f10629a) {
            case 6:
                zzu.zzo().i("OpenGmsgHandler.attributionReportingManager", th);
                return;
            case 10:
                zzm.zzj("Failed to parse gmsg params for: ".concat(String.valueOf((Uri) this.f10631d)));
                return;
            case 19:
                zze zzeVarD0 = en1.d0(th, ((f30) ((fz) ((z10) this.f10632f)).X.zzb()).f4378l);
                yp0 yp0Var = (yp0) this.f10633h;
                yp0Var.f10999z = zzeVarD0;
                synchronized (yp0Var) {
                    try {
                        ((m40) ((fz) ((z10) this.f10632f)).Q.zzb()).t(((yp0) this.f10633h).f10999z);
                        tp1.Z(((yp0) this.f10633h).f10999z.zza, "BannerAdLoader.onFailure", th);
                        yp0 yp0Var2 = (yp0) this.f10633h;
                        if (yp0Var2.f10998y) {
                            yp0Var2.d();
                            yp0 yp0Var3 = (yp0) this.f10633h;
                            yp0Var3.f10993t.J0(yp0Var3.f10995v.a());
                        }
                        if (!((Boolean) eh.f4203c.k()).booleanValue() || (ft0Var = (ft0) this.f10630b) == null) {
                            yp0 yp0Var4 = (yp0) this.f10633h;
                            gt0 gt0Var = yp0Var4.f10994u;
                            bt0 bt0Var = (bt0) this.f10631d;
                            bt0Var.j(yp0Var4.f10999z);
                            bt0Var.e(th);
                            bt0Var.x(false);
                            gt0Var.b(bt0Var.zzm());
                        } else {
                            ft0Var.c(((yp0) this.f10633h).f10999z);
                            bt0 bt0Var2 = (bt0) this.f10631d;
                            bt0Var2.e(th);
                            bt0Var2.x(false);
                            ft0Var.a(bt0Var2);
                            ft0Var.h();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                return;
        }
    }

    public final k41 F() throws GeneralSecurityException {
        Integer num = (Integer) this.f10630b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((j41) this.f10633h) == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (((Integer) this.f10631d) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f10632f) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        ((Integer) this.f10631d).intValue();
        ((Integer) this.f10632f).intValue();
        return new k41(iIntValue, (j41) this.f10633h);
    }

    public final a81 G() throws GeneralSecurityException {
        Integer num = (Integer) this.f10630b;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f10631d) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((y71) this.f10632f) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((z71) this.f10633h) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f10630b));
        }
        int iIntValue = ((Integer) this.f10631d).intValue();
        y71 y71Var = (y71) this.f10632f;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(iIntValue)));
        }
        if (y71Var == y71.f10792b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(iIntValue)));
            }
        } else if (y71Var == y71.f10793c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(iIntValue)));
            }
        } else if (y71Var == y71.f10794d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(iIntValue)));
            }
        } else if (y71Var == y71.f10795e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(iIntValue)));
            }
        } else {
            if (y71Var != y71.f10796f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(iIntValue)));
            }
        }
        return new a81(((Integer) this.f10630b).intValue(), ((Integer) this.f10631d).intValue(), (z71) this.f10633h, (y71) this.f10632f);
    }

    public final synchronized void H() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f10630b.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f10630b, new Object[0]);
            ((cv0) this.f10633h).c(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e10) {
            throw new zzfqe(2003, e10);
        }
    }

    public final synchronized boolean I() {
        try {
        } catch (Exception e10) {
            throw new zzfqe(2001, e10);
        }
        return ((Boolean) this.f10630b.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f10630b, new Object[0])).booleanValue();
    }

    public final synchronized byte[] K(HashMap map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e10) {
            ((cv0) this.f10633h).b(2007, System.currentTimeMillis() - jCurrentTimeMillis, e10);
            return null;
        }
        return (byte[]) this.f10630b.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f10630b, null, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo4a(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xq.mo4a(java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        r2.h(r7);
        r2 = true;
     */
    @Override // com.google.android.gms.internal.ads.c4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(byte[] r35, int r36, int r37, com.google.android.gms.internal.ads.e4 r38) {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xq.c(byte[], int, int, com.google.android.gms.internal.ads.e4):void");
    }

    public final synchronized void e(i7 i7Var) {
        try {
            Map map = (Map) this.f10630b;
            String strZzj = i7Var.zzj();
            List list = (List) map.remove(strZzj);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (o7.f7522a) {
                o7.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzj);
            }
            i7 i7Var2 = (i7) list.remove(0);
            ((Map) this.f10630b).put(strZzj, list);
            i7Var2.i(this);
            try {
                ((BlockingQueue) this.f10632f).put(i7Var2);
            } catch (InterruptedException e10) {
                o7.b("Couldn't add request to queue. %s", e10.toString());
                Thread.currentThread().interrupt();
                a7 a7Var = (a7) this.f10631d;
                a7Var.f2616f = true;
                a7Var.interrupt();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void f(a61 a61Var) throws GeneralSecurityException {
        j71 j71Var = new j71(a61Var.f2610b, a61Var.f2609a);
        if (!((Map) this.f10631d).containsKey(j71Var)) {
            ((Map) this.f10631d).put(j71Var, a61Var);
            return;
        }
        a61 a61Var2 = (a61) ((Map) this.f10631d).get(j71Var);
        if (!a61Var2.equals(a61Var) || !a61Var.equals(a61Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(j71Var.toString()));
        }
    }

    public final void g() {
        this.f10631d = 12;
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void h(boolean z9, Context context, s40 s40Var) throws zzdgw {
        boolean zN;
        try {
            int iOrdinal = ((AdFormat) this.f10631d).ordinal();
            if (iOrdinal == 1) {
                zN = ((bp) this.f10632f).n(new a4.b(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zN = ((bp) this.f10632f).r(new a4.b(context));
                    }
                    throw new zzdgw("Adapter failed to show.");
                }
                zN = ((bp) this.f10632f).A(new a4.b(context));
            }
            if (zN) {
                if (((v40) this.f10633h) == null) {
                    return;
                }
                if (((Boolean) zzba.zzc().a(eg.f4066m1)).booleanValue() || ((fr0) this.f10630b).Y != 2) {
                    return;
                }
                ((v40) this.f10633h).zza();
                return;
            }
            throw new zzdgw("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdgw(th);
        }
    }

    public final void i(int i10) throws GeneralSecurityException {
        if (i10 != 12 && i10 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
        }
        this.f10631d = Integer.valueOf(i10);
    }

    public final void j(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzl zzlVarZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ut utVarD = d((Context) this.f10630b);
        if (utVarD == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        Context context = (Context) this.f10630b;
        zzdx zzdxVar = (zzdx) this.f10632f;
        a4.b bVar = new a4.b(context);
        if (zzdxVar == null) {
            com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm();
            zzmVar.zzg(jCurrentTimeMillis);
            zzlVarZza = zzmVar.zza();
        } else {
            zzdxVar.zzq(jCurrentTimeMillis);
            zzlVarZza = zzp.zza.zza((Context) this.f10630b, (zzdx) this.f10632f);
        }
        try {
            utVarD.zzf(bVar, new zzbyq((String) this.f10633h, ((AdFormat) this.f10631d).name(), null, zzlVarZza), new uq(queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final void k(rf rfVar) {
        nd ndVar = (nd) ((sf) rfVar.f9462b).J().o();
        md mdVar = (md) this.f10630b;
        ndVar.d();
        od.D((od) ndVar.f9462b, mdVar);
        rfVar.d();
        sf.E((sf) rfVar.f9462b, (od) ndVar.b());
        lf lfVar = (lf) ((sf) rfVar.f9462b).K().o();
        String str = (String) this.f10633h;
        lfVar.d();
        mf.C((mf) lfVar.f9462b, str);
        ge geVar = (ge) this.f10631d;
        lfVar.d();
        mf.A((mf) lfVar.f9462b, geVar);
        rfVar.d();
        sf.D((sf) rfVar.f9462b, (mf) lfVar.b());
        String str2 = (String) this.f10632f;
        rfVar.d();
        sf.A((sf) rfVar.f9462b, str2);
    }

    public final void l(i7 i7Var, l7 l7Var) {
        List list;
        z6 z6Var = (z6) l7Var.f6525d;
        if (z6Var == null || z6Var.f11161e < System.currentTimeMillis()) {
            e(i7Var);
            return;
        }
        String strZzj = i7Var.zzj();
        synchronized (this) {
            list = (List) ((Map) this.f10630b).remove(strZzj);
        }
        if (list != null) {
            if (o7.f7522a) {
                o7.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzj);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((i10) this.f10633h).d((i7) it.next(), l7Var, null);
            }
        }
    }

    public final void m(yu0 yu0Var) {
        yu0Var.f11038a = this;
        ((ArrayDeque) this.f10632f).add(yu0Var);
        if (((yu0) this.f10633h) == null) {
            yu0 yu0Var2 = (yu0) ((ArrayDeque) this.f10632f).poll();
            this.f10633h = yu0Var2;
            if (yu0Var2 != null) {
                yu0Var2.executeOnExecutor((ThreadPoolExecutor) this.f10631d, new Object[0]);
            }
        }
    }

    public final void n(c61 c61Var) throws GeneralSecurityException {
        k71 k71Var = new k71(c61Var.f3221a, c61Var.f3222b);
        if (!((Map) this.f10630b).containsKey(k71Var)) {
            ((Map) this.f10630b).put(k71Var, c61Var);
            return;
        }
        c61 c61Var2 = (c61) ((Map) this.f10630b).get(k71Var);
        if (!c61Var2.equals(c61Var) || !c61Var.equals(c61Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(k71Var.toString()));
        }
    }

    public final void o(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f10630b = Integer.valueOf(i10);
    }

    public final void p(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f10630b = Integer.valueOf(i10);
    }

    public final void q(int i10) {
        this.f10630b = Integer.valueOf(i10);
    }

    public final void r(v61 v61Var) throws GeneralSecurityException {
        j71 j71Var = new j71(v61Var.f9791b, v61Var.f9790a);
        if (!((Map) this.f10633h).containsKey(j71Var)) {
            ((Map) this.f10633h).put(j71Var, v61Var);
            return;
        }
        v61 v61Var2 = (v61) ((Map) this.f10633h).get(j71Var);
        if (!v61Var2.equals(v61Var) || !v61Var.equals(v61Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(j71Var.toString()));
        }
    }

    public final synchronized boolean s(i7 i7Var) {
        try {
            Map map = (Map) this.f10630b;
            String strZzj = i7Var.zzj();
            if (!map.containsKey(strZzj)) {
                ((Map) this.f10630b).put(strZzj, null);
                i7Var.i(this);
                if (o7.f7522a) {
                    o7.b("new request, sending to network %s", strZzj);
                }
                return false;
            }
            List arrayList = (List) ((Map) this.f10630b).get(strZzj);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            i7Var.zzm("waiting-for-response");
            arrayList.add(i7Var);
            ((Map) this.f10630b).put(strZzj, arrayList);
            if (o7.f7522a) {
                o7.b("Request for cacheKey=%s is in flight, putting on hold.", strZzj);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void t() {
        this.f10632f = 16;
    }

    public final void u(int i10) {
        this.f10631d = Integer.valueOf(i10);
    }

    public final void v() {
        this.f10632f = 16;
    }

    public d50 w(Set set) {
        return new d50(set);
    }

    public final synchronized void x(MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.f10630b.getClass().getDeclaredMethod("he", Map.class).invoke(this.f10630b, map);
            ((cv0) this.f10633h).c(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e10) {
            throw new zzfqe(2005, e10);
        }
    }

    public final void y(x61 x61Var) throws GeneralSecurityException {
        k71 k71Var = new k71(x61Var.f10460a, x61Var.f10461b);
        if (!((Map) this.f10632f).containsKey(k71Var)) {
            ((Map) this.f10632f).put(k71Var, x61Var);
            return;
        }
        x61 x61Var2 = (x61) ((Map) this.f10632f).get(k71Var);
        if (!x61Var2.equals(x61Var) || !x61Var.equals(x61Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(k71Var.toString()));
        }
    }

    public final synchronized int z() {
        try {
        } catch (Exception e10) {
            throw new zzfqe(2006, e10);
        }
        return ((Integer) this.f10630b.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f10630b, new Object[0])).intValue();
    }

    @Override // com.google.android.gms.internal.ads.tu, com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final /* bridge */ /* synthetic */ void mo5zza(Object obj) {
        zm zmVar = (zm) obj;
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f10631d;
        qu quVar = (qu) this.f10632f;
        hn hnVar = (hn) this.f10633h;
        tm tmVar = (tm) this.f10630b;
        try {
            zzu.zzp();
            String string = UUID.randomUUID().toString();
            vk.f9891o.c(string, new gn(hnVar, tmVar, quVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", ((dn) hnVar.f5351d).a(obj2));
            zmVar.T(jSONObject, (String) hnVar.f5349b);
        } catch (Exception e10) {
            try {
                quVar.c(e10);
                zzm.zzh("Unable to invokeJavascript", e10);
            } finally {
                tmVar.o();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.c4
    public final /* synthetic */ void zzb() {
    }

    public xq(View view, nx nxVar, q20 q20Var, gr0 gr0Var) {
        this.f10629a = 11;
        this.f10631d = view;
        this.f10633h = nxVar;
        this.f10630b = q20Var;
        this.f10632f = gr0Var;
    }

    public xq(cl clVar, Map map, zza zzaVar, String str) {
        this.f10629a = 6;
        this.f10630b = map;
        this.f10631d = zzaVar;
        this.f10633h = str;
        this.f10632f = clVar;
    }

    public xq(ep epVar, x30 x30Var, Executor executor) {
        this.f10629a = 1;
        this.f10630b = epVar;
        this.f10631d = x30Var;
        this.f10632f = executor;
    }

    public /* synthetic */ xq(vq vqVar) {
        this.f10629a = 8;
    }

    public /* synthetic */ xq(wq wqVar) {
        this.f10629a = 23;
        this.f10630b = null;
        this.f10631d = null;
        this.f10632f = null;
        this.f10633h = null;
    }

    public xq(ix ixVar, List list, String str, Uri uri) {
        this.f10629a = 10;
        this.f10630b = list;
        this.f10633h = str;
        this.f10631d = uri;
        this.f10632f = ixVar;
    }

    public xq(fr0 fr0Var, bp bpVar, AdFormat adFormat) {
        this.f10629a = 18;
        this.f10633h = null;
        this.f10630b = fr0Var;
        this.f10632f = bpVar;
        this.f10631d = adFormat;
    }

    public /* synthetic */ xq(g1.a aVar) {
        this.f10629a = 29;
        this.f10630b = null;
        this.f10631d = null;
        this.f10632f = null;
        this.f10633h = z71.f11181e;
    }

    public /* synthetic */ xq(Object obj) {
        this.f10629a = 25;
        this.f10630b = null;
        this.f10631d = null;
        this.f10632f = null;
        this.f10633h = j41.f5799d;
    }

    public /* synthetic */ xq(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f10629a = i10;
        this.f10630b = obj;
        this.f10631d = obj2;
        this.f10632f = obj3;
        this.f10633h = obj4;
    }

    public /* synthetic */ xq(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f10629a = i10;
        this.f10630b = obj2;
        this.f10631d = obj3;
        this.f10632f = obj4;
        this.f10633h = obj;
    }

    public /* synthetic */ xq(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5) {
        this.f10629a = i10;
        this.f10630b = obj;
        this.f10633h = obj2;
        this.f10631d = obj3;
        this.f10632f = obj4;
    }

    public /* synthetic */ xq(Map map, d71 d71Var, i61 i61Var, Class cls) {
        this.f10629a = 27;
        this.f10630b = map;
        this.f10631d = d71Var;
        this.f10632f = cls;
        this.f10633h = i61Var;
    }

    public xq(int i10) {
        this.f10629a = i10;
        if (i10 != 17) {
            if (i10 == 22) {
                this.f10632f = new ArrayDeque();
                this.f10633h = null;
                this.f10630b = new LinkedBlockingQueue();
                this.f10631d = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, (BlockingQueue) this.f10630b);
                return;
            }
            if (i10 != 28) {
                this.f10630b = new ik0();
                this.f10631d = new ik0();
                this.f10632f = new n4();
            } else {
                this.f10630b = new HashMap();
                this.f10631d = new HashMap();
                this.f10632f = new HashMap();
                this.f10633h = new HashMap();
            }
        }
    }

    public xq(Context context, ViewGroup viewGroup, fx fxVar) {
        this.f10629a = 9;
        this.f10630b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f10632f = viewGroup;
        this.f10631d = fxVar;
        this.f10633h = null;
    }

    public xq(Context context, String str) {
        String packageName;
        this.f10629a = 5;
        this.f10630b = context;
        this.f10632f = str;
        this.f10633h = (String) fh.f4525a.k();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f10631d = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        ((Map) this.f10631d).put("v", "3");
        ((Map) this.f10631d).put("os", Build.VERSION.RELEASE);
        ((Map) this.f10631d).put("api_v", Build.VERSION.SDK);
        Map map = (Map) this.f10631d;
        zzu.zzp();
        map.put("device", zzt.zzr());
        Map map2 = (Map) this.f10631d;
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        map2.put("app", packageName);
        Map map3 = (Map) this.f10631d;
        zzu.zzp();
        map3.put("is_lite_sdk", true != zzt.zzE(context) ? "0" : "1");
        xr xrVarZzm = zzu.zzm();
        Context context2 = (Context) this.f10630b;
        xrVarZzm.getClass();
        n5.a aVarB = nu.f7383a.b(new xa(xrVarZzm, context2));
        try {
            ((Map) this.f10631d).put("network_coarse", Integer.toString(((vr) aVarB.get()).f9958j));
            ((Map) this.f10631d).put("network_fine", Integer.toString(((vr) aVarB.get()).f9959k));
        } catch (Exception e10) {
            zzu.zzo().i("CsiConfiguration.CsiConfiguration", e10);
        }
        if (((Boolean) zzba.zzc().a(eg.ua)).booleanValue()) {
            Map map4 = (Map) this.f10631d;
            zzu.zzp();
            map4.put("is_bstar", true != zzt.zzB(context) ? "0" : "1");
        }
        if (((Boolean) zzba.zzc().a(eg.A8)).booleanValue()) {
            if (!((Boolean) zzba.zzc().a(eg.Z1)).booleanValue() || tc1.n(zzu.zzo().f5060g)) {
                return;
            }
            ((Map) this.f10631d).put("plugin", zzu.zzo().f5060g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public xq(JsonReader jsonReader, zzbvb zzbvbVar) throws IOException {
        Bundle bundle;
        this.f10629a = 20;
        this.f10633h = zzbvbVar;
        if (((Boolean) zzba.zzc().a(eg.S1)).booleanValue() && zzbvbVar != null && (bundle = zzbvbVar.f11586y) != null) {
            ((y3.b) zzu.zzB()).getClass();
            bundle.putLong("server-response-parse-start", System.currentTimeMillis());
        }
        ?? EmptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        hr0 hr0Var = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        EmptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            EmptyList.add(new fr0(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        hr0Var = new hr0(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectZzi = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectZzi = zzbs.zzi(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList.add(new jr0(jSONObjectZzi, strNextString));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f10632f = arrayList;
        this.f10630b = EmptyList;
        this.f10631d = hr0Var == null ? new hr0(new JsonReader(new StringReader("{}"))) : hr0Var;
    }

    public xq(a7 a7Var, PriorityBlockingQueue priorityBlockingQueue, i10 i10Var) {
        this.f10629a = 4;
        this.f10630b = new HashMap();
        this.f10633h = i10Var;
        this.f10631d = a7Var;
        this.f10632f = priorityBlockingQueue;
    }

    public xq(l71 l71Var) {
        this.f10629a = 28;
        this.f10630b = new HashMap(l71Var.f6527a);
        this.f10631d = new HashMap(l71Var.f6528b);
        this.f10632f = new HashMap(l71Var.f6529c);
        this.f10633h = new HashMap(l71Var.f6530d);
    }
}
