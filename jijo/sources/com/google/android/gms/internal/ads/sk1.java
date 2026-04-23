package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class sk1 implements fk1, tk1 {
    public xg A;
    public xg B;
    public xg C;
    public y1 D;
    public y1 E;
    public y1 F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pk1 f8905b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PlaybackSession f8906d;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f8912u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PlaybackMetrics.Builder f8913v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8914w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public zzbp f8917z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hv f8908h = new hv();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vu f8909q = new vu();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f8911t = new HashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap f8910s = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8907f = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8915x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8916y = 0;

    public sk1(Context context, PlaybackSession playbackSession) {
        this.f8904a = context.getApplicationContext();
        this.f8906d = playbackSession;
        pk1 pk1Var = new pk1();
        this.f8905b = pk1Var;
        pk1Var.f7909d = this;
    }

    public final void a(ek1 ek1Var, String str) {
        jo1 jo1Var = ek1Var.f4225d;
        if ((jo1Var == null || !jo1Var.b()) && str.equals(this.f8912u)) {
            b();
        }
        this.f8910s.remove(str);
        this.f8911t.remove(str);
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.f8913v;
        if (builder != null && this.L) {
            builder.setAudioUnderrunCount(this.K);
            this.f8913v.setVideoFramesDropped(this.I);
            this.f8913v.setVideoFramesPlayed(this.J);
            Long l9 = (Long) this.f8910s.get(this.f8912u);
            this.f8913v.setNetworkTransferDurationMillis(l9 == null ? 0L : l9.longValue());
            Long l10 = (Long) this.f8911t.get(this.f8912u);
            this.f8913v.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.f8913v.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            this.f8906d.reportPlaybackMetrics(this.f8913v.build());
        }
        this.f8913v = null;
        this.f8912u = null;
        this.K = 0;
        this.I = 0;
        this.J = 0;
        this.D = null;
        this.E = null;
        this.F = null;
        this.L = false;
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final void c(ek1 ek1Var, int i10, long j10) {
        jo1 jo1Var = ek1Var.f4225d;
        if (jo1Var != null) {
            HashMap map = this.f8911t;
            String strA = this.f8905b.a(ek1Var.f4223b, jo1Var);
            Long l9 = (Long) map.get(strA);
            HashMap map2 = this.f8910s;
            Long l10 = (Long) map2.get(strA);
            map.put(strA, Long.valueOf((l9 == null ? 0L : l9.longValue()) + j10));
            map2.put(strA, Long.valueOf((l10 != null ? l10.longValue() : 0L) + ((long) i10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final /* synthetic */ void d(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final void e(ek1 ek1Var, gk1 gk1Var) {
        jo1 jo1Var = ek1Var.f4225d;
        if (jo1Var == null) {
            return;
        }
        y1 y1Var = (y1) gk1Var.f4945f;
        y1Var.getClass();
        xg xgVar = new xg(y1Var, this.f8905b.a(ek1Var.f4223b, jo1Var));
        int i10 = gk1Var.f4942a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.B = xgVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.C = xgVar;
                return;
            }
        }
        this.A = xgVar;
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final /* synthetic */ void f(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final /* synthetic */ void g(y1 y1Var) {
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final void h(zzbp zzbpVar) {
        this.f8917z = zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final void i(IOException iOException) {
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final /* synthetic */ void j(y1 y1Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01d7 A[PHI: r2
      0x01d7: PHI (r2v57 int) = (r2v38 int), (r2v90 int) binds: [B:192:0x02e2, B:114:0x01d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01da A[PHI: r2
      0x01da: PHI (r2v56 int) = (r2v38 int), (r2v90 int) binds: [B:192:0x02e2, B:114:0x01d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01dd A[PHI: r2
      0x01dd: PHI (r2v55 int) = (r2v38 int), (r2v90 int) binds: [B:192:0x02e2, B:114:0x01d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e0 A[PHI: r2
      0x01e0: PHI (r2v54 int) = (r2v38 int), (r2v90 int) binds: [B:192:0x02e2, B:114:0x01d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0284  */
    @Override // com.google.android.gms.internal.ads.fk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(com.google.android.gms.internal.ads.is r26, com.google.android.gms.internal.ads.cj0 r27) {
        /*
            Method dump skipped, instruction units count: 1346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sk1.k(com.google.android.gms.internal.ads.is, com.google.android.gms.internal.ads.cj0):void");
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final void l(wh1 wh1Var) {
        this.I += wh1Var.f10190g;
        this.J += wh1Var.f10188e;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(com.google.android.gms.internal.ads.wv r10, com.google.android.gms.internal.ads.jo1 r11) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sk1.m(com.google.android.gms.internal.ads.wv, com.google.android.gms.internal.ads.jo1):void");
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final void n(e10 e10Var) {
        xg xgVar = this.A;
        if (xgVar != null) {
            y1 y1Var = (y1) xgVar.f10550f;
            if (y1Var.f10720s == -1) {
                q0 q0Var = new q0(y1Var);
                q0Var.f8057q = e10Var.f3802a;
                q0Var.f8058r = e10Var.f3803b;
                this.A = new xg(new y1(q0Var), (String) xgVar.f10549d);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final void o(int i10) {
        if (i10 == 1) {
            this.G = true;
            i10 = 1;
        }
        this.f8914w = i10;
    }

    @Override // com.google.android.gms.internal.ads.fk1
    public final /* synthetic */ void p() {
    }

    public final void q(int i10, long j10, y1 y1Var, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = qk1.g(i10).setTimeSinceCreatedMillis(j10 - this.f8907f);
        if (y1Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i11 != 1 ? 1 : 2);
            String str = y1Var.f10713l;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = y1Var.f10714m;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = y1Var.f10711j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = y1Var.f10710i;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = y1Var.f10719r;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = y1Var.f10720s;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = y1Var.f10727z;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = y1Var.A;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = y1Var.f10705d;
            if (str4 != null) {
                int i17 = yn0.f10944a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = y1Var.f10721t;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.L = true;
        this.f8906d.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    public final boolean r(xg xgVar) {
        String str;
        if (xgVar == null) {
            return false;
        }
        pk1 pk1Var = this.f8905b;
        String str2 = (String) xgVar.f10549d;
        synchronized (pk1Var) {
            str = pk1Var.f7911f;
        }
        return str2.equals(str);
    }
}
