package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.common.ConnectionResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class qp0 implements k21, z3, zzg, v3.b, v3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8251b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8252d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f8253f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f8254h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f8255q;

    public qp0(nb nbVar, File file, File file2, File file3) {
        this.f8250a = 8;
        this.f8251b = nbVar;
        this.f8252d = file;
        this.f8253f = file3;
        this.f8254h = file2;
    }

    public static x8 b() {
        j8 j8VarA0 = x8.a0();
        j8VarA0.d();
        x8.K0((x8) j8VarA0.f9462b, 32768L);
        return (x8) j8VarA0.b();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.google.android.gms.internal.ads.x30, java.lang.Object] */
    private final void c(Throwable th) {
        ft0 ft0Var;
        d10 d10Var = (d10) ((tp0) this.f8255q).f9227h.c();
        zze zzeVarD0 = d10Var == null ? en1.d0(th, null) : en1.d0(th, ((cz) d10Var).zzb().f4378l);
        synchronized (((tp0) this.f8255q)) {
            try {
                Object obj = this.f8255q;
                ((tp0) obj).f9232v = null;
                if (d10Var != null) {
                    ((m40) ((cz) d10Var).f3488j0.zzb()).t(zzeVarD0);
                    if (((Boolean) zzba.zzc().a(eg.f4111q7)).booleanValue()) {
                        ((tp0) this.f8255q).f9224b.execute(new vh0(this, 5, zzeVarD0));
                    }
                } else {
                    ((tp0) obj).f9226f.t(zzeVarD0);
                    ((tp0) this.f8255q).c((rp0) this.f8254h).e().zzb().f4372f.zzh();
                }
                tp1.Z(zzeVarD0.zza, "AppOpenAdLoader.onFailure", th);
                ((pl0) this.f8251b).mo1zza();
                if (!((Boolean) eh.f4203c.k()).booleanValue() || (ft0Var = (ft0) this.f8252d) == null) {
                    gt0 gt0Var = ((tp0) this.f8255q).f9230t;
                    bt0 bt0Var = (bt0) this.f8253f;
                    bt0Var.j(zzeVarD0);
                    bt0Var.e(th);
                    bt0Var.x(false);
                    gt0Var.b(bt0Var.zzm());
                } else {
                    ft0Var.c(zzeVarD0);
                    bt0 bt0Var2 = (bt0) this.f8253f;
                    bt0Var2.e(th);
                    bt0Var2.x(false);
                    ft0Var.a(bt0Var2);
                    ft0Var.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d(Throwable th) {
        ft0 ft0Var;
        ec0 ec0Var = (ec0) ((yq0) this.f8255q).f11010h.c();
        zze zzeVarD0 = ec0Var == null ? en1.d0(th, null) : en1.d0(th, ((oz) ec0Var).zzb().f4378l);
        synchronized (((yq0) this.f8255q)) {
            try {
                if (ec0Var != null) {
                    ((m40) ((oz) ec0Var).A.zzb()).t(zzeVarD0);
                    ((yq0) this.f8255q).f11007b.execute(new vh0(this, 6, zzeVarD0));
                } else {
                    ((yq0) this.f8255q).f11009f.t(zzeVarD0);
                    ((yq0) this.f8255q).a((xq0) this.f8254h).d().zzb().f4372f.zzh();
                }
                tp1.Z(zzeVarD0.zza, "RewardedAdLoader.onFailure", th);
                ((pl0) this.f8251b).mo1zza();
                if (!((Boolean) eh.f4203c.k()).booleanValue() || (ft0Var = (ft0) this.f8252d) == null) {
                    gt0 gt0Var = ((yq0) this.f8255q).f11012s;
                    bt0 bt0Var = (bt0) this.f8253f;
                    bt0Var.j(zzeVarD0);
                    bt0Var.e(th);
                    bt0Var.x(false);
                    gt0Var.b(bt0Var.zzm());
                } else {
                    ft0Var.c(zzeVarD0);
                    bt0 bt0Var2 = (bt0) this.f8253f;
                    bt0Var2.e(th);
                    bt0Var2.x(false);
                    ft0Var.a(bt0Var2);
                    ft0Var.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void e(Object obj) {
        ft0 ft0Var;
        r20 r20Var = (r20) obj;
        synchronized (((tl0) this.f8255q)) {
            try {
                ((d60) r20Var.f8363g.f3585a.f6060b).f3586b = (kl0) ((ep) ((tl0) this.f8255q).f9188f).f4270d;
                ((pl0) this.f8251b).mo4a(r20Var);
                ((gy) ((tl0) this.f8255q).f9186b).a().execute(new yd0(6, this));
                if (!((Boolean) eh.f4203c.k()).booleanValue() || (ft0Var = (ft0) this.f8252d) == null) {
                    gt0 gt0Var = (gt0) ((tl0) this.f8255q).f9189h;
                    bt0 bt0Var = (bt0) this.f8253f;
                    bt0Var.d(r20Var.f8357a.f6383b);
                    bt0Var.v(r20Var.f8362f.f5205a);
                    bt0Var.x(true);
                    gt0Var.b(bt0Var.zzm());
                } else {
                    ft0Var.g(r20Var.f8357a.f6383b);
                    ft0Var.e(r20Var.f8362f.f5205a);
                    bt0 bt0Var2 = (bt0) this.f8253f;
                    bt0Var2.x(true);
                    ft0Var.a(bt0Var2);
                    ft0Var.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(Object obj) {
        ft0 ft0Var;
        r20 r20Var = (r20) obj;
        synchronized (((tp0) this.f8255q)) {
            try {
                ((tp0) this.f8255q).f9232v = null;
                if (((Boolean) zzba.zzc().a(eg.f4111q7)).booleanValue()) {
                    ((d60) r20Var.f8363g.f3585a.f6060b).f3588f = ((tp0) this.f8255q).f9226f;
                }
                ((pl0) this.f8251b).mo4a(r20Var);
                if (!((Boolean) eh.f4203c.k()).booleanValue() || (ft0Var = (ft0) this.f8252d) == null) {
                    gt0 gt0Var = ((tp0) this.f8255q).f9230t;
                    bt0 bt0Var = (bt0) this.f8253f;
                    bt0Var.d(r20Var.f8357a.f6383b);
                    bt0Var.v(r20Var.f8362f.f5205a);
                    bt0Var.x(true);
                    gt0Var.b(bt0Var.zzm());
                } else {
                    ft0Var.g(r20Var.f8357a.f6383b);
                    ft0Var.e(r20Var.f8362f.f5205a);
                    bt0 bt0Var2 = (bt0) this.f8253f;
                    bt0Var2.x(true);
                    ft0Var.a(bt0Var2);
                    ft0Var.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void g(Object obj) {
        ft0 ft0Var;
        bc0 bc0Var = (bc0) obj;
        synchronized (((yq0) this.f8255q)) {
            try {
                ((d60) bc0Var.f8363g.f3585a.f6060b).f3589h = ((yq0) this.f8255q).f11009f;
                ((pl0) this.f8251b).mo4a(bc0Var);
                yq0 yq0Var = (yq0) this.f8255q;
                Executor executor = yq0Var.f11007b;
                wq0 wq0Var = yq0Var.f11009f;
                Objects.requireNonNull(wq0Var);
                executor.execute(new yd0(13, wq0Var));
                ((yq0) this.f8255q).f11009f.onAdMetadataChanged();
                if (!((Boolean) eh.f4203c.k()).booleanValue() || (ft0Var = (ft0) this.f8252d) == null) {
                    gt0 gt0Var = ((yq0) this.f8255q).f11012s;
                    bt0 bt0Var = (bt0) this.f8253f;
                    bt0Var.d(bc0Var.f8357a.f6383b);
                    bt0Var.v(bc0Var.f8362f.f5205a);
                    bt0Var.x(true);
                    gt0Var.b(bt0Var.zzm());
                } else {
                    ft0Var.g(bc0Var.f8357a.f6383b);
                    ft0Var.e(bc0Var.f8362f.f5205a);
                    bt0 bt0Var2 = (bt0) this.f8253f;
                    bt0Var2.x(true);
                    ft0Var.a(bt0Var2);
                    ft0Var.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        ft0 ft0Var;
        ft0 ft0Var2;
        final int i10 = 0;
        switch (this.f8250a) {
            case 0:
                c(th);
                return;
            case 1:
                d(th);
                return;
            case 5:
                zze zzeVarD0 = en1.d0(th, ((f30) ((uy) ((t80) this.f8254h)).f9676q0.zzb()).f4378l);
                ((m40) ((uy) ((t80) this.f8254h)).f9668m0.zzb()).t(zzeVarD0);
                ((gy) ((tl0) this.f8255q).f9186b).a().execute(new vh0(this, 4, zzeVarD0));
                tp1.Z(zzeVarD0.zza, "NativeAdLoader.onFailure", th);
                ((pl0) this.f8251b).mo1zza();
                if (((Boolean) eh.f4203c.k()).booleanValue() && (ft0Var = (ft0) this.f8252d) != null) {
                    ft0Var.c(zzeVarD0);
                    bt0 bt0Var = (bt0) this.f8253f;
                    bt0Var.e(th);
                    bt0Var.x(false);
                    ft0Var.a(bt0Var);
                    ft0Var.h();
                    return;
                }
                tl0 tl0Var = (tl0) this.f8255q;
                bt0 bt0Var2 = (bt0) this.f8253f;
                gt0 gt0Var = (gt0) tl0Var.f9189h;
                bt0Var2.j(zzeVarD0);
                bt0Var2.e(th);
                bt0Var2.x(false);
                gt0Var.b(bt0Var2.zzm());
                return;
            default:
                final zze zzeVarD02 = en1.d0(th, ((f30) ((lz) ((i80) this.f8254h)).f6777z0.zzb()).f4378l);
                synchronized (((uq0) this.f8255q)) {
                    try {
                        ((uq0) this.f8255q).f9580u = null;
                        ((m40) ((lz) ((i80) this.f8254h)).f6757p0.zzb()).t(zzeVarD02);
                        if (((Boolean) zzba.zzc().a(eg.f4121r7)).booleanValue()) {
                            ((uq0) this.f8255q).f9573b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.sq0

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ qp0 f8955b;

                                {
                                    this.f8955b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i11 = i10;
                                    zze zzeVar = zzeVarD02;
                                    qp0 qp0Var = this.f8955b;
                                    switch (i11) {
                                        case 0:
                                            ((uq0) qp0Var.f8255q).f9575f.t(zzeVar);
                                            break;
                                        default:
                                            ((uq0) qp0Var.f8255q).f9576h.t(zzeVar);
                                            break;
                                    }
                                }
                            });
                            final int i11 = 1;
                            ((uq0) this.f8255q).f9573b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.sq0

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ qp0 f8955b;

                                {
                                    this.f8955b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i112 = i11;
                                    zze zzeVar = zzeVarD02;
                                    qp0 qp0Var = this.f8955b;
                                    switch (i112) {
                                        case 0:
                                            ((uq0) qp0Var.f8255q).f9575f.t(zzeVar);
                                            break;
                                        default:
                                            ((uq0) qp0Var.f8255q).f9576h.t(zzeVar);
                                            break;
                                    }
                                }
                            });
                        }
                        tp1.Z(zzeVarD02.zza, "InterstitialAdLoader.onFailure", th);
                        ((pl0) this.f8251b).mo1zza();
                        if (!((Boolean) eh.f4203c.k()).booleanValue() || (ft0Var2 = (ft0) this.f8252d) == null) {
                            gt0 gt0Var2 = ((uq0) this.f8255q).f9578s;
                            bt0 bt0Var3 = (bt0) this.f8253f;
                            bt0Var3.j(zzeVarD02);
                            bt0Var3.e(th);
                            bt0Var3.x(false);
                            gt0Var2.b(bt0Var3.zzm());
                        } else {
                            ft0Var2.c(zzeVarD02);
                            bt0 bt0Var4 = (bt0) this.f8253f;
                            bt0Var4.e(th);
                            bt0Var4.x(false);
                            ft0Var2.a(bt0Var4);
                            ft0Var2.h();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final void mo4a(Object obj) {
        ft0 ft0Var;
        switch (this.f8250a) {
            case 0:
                f(obj);
                return;
            case 1:
                g(obj);
                return;
            case 5:
                e(obj);
                return;
            default:
                z70 z70Var = (z70) obj;
                synchronized (((uq0) this.f8255q)) {
                    try {
                        ((uq0) this.f8255q).f9580u = null;
                        xf xfVar = eg.f4121r7;
                        if (((Boolean) zzba.zzc().a(xfVar)).booleanValue()) {
                            jp0 jp0Var = z70Var.f8363g.f3585a;
                            Object obj2 = this.f8255q;
                            kl0 kl0Var = ((uq0) obj2).f9575f;
                            Object obj3 = jp0Var.f6060b;
                            ((d60) obj3).f3586b = kl0Var;
                            ((d60) obj3).f3589h = ((uq0) obj2).f9576h;
                        }
                        ((pl0) this.f8251b).mo4a(z70Var);
                        final int i10 = 1;
                        if (((Boolean) zzba.zzc().a(xfVar)).booleanValue()) {
                            final int i11 = 0;
                            ((uq0) this.f8255q).f9573b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.tq0

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ qp0 f9257b;

                                {
                                    this.f9257b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i12 = i11;
                                    qp0 qp0Var = this.f9257b;
                                    switch (i12) {
                                        case 0:
                                            ((uq0) qp0Var.f8255q).f9575f.zzs();
                                            break;
                                        default:
                                            ((uq0) qp0Var.f8255q).f9576h.zzs();
                                            break;
                                    }
                                }
                            });
                            ((uq0) this.f8255q).f9573b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.tq0

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ qp0 f9257b;

                                {
                                    this.f9257b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i12 = i10;
                                    qp0 qp0Var = this.f9257b;
                                    switch (i12) {
                                        case 0:
                                            ((uq0) qp0Var.f8255q).f9575f.zzs();
                                            break;
                                        default:
                                            ((uq0) qp0Var.f8255q).f9576h.zzs();
                                            break;
                                    }
                                }
                            });
                        }
                        if (!((Boolean) eh.f4203c.k()).booleanValue() || (ft0Var = (ft0) this.f8252d) == null) {
                            gt0 gt0Var = ((uq0) this.f8255q).f9578s;
                            bt0 bt0Var = (bt0) this.f8253f;
                            bt0Var.d(z70Var.f8357a.f6383b);
                            bt0Var.v(z70Var.f8362f.f5205a);
                            bt0Var.x(true);
                            gt0Var.b(bt0Var.zzm());
                        } else {
                            ft0Var.g(z70Var.f8357a.f6383b);
                            ft0Var.e(z70Var.f8362f.f5205a);
                            bt0 bt0Var2 = (bt0) this.f8253f;
                            bt0Var2.x(true);
                            ft0Var.a(bt0Var2);
                            ft0Var.h();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    public final int h(int i10) {
        return ((int[]) this.f8251b)[i10];
    }

    public final kp1 i(int i10) {
        return ((kp1[]) this.f8252d)[i10];
    }

    public final kp1 j() {
        return (kp1) this.f8255q;
    }

    public final void k(Object obj, ga1 ga1Var, boolean z9) {
        byte[] bArrB;
        if (((Map) this.f8252d) == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if (ga1Var.I() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int iOrdinal = ga1Var.D().ordinal();
        if (iOrdinal == 1) {
            bArrB = u61.b(ga1Var.A()).b();
        } else if (iOrdinal == 2) {
            bArrB = u61.a(ga1Var.A()).b();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrB = u61.a(ga1Var.A()).b();
        } else {
            bArrB = tc1.P;
        }
        tb1 tb1VarA = tb1.a(bArrB);
        d71 d71Var = new d71(obj, tb1VarA, ga1Var.I(), ga1Var.D(), ga1Var.A(), ga1Var.B().E());
        Map map = (Map) this.f8252d;
        List list = (List) this.f8253f;
        ArrayList arrayList = new ArrayList();
        arrayList.add(d71Var);
        List list2 = (List) map.put(tb1VarA, Collections.unmodifiableList(arrayList));
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            arrayList2.add(d71Var);
            map.put(tb1VarA, Collections.unmodifiableList(arrayList2));
        }
        list.add(d71Var);
        if (z9) {
            if (((d71) this.f8254h) != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f8254h = d71Var;
        }
    }

    public final byte[] l() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrB;
        ArrayList arrayList;
        int iMin;
        FileInputStream fileInputStream2 = null;
        if (((byte[]) this.f8255q) == null) {
            try {
                fileInputStream = new FileInputStream((File) this.f8254h);
            } catch (IOException unused) {
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                arrayList = new ArrayList();
                iMin = NotificationCompat.FLAG_LOCAL_ONLY;
            } catch (IOException unused2) {
                y3.c.b(fileInputStream);
                bArrB = null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                y3.c.b(fileInputStream2);
                throw th;
            }
            while (true) {
                byte[] bArr = new byte[iMin];
                int i10 = 0;
                while (i10 < iMin) {
                    int i11 = fileInputStream.read(bArr, i10, iMin - i10);
                    if (i11 == -1) {
                        break;
                    }
                    i10 += i11;
                }
                cc1 cc1VarQ = i10 == 0 ? null : ec1.q(0, bArr, i10);
                if (cc1VarQ == null) {
                    break;
                }
                arrayList.add(cc1VarQ);
                iMin = Math.min(iMin + iMin, 8192);
                this.f8255q = bArrB;
            }
            bArrB = ec1.p(arrayList).b();
            y3.c.b(fileInputStream);
            this.f8255q = bArrB;
        }
        byte[] bArr2 = (byte[]) this.f8255q;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }

    @Override // v3.b
    public final void m(int i10) {
        try {
            ((LinkedBlockingQueue) this.f8254h).put(b());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.z3
    public final ArrayList q(long j10) {
        Map map = (Map) this.f8253f;
        Map map2 = (Map) this.f8254h;
        Map map3 = (Map) this.f8255q;
        v4 v4Var = (v4) this.f8251b;
        v4Var.getClass();
        ArrayList arrayList = new ArrayList();
        v4Var.h(j10, v4Var.f9764h, arrayList);
        TreeMap treeMap = new TreeMap();
        v4Var.j(j10, false, v4Var.f9764h, treeMap);
        v4Var.i(j10, map, map2, v4Var.f9764h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                y4 y4Var = (y4) map2.get(pair.first);
                y4Var.getClass();
                arrayList2.add(new c60(null, null, null, bitmapDecodeByteArray, y4Var.f10759c, 0, y4Var.f10761e, y4Var.f10758b, 0, Integer.MIN_VALUE, -3.4028235E38f, y4Var.f10762f, y4Var.f10763g, y4Var.f10766j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            y4 y4Var2 = (y4) map2.get(entry.getKey());
            y4Var2.getClass();
            n50 n50Var = (n50) entry.getValue();
            CharSequence charSequence = n50Var.f7160a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (t4 t4Var : (t4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), t4.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(t4Var), spannableStringBuilder.getSpanEnd(t4Var), (CharSequence) RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
            int i11 = 0;
            while (i11 < spannableStringBuilder.length()) {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i11) == ' ') {
                    int i13 = i12;
                    while (i13 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i13) == ' ') {
                        i13++;
                    }
                    int i14 = i13 - i12;
                    if (i14 > 0) {
                        spannableStringBuilder.delete(i11, i14 + i11);
                    }
                }
                i11 = i12;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i15 = 0;
            while (i15 < spannableStringBuilder.length() - 1) {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i15) == '\n' && spannableStringBuilder.charAt(i16) == ' ') {
                    spannableStringBuilder.delete(i16, i15 + 2);
                }
                i15 = i16;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i17 = 0;
            while (i17 < spannableStringBuilder.length() - 1) {
                int i18 = i17 + 1;
                if (spannableStringBuilder.charAt(i17) == ' ' && spannableStringBuilder.charAt(i18) == '\n') {
                    spannableStringBuilder.delete(i17, i18);
                }
                i17 = i18;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            n50Var.f7164e = y4Var2.f10759c;
            n50Var.f7165f = y4Var2.f10760d;
            n50Var.f7166g = y4Var2.f10761e;
            n50Var.f7167h = y4Var2.f10758b;
            n50Var.f7171l = y4Var2.f10762f;
            n50Var.f7170k = y4Var2.f10765i;
            n50Var.f7169j = y4Var2.f10764h;
            n50Var.f7173n = y4Var2.f10766j;
            arrayList2.add(n50Var.a());
        }
        return arrayList2;
    }

    @Override // v3.b
    public final void r(Bundle bundle) {
        tv0 tv0VarN;
        try {
            tv0VarN = ((sv0) this.f8251b).n();
        } catch (DeadObjectException | IllegalStateException unused) {
            tv0VarN = null;
        }
        if (tv0VarN != null) {
            try {
                try {
                    zzfpp zzfppVar = new zzfpp(1, (String) this.f8252d, (String) this.f8253f);
                    Parcel parcelM = tv0VarN.m();
                    qb.c(parcelM, zzfppVar);
                    Parcel parcelT = tv0VarN.t(parcelM, 1);
                    zzfpr zzfprVar = (zzfpr) qb.a(parcelT, zzfpr.CREATOR);
                    parcelT.recycle();
                    if (zzfprVar.f11632b == null) {
                        try {
                            byte[] bArr = zzfprVar.f11633d;
                            pc1 pc1Var = pc1.f7857a;
                            yd1 yd1Var = yd1.f10857c;
                            zzfprVar.f11632b = x8.v0(bArr, pc1.f7858b);
                            zzfprVar.f11633d = null;
                        } catch (zzgyn | NullPointerException e10) {
                            throw new IllegalStateException(e10);
                        }
                    }
                    zzfprVar.b();
                    ((LinkedBlockingQueue) this.f8254h).put(zzfprVar.f11632b);
                } catch (Throwable unused2) {
                    ((LinkedBlockingQueue) this.f8254h).put(b());
                }
            } catch (InterruptedException unused3) {
            } catch (Throwable th) {
                zzc();
                ((HandlerThread) this.f8255q).quit();
                throw th;
            }
            zzc();
            ((HandlerThread) this.f8255q).quit();
        }
    }

    @Override // v3.c
    public final void t(ConnectionResult connectionResult) {
        try {
            ((LinkedBlockingQueue) this.f8254h).put(b());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.z3
    public final int zza() {
        return ((long[]) this.f8252d).length;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        switch (this.f8250a) {
            case 4:
                break;
            default:
                sv0 sv0Var = (sv0) this.f8251b;
                if (sv0Var != null) {
                    if (sv0Var.isConnected() || ((sv0) this.f8251b).isConnecting()) {
                        ((sv0) this.f8251b).disconnect();
                    }
                }
                break;
        }
    }

    public /* synthetic */ qp0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f8250a = i10;
        this.f8251b = obj2;
        this.f8252d = obj3;
        this.f8253f = obj4;
        this.f8254h = obj5;
        this.f8255q = obj;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    /* JADX INFO: renamed from: zza */
    public final void mo8zza(View view) {
        uk0 uk0Var = (uk0) this.f8254h;
        jp0 jp0Var = (jp0) ((wi0) this.f8255q).f10200e;
        kr0 kr0Var = (kr0) this.f8252d;
        fr0 fr0Var = (fr0) this.f8253f;
        jp0Var.getClass();
        dc0 dc0Var = new dc0(new k70(25));
        kz kzVarA = ((i80) jp0Var.f6060b).a(new ep(kr0Var, fr0Var, (String) null), dc0Var);
        rk0 rk0Var = new rk0(19, kzVarA, 0);
        synchronized (uk0Var) {
            uk0Var.f9526a = rk0Var;
        }
        ((qu) this.f8251b).b(kzVarA.q0());
    }

    @Override // com.google.android.gms.internal.ads.z3
    public final long zzb(int i10) {
        return ((long[]) this.f8252d)[i10];
    }

    public qp0(int[] iArr, kp1[] kp1VarArr, int[] iArr2, int[][][] iArr3, kp1 kp1Var) {
        this.f8250a = 10;
        this.f8251b = iArr;
        this.f8252d = kp1VarArr;
        this.f8254h = iArr3;
        this.f8253f = iArr2;
        this.f8255q = kp1Var;
    }

    public qp0(Context context, String str, String str2) {
        this.f8250a = 7;
        this.f8252d = str;
        this.f8253f = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f8255q = handlerThread;
        handlerThread.start();
        this.f8251b = new sv0(context, ((HandlerThread) this.f8255q).getLooper(), this, this, 9200000);
        this.f8254h = new LinkedBlockingQueue();
        ((sv0) this.f8251b).checkAvailabilityAndConnect();
    }

    public qp0(v4 v4Var, HashMap map, HashMap map2, HashMap map3) {
        this.f8250a = 2;
        this.f8251b = v4Var;
        this.f8254h = map2;
        this.f8255q = map3;
        this.f8253f = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        v4Var.g(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f8252d = jArr;
    }

    public /* synthetic */ qp0(Class cls) {
        this.f8250a = 9;
        this.f8252d = new HashMap();
        this.f8253f = new ArrayList();
        this.f8251b = cls;
        this.f8255q = i61.f5509b;
    }
}
