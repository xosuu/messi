package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbe;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zzbh;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class qv {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f8281r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VersionInfoParcel f8284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jg f8285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lg f8286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzbh f8287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f8288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String[] f8289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8292k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public cv f8295n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8296o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8297p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f8298q;

    static {
        f8281r = zzay.zze().nextInt(100) < ((Integer) zzba.zzc().a(eg.Kb)).intValue();
    }

    public qv(Context context, VersionInfoParcel versionInfoParcel, String str, lg lgVar, jg jgVar) {
        zzbf zzbfVar = new zzbf();
        zzbfVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbfVar.zza("1_5", 1.0d, 5.0d);
        zzbfVar.zza("5_10", 5.0d, 10.0d);
        zzbfVar.zza("10_20", 10.0d, 20.0d);
        zzbfVar.zza("20_30", 20.0d, 30.0d);
        zzbfVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.f8287f = zzbfVar.zzb();
        this.f8290i = false;
        this.f8291j = false;
        this.f8292k = false;
        this.f8293l = false;
        this.f8298q = -1L;
        this.f8282a = context;
        this.f8284c = versionInfoParcel;
        this.f8283b = str;
        this.f8286e = lgVar;
        this.f8285d = jgVar;
        String str2 = (String) zzba.zzc().a(eg.f4142u);
        if (str2 == null) {
            this.f8289h = new String[0];
            this.f8288g = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.f8289h = new String[length];
        this.f8288g = new long[length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            try {
                this.f8288g[i10] = Long.parseLong(strArrSplit[i10]);
            } catch (NumberFormatException e10) {
                zzm.zzk("Unable to parse frame hash target time number.", e10);
                this.f8288g[i10] = -1;
            }
        }
    }

    public final void a() {
        if (!f8281r || this.f8296o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f8283b);
        bundle.putString("player", this.f8295n.r());
        for (zzbe zzbeVar : this.f8287f.zza()) {
            String strValueOf = String.valueOf(zzbeVar.zza);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(zzbeVar.zze));
            String strValueOf2 = String.valueOf(zzbeVar.zza);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(zzbeVar.zzd));
        }
        int i10 = 0;
        while (true) {
            long[] jArr = this.f8288g;
            if (i10 >= jArr.length) {
                zzu.zzp().zzh(this.f8282a, this.f8284c.afmaVersion, "gmob-apps", bundle, true);
                this.f8296o = true;
                return;
            } else {
                String str = this.f8289h[i10];
                if (str != null) {
                    bundle.putString("fh_".concat(Long.valueOf(jArr[i10]).toString()), str);
                }
                i10++;
            }
        }
    }

    public final void b(cv cvVar) {
        if (this.f8292k && !this.f8293l) {
            if (zze.zzc() && !this.f8293l) {
                zze.zza("VideoMetricsMixin first frame");
            }
            y3.c.i(this.f8286e, this.f8285d, "vff2");
            this.f8293l = true;
        }
        ((y3.b) zzu.zzB()).getClass();
        long jNanoTime = System.nanoTime();
        if (this.f8294m && this.f8297p && this.f8298q != -1) {
            this.f8287f.zzb(TimeUnit.SECONDS.toNanos(1L) / (jNanoTime - this.f8298q));
        }
        this.f8297p = this.f8294m;
        this.f8298q = jNanoTime;
        long jLongValue = ((Long) zzba.zzc().a(eg.f4152v)).longValue();
        long j10 = cvVar.j();
        int i10 = 0;
        while (true) {
            String[] strArr = this.f8289h;
            if (i10 >= strArr.length) {
                return;
            }
            if (strArr[i10] == null && jLongValue > Math.abs(j10 - this.f8288g[i10])) {
                int i11 = 8;
                Bitmap bitmap = cvVar.getBitmap(8, 8);
                long j11 = 63;
                long j12 = 0;
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = 0;
                    while (i13 < i11) {
                        int pixel = bitmap.getPixel(i13, i12);
                        j12 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j11);
                        j11--;
                        i13++;
                        i11 = 8;
                    }
                    i12++;
                    i11 = 8;
                }
                strArr[i10] = String.format("%016X", Long.valueOf(j12));
                return;
            }
            i10++;
        }
    }
}
