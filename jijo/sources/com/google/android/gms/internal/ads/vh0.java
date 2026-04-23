package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9846b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9847d;

    public vh0(WebView webView, String str) {
        this.f9845a = 10;
        this.f9846b = webView;
        this.f9847d = str;
    }

    private final void a() {
        zzbra zzbraVar;
        gt0 gt0Var = (gt0) this.f9846b;
        dt0 dt0Var = (dt0) this.f9847d;
        gt0Var.getClass();
        synchronized (gt0.f5044w) {
            try {
                if (!gt0Var.f5053t) {
                    gt0Var.f5053t = true;
                    if (gt0.a()) {
                        try {
                            zzu.zzp();
                            gt0Var.f5049f = zzt.zzp(gt0Var.f5046a);
                        } catch (RemoteException | RuntimeException e10) {
                            zzu.zzo().i("CuiMonitor.gettingAppIdFromManifest", e10);
                        }
                        s3.d dVar = s3.d.f16687b;
                        Context context = gt0Var.f5046a;
                        dVar.getClass();
                        gt0Var.f5050h = s3.d.a(context);
                        int iIntValue = ((Integer) zzba.zzc().a(eg.R7)).intValue();
                        if (((Boolean) zzba.zzc().a(eg.Ta)).booleanValue()) {
                            long j10 = iIntValue;
                            nu.f7386d.scheduleWithFixedDelay(gt0Var, j10, j10, TimeUnit.MILLISECONDS);
                        } else {
                            long j11 = iIntValue;
                            nu.f7386d.scheduleAtFixedRate(gt0Var, j11, j11, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } finally {
            }
        }
        if (gt0.a() && dt0Var != null) {
            synchronized (gt0.f5043v) {
                try {
                    if (((nt0) gt0Var.f5048d.f9462b).A() >= ((Integer) zzba.zzc().a(eg.S7)).intValue()) {
                        return;
                    }
                    ht0 ht0VarA = jt0.A();
                    int i10 = dt0Var.f3743m;
                    ht0VarA.d();
                    ((jt0) ht0VarA.f9462b).zzd = i10 - 2;
                    boolean z9 = dt0Var.f3732b;
                    ht0VarA.d();
                    ((jt0) ht0VarA.f9462b).zzk = z9;
                    long j12 = dt0Var.f3731a;
                    ht0VarA.d();
                    ((jt0) ht0VarA.f9462b).zzl = j12;
                    ht0VarA.d();
                    ((jt0) ht0VarA.f9462b).zzp = 1;
                    String str = gt0Var.f5047b.afmaVersion;
                    ht0VarA.d();
                    jt0.L((jt0) ht0VarA.f9462b, str);
                    String str2 = gt0Var.f5049f;
                    ht0VarA.d();
                    jt0.M((jt0) ht0VarA.f9462b, str2);
                    String str3 = Build.VERSION.RELEASE;
                    ht0VarA.d();
                    jt0.N((jt0) ht0VarA.f9462b, str3);
                    int i11 = Build.VERSION.SDK_INT;
                    ht0VarA.d();
                    ((jt0) ht0VarA.f9462b).zzA = i11;
                    int i12 = dt0Var.f3745o;
                    ht0VarA.d();
                    jt0.W((jt0) ht0VarA.f9462b, i12);
                    int i13 = dt0Var.f3733c;
                    ht0VarA.d();
                    ((jt0) ht0VarA.f9462b).zzG = i13;
                    long j13 = gt0Var.f5050h;
                    ht0VarA.d();
                    ((jt0) ht0VarA.f9462b).zzH = j13;
                    int i14 = dt0Var.f3744n;
                    ht0VarA.d();
                    jt0.X((jt0) ht0VarA.f9462b, i14);
                    String str4 = dt0Var.f3734d;
                    ht0VarA.d();
                    jt0.S((jt0) ht0VarA.f9462b, str4);
                    String str5 = dt0Var.f3735e;
                    ht0VarA.d();
                    jt0.T((jt0) ht0VarA.f9462b, str5);
                    String str6 = dt0Var.f3736f;
                    ht0VarA.d();
                    jt0.B((jt0) ht0VarA.f9462b, str6);
                    pc0 pc0VarA = gt0Var.f5051q.a(dt0Var.f3736f);
                    String string = (pc0VarA == null || (zzbraVar = pc0VarA.f7854b) == null) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzbraVar.toString();
                    ht0VarA.d();
                    ((jt0) ht0VarA.f9462b).zzW = string;
                    String str7 = dt0Var.f3737g;
                    ht0VarA.d();
                    jt0.D((jt0) ht0VarA.f9462b, str7);
                    it0 it0Var = dt0Var.f3738h;
                    ht0VarA.d();
                    ((jt0) ht0VarA.f9462b).zzae = it0Var.a();
                    String str8 = dt0Var.f3741k;
                    ht0VarA.d();
                    jt0.G((jt0) ht0VarA.f9462b, str8);
                    String str9 = dt0Var.f3739i;
                    ht0VarA.d();
                    jt0.E((jt0) ht0VarA.f9462b, str9);
                    String str10 = dt0Var.f3740j;
                    ht0VarA.d();
                    jt0.F((jt0) ht0VarA.f9462b, str10);
                    long j14 = dt0Var.f3742l;
                    ht0VarA.d();
                    ((jt0) ht0VarA.f9462b).zzm = j14;
                    if (((Boolean) zzba.zzc().a(eg.W7)).booleanValue()) {
                        List list = gt0Var.f5052s;
                        ht0VarA.d();
                        jt0.P((jt0) ht0VarA.f9462b, list);
                    }
                    kt0 kt0Var = gt0Var.f5048d;
                    lt0 lt0VarA = mt0.A();
                    lt0VarA.d();
                    mt0.B((mt0) lt0VarA.f9462b, (jt0) ht0VarA.b());
                    kt0Var.d();
                    nt0.D((nt0) kt0Var.f9462b, (mt0) lt0VarA.b());
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        pw0 nw0Var;
        Throwable thB;
        long j10;
        boolean z9;
        long j11 = -9223372036854775807L;
        boolean z10 = false;
        switch (this.f9845a) {
            case 0:
                kq1.d(((jq1) this.f9847d).f6067a, ((lj0) this.f9846b).b());
                return;
            case 1:
                cu0 cu0Var = (cu0) this.f9846b;
                au0 au0Var = au0.f2792a;
                View view = (View) this.f9847d;
                for (yt0 yt0Var : cu0Var.f3452c.values()) {
                    if (!yt0Var.f11035f) {
                        yt0Var.f11031b.a(view, au0Var);
                    }
                }
                cu0Var.f3453d.a(view, au0Var);
                return;
            case 2:
                cu0 cu0Var2 = (cu0) this.f9846b;
                jp0 jp0Var = (jp0) this.f9847d;
                Iterator it = cu0Var2.f3452c.values().iterator();
                while (it.hasNext()) {
                    ((yt0) it.next()).a();
                }
                Timer timer = new Timer();
                timer.schedule(new ph0(cu0Var2, jp0Var, timer), 1000L);
                return;
            case 3:
                xi0 xi0Var = (xi0) this.f9846b;
                fx fxVar = (fx) this.f9847d;
                xi0Var.getClass();
                fxVar.n0();
                rx rxVarZzq = fxVar.zzq();
                zzfk zzfkVar = ((or0) xi0Var.f10565e).f7641a;
                if (zzfkVar != null && rxVarZzq != null) {
                    rxVarZzq.v1(zzfkVar);
                }
                if (!((Boolean) zzba.zzc().a(eg.Z0)).booleanValue() || fxVar.isAttachedToWindow()) {
                    return;
                }
                fxVar.onPause();
                fxVar.a0();
                return;
            case 4:
                ((n40) ((ep) ((tl0) ((qp0) this.f9846b).f8255q).f9188f).f4271f).t((zze) this.f9847d);
                return;
            case 5:
                ((tp0) ((qp0) this.f9846b).f8255q).f9226f.t((zze) this.f9847d);
                return;
            case 6:
                ((yq0) ((qp0) this.f9846b).f8255q).f11009f.t((zze) this.f9847d);
                return;
            case 7:
                InputStream inputStream = (InputStream) this.f9846b;
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) this.f9847d);
                        try {
                            y3.c.c(inputStream, autoCloseOutputStream, false);
                            autoCloseOutputStream.close();
                            inputStream.close();
                            return;
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException unused) {
                    return;
                }
            case 8:
                vs0 vs0Var = ((us0) ((tl0) this.f9846b).f9190q).f9606c;
                ts0 ts0Var = (ts0) this.f9847d;
                e70 e70Var = (e70) vs0Var;
                e70Var.getClass();
                e70Var.I0(new aa(27, ts0Var));
                return;
            case 9:
                a();
                return;
            case 10:
                en1.L0((WebView) this.f9846b, (String) this.f9847d);
                return;
            case 11:
                ((WebView) this.f9846b).destroy();
                return;
            case 12:
                ((k4.e) this.f9847d).f14669a.f(xv0.a((Context) this.f9846b, "GLAS"));
                return;
            case 13:
                ax0 ax0Var = (ax0) this.f9846b;
                ek0 ek0Var = ax0Var.f2817a;
                IBinder iBinder = (IBinder) this.f9847d;
                int i10 = ow0.f7690a;
                if (iBinder == null) {
                    nw0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
                    nw0Var = iInterfaceQueryLocalInterface instanceof pw0 ? (pw0) iInterfaceQueryLocalInterface : new nw0(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
                }
                ek0Var.f4221v = nw0Var;
                ((ou) ax0Var.f2817a.f4215f).d("linkToDeath", new Object[0]);
                try {
                    IInterface iInterface = (IInterface) ax0Var.f2817a.f4221v;
                    iInterface.getClass();
                    iInterface.asBinder().linkToDeath((IBinder.DeathRecipient) ax0Var.f2817a.f4219t, 0);
                    break;
                } catch (RemoteException e10) {
                    ((ou) ax0Var.f2817a.f4215f).c(e10, "linkToDeath failed", new Object[0]);
                }
                ek0 ek0Var2 = ax0Var.f2817a;
                ek0Var2.f4213b = false;
                synchronized (((List) ek0Var2.f4217q)) {
                    try {
                        Iterator it2 = ((List) ax0Var.f2817a.f4217q).iterator();
                        while (it2.hasNext()) {
                            ((Runnable) it2.next()).run();
                        }
                        ((List) ax0Var.f2817a.f4217q).clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 14:
                ((u11) this.f9846b).r((wy0) this.f9847d);
                return;
            case 15:
                Object obj = this.f9846b;
                Object obj2 = (Future) obj;
                boolean z11 = obj2 instanceof z21;
                Object obj3 = this.f9847d;
                if (z11 && (thB = ((z21) obj2).b()) != null) {
                    ((k21) obj3).E(thB);
                    return;
                }
                try {
                    ((k21) obj3).mo4a(tc1.s0((Future) obj));
                    return;
                } catch (ExecutionException e11) {
                    ((k21) obj3).E(e11.getCause());
                    return;
                } catch (Throwable th2) {
                    ((k21) obj3).E(th2);
                    return;
                }
            case 16:
                ui1 ui1Var = (ui1) this.f9846b;
                yi1 yi1Var = (yi1) this.f9847d;
                int i11 = ui1Var.f9520x - yi1Var.f10910c;
                ui1Var.f9520x = i11;
                if (yi1Var.f10911d) {
                    ui1Var.f9521y = yi1Var.f10912e;
                    ui1Var.f9522z = true;
                }
                if (yi1Var.f10913f) {
                    ui1Var.A = yi1Var.f10914g;
                }
                if (i11 == 0) {
                    wv wvVar = yi1Var.f10909b.f8883a;
                    if (!ui1Var.Q.f8883a.o() && wvVar.o()) {
                        ui1Var.R = -1;
                        ui1Var.S = 0L;
                    }
                    if (!wvVar.o()) {
                        List listAsList = Arrays.asList(((xj1) wvVar).f10591h);
                        tc1.W(listAsList.size() == ui1Var.f9510n.size());
                        for (int i12 = 0; i12 < listAsList.size(); i12++) {
                            ((ti1) ui1Var.f9510n.get(i12)).f9170b = (wv) listAsList.get(i12);
                        }
                    }
                    if (ui1Var.f9522z) {
                        if (yi1Var.f10909b.f8884b.equals(ui1Var.Q.f8884b) && yi1Var.f10909b.f8886d == ui1Var.Q.f8899q) {
                            i = 0;
                        }
                        if (i != 0) {
                            if (wvVar.o() || yi1Var.f10909b.f8884b.b()) {
                                j11 = yi1Var.f10909b.f8886d;
                            } else {
                                sj1 sj1Var = yi1Var.f10909b;
                                jo1 jo1Var = sj1Var.f8884b;
                                j11 = sj1Var.f8886d;
                                wvVar.n(jo1Var.f6052a, ui1Var.f9509m);
                            }
                        }
                        j10 = j11;
                        z9 = i;
                    } else {
                        j10 = -9223372036854775807L;
                        z9 = 0;
                    }
                    ui1Var.f9522z = false;
                    ui1Var.p(yi1Var.f10909b, 1, ui1Var.A, z9, ui1Var.f9521y, j10, -1);
                    return;
                }
                return;
            case 17:
                cj0 cj0Var = (cj0) this.f9846b;
                String str = (String) this.f9847d;
                cj0Var.getClass();
                int i13 = yn0.f10944a;
                ((ri1) ((ol1) cj0Var.f3302d)).f8608a.f9512p.zzx(str);
                return;
            case 18:
                cj0 cj0Var2 = ((im1) this.f9846b).f5645a.J0;
                jk1 jk1Var = (jk1) this.f9847d;
                Handler handler = (Handler) cj0Var2.f3301b;
                if (handler != null) {
                    handler.post(new ll1(cj0Var2, jk1Var, i));
                    return;
                }
                return;
            default:
                wo1 wo1Var = (wo1) this.f9846b;
                v0 v0Var = (v0) this.f9847d;
                wo1Var.I = wo1Var.A == null ? v0Var : new l0(-9223372036854775807L, 0L);
                wo1Var.J = v0Var.zza();
                if (!wo1Var.P && v0Var.zza() == -9223372036854775807L) {
                    z10 = true;
                }
                wo1Var.K = z10;
                wo1Var.L = true == z10 ? 7 : 1;
                if (wo1Var.E) {
                    wo1Var.f10263h.s(wo1Var.J, v0Var.zzh(), wo1Var.K);
                    return;
                } else {
                    wo1Var.q();
                    return;
                }
        }
    }

    public final String toString() {
        switch (this.f9845a) {
            case 15:
                ep epVar = new ep(vh0.class.getSimpleName());
                k21 k21Var = (k21) this.f9847d;
                cj0 cj0Var = new cj0(7);
                ((cj0) epVar.f4271f).f3302d = cj0Var;
                epVar.f4271f = cj0Var;
                cj0Var.f3301b = k21Var;
                return epVar.toString();
            default:
                return super.toString();
        }
    }

    public vh0(tu0 tu0Var) {
        this.f9845a = 11;
        this.f9847d = tu0Var;
        this.f9846b = tu0Var.f9285e;
    }

    public /* synthetic */ vh0(Object obj, int i10, Object obj2) {
        this.f9845a = i10;
        this.f9846b = obj;
        this.f9847d = obj2;
    }
}
