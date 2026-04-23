package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import dalvik.system.DexClassLoader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.BlockingQueue;
import org.jasypt.digest.StandardStringDigester;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class s9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8821b;

    public /* synthetic */ s9(int i10, Object obj) {
        this.f8820a = i10;
        this.f8821b = obj;
    }

    private final void a() {
        synchronized (((t9) this.f8821b).f9090z) {
            if (((t9) this.f8821b).A) {
                return;
            }
            ((t9) this.f8821b).A = true;
            try {
                t9.c((t9) this.f8821b);
            } catch (Exception e10) {
                ((t9) this.f8821b).f9082q.b(2023, -1L, e10);
            }
            synchronized (((t9) this.f8821b).f9090z) {
                ((t9) this.f8821b).A = false;
            }
        }
    }

    private final void b() {
        boolean zBooleanValue;
        if (((u9) this.f8821b).f9423b != null) {
            return;
        }
        synchronized (u9.f9419c) {
            if (((u9) this.f8821b).f9423b != null) {
                return;
            }
            boolean z9 = false;
            try {
                zBooleanValue = ((Boolean) eg.f4057l2.k()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    u9.f9420d = xv0.a(((u9) this.f8821b).f9422a.f5850a, "ADSHIELD");
                    z9 = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z9 = zBooleanValue;
            }
            ((u9) this.f8821b).f9423b = Boolean.valueOf(z9);
            u9.f9419c.open();
        }
    }

    private final void c() {
        synchronized (((bc) this.f8821b).f2965d) {
            bc bcVar = (bc) this.f8821b;
            if (bcVar.f2966f && bcVar.f2967h) {
                bcVar.f2966f = false;
                zzm.zze("App went background");
                Iterator it = ((bc) this.f8821b).f2968q.iterator();
                while (it.hasNext()) {
                    try {
                        ((cc) it.next()).zza(false);
                    } catch (Exception e10) {
                        zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                    }
                }
            } else {
                zzm.zze("App is still foreground");
            }
        }
    }

    private final void d() {
        xg xgVar = (xg) this.f8821b;
        synchronized (xgVar) {
            try {
                v3.d0 d0Var = (v3.d0) xgVar.f10550f;
                if (d0Var.f17735b) {
                    tb tbVar = (tb) d0Var.f17736d;
                    byte[] bArr = (byte[]) xgVar.f10549d;
                    rb rbVar = (rb) tbVar;
                    Parcel parcelM = rbVar.m();
                    parcelM.writeByteArray(bArr);
                    rbVar.a0(parcelM, 5);
                    rb rbVar2 = (rb) ((tb) ((v3.d0) xgVar.f10550f).f17736d);
                    Parcel parcelM2 = rbVar2.m();
                    parcelM2.writeInt(0);
                    rbVar2.a0(parcelM2, 6);
                    tb tbVar2 = (tb) ((v3.d0) xgVar.f10550f).f17736d;
                    int i10 = xgVar.f10548b;
                    rb rbVar3 = (rb) tbVar2;
                    Parcel parcelM3 = rbVar3.m();
                    parcelM3.writeInt(i10);
                    rbVar3.a0(parcelM3, 7);
                    rb rbVar4 = (rb) ((tb) ((v3.d0) xgVar.f10550f).f17736d);
                    Parcel parcelM4 = rbVar4.m();
                    parcelM4.writeIntArray(null);
                    rbVar4.a0(parcelM4, 4);
                    rb rbVar5 = (rb) ((tb) ((v3.d0) xgVar.f10550f).f17736d);
                    rbVar5.a0(rbVar5.m(), 3);
                }
            } catch (RemoteException e10) {
                zzm.zzf("Clearcut log failed", e10);
            }
        }
    }

    private final void e() throws Throwable {
        String str;
        LinkedHashMap linkedHashMap;
        jt jtVar = (jt) this.f8821b;
        while (true) {
            try {
                lg lgVar = (lg) ((BlockingQueue) jtVar.f6072a).take();
                kg kgVarA = lgVar.a();
                switch (kgVarA.f6278a) {
                    case 0:
                        str = kgVarA.f6279b;
                        break;
                    default:
                        str = kgVarA.f6279b;
                        break;
                }
                if (!TextUtils.isEmpty(str)) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) jtVar.f6073b;
                    synchronized (lgVar.f6605c) {
                        zzu.zzo().c();
                        linkedHashMap = lgVar.f6604b;
                    }
                    jtVar.j(jtVar.c(linkedHashMap2, linkedHashMap), kgVarA);
                }
            } catch (InterruptedException e10) {
                zzm.zzk("CsiReporter:reporter interrupted", e10);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void f() throws Throwable {
        qw qwVar;
        String str;
        qw qwVar2;
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        qw qwVar3;
        long j10;
        long j11;
        qw qwVar4;
        long j12;
        s9 s9Var = this;
        qw qwVar5 = (qw) s9Var.f8821b;
        String strConcat = "cache:".concat(String.valueOf(zzf.zzf(qwVar5.f8300h)));
        try {
            jLongValue = ((Long) zzba.zzc().a(eg.f4113r)).longValue() * 1000;
            jIntValue = ((Integer) zzba.zzc().a(eg.f4103q)).intValue();
            zBooleanValue = ((Boolean) zzba.zzc().a(eg.G1)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
                qwVar = s9Var;
            }
        } catch (Exception e10) {
            e = e10;
            qwVar = qwVar5;
            str = strConcat;
        }
        synchronized (qwVar5) {
            try {
                ((y3.b) zzu.zzB()).getClass();
                if (System.currentTimeMillis() - qwVar5.f8304u > jLongValue) {
                    throw new IOException("Timeout reached. Limit: " + jLongValue + " ms");
                }
                if (qwVar5.f8301q) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!qwVar5.f8302s) {
                    bk1 bk1Var = qwVar5.f8299f.f11058s;
                    if (bk1Var == null) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long jF = bk1Var.f();
                    if (jF > 0) {
                        long jE = qwVar5.f8299f.f11058s.e();
                        if (jE != qwVar5.f8305v) {
                            boolean z9 = jE > 0;
                            String str2 = qwVar5.f8300h;
                            if (zBooleanValue) {
                                yw ywVar = qwVar5.f8299f;
                                j12 = (ywVar.E == null || !ywVar.E.A) ? ywVar.f11062w : 0L;
                            } else {
                                j12 = -1;
                            }
                            j11 = jIntValue;
                            str = strConcat;
                            try {
                                zzf.zza.post(new gw(qwVar5, str2, strConcat, jE, jF, j12, zBooleanValue ? qwVar5.f8299f.u() : -1L, zBooleanValue ? qwVar5.f8299f.q() : -1L, z9, yw.G.get(), yw.H.get()));
                                j10 = jE;
                                qw qwVar6 = qwVar5;
                                qwVar6.f8305v = j10;
                                qwVar4 = qwVar6;
                            } catch (Throwable th2) {
                                th = th2;
                                qwVar = qwVar5;
                                try {
                                    throw th;
                                } catch (Exception e11) {
                                    e = e11;
                                    zzm.zzj("Failed to preload url " + qwVar.f8300h + " Exception: " + e.getMessage());
                                    zzu.zzo().h("VideoStreamExoPlayerCache.preload", e);
                                    qwVar.i();
                                    qwVar.l(qwVar.f8300h, str, "error", qw.u("error", e));
                                    qwVar2 = qwVar;
                                    zzu.zzy().f4313a.remove(qwVar2.f8303t);
                                }
                            }
                        } else {
                            j10 = jE;
                            j11 = jIntValue;
                            qwVar4 = qwVar5;
                            str = strConcat;
                        }
                        if (j10 >= jF) {
                            zzf.zza.post(new jw(qwVar4, qwVar4.f8300h, str, jF));
                            qwVar2 = qwVar4;
                        } else {
                            long j13 = qwVar4.f8299f.f11062w;
                            qwVar3 = qwVar4;
                            if (j13 >= j11) {
                                qwVar3 = qwVar4;
                                if (j10 > 0) {
                                    qwVar2 = qwVar4;
                                }
                            }
                        }
                    } else {
                        qwVar3 = qwVar5;
                    }
                    zzt.zza.postDelayed(new s9(14, qwVar3), ((Long) zzba.zzc().a(eg.f4123s)).longValue());
                    return;
                }
                zzu.zzy().f4313a.remove(qwVar2.f8303t);
            } catch (Throwable th3) {
                th = th3;
                qwVar = qwVar5;
                str = strConcat;
            }
        }
        qwVar2 = qwVar5;
        zzu.zzy().f4313a.remove(qwVar2.f8303t);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = 1;
        switch (this.f8820a) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                na naVar = (na) this.f8821b;
                Handler handler = na.f7223y;
                naVar.c();
                return;
            case 3:
                hb hbVar = (hb) this.f8821b;
                try {
                    ja jaVar = hbVar.f5245a;
                    DexClassLoader dexClassLoader = jaVar.f5852c;
                    byte[] bArr = jaVar.f5854e;
                    String str = hbVar.f5246b;
                    jaVar.f5853d.getClass();
                    Class<?> clsLoadClass = dexClassLoader.loadClass(new String(ba.b(str, bArr), StandardStringDigester.MESSAGE_CHARSET));
                    if (clsLoadClass != null) {
                        ja jaVar2 = hbVar.f5245a;
                        byte[] bArr2 = jaVar2.f5854e;
                        String str2 = hbVar.f5247c;
                        jaVar2.f5853d.getClass();
                        hbVar.f5248d = clsLoadClass.getMethod(new String(ba.b(str2, bArr2), StandardStringDigester.MESSAGE_CHARSET), hbVar.f5249e);
                    }
                    break;
                } catch (zzaut | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
                } catch (Throwable th) {
                    hbVar.f5250f.countDown();
                    throw th;
                }
                hbVar.f5250f.countDown();
                return;
            case 4:
                ((xb) this.f8821b).c(3);
                return;
            case 5:
                c();
                return;
            case 6:
                bd.c((bd) this.f8821b);
                return;
            case 7:
                d();
                return;
            case 8:
                e();
                return;
            case 9:
                ((sg) this.f8821b).d();
                return;
            case 10:
                c.a aVar = (c.a) this.f8821b;
                if (((cd) aVar.f1490a) == null) {
                    return;
                }
                ((cd) aVar.f1490a).disconnect();
                Binder.flushPendingCommands();
                return;
            case 11:
                ((cv) this.f8821b).x();
                return;
            case 12:
                gv gvVar = (gv) ((bv) this.f8821b);
                if (gvVar.f5077t && gvVar.C.getParent() != null) {
                    gvVar.f5071b.removeView(gvVar.C);
                }
                cv cvVar = gvVar.f5076s;
                if (cvVar == null || gvVar.B == null) {
                    return;
                }
                ((y3.b) zzu.zzB()).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (cvVar.getBitmap(gvVar.B) != null) {
                    gvVar.D = true;
                }
                ((y3.b) zzu.zzB()).getClass();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (zze.zzc()) {
                    zze.zza("Spinner frame grab took " + jElapsedRealtime2 + "ms");
                }
                if (jElapsedRealtime2 > gvVar.f5075q) {
                    zzm.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
                    gvVar.f5080w = false;
                    gvVar.B = null;
                    lg lgVar = gvVar.f5073f;
                    if (lgVar != null) {
                        lgVar.b("spinner_jank", Long.toString(jElapsedRealtime2));
                        return;
                    }
                    return;
                }
                return;
            case 13:
                zzu.zzy().f4313a.remove((dw) this.f8821b);
                return;
            case 14:
                f();
                return;
            case 15:
                fx fxVar = ((ix) this.f8821b).f5709a;
                fxVar.N();
                com.google.android.gms.ads.internal.overlay.zzm zzmVarS = fxVar.s();
                if (zzmVarS != null) {
                    zzmVarS.zzz();
                    return;
                }
                return;
            case 16:
                int i11 = ix.R;
                jt jtVarC = zzu.zzo().c();
                String str3 = (String) this.f8821b;
                if (((HashSet) jtVarC.f6078g).contains(str3)) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sdkVersion", (String) jtVarC.f6077f);
                linkedHashMap.put("ue", str3);
                jtVarC.j(jtVarC.c((LinkedHashMap) jtVarC.f6073b, linkedHashMap), null);
                return;
            case 17:
                zh0 zh0Var = (zh0) this.f8821b;
                xh0 xh0VarZzA = zzu.zzA();
                yt0 yt0Var = zh0Var.f11241a;
                ((k70) xh0VarZzA).getClass();
                k70.m(new uh0(yt0Var, i10));
                return;
            case 18:
                super/*android.webkit.WebView*/.destroy();
                return;
            case 19:
                ((u00) this.f8821b).f9332b.f9716d.a();
                return;
            case 20:
                ((u00) this.f8821b).f9332b.f9716d.b();
                return;
            case sf.zzm /* 21 */:
                n10 n10Var = (n10) this.f8821b;
                uj ujVar = n10Var.f7104o.f8540d;
                if (ujVar == null) {
                    return;
                }
                try {
                    ujVar.e1((zzbu) n10Var.f7106q.zzb(), new a4.b(n10Var.f7099j));
                    return;
                } catch (RemoteException e10) {
                    zzm.zzh("RemoteException when notifyAdLoad is called", e10);
                    return;
                }
            case 22:
                ((w20) this.f8821b).f10036c = false;
                return;
            case 23:
                ((k21) this.f8821b).E(new zzdwl(3));
                return;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                n30 n30Var = (n30) this.f8821b;
                b4.f.l0(n30Var.f7125d);
                n30Var.f7130t = true;
                return;
            case 25:
                r30 r30Var = (r30) this.f8821b;
                synchronized (r30Var) {
                    try {
                        if (r30Var.f8376h.isDone()) {
                            return;
                        }
                        r30Var.f8376h.f(Boolean.TRUE);
                        return;
                    } finally {
                    }
                }
            case 26:
                ((s40) this.f8821b).J0();
                return;
            case 27:
                ((q90) this.f8821b).zzp();
                return;
            case 28:
                v90 v90Var = (v90) this.f8821b;
                if (v90Var.f9806q == null) {
                    View view = new View(v90Var.f9803d.getContext());
                    v90Var.f9806q = view;
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if (v90Var.f9803d != v90Var.f9806q.getParent()) {
                    v90Var.f9803d.addView(v90Var.f9806q);
                    return;
                }
                return;
            default:
                jb0 jb0Var = (jb0) this.f8821b;
                try {
                    jb0Var.getClass();
                    z3.a.j("#008 Must be called on the main UI thread.");
                    jb0Var.w1();
                    i90 i90Var = jb0Var.f5883d;
                    if (i90Var != null) {
                        i90Var.v();
                    }
                    jb0Var.f5883d = null;
                    jb0Var.f5881a = null;
                    jb0Var.f5882b = null;
                    jb0Var.f5884f = true;
                    return;
                } catch (RemoteException e11) {
                    zzm.zzl("#007 Could not call remote method.", e11);
                    return;
                }
        }
    }
}
