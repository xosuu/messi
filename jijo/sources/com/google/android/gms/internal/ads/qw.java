package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class qw extends lw implements iv {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public yw f8299f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f8300h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8301q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public dw f8303t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f8304u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f8305v;

    public static String u(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final void c() {
        zzm.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final void d(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final void e(int i10, int i11) {
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final void f(long j10, boolean z9) {
        pv pvVar = (pv) this.f6708d.get();
        if (pvVar != null) {
            nu.f7387e.execute(new uv(pvVar, z9, j10, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final void g(Exception exc) {
        zzm.zzk("Precache exception", exc);
        zzu.zzo().h("VideoStreamExoPlayerCache.onException", exc);
    }

    @Override // com.google.android.gms.internal.ads.iv
    public final void h(String str, Exception exc) {
        zzm.zzk("Precache error", exc);
        zzu.zzo().h("VideoStreamExoPlayerCache.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void i() {
        yw ywVar = this.f8299f;
        if (ywVar != null) {
            ywVar.f11061v = null;
            bk1 bk1Var = ywVar.f11058s;
            if (bk1Var != null) {
                bk1Var.c(ywVar);
                ywVar.f11058s.n();
                ywVar.f11058s = null;
                yw.H.decrementAndGet();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void k() {
        synchronized (this) {
            this.f8301q = true;
            notify();
            i();
        }
        String str = this.f8300h;
        if (str != null) {
            l(this.f8300h, "cache:".concat(String.valueOf(zzf.zzf(str))), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void n(int i10) {
        tw twVar = this.f8299f.f11053b;
        synchronized (twVar) {
            twVar.f9293d = ((long) i10) * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void o(int i10) {
        tw twVar = this.f8299f.f11053b;
        synchronized (twVar) {
            twVar.f9294e = ((long) i10) * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void p(int i10) {
        tw twVar = this.f8299f.f11053b;
        synchronized (twVar) {
            twVar.f9292c = ((long) i10) * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void q(int i10) {
        tw twVar = this.f8299f.f11053b;
        synchronized (twVar) {
            twVar.f9291b = ((long) i10) * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final boolean r(String str) {
        return s(str, new String[]{str});
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0169, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new com.google.android.gms.internal.ads.jw(r44, r45, r31, r24));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.pv] */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.android.gms.internal.ads.lw, com.google.android.gms.internal.ads.qw] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.gms.internal.ads.qw] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.ads.lw] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // com.google.android.gms.internal.ads.lw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s(java.lang.String r45, java.lang.String[] r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qw.s(java.lang.String, java.lang.String[]):boolean");
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final boolean t(String str, String[] strArr, dw dwVar) {
        this.f8300h = str;
        this.f8303t = dwVar;
        String strConcat = "cache:".concat(String.valueOf(zzf.zzf(str)));
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            yw ywVar = this.f8299f;
            ywVar.getClass();
            ywVar.r(uriArr, ByteBuffer.allocate(0), false);
            pv pvVar = (pv) this.f6708d.get();
            if (pvVar != null) {
                pvVar.f(strConcat, this);
            }
            ((y3.b) zzu.zzB()).getClass();
            this.f8304u = System.currentTimeMillis();
            this.f8305v = -1L;
            zzt.zza.postDelayed(new s9(14, this), 0L);
            return true;
        } catch (Exception e10) {
            zzm.zzj("Failed to preload url " + str + " Exception: " + e10.getMessage());
            zzu.zzo().h("VideoStreamExoPlayerCache.preload", e10);
            i();
            l(str, strConcat, "error", u("error", e10));
            return false;
        }
    }
}
