package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.util.SparseBooleanArray;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class yw implements va1, fk1 {
    public static final AtomicInteger G = new AtomicInteger(0);
    public static final AtomicInteger H = new AtomicInteger(0);
    public final int A;
    public Integer C;
    public final ArrayList D;
    public volatile uw E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tw f11053b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final aq1 f11054d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ov f11055f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakReference f11056h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lj0 f11057q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public bk1 f11058s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ByteBuffer f11059t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11060u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public iv f11061v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11062w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11063x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f11064y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f11065z;
    public final Object B = new Object();
    public final HashSet F = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:25:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public yw(android.content.Context r5, com.google.android.gms.internal.ads.ov r6, com.google.android.gms.internal.ads.pv r7, java.lang.Integer r8) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yw.<init>(android.content.Context, com.google.android.gms.internal.ads.ov, com.google.android.gms.internal.ads.pv, java.lang.Integer):void");
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void a(iz0 iz0Var, boolean z9, int i10) {
        this.f11062w += i10;
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void b(hw0 hw0Var, iz0 iz0Var, boolean z9) {
        if (hw0Var instanceof w71) {
            synchronized (this.B) {
                this.D.add((w71) hw0Var);
            }
        } else if (hw0Var instanceof uw) {
            this.E = (uw) hw0Var;
            pv pvVar = (pv) this.f11056h.get();
            if (((Boolean) zzba.zzc().a(eg.G1)).booleanValue() && pvVar != null && this.E.f9636z) {
                HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.E.B));
                map.put("gcacheDownloaded", String.valueOf(this.E.C));
                zzt.zza.post(new vm(pvVar, 15, map));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final /* synthetic */ void c(ek1 ek1Var, int i10, long j10) {
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final void d(int i10) {
        iv ivVar = this.f11061v;
        if (ivVar != null) {
            ivVar.d(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final /* synthetic */ void e(ek1 ek1Var, gk1 gk1Var) {
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final void f(int i10) {
        this.f11063x += i10;
    }

    public final void finalize() {
        G.decrementAndGet();
        if (zze.zzc()) {
            zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final void g(y1 y1Var) {
        pv pvVar = (pv) this.f11056h.get();
        if (!((Boolean) zzba.zzc().a(eg.G1)).booleanValue() || pvVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(y1Var.f10721t));
        map.put("bitRate", String.valueOf(y1Var.f10710i));
        map.put("resolution", y1Var.f10719r + "x" + y1Var.f10720s);
        String str = y1Var.f10713l;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = y1Var.f10714m;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = y1Var.f10711j;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        pvVar.j("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final void h(zzbp zzbpVar) {
        iv ivVar = this.f11061v;
        if (ivVar != null) {
            ivVar.h("onPlayerError", zzbpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final void i(IOException iOException) {
        iv ivVar = this.f11061v;
        if (ivVar != null) {
            if (this.f11055f.f7680j) {
                ivVar.g(iOException);
            } else {
                ivVar.h("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final void j(y1 y1Var) {
        pv pvVar = (pv) this.f11056h.get();
        if (!((Boolean) zzba.zzc().a(eg.G1)).booleanValue() || pvVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = y1Var.f10713l;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = y1Var.f10714m;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = y1Var.f10711j;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        pvVar.j("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final /* synthetic */ void k(is isVar, cj0 cj0Var) {
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final /* synthetic */ void l(wh1 wh1Var) {
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void m(iz0 iz0Var, boolean z9) {
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final void n(e10 e10Var) {
        iv ivVar = this.f11061v;
        if (ivVar != null) {
            ivVar.e(e10Var.f3802a, e10Var.f3803b);
        }
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final /* synthetic */ void o(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final void p() {
        iv ivVar = this.f11061v;
        if (ivVar != null) {
            ivVar.c();
        }
    }

    public final long q() {
        if (this.E != null && this.E.A) {
            return this.E.o();
        }
        synchronized (this.B) {
            while (!this.D.isEmpty()) {
                long j10 = this.f11064y;
                Map mapZze = ((w71) this.D.remove(0)).zze();
                long j11 = 0;
                if (mapZze != null) {
                    Iterator it = mapZze.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && tc1.F("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j11 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.f11064y = j10 + j11;
            }
        }
        return this.f11064y;
    }

    public final void r(Uri[] uriArr, ByteBuffer byteBuffer, boolean z9) {
        qn1 qo1Var;
        if (this.f11058s != null) {
            this.f11059t = byteBuffer;
            this.f11060u = z9;
            int length = uriArr.length;
            if (length == 1) {
                qo1Var = t(uriArr[0]);
            } else {
                qn1[] qn1VarArr = new qn1[length];
                for (int i10 = 0; i10 < uriArr.length; i10++) {
                    qn1VarArr[i10] = t(uriArr[i10]);
                }
                qo1Var = new qo1(new jk1(28, (Object) null), qn1VarArr);
            }
            this.f11058s.d(qo1Var);
            this.f11058s.g();
            H.incrementAndGet();
        }
    }

    public final void s(boolean z9) {
        up1 up1Var;
        if (this.f11058s == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            this.f11058s.l();
            if (i10 >= 2) {
                return;
            }
            aq1 aq1Var = this.f11054d;
            synchronized (aq1Var.f2770c) {
                up1Var = aq1Var.f2773f;
            }
            up1Var.getClass();
            sp1 sp1Var = new sp1(up1Var);
            boolean z10 = !z9;
            SparseBooleanArray sparseBooleanArray = sp1Var.f8953t;
            if (sparseBooleanArray.get(i10) != z10) {
                if (z10) {
                    sparseBooleanArray.put(i10, true);
                } else {
                    sparseBooleanArray.delete(i10);
                }
            }
            aq1Var.h(sp1Var);
            i10++;
        }
    }

    public final yo1 t(Uri uri) {
        zy0 zy0Var = bz0.f3132b;
        wz0 wz0Var = wz0.f10382h;
        List listEmptyList = Collections.emptyList();
        wz0 wz0Var2 = wz0.f10382h;
        ic icVar = ic.f5559a;
        gb gbVar = uri != null ? new gb(uri, listEmptyList, wz0Var2) : null;
        fg fgVar = new fg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new d8(), gbVar, new da(), fk.f4541y, icVar);
        int i10 = this.f11055f.f7676f;
        lj0 lj0Var = this.f11057q;
        lj0Var.f6643a = i10;
        gbVar.getClass();
        return new yo1(fgVar, (cw0) lj0Var.f6644b, (mx0) lj0Var.f6645d, (f3) lj0Var.f6646f, lj0Var.f6643a);
    }

    public final long u() {
        if (this.E != null && this.E.A && this.E.B) {
            return Math.min(this.f11062w, this.E.D);
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void zzc() {
    }
}
