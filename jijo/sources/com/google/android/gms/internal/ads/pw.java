package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pw extends lw implements va1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f7970f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ov f7971h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7972q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x1 f7973s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k0 f7974t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ByteBuffer f7975u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7976v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f7977w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f7978x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f7979y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f7980z;

    public pw(pv pvVar, ov ovVar) {
        super(pvVar);
        this.f7971h = ovVar;
        this.f7973s = new x1(3);
        this.f7974t = new k0();
        this.f7977w = new Object();
        String strZzr = pvVar.zzr();
        this.f7978x = (String) (strZzr == null ? cx0.f3464a : new kx0(strZzr)).b();
        this.f7979y = pvVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void a(iz0 iz0Var, boolean z9, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void b(hw0 hw0Var, iz0 iz0Var, boolean z9) {
        if (hw0Var instanceof f41) {
            ((ArrayList) this.f7973s.f10400d).add((f41) hw0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.lw
    public final void k() {
        this.f7972q = true;
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void m(iz0 iz0Var, boolean z9) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.lw
    public final boolean r(String str) {
        String str2;
        String str3;
        hw0 hw0Var;
        this.f7970f = str;
        String str4 = "error";
        String strConcat = "cache:".concat(String.valueOf(zzf.zzf(str)));
        try {
            yz yzVar = new yz();
            String str5 = this.f6707b;
            ov ovVar = this.f7971h;
            f41 f41Var = new f41(str5, ovVar.f7674d, ovVar.f7675e, true, yzVar);
            f41Var.a(this);
            hw0 yvVar = f41Var;
            if (this.f7971h.f7679i) {
                yvVar = new yv(this.f6706a, f41Var, this.f7978x, this.f7979y);
            }
            yvVar.g(new iz0(Uri.parse(str), 0L, -1L));
            pv pvVar = (pv) this.f6708d.get();
            if (pvVar != null) {
                pvVar.f(strConcat, this);
            }
            ((y3.b) zzu.zzB()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = ((Long) zzba.zzc().a(eg.f4123s)).longValue();
            long jLongValue2 = ((Long) zzba.zzc().a(eg.f4113r)).longValue();
            this.f7975u = ByteBuffer.allocate(this.f7971h.f7673c);
            int i10 = 8192;
            byte[] bArr = new byte[8192];
            long j10 = jCurrentTimeMillis;
            hw0 hw0Var2 = yvVar;
            while (true) {
                int iB = hw0Var2.b(0, bArr, Math.min(this.f7975u.remaining(), i10));
                str2 = str4;
                if (iB == -1) {
                    this.f7980z = true;
                    zzf.zza.post(new jw(this, str, strConcat, (int) this.f7974t.a(this.f7975u)));
                    break;
                }
                try {
                    synchronized (this.f7977w) {
                        try {
                            boolean z9 = this.f7972q;
                            if (z9) {
                                hw0Var = hw0Var2;
                                str3 = z9;
                            } else {
                                ByteBuffer byteBuffer = this.f7975u;
                                hw0Var = hw0Var2;
                                byteBuffer.put(bArr, 0, iB);
                                str3 = byteBuffer;
                            }
                        } finally {
                        }
                    }
                    if (this.f7975u.remaining() <= 0) {
                        v();
                        break;
                    }
                    try {
                        if (this.f7972q) {
                            throw new IOException("Precache abort at " + this.f7975u.limit() + " bytes");
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (jCurrentTimeMillis2 - j10 >= jLongValue) {
                            v();
                            j10 = jCurrentTimeMillis2;
                        }
                        if (jCurrentTimeMillis2 - jCurrentTimeMillis > 1000 * jLongValue2) {
                            throw new IOException("Timeout exceeded. Limit: " + jLongValue2 + " sec");
                        }
                        str4 = str2;
                        hw0Var2 = hw0Var;
                        i10 = 8192;
                    } catch (Exception e10) {
                        e = e10;
                        String strX = fb1.x(e.getClass().getCanonicalName(), ":", e.getMessage());
                        zzm.zzj("Failed to preload url " + str + " Exception: " + strX);
                        l(str, strConcat, str3, strX);
                        return false;
                    }
                } catch (Exception e11) {
                    e = e11;
                    str3 = str2;
                    String strX2 = fb1.x(e.getClass().getCanonicalName(), ":", e.getMessage());
                    zzm.zzj("Failed to preload url " + str + " Exception: " + strX2);
                    l(str, strConcat, str3, strX2);
                    return false;
                }
            }
            return true;
        } catch (Exception e12) {
            e = e12;
            str2 = str4;
        }
    }

    public final ByteBuffer u() {
        synchronized (this.f7977w) {
            try {
                ByteBuffer byteBuffer = this.f7975u;
                if (byteBuffer != null && !this.f7976v) {
                    byteBuffer.flip();
                    this.f7976v = true;
                }
                this.f7972q = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f7975u;
    }

    public final void v() {
        int iN = (int) this.f7973s.n();
        int iA = (int) this.f7974t.a(this.f7975u);
        int iPosition = this.f7975u.position();
        int iRound = Math.round((iPosition / iN) * iA);
        int i10 = yw.G.get();
        int i11 = yw.H.get();
        String str = this.f7970f;
        zzf.zza.post(new hw(this, str, "cache:".concat(String.valueOf(zzf.zzf(str))), iPosition, iN, iRound, iA, iRound > 0, i10, i11));
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final void zzc() {
    }
}
