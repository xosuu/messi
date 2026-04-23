package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioAttributes;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.nonagon.signalgeneration.zzay;
import com.google.android.gms.ads.rewarded.RewardItem;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class aa implements v, v6, rv0, InitializationCompleteCallback, RewardItem, k21, s60, b60, yx, zf0, jd, j80, pl0, mq0, k4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2626b;

    public /* synthetic */ aa(int i10, Object obj) {
        this.f2625a = i10;
        this.f2626b = obj;
    }

    private final void e() {
        synchronized (((gl0) this.f2626b)) {
            ((gl0) this.f2626b).f4954u = null;
        }
    }

    private final void l() {
        synchronized (((nl0) this.f2626b)) {
            ((nl0) this.f2626b).f7307v = null;
        }
    }

    private final void m(Object obj) {
        String str = (String) obj;
        synchronized (this) {
            Object obj2 = this.f2626b;
            ((be0) obj2).f2999c = true;
            ((y3.b) zzu.zzB()).getClass();
            ((be0) obj2).d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - ((be0) this.f2626b).f3000d), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, true);
            ((be0) this.f2626b).f3005i.execute(new vm(this, 28, str));
        }
    }

    private final void o(Object obj) {
        l10 l10Var = (l10) obj;
        synchronized (((gl0) this.f2626b)) {
            l10 l10Var2 = ((gl0) this.f2626b).f4954u;
            if (l10Var2 != null) {
                z40 z40Var = l10Var2.f8359c;
                z40Var.getClass();
                z40Var.I0(new y40(null));
            }
            Object obj2 = this.f2626b;
            ((gl0) obj2).f4954u = l10Var;
            ((gl0) obj2).f4954u.a();
        }
    }

    private final /* bridge */ /* synthetic */ void p(Object obj) {
        z70 z70Var = (z70) obj;
        synchronized (((nl0) this.f2626b)) {
            Object obj2 = this.f2626b;
            ((nl0) obj2).f7307v = z70Var;
            ((nl0) obj2).f7307v.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        switch (this.f2625a) {
            case 7:
                ((f30) this.f2626b).f4372f.k(false);
                return;
            case 13:
                synchronized (this) {
                    Object obj = this.f2626b;
                    ((be0) obj).f2999c = true;
                    ((y3.b) zzu.zzB()).getClass();
                    ((be0) obj).d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - ((be0) this.f2626b).f3000d), "Internal Error.", false);
                    ((be0) this.f2626b).f3001e.c(new Exception());
                    break;
                }
                return;
            case 15:
                return;
            case 17:
                zzm.zzg("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
                return;
            default:
                zze zzeVarD0 = en1.d0(th, ((f30) ((fz) ((xi0) this.f2626b).f10562b).X.zzb()).f4378l);
                ((m40) ((xi0) this.f2626b).f10565e).t(zzeVarD0);
                tp1.Z(zzeVarD0.zza, "DelayedBannerAd.onFailure", th);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final void mo4a(Object obj) {
        switch (this.f2625a) {
            case 7:
                ((f30) this.f2626b).f4372f.k(true);
                return;
            case 13:
                m(obj);
                return;
            case 15:
                ((s50) ((l2.l) this.f2626b).f15161a).b((kr0) obj);
                return;
            case 17:
                try {
                    ((rs0) this.f2626b).zza((SQLiteDatabase) obj);
                    return;
                } catch (Exception e10) {
                    zzm.zzg("Error executing function on offline buffered ping database: ".concat(String.valueOf(e10.getMessage())));
                    return;
                }
            case 18:
                ((l10) obj).a();
                return;
            case 20:
                o(obj);
                return;
            case sf.zzm /* 21 */:
                p(obj);
                return;
            default:
                synchronized (((br0) this.f2626b)) {
                    try {
                        ((br0) this.f2626b).f3091u = (bc0) obj;
                        if (((Boolean) zzba.zzc().a(eg.f4004g3)).booleanValue()) {
                            ((bc0) obj).f2982s.f7038a = ((br0) this.f2626b).f3086f;
                        }
                        ((br0) this.f2626b).f3091u.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.rv0
    public final void b(int i10, long j10) {
        ((cv0) this.f2626b).c(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.v6
    public final void c(MessageDigest[] messageDigestArr, long j10, int i10) {
        ByteBuffer byteBufferSlice;
        synchronized (((ByteBuffer) this.f2626b)) {
            int i11 = (int) j10;
            ((ByteBuffer) this.f2626b).position(i11);
            ((ByteBuffer) this.f2626b).limit(i11 + i10);
            byteBufferSlice = ((ByteBuffer) this.f2626b).slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    public final vh1[] d(Handler handler, ri1 ri1Var, ri1 ri1Var2) {
        yw ywVar = (yw) this.f2626b;
        Context context = ywVar.f11052a;
        u3.q qVar = new u3.q(context);
        tc1.W(!qVar.f17607a);
        qVar.f17607a = true;
        if (((ep) qVar.f17611h) == null) {
            qVar.f17611h = new ep(new e30[0]);
        }
        if (((ok0) qVar.f17612q) == null) {
            qVar.f17612q = new ok0(context, 10);
        }
        jm1 jm1Var = new jm1(context, new dg(context), handler, ri1Var2, new gm1(qVar));
        Context context2 = ywVar.f11052a;
        return new vh1[]{jm1Var, new b(context2, new dg(context2), handler, ri1Var)};
    }

    @Override // com.google.android.gms.internal.ads.v
    public final long f(long j10) {
        return Math.max(0L, Math.min((j10 * ((long) ((m0) this.f2626b).f6788e)) / 1000000, r0.f6793j - 1));
    }

    @Override // com.google.android.gms.internal.ads.rv0
    public final void g(int i10, String str, long j10) {
        ((cv0) this.f2626b).d(i10, System.currentTimeMillis() - j10, null, null, str);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        ks ksVar = (ks) this.f2626b;
        if (ksVar != null) {
            try {
                return ksVar.zze();
            } catch (RemoteException e10) {
                zzm.zzk("Could not forward getAmount to RewardItem", e10);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        ks ksVar = (ks) this.f2626b;
        if (ksVar != null) {
            try {
                return ksVar.zzf();
            } catch (RemoteException e10) {
                zzm.zzk("Could not forward getType to RewardItem", e10);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.j80
    public final void h(boolean z9, Context context, s40 s40Var) throws zzdgw {
        zzffn zzffnVar;
        fi0 fi0Var = (fi0) this.f2626b;
        try {
            ((vr0) fi0Var.f4535b).c(z9);
            vr0 vr0Var = (vr0) fi0Var.f4535b;
            vr0Var.getClass();
            try {
                vr0Var.f9963a.s();
            } finally {
            }
        } catch (zzffn e10) {
            zzm.zzk("Cannot show rewarded video.", e10);
            throw new zzdgw(e10.getCause());
        }
    }

    @Override // k4.b
    public final void i(k4.l lVar) {
        lw0 lw0Var = (lw0) this.f2626b;
        if (lVar.f14685d) {
            lw0Var.cancel(false);
            return;
        }
        if (lVar.d()) {
            lw0Var.f(lVar.b());
            return;
        }
        Exception excA = lVar.a();
        if (excA == null) {
            throw new IllegalStateException();
        }
        lw0Var.g(excA);
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final bz j(lq0 lq0Var) {
        return ((tp0) this.f2626b).c(lq0Var);
    }

    @Override // com.google.android.gms.internal.ads.jd
    public final void k(rf rfVar) {
        zd zdVar = (zd) this.f2626b;
        rfVar.d();
        sf.H((sf) rfVar.f9462b, zdVar);
    }

    @Override // com.google.android.gms.internal.ads.zf0
    public final n5.a n(zzbvb zzbvbVar) {
        n5.a aVarZ;
        rf0 rf0Var = (rf0) ((tl0) this.f2626b).f9186b;
        String str = zzbvbVar.f11581t;
        synchronized (rf0Var.f7567b) {
            try {
                int i10 = rf0Var.f8587t;
                int i11 = 1;
                if (i10 != 1 && i10 != 3) {
                    aVarZ = tc1.Z(new zzdyp(2));
                } else if (rf0Var.f7568d) {
                    aVarZ = rf0Var.f7566a;
                } else {
                    rf0Var.f8587t = 3;
                    rf0Var.f7568d = true;
                    rf0Var.f8586s = str;
                    rf0Var.f7571q.checkAvailabilityAndConnect();
                    rf0Var.f7566a.a(new qf0(rf0Var, i11), nu.f7388f);
                    aVarZ = rf0Var.f7566a;
                }
            } finally {
            }
        }
        return aVarZ;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            ((wl) this.f2626b).a(str);
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            ((wl) this.f2626b).zzf();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    public final int q() {
        int iOptInt = ((JSONObject) this.f2626b).optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        switch (this.f2625a) {
            case 8:
                ((o40) obj).O((zzdgw) this.f2626b);
                break;
            case 9:
                ((u50) obj).b((kr0) this.f2626b);
                break;
            case 10:
                ((sp0) obj).h((zzs) this.f2626b);
                break;
            case 11:
                ((v70) obj).zze((zzay) this.f2626b);
                break;
            default:
                ts0 ts0Var = (ts0) this.f2626b;
                ((ys0) obj).j((ws0) ts0Var.f9282a, ts0Var.f9283b);
                break;
        }
    }

    public /* synthetic */ aa(int i10, Object obj, int i11) {
        this.f2625a = i10;
        this.f2626b = obj;
    }

    public /* synthetic */ aa() {
        this.f2625a = 23;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i10 = yn0.f10944a;
        if (i10 >= 29) {
            uu.a(usage, 1);
        }
        if (i10 >= 32) {
            x50.a(usage, 0);
        }
        this.f2626b = usage.build();
    }

    public aa(ConnectivityManager connectivityManager) {
        this.f2625a = 0;
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new j2.e(1, this));
        } catch (RuntimeException unused) {
            synchronized (aa.class) {
                this.f2626b = null;
            }
        }
    }

    public aa(ByteBuffer byteBuffer) {
        this.f2625a = 2;
        this.f2626b = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.v6
    public final long zza() {
        switch (this.f2625a) {
            case 0:
                synchronized (aa.class) {
                    try {
                        NetworkCapabilities networkCapabilities = (NetworkCapabilities) this.f2626b;
                        if (networkCapabilities != null) {
                            if (networkCapabilities.hasTransport(4)) {
                                return 2L;
                            }
                            if (((NetworkCapabilities) this.f2626b).hasTransport(1)) {
                                return 1L;
                            }
                            if (((NetworkCapabilities) this.f2626b).hasTransport(0)) {
                                return 0L;
                            }
                        }
                        return -1L;
                    } finally {
                    }
                }
            default:
                return ((ByteBuffer) this.f2626b).capacity();
        }
    }

    @Override // com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public final void mo1zza() {
        switch (this.f2625a) {
            case 20:
                e();
                return;
            case sf.zzm /* 21 */:
                l();
                return;
            default:
                synchronized (((br0) this.f2626b)) {
                    ((br0) this.f2626b).f3091u = null;
                    break;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.yx
    public final void zza(boolean z9, int i10, String str, String str2) {
        ed edVar = (ed) this.f2626b;
        if (z9) {
            edVar.d();
            return;
        }
        edVar.c(new zzeir(1, "Image Web View failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
    }
}
