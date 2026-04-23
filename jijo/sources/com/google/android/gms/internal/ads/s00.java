package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class s00 implements k40, e50, w40, zza, u40, m70 {
    public final AtomicBoolean A = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f8743b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f8744d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f8745f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kr0 f8746h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fr0 f8747q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ut0 f8748s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qr0 f8749t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final y9 f8750u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ug f8751v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final WeakReference f8752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final WeakReference f8753x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ep f8754y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f8755z;

    public s00(Context context, mu muVar, Executor executor, ScheduledExecutorService scheduledExecutorService, kr0 kr0Var, fr0 fr0Var, ut0 ut0Var, qr0 qr0Var, View view, fx fxVar, y9 y9Var, ug ugVar, ep epVar) {
        this.f8742a = context;
        this.f8743b = muVar;
        this.f8744d = executor;
        this.f8745f = scheduledExecutorService;
        this.f8746h = kr0Var;
        this.f8747q = fr0Var;
        this.f8748s = ut0Var;
        this.f8749t = qr0Var;
        this.f8750u = y9Var;
        this.f8752w = new WeakReference(view);
        this.f8753x = new WeakReference(fxVar);
        this.f8751v = ugVar;
        this.f8754y = epVar;
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void a(zze zzeVar) {
        if (((Boolean) zzba.zzc().a(eg.f4056l1)).booleanValue()) {
            int i10 = zzeVar.zza;
            fr0 fr0Var = this.f8747q;
            List list = fr0Var.f4628o;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ut0.c((String) it.next(), "@gw_mpe@", "2." + i10));
            }
            this.f8749t.a(this.f8748s.a(this.f8746h, fr0Var, arrayList));
        }
    }

    public final List b() {
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.xa)).booleanValue();
        fr0 fr0Var = this.f8747q;
        if (zBooleanValue) {
            zzu.zzp();
            Context context = this.f8742a;
            if (zzt.zzB(context)) {
                zzu.zzp();
                Integer numZzs = zzt.zzs(context);
                if (numZzs != null) {
                    Integer numValueOf = Integer.valueOf(Math.min(numZzs.intValue(), 20));
                    ArrayList arrayList = new ArrayList();
                    Iterator it = fr0Var.f4606d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(numValueOf.intValue())).toString());
                    }
                    return arrayList;
                }
            }
        }
        return fr0Var.f4606d;
    }

    public final void h() {
        String strZzh;
        int i10;
        fr0 fr0Var = this.f8747q;
        List list = fr0Var.f4606d;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) zzba.zzc().a(eg.f3993f3)).booleanValue()) {
            strZzh = this.f8750u.f10801b.zzh(this.f8742a, (View) this.f8752w.get(), null);
        } else {
            strZzh = null;
        }
        if ((((Boolean) zzba.zzc().a(eg.f4023i0)).booleanValue() && ((hr0) this.f8746h.f6383b.f10631d).f5377h) || !((Boolean) kh.f6289h.k()).booleanValue()) {
            this.f8749t.a(this.f8748s.b(this.f8746h, this.f8747q, false, strZzh, null, b()));
            return;
        }
        if (((Boolean) kh.f6288g.k()).booleanValue() && ((i10 = fr0Var.f4602b) == 1 || i10 == 2 || i10 == 5)) {
        }
        tc1.u0((h21) tc1.r0(h21.r(tc1.d0(null)), ((Long) zzba.zzc().a(eg.M0)).longValue(), TimeUnit.MILLISECONDS, this.f8745f), new p80(this, strZzh, 15), this.f8743b);
    }

    public final void j(int i10, int i11) {
        View view;
        if (i10 <= 0 || !((view = (View) this.f8752w.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            h();
        } else {
            this.f8745f.schedule(new r00(this, i10, i11, 1), i11, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void n(as asVar, String str, String str2) {
        lr0 lr0Var;
        fr0 fr0Var = this.f8747q;
        List list = fr0Var.f4614h;
        ut0 ut0Var = this.f8748s;
        ut0Var.getClass();
        ArrayList arrayList = new ArrayList();
        ((y3.b) ut0Var.f9614h).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            String str3 = ((yr) asVar).f11020a;
            String string = Integer.toString(((yr) asVar).f11021b);
            boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.f4004g3)).booleanValue();
            hx0 kx0Var = cx0.f3464a;
            if (zBooleanValue) {
                mr0 mr0Var = ut0Var.f9613g;
                if (mr0Var != null && (lr0Var = mr0Var.f7038a) != null) {
                    kx0Var = new kx0(lr0Var);
                }
            } else {
                lr0 lr0Var2 = ut0Var.f9612f;
                if (lr0Var2 != null) {
                    kx0Var = new kx0(lr0Var2);
                }
            }
            String str4 = (String) kx0Var.a(new b3(20)).b();
            String str5 = (String) kx0Var.a(new b3(21)).b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(t3.i.N(ut0.c(ut0.c(ut0.c(ut0.c(ut0.c(ut0.c((String) it.next(), "@gw_rwd_userid@", Uri.encode(str4)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(str3)), "@gw_rwd_amt@", string), "@gw_sdkver@", ut0Var.f9608b), ut0Var.f9611e, fr0Var.W, fr0Var.f4645w0));
            }
        } catch (RemoteException e10) {
            zzm.zzh("Unable to determine award type and amount.", e10);
        }
        this.f8749t.a(arrayList);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.f4023i0)).booleanValue();
        kr0 kr0Var = this.f8746h;
        if (!(zBooleanValue && ((hr0) kr0Var.f6383b.f10631d).f5377h) && ((Boolean) kh.f6285d.k()).booleanValue()) {
            ug ugVar = this.f8751v;
            ugVar.getClass();
            tc1.u0(tc1.P(h21.r((h21) tc1.r0(h21.r(tc1.d0(null)), ((Long) kh.f6284c.k()).longValue(), TimeUnit.MILLISECONDS, ugVar.f9471c)), Throwable.class, new b3(4), nu.f7388f), new i10(13, this), this.f8743b);
        } else {
            fr0 fr0Var = this.f8747q;
            this.f8749t.c(true == zzu.zzo().a(this.f8742a) ? 2 : 1, this.f8748s.a(kr0Var, fr0Var, fr0Var.f4604c));
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zze() {
        fr0 fr0Var = this.f8747q;
        this.f8749t.a(this.f8748s.a(this.f8746h, fr0Var, fr0Var.f4616i));
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzf() {
        fr0 fr0Var = this.f8747q;
        this.f8749t.a(this.f8748s.a(this.f8746h, fr0Var, fr0Var.f4612g));
    }

    @Override // com.google.android.gms.internal.ads.w40
    public final void zzr() {
        if (this.A.compareAndSet(false, true)) {
            int iIntValue = ((Integer) zzba.zzc().a(eg.f4088o3)).intValue();
            if (iIntValue > 0) {
                j(iIntValue, ((Integer) zzba.zzc().a(eg.p3)).intValue());
                return;
            }
            if (!((Boolean) zzba.zzc().a(eg.f4078n3)).booleanValue()) {
                h();
            } else {
                this.f8744d.execute(new q00(this, 0));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final synchronized void zzs() {
        ep epVar;
        try {
            if (this.f8755z) {
                ArrayList arrayList = new ArrayList(b());
                arrayList.addAll(this.f8747q.f4610f);
                this.f8749t.a(this.f8748s.b(this.f8746h, this.f8747q, true, null, null, arrayList));
            } else {
                qr0 qr0Var = this.f8749t;
                ut0 ut0Var = this.f8748s;
                kr0 kr0Var = this.f8746h;
                fr0 fr0Var = this.f8747q;
                qr0Var.a(ut0Var.a(kr0Var, fr0Var, fr0Var.f4624m));
                if (((Boolean) zzba.zzc().a(eg.f4048k3)).booleanValue() && (epVar = this.f8754y) != null) {
                    List list = ((fr0) epVar.f4270d).f4624m;
                    String strC = ((tj0) epVar.f4271f).c();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(ut0.c((String) it.next(), "@gw_adnetstatus@", strC));
                    }
                    long jA = ((tj0) this.f8754y.f4271f).a();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(ut0.c((String) it2.next(), "@gw_ttr@", Long.toString(jA, 10)));
                    }
                    qr0 qr0Var2 = this.f8749t;
                    ut0 ut0Var2 = this.f8748s;
                    ep epVar2 = this.f8754y;
                    qr0Var2.a(ut0Var2.a(epVar2.k(), (fr0) epVar2.f4270d, arrayList3));
                }
                qr0 qr0Var3 = this.f8749t;
                ut0 ut0Var3 = this.f8748s;
                kr0 kr0Var2 = this.f8746h;
                fr0 fr0Var2 = this.f8747q;
                qr0Var3.a(ut0Var3.a(kr0Var2, fr0Var2, fr0Var2.f4610f));
            }
            this.f8755z = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.m70
    public final void zzt() {
        fr0 fr0Var = this.f8747q;
        this.f8749t.a(this.f8748s.a(this.f8746h, fr0Var, fr0Var.f4641u0));
    }
}
