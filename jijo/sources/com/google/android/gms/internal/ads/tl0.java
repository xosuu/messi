package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzu;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class tl0 implements ql0, w30, zzg, nq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9186b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9187d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f9188f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f9189h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f9190q;

    public /* synthetic */ tl0(int i10) {
        this.f9185a = null;
        this.f9186b = null;
        this.f9187d = null;
        this.f9188f = null;
        this.f9189h = null;
        this.f9190q = a41.f2579d;
    }

    public static /* bridge */ /* synthetic */ String e(tl0 tl0Var) {
        String str = (String) zzba.zzc().a(eg.f3977d9);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", (Long) tl0Var.f9185a);
            jSONObject.put("eventCategory", (String) tl0Var.f9186b);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, (String) tl0Var.f9187d);
            jSONObject.putOpt("errorCode", (Integer) tl0Var.f9188f);
            jSONObject.putOpt("rewardType", (String) tl0Var.f9189h);
            jSONObject.putOpt("rewardAmount", (Integer) tl0Var.f9190q);
        } catch (JSONException unused) {
            zzm.zzj("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final n5.a a(final cj0 cj0Var, final mq0 mq0Var) {
        n5.a aVarB;
        synchronized (this) {
            bz bzVarJ = mq0Var.j((lq0) cj0Var.f3302d);
            bzVarJ.a(new cq0((String) this.f9188f));
            final x30 x30Var = (x30) bzVarJ.e();
            x30Var.zzg();
            x30Var.zzg();
            zzl zzlVar = x30Var.zzg().f7644d;
            if (zzlVar.zzs == null && zzlVar.zzx == null) {
                or0 or0VarZzg = x30Var.zzg();
                final bq0 bq0Var = new bq0(mq0Var, cj0Var, or0VarZzg.f7644d, or0VarZzg.f7646f, (Executor) this.f9190q, or0VarZzg.f7650j, null);
                aVarB = tc1.q0(h21.r(((eq0) ((nq0) this.f9186b)).b(cj0Var, mq0Var, x30Var)), new y11() { // from class: com.google.android.gms.internal.ads.aq0
                    @Override // com.google.android.gms.internal.ads.y11
                    public final n5.a zza(Object obj) {
                        y01 y01VarA;
                        tl0 tl0Var = this.f2764a;
                        cj0 cj0Var2 = cj0Var;
                        bq0 bq0Var2 = bq0Var;
                        mq0 mq0Var2 = mq0Var;
                        x30 x30Var2 = x30Var;
                        dq0 dq0Var = (dq0) obj;
                        if (dq0Var != null) {
                            tl0Var.getClass();
                            bq0 bq0Var3 = new bq0(bq0Var2.f3071a, bq0Var2.f3072b, bq0Var2.f3073c, bq0Var2.f3074d, bq0Var2.f3075e, bq0Var2.f3076f, dq0Var.f3718a);
                            if (dq0Var.f3720c != null) {
                                tl0Var.f9189h = null;
                                ((ms0) tl0Var.f9187d).a(bq0Var3);
                                return tl0Var.o(dq0Var.f3720c, cj0Var2);
                            }
                            ms0 ms0Var = (ms0) tl0Var.f9187d;
                            synchronized (ms0Var) {
                                ms0Var.f7043e = 2;
                                y01VarA = ms0Var.c() ? null : ms0Var.f7042d.a(bq0Var3);
                            }
                            if (y01VarA != null) {
                                tl0Var.f9189h = null;
                                return tc1.q0(y01VarA, new if0(17, tl0Var), (Executor) tl0Var.f9190q);
                            }
                            ((ms0) tl0Var.f9187d).a(bq0Var3);
                            cj0Var2 = new cj0((lq0) cj0Var2.f3302d, dq0Var.f3719b, 3);
                        }
                        n5.a aVarB2 = ((hq0) ((nq0) tl0Var.f9185a)).b(cj0Var2, mq0Var2, x30Var2);
                        tl0Var.f9189h = x30Var2;
                        return aVarB2;
                    }
                }, (Executor) this.f9190q);
            } else {
                this.f9189h = x30Var;
                aVarB = ((hq0) ((nq0) this.f9185a)).b(cj0Var, mq0Var, x30Var);
            }
        }
        return aVarB;
    }

    @Override // com.google.android.gms.internal.ads.ql0
    public final boolean b(zzl zzlVar, String str, b4.f fVar, pl0 pl0Var) {
        zzu.zzp();
        final int i10 = 0;
        if (zzt.zzH((Context) this.f9187d) && zzlVar.zzs == null) {
            zzm.zzg("Failed to load the ad because app ID is missing.");
            ((gy) this.f9186b).a().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.sl0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ tl0 f8919b;

                {
                    this.f8919b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = i10;
                    tl0 tl0Var = this.f8919b;
                    switch (i11) {
                        case 0:
                            ((n40) ((ep) tl0Var.f9188f).f4271f).t(en1.u0(4, null, null));
                            break;
                        default:
                            ((n40) ((ep) tl0Var.f9188f).f4271f).t(en1.u0(6, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        final int i11 = 1;
        if (str == null) {
            zzm.zzg("Ad unit ID should not be null for NativeAdLoader.");
            ((gy) this.f9186b).a().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.sl0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ tl0 f8919b;

                {
                    this.f8919b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i112 = i11;
                    tl0 tl0Var = this.f8919b;
                    switch (i112) {
                        case 0:
                            ((n40) ((ep) tl0Var.f9188f).f4271f).t(en1.u0(4, null, null));
                            break;
                        default:
                            ((n40) ((ep) tl0Var.f9188f).f4271f).t(en1.u0(6, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        tp1.I((Context) this.f9187d, zzlVar.zzf);
        if (((Boolean) zzba.zzc().a(eg.f3942a8)).booleanValue() && zzlVar.zzf) {
            ((le0) ((zy) ((gy) this.f9186b)).f11375w.zzb()).e(true);
        }
        int i12 = ((rl0) fVar).f8632c;
        ((y3.b) zzu.zzB()).getClass();
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        Bundle bundleC = tc1.c(new Pair("api-call", lValueOf), new Pair("dynamite-enter", lValueOf));
        nr0 nr0Var = (nr0) this.f9185a;
        nr0Var.f7358a = zzlVar;
        nr0Var.f7377t = bundleC;
        nr0Var.f7370m = i12;
        Context context = (Context) this.f9187d;
        or0 or0VarA = nr0Var.a();
        bt0 bt0VarS = tc1.s(context, tc1.S(or0VarA), 8, zzlVar);
        zzcb zzcbVar = or0VarA.f7654n;
        if (zzcbVar != null) {
            ((kl0) ((ep) this.f9188f).f4270d).k(zzcbVar);
        }
        zy zyVar = ((zy) ((gy) this.f9186b)).f11340c;
        tl0 tl0Var = new tl0();
        tl0Var.f9187d = (Context) this.f9187d;
        tl0Var.f9185a = or0VarA;
        z30 z30Var = new z30(tl0Var);
        t60 t60Var = new t60();
        t60Var.c((kl0) ((ep) this.f9188f).f4270d, ((gy) this.f9186b).a());
        u60 u60Var = new u60(t60Var);
        ep epVar = (ep) this.f9188f;
        p80 p80Var = new p80((r90) epVar.f4269b, i10, ((kl0) epVar.f4270d).j());
        ft0 ft0Var = null;
        uy uyVar = new uy(zyVar, new i10(i10, ft0Var), p80Var, u60Var, z30Var, new i10(), null, null);
        if (((Boolean) eh.f4203c.k()).booleanValue()) {
            ft0Var = (ft0) uyVar.f9651e.zzb();
            ft0Var.i(8);
            ft0Var.b(zzlVar.zzp);
            ft0Var.f(zzlVar.zzm);
        }
        ft0 ft0Var2 = ft0Var;
        ((wr0) ((zy) ((gy) this.f9186b)).I.zzb()).c(1);
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((zy) ((gy) this.f9186b)).f11344e.zzb();
        f30 f30Var = (f30) uyVar.f9676q0.zzb();
        ts0 ts0VarA = f30Var.a(f30Var.b());
        w20 w20Var = new w20(muVar, scheduledExecutorService, ts0VarA);
        this.f9190q = w20Var;
        tc1.u0(ts0VarA, new m20(w20Var, new qp0(this, pl0Var, ft0Var2, bt0VarS, uyVar, 5), 16, i10), muVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final Object c() {
        x30 x30Var;
        synchronized (this) {
            x30Var = (x30) this.f9189h;
        }
        return x30Var;
    }

    public final ts0 d() {
        Object obj = this.f9185a;
        String str = (String) this.f9186b;
        if (str == null) {
            ((xs0) ((us0) this.f9190q)).getClass();
            str = ((ws0) obj).f10341a;
        }
        ts0 ts0Var = new ts0(obj, str, (n5.a) this.f9189h);
        e70 e70Var = (e70) ((us0) this.f9190q).f9606c;
        e70Var.getClass();
        e70Var.I0(new jp0(28, ts0Var));
        n5.a aVar = (n5.a) this.f9187d;
        vh0 vh0Var = new vh0(this, 8, ts0Var);
        mu muVar = nu.f7388f;
        aVar.a(vh0Var, muVar);
        tc1.u0(ts0Var, new cj0(this, ts0Var, 4), muVar);
        return ts0Var;
    }

    public final void f(int i10) {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f9185a = Integer.valueOf(i10);
    }

    public final tl0 g(ws0 ws0Var) {
        return ((us0) this.f9190q).b(d(), ws0Var);
    }

    public final void h(int i10) {
        if (i10 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i10)));
        }
        this.f9186b = Integer.valueOf(i10);
    }

    public final void i(int i10) {
        if (i10 < 12 || i10 > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i10)));
        }
        this.f9187d = Integer.valueOf(i10);
    }

    public final tl0 j(rs0 rs0Var) {
        return l(new if0(18, rs0Var));
    }

    public final void k(int i10) {
        if (i10 < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
        }
        this.f9188f = Integer.valueOf(i10);
    }

    public final tl0 l(y11 y11Var) {
        return m(y11Var, ((us0) this.f9190q).f9604a);
    }

    public final tl0 m(y11 y11Var, p21 p21Var) {
        return new tl0((us0) this.f9190q, this.f9185a, (String) this.f9186b, (n5.a) this.f9187d, (List) this.f9188f, tc1.q0((n5.a) this.f9189h, y11Var, p21Var));
    }

    public final b41 n() {
        if (((Integer) this.f9185a) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (((Integer) this.f9186b) == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (((Integer) this.f9187d) == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = (Integer) this.f9188f;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((z31) this.f9189h) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((a41) this.f9190q) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        int iIntValue = num.intValue();
        z31 z31Var = (z31) this.f9189h;
        if (z31Var == z31.f11100b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(iIntValue)));
            }
        } else if (z31Var == z31.f11101c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(iIntValue)));
            }
        } else if (z31Var == z31.f11102d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(iIntValue)));
            }
        } else if (z31Var == z31.f11103e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(iIntValue)));
            }
        } else {
            if (z31Var != z31.f11104f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(iIntValue)));
            }
        }
        return new b41(((Integer) this.f9185a).intValue(), ((Integer) this.f9186b).intValue(), ((Integer) this.f9187d).intValue(), ((Integer) this.f9188f).intValue(), (a41) this.f9190q, (z31) this.f9189h);
    }

    public final n5.a o(es0 es0Var, cj0 cj0Var) {
        x30 x30Var = es0Var.f4285a;
        this.f9189h = x30Var;
        if (es0Var.f4287c != null) {
            if (x30Var.zzf() != null) {
                es0Var.f4287c.f8361e.b(es0Var.f4285a.zzf());
            }
            return tc1.d0(es0Var.f4287c);
        }
        x30Var.zzb().f4373g = es0Var.f4286b;
        return ((hq0) ((nq0) this.f9185a)).b(cj0Var, null, es0Var.f4285a);
    }

    public final y01 p(zzbvb zzbvbVar, zf0 zf0Var, zf0 zf0Var2, y11 y11Var) {
        String str = zzbvbVar.f11577f;
        zzu.zzp();
        return tc1.V(tc1.q0(tc1.q0(h21.r(zzt.zzC(str) ? tc1.Z(new zzdyp(1)) : tc1.V(zf0Var.n(zzbvbVar), ExecutionException.class, new f00(7), (p21) this.f9185a)), new f00(6), (p21) this.f9185a), y11Var, (p21) this.f9185a), zzdyp.class, new hn(this, zf0Var2, zzbvbVar, y11Var, 2), (p21) this.f9185a);
    }

    public final tl0 q(long j10, TimeUnit timeUnit) {
        return new tl0((us0) this.f9190q, this.f9185a, (String) this.f9186b, (n5.a) this.f9187d, (List) this.f9188f, tc1.r0((n5.a) this.f9189h, j10, timeUnit, ((us0) this.f9190q).f9605b));
    }

    @Override // com.google.android.gms.internal.ads.ql0
    public final boolean zza() {
        w20 w20Var = (w20) this.f9190q;
        return w20Var != null && w20Var.f10036c;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if (((AtomicBoolean) this.f9190q).get()) {
            ((j40) this.f9185a).onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (((AtomicBoolean) this.f9190q).get()) {
            ((v40) this.f9186b).zza();
            ((r70) this.f9187d).zza();
        }
    }

    public tl0(hq0 hq0Var, eq0 eq0Var, ms0 ms0Var, String str, mu muVar) {
        this.f9185a = hq0Var;
        this.f9186b = eq0Var;
        this.f9187d = ms0Var;
        this.f9188f = str;
        this.f9190q = muVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    /* JADX INFO: renamed from: zza */
    public final synchronized void mo8zza(View view) {
        if (((AtomicBoolean) this.f9190q).compareAndSet(false, true)) {
            ((y00) this.f9189h).zzr();
            ((o70) this.f9188f).J0(view);
        }
    }

    public tl0(us0 us0Var, Object obj, String str, n5.a aVar, List list, n5.a aVar2) {
        this.f9190q = us0Var;
        this.f9185a = obj;
        this.f9186b = str;
        this.f9187d = aVar;
        this.f9188f = list;
        this.f9189h = aVar2;
    }

    public /* synthetic */ tl0(String str) {
        this.f9186b = str;
    }
}
