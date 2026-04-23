package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzq;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class yc0 implements h60, zza, w40, o40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sr0 f10839b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ed0 f10840d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kr0 f10841f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fr0 f10842h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lh0 f10843q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f10844s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Boolean f10845t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f10846u = ((Boolean) zzba.zzc().a(eg.f4007g6)).booleanValue();

    public yc0(Context context, sr0 sr0Var, ed0 ed0Var, kr0 kr0Var, fr0 fr0Var, lh0 lh0Var, String str) {
        this.f10838a = context;
        this.f10839b = sr0Var;
        this.f10840d = ed0Var;
        this.f10841f = kr0Var;
        this.f10842h = fr0Var;
        this.f10843q = lh0Var;
        this.f10844s = str;
    }

    @Override // com.google.android.gms.internal.ads.o40
    public final void O(zzdgw zzdgwVar) {
        if (this.f10846u) {
            m20 m20VarA = a("ifts");
            m20VarA.f("reason", "exception");
            if (!TextUtils.isEmpty(zzdgwVar.getMessage())) {
                m20VarA.f(NotificationCompat.CATEGORY_MESSAGE, zzdgwVar.getMessage());
            }
            m20VarA.h();
        }
    }

    public final m20 a(String str) {
        m20 m20VarA = this.f10840d.a();
        kr0 kr0Var = this.f10841f;
        m20VarA.f("gqi", ((hr0) kr0Var.f6383b.f10631d).f5371b);
        fr0 fr0Var = this.f10842h;
        m20VarA.f("aai", fr0Var.f4644w);
        m20VarA.f("request_id", fr0Var.f4627n0);
        m20VarA.f("ad_format", fr0.a(fr0Var.f4602b));
        m20VarA.f("action", str);
        m20VarA.f("ad_format", this.f10844s.toUpperCase(Locale.ROOT));
        List list = fr0Var.f4638t;
        if (!list.isEmpty()) {
            m20VarA.f("ancn", (String) list.get(0));
        }
        if (fr0Var.f4617i0) {
            m20VarA.f("device_connectivity", true != zzu.zzo().a(this.f10838a) ? "offline" : "online");
            ((y3.b) zzu.zzB()).getClass();
            m20VarA.f("event_timestamp", String.valueOf(System.currentTimeMillis()));
            m20VarA.f("offline_ad", "1");
        }
        if (((Boolean) zzba.zzc().a(eg.f4091o6)).booleanValue()) {
            jp0 jp0Var = kr0Var.f6382a;
            boolean z9 = zzq.zzf((or0) jp0Var.f6060b) != 1;
            m20VarA.f("scar", String.valueOf(z9));
            if (z9) {
                zzl zzlVar = ((or0) jp0Var.f6060b).f7644d;
                m20VarA.f("ragent", zzlVar.zzp);
                m20VarA.f("rtype", zzq.zzb(zzq.zzc(zzlVar)));
            }
        }
        return m20VarA;
    }

    public final void b(m20 m20Var) {
        if (!this.f10842h.f4617i0) {
            m20Var.h();
            return;
        }
        hd0 hd0Var = ((ed0) m20Var.f6810d).f3907a;
        String strGenerateUrl = hd0Var.f5573f.generateUrl((Map) m20Var.f6809b);
        ((y3.b) zzu.zzB()).getClass();
        this.f10843q.c(new s7(System.currentTimeMillis(), ((hr0) this.f10841f.f6383b.f10631d).f5371b, strGenerateUrl, 2));
    }

    public final boolean h() {
        String strZzp;
        if (this.f10845t == null) {
            synchronized (this) {
                if (this.f10845t == null) {
                    String str = (String) zzba.zzc().a(eg.f4035j1);
                    zzu.zzp();
                    try {
                        strZzp = zzt.zzp(this.f10838a);
                    } catch (RemoteException unused) {
                        strZzp = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strZzp != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzp);
                        } catch (RuntimeException e10) {
                            zzu.zzo().i("CsiActionsListener.isPatternMatched", e10);
                        }
                    }
                    this.f10845t = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f10845t.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // com.google.android.gms.internal.ads.o40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(com.google.android.gms.ads.internal.client.zze r6) {
        /*
            r5 = this;
            boolean r0 = r5.f10846u
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "ifts"
            com.google.android.gms.internal.ads.m20 r0 = r5.a(r0)
            java.lang.String r1 = "reason"
            java.lang.String r2 = "adapter"
            r0.f(r1, r2)
            int r1 = r6.zza
            java.lang.String r2 = r6.zzb
            java.lang.String r3 = r6.zzc
            java.lang.String r4 = "com.google.android.gms.ads"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L32
            com.google.android.gms.ads.internal.client.zze r3 = r6.zzd
            if (r3 == 0) goto L32
            java.lang.String r3 = r3.zzc
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L32
            com.google.android.gms.ads.internal.client.zze r6 = r6.zzd
            int r1 = r6.zza
            java.lang.String r2 = r6.zzb
        L32:
            if (r1 < 0) goto L3d
            java.lang.String r6 = "arec"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.f(r6, r1)
        L3d:
            com.google.android.gms.internal.ads.sr0 r6 = r5.f10839b
            java.util.regex.Pattern r6 = r6.f8967a
            if (r6 == 0) goto L55
            if (r2 != 0) goto L46
            goto L55
        L46:
            java.util.regex.Matcher r6 = r6.matcher(r2)
            boolean r1 = r6.find()
            if (r1 == 0) goto L55
            java.lang.String r6 = r6.group()
            goto L56
        L55:
            r6 = 0
        L56:
            if (r6 == 0) goto L5d
            java.lang.String r1 = "areec"
            r0.f(r1, r6)
        L5d:
            r0.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yc0.j(com.google.android.gms.ads.internal.client.zze):void");
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.f10842h.f4617i0) {
            b(a("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.o40
    public final void zzb() {
        if (this.f10846u) {
            m20 m20VarA = a("ifts");
            m20VarA.f("reason", "blocked");
            m20VarA.h();
        }
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final void zzi() {
        if (h()) {
            a("adapter_shown").h();
        }
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final void zzj() {
        if (h()) {
            a("adapter_impression").h();
        }
    }

    @Override // com.google.android.gms.internal.ads.w40
    public final void zzr() {
        if (h() || this.f10842h.f4617i0) {
            b(a("impression"));
        }
    }
}
