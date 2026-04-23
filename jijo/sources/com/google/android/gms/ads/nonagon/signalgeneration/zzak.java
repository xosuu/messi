package com.google.android.gms.ads.nonagon.signalgeneration;

import a4.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.internal.ads.bz0;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.eh;
import com.google.android.gms.internal.ads.ft0;
import com.google.android.gms.internal.ads.gt0;
import com.google.android.gms.internal.ads.gx0;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.h21;
import com.google.android.gms.internal.ads.hd0;
import com.google.android.gms.internal.ads.nu;
import com.google.android.gms.internal.ads.p21;
import com.google.android.gms.internal.ads.pr0;
import com.google.android.gms.internal.ads.q11;
import com.google.android.gms.internal.ads.qg;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.r11;
import com.google.android.gms.internal.ads.sg;
import com.google.android.gms.internal.ads.tb0;
import com.google.android.gms.internal.ads.tc1;
import com.google.android.gms.internal.ads.tq;
import com.google.android.gms.internal.ads.tt;
import com.google.android.gms.internal.ads.v9;
import com.google.android.gms.internal.ads.vt0;
import com.google.android.gms.internal.ads.wr0;
import com.google.android.gms.internal.ads.x11;
import com.google.android.gms.internal.ads.xf;
import com.google.android.gms.internal.ads.y11;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.z01;
import com.google.android.gms.internal.ads.z11;
import com.google.android.gms.internal.ads.zzaup;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbyq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m2.f;
import n3.c;
import n5.a;
import org.json.JSONException;
import org.json.JSONObject;
import p.e;
import p.g;

/* JADX INFO: loaded from: classes.dex */
public final class zzak extends tt {
    public static final ArrayList R = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    public static final ArrayList S = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    public static final ArrayList T = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    public static final ArrayList U = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    public final boolean A;
    public final boolean B;
    public final String C;
    public final String D;
    public final AtomicInteger E;
    public final VersionInfoParcel F;
    public String G;
    public final String H;
    public final ArrayList I;
    public final ArrayList J;
    public final ArrayList K;
    public final ArrayList L;
    public final AtomicBoolean M;
    public final AtomicBoolean N;
    public final AtomicInteger O;
    public final sg P;
    public final zze Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gy f2356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f2357b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y9 f2358d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pr0 f2359f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wr0 f2360h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p21 f2361q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ScheduledExecutorService f2362s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public zzbtl f2363t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Point f2364u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Point f2365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final hd0 f2366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vt0 f2367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f2368y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f2369z;

    public zzak(gy gyVar, Context context, y9 y9Var, wr0 wr0Var, p21 p21Var, ScheduledExecutorService scheduledExecutorService, hd0 hd0Var, vt0 vt0Var, VersionInfoParcel versionInfoParcel, sg sgVar, pr0 pr0Var, zze zzeVar) {
        ArrayList arrayListC1;
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        this.f2364u = new Point();
        this.f2365v = new Point();
        this.E = new AtomicInteger(0);
        this.M = new AtomicBoolean(false);
        this.N = new AtomicBoolean(false);
        this.O = new AtomicInteger(0);
        this.f2356a = gyVar;
        this.f2357b = context;
        this.f2358d = y9Var;
        this.f2359f = pr0Var;
        this.f2360h = wr0Var;
        this.f2361q = p21Var;
        this.f2362s = scheduledExecutorService;
        this.f2366w = hd0Var;
        this.f2367x = vt0Var;
        this.F = versionInfoParcel;
        this.P = sgVar;
        this.f2368y = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4177x6)).booleanValue();
        this.f2369z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4167w6)).booleanValue();
        this.A = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4196z6)).booleanValue();
        this.B = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.B6)).booleanValue();
        this.C = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.A6);
        this.D = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.C6);
        this.H = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.D6);
        this.Q = zzeVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.E6)).booleanValue()) {
            this.I = C1((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.F6));
            this.J = C1((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.G6));
            this.K = C1((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.H6));
            arrayListC1 = C1((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.I6));
        } else {
            this.I = R;
            this.J = S;
            this.K = T;
            arrayListC1 = U;
        }
        this.L = arrayListC1;
    }

    public static boolean A1(Uri uri, ArrayList arrayList, ArrayList arrayList2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final Uri B1(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i10 = iIndexOf + 1;
        return Uri.parse(string.substring(0, i10) + str + "=" + str2 + "&" + string.substring(i10));
    }

    public static final ArrayList C1(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!tc1.n(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ ft0 D1(a aVar, zzbyq zzbyqVar) {
        if (!gt0.a() || !((Boolean) eh.f4205e.k()).booleanValue()) {
            return null;
        }
        try {
            ft0 ft0VarZza = ((zzs) tc1.s0(aVar)).zza();
            ft0VarZza.d(new ArrayList(Collections.singletonList(zzbyqVar.f11602b)));
            com.google.android.gms.ads.internal.client.zzl zzlVar = zzbyqVar.f11604f;
            ft0VarZza.b(zzlVar == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzlVar.zzp);
            ft0VarZza.f(zzlVar.zzm);
            return ft0VarZza;
        } catch (ExecutionException e10) {
            com.google.android.gms.ads.internal.zzu.zzo().i("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e10);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzs u1(android.content.Context r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.ads.internal.client.zzq r11, com.google.android.gms.ads.internal.client.zzl r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzak.u1(android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.ads.internal.client.zzq, com.google.android.gms.ads.internal.client.zzl, android.os.Bundle):com.google.android.gms.ads.nonagon.signalgeneration.zzs");
    }

    public final z01 v1(final String str) {
        final tb0[] tb0VarArr = new tb0[1];
        a aVarA = this.f2360h.a();
        y11 y11Var = new y11() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
            @Override // com.google.android.gms.internal.ads.y11
            public final a zza(Object obj) throws JSONException {
                zzak zzakVar = this.zza;
                tb0[] tb0VarArr2 = tb0VarArr;
                String str2 = str;
                tb0 tb0Var = (tb0) obj;
                zzakVar.getClass();
                tb0VarArr2[0] = tb0Var;
                Context context = zzakVar.f2357b;
                zzbtl zzbtlVar = zzakVar.f2363t;
                Map map = zzbtlVar.f11521b;
                JSONObject jSONObjectZzd = zzbv.zzd(context, map, map, zzbtlVar.f11520a, null);
                JSONObject jSONObjectZzg = zzbv.zzg(zzakVar.f2357b, zzakVar.f2363t.f11520a);
                JSONObject jSONObjectZzf = zzbv.zzf(zzakVar.f2363t.f11520a);
                JSONObject jSONObjectZze = zzbv.zze(zzakVar.f2357b, zzakVar.f2363t.f11520a);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", jSONObjectZzd);
                jSONObject.put("ad_view_signal", jSONObjectZzg);
                jSONObject.put("scroll_view_signal", jSONObjectZzf);
                jSONObject.put("lock_screen_signal", jSONObjectZze);
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", zzbv.zzc(null, zzakVar.f2357b, zzakVar.f2365v, zzakVar.f2364u));
                }
                return tb0Var.a(jSONObject, str2);
            }
        };
        p21 p21Var = this.f2361q;
        r11 r11VarQ0 = tc1.q0(aVarA, y11Var, p21Var);
        r11VarQ0.a(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzw
            @Override // java.lang.Runnable
            public final void run() {
                zzak zzakVar = this.zza;
                tb0[] tb0VarArr2 = tb0VarArr;
                zzakVar.getClass();
                tb0 tb0Var = tb0VarArr2[0];
                if (tb0Var != null) {
                    zzakVar.f2360h.b(tc1.d0(tb0Var));
                }
            }
        }, p21Var);
        return tc1.P(tc1.o0((h21) tc1.r0(h21.r(r11VarQ0), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.P6)).intValue(), TimeUnit.MILLISECONDS, this.f2362s), new gx0() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzac
            @Override // com.google.android.gms.internal.ads.gx0
            public final Object apply(Object obj) {
                ArrayList arrayList = zzak.R;
                return ((JSONObject) obj).optString("nas");
            }
        }, p21Var), Exception.class, new gx0() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
            @Override // com.google.android.gms.internal.ads.gx0
            public final Object apply(Object obj) {
                ArrayList arrayList = zzak.R;
                com.google.android.gms.ads.internal.util.client.zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (Exception) obj);
                return null;
            }
        }, p21Var);
    }

    public final void w1() {
        if (((Boolean) qh.f8178a.k()).booleanValue()) {
            this.Q.zzb();
        } else {
            tc1.u0(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.ga)).booleanValue() ? tc1.k0(new x11() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
                @Override // com.google.android.gms.internal.ads.x11
                /* JADX INFO: renamed from: zza */
                public final a mo2zza() {
                    zzak zzakVar = this.zza;
                    return zzakVar.u1(zzakVar.f2357b, null, AdFormat.BANNER.name(), null, null, new Bundle()).zzb();
                }
            }, nu.f7383a) : u1(this.f2357b, null, AdFormat.BANNER.name(), null, null, new Bundle()).zzb(), new f(22, this), this.f2356a.a());
        }
    }

    public final void x1() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.H8)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.K8)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.O8)).booleanValue() && this.M.getAndSet(true)) {
                return;
            }
            w1();
        }
    }

    public final void y1(List list, final a4.a aVar, tq tqVar, boolean z9) {
        ArrayList arrayList;
        ArrayList arrayList2;
        a aVarQ0;
        Map map;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.O6)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The updating URL feature is not enabled.");
            try {
                tqVar.a("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                return;
            }
        }
        Iterator it = list.iterator();
        int i10 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.J;
            arrayList2 = this.I;
            if (!zHasNext) {
                break;
            } else if (A1((Uri) it.next(), arrayList2, arrayList)) {
                i10++;
            }
        }
        int i11 = 1;
        if (i10 > 1) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (A1(uri, arrayList2, arrayList)) {
                Callable callable = new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzx
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Exception {
                        pr0 pr0Var;
                        zzak zzakVar = this.zza;
                        Uri uriA = uri;
                        a4.a aVar2 = aVar;
                        zzakVar.getClass();
                        try {
                            uriA = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.ab)).booleanValue() || (pr0Var = zzakVar.f2359f) == null) ? zzakVar.f2358d.a(uriA, zzakVar.f2357b, (View) b.a0(aVar2), null) : pr0Var.a(uriA, zzakVar.f2357b, (View) b.a0(aVar2), null);
                        } catch (zzaup e11) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzk(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
                        }
                        if (uriA.getQueryParameter("ms") != null) {
                            return uriA;
                        }
                        throw new Exception("Failed to append spam signals to click url.");
                    }
                };
                p21 p21Var = this.f2361q;
                a aVarB = ((q11) p21Var).b(callable);
                zzbtl zzbtlVar = this.f2363t;
                if (zzbtlVar == null || (map = zzbtlVar.f11521b) == null || map.isEmpty()) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzi("Asset view map is empty.");
                    aVarQ0 = aVarB;
                } else {
                    aVarQ0 = tc1.q0(aVarB, new y11() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzy
                        @Override // com.google.android.gms.internal.ads.y11
                        public final a zza(Object obj) {
                            zzak zzakVar = this.zza;
                            return tc1.o0(zzakVar.v1("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new gx0(zzakVar, (Uri) obj) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzz
                                public final /* synthetic */ Uri zza;

                                {
                                    this.zza = uri;
                                }

                                @Override // com.google.android.gms.internal.ads.gx0
                                public final Object apply(Object obj2) {
                                    Uri uri2 = this.zza;
                                    String str = (String) obj2;
                                    ArrayList arrayList4 = zzak.R;
                                    return !TextUtils.isEmpty(str) ? zzak.B1(uri2, "nas", str) : uri2;
                                }
                            }, zzakVar.f2361q);
                        }
                    }, p21Var);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                aVarQ0 = tc1.d0(uri);
            }
            arrayList3.add(aVarQ0);
        }
        tc1.u0(new z11(bz0.k(arrayList3), true), new c(this, tqVar, z9, i11), this.f2356a.a());
    }

    public final void z1(final List list, final a4.a aVar, tq tqVar, boolean z9) {
        Map map;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.O6)).booleanValue()) {
            try {
                tqVar.a("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                return;
            }
        }
        Callable callable = new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                zzak zzakVar = this.zza;
                List<Uri> list2 = list;
                a4.a aVar2 = aVar;
                v9 v9Var = zzakVar.f2358d.f10801b;
                String strZzh = v9Var != null ? v9Var.zzh(zzakVar.f2357b, (View) b.a0(aVar2), null) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                if (TextUtils.isEmpty(strZzh)) {
                    throw new Exception("Failed to get view signals.");
                }
                ArrayList arrayList = new ArrayList();
                for (Uri uri : list2) {
                    if (zzak.A1(uri, zzakVar.K, zzakVar.L)) {
                        arrayList.add(zzak.B1(uri, "ms", strZzh));
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                        arrayList.add(uri);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new Exception("Empty impression URLs result.");
                }
                return arrayList;
            }
        };
        p21 p21Var = this.f2361q;
        a aVarB = ((q11) p21Var).b(callable);
        zzbtl zzbtlVar = this.f2363t;
        if (zzbtlVar == null || (map = zzbtlVar.f11521b) == null || map.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Asset view map is empty.");
        } else {
            aVarB = tc1.q0(aVarB, new y11() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
                @Override // com.google.android.gms.internal.ads.y11
                public final a zza(Object obj) {
                    final zzak zzakVar = this.zza;
                    final ArrayList arrayList = (ArrayList) obj;
                    return tc1.o0(zzakVar.v1("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new gx0() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                        @Override // com.google.android.gms.internal.ads.gx0
                        public final Object apply(Object obj2) {
                            zzak zzakVar2 = zzakVar;
                            List<Uri> list2 = arrayList;
                            String str = (String) obj2;
                            zzakVar2.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            for (Uri uri : list2) {
                                if (!zzak.A1(uri, zzakVar2.K, zzakVar2.L) || TextUtils.isEmpty(str)) {
                                    arrayList2.add(uri);
                                } else {
                                    arrayList2.add(zzak.B1(uri, "nas", str));
                                }
                            }
                            return arrayList2;
                        }
                    }, zzakVar.f2361q);
                }
            }, p21Var);
        }
        tc1.u0(aVarB, new c(this, tqVar, z9, 0), this.f2356a.a());
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final a4.a zze(a4.a aVar, a4.a aVar2, String str, a4.a aVar3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.R8)).booleanValue()) {
            return new b(null);
        }
        Context context = (Context) b.a0(aVar);
        e eVar = (e) b.a0(aVar2);
        p.a aVar4 = (p.a) b.a0(aVar3);
        sg sgVar = this.P;
        sgVar.getClass();
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        sgVar.f8861j = context;
        sgVar.f8857f = str;
        qg qgVar = new qg(sgVar, aVar4);
        sgVar.f8855d = qgVar;
        g gVarA = eVar.a(qgVar);
        sgVar.f8856e = gVarA;
        if (gVarA == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("CustomTabsClient failed to create new session.");
        }
        if (((Boolean) qh.f8178a.k()).booleanValue()) {
            this.Q.zzb();
        }
        return new b(sgVar.f8856e);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0099  */
    @Override // com.google.android.gms.internal.ads.ut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(a4.a r9, final com.google.android.gms.internal.ads.zzbyq r10, com.google.android.gms.internal.ads.rt r11) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzak.zzf(a4.a, com.google.android.gms.internal.ads.zzbyq, com.google.android.gms.internal.ads.rt):void");
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzg(zzbtl zzbtlVar) {
        this.f2363t = zzbtlVar;
        this.f2360h.c(1);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzh(List list, a4.a aVar, tq tqVar) {
        y1(list, aVar, tqVar, true);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzi(List list, a4.a aVar, tq tqVar) {
        z1(list, aVar, tqVar, true);
    }

    @Override // com.google.android.gms.internal.ads.ut
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzj(a4.a aVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.G8)).booleanValue()) {
            xf xfVar = eg.M6;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(xfVar)).booleanValue()) {
                x1();
            }
            WebView webView = (WebView) b.a0(aVar);
            if (webView == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("The webView cannot be null.");
                return;
            }
            webView.addJavascriptInterface(new n3.a(webView, this.f2358d, this.f2366w, this.f2367x, this.f2359f, this.Q), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.Q8)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzo().f5064k.incrementAndGet();
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(xfVar)).booleanValue()) {
                x1();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzk(a4.a aVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.O6)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) b.a0(aVar);
            zzbtl zzbtlVar = this.f2363t;
            this.f2364u = zzbv.zza(motionEvent, zzbtlVar == null ? null : zzbtlVar.f11520a);
            if (motionEvent.getAction() == 0) {
                this.f2365v = this.f2364u;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.f2364u;
            motionEventObtain.setLocation(point.x, point.y);
            this.f2358d.f10801b.zzk(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzl(List list, a4.a aVar, tq tqVar) {
        y1(list, aVar, tqVar, false);
    }

    @Override // com.google.android.gms.internal.ads.ut
    public final void zzm(List list, a4.a aVar, tq tqVar) {
        z1(list, aVar, tqVar, false);
    }
}
