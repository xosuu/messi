package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6091a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f6092b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6093d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6094f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6095h;

    public jw(lw lwVar, String str, String str2, long j10) {
        this.f6093d = str;
        this.f6094f = str2;
        this.f6092b = j10;
        this.f6095h = lwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6091a) {
            case 0:
                HashMap map = new HashMap();
                map.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
                map.put("src", (String) this.f6093d);
                map.put("cachedSrc", (String) this.f6094f);
                map.put("totalDuration", Long.toString(this.f6092b));
                lw.j((lw) this.f6095h, map);
                return;
            default:
                uo0 uo0Var = (uo0) this.f6093d;
                long j10 = this.f6092b;
                to0 to0Var = (to0) this.f6094f;
                Bundle bundle = (Bundle) this.f6095h;
                uo0Var.getClass();
                ((y3.b) zzu.zzB()).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
                if (((Boolean) nh.f7263a.k()).booleanValue()) {
                    String canonicalName = to0Var.getClass().getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    zze.zza("Signal runtime (ms) : " + canonicalName + " = " + jElapsedRealtime);
                }
                if (((Boolean) zzba.zzc().a(eg.S1)).booleanValue()) {
                    if (((Boolean) zzba.zzc().a(eg.T1)).booleanValue()) {
                        synchronized (uo0Var) {
                            bundle.putLong("sig" + to0Var.zza(), jElapsedRealtime);
                        }
                    }
                    break;
                }
                if (((Boolean) zzba.zzc().a(eg.Q1)).booleanValue()) {
                    m20 m20VarA = uo0Var.f9551e.a();
                    m20VarA.f("action", "lat_ms");
                    m20VarA.f("lat_grp", "sig_lat_grp");
                    m20VarA.f("lat_id", String.valueOf(to0Var.zza()));
                    m20VarA.f("clat_ms", String.valueOf(jElapsedRealtime));
                    if (((Boolean) zzba.zzc().a(eg.R1)).booleanValue()) {
                        synchronized (uo0Var) {
                            uo0Var.f9553g++;
                            break;
                        }
                        m20VarA.f("seq_num", zzu.zzo().f5056c.f6083c.a());
                        synchronized (uo0Var) {
                            try {
                                if (uo0Var.f9553g == uo0Var.f9548b.size() && uo0Var.f9552f != 0) {
                                    uo0Var.f9553g = 0;
                                    ((y3.b) zzu.zzB()).getClass();
                                    String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - uo0Var.f9552f);
                                    if (to0Var.zza() <= 39 || to0Var.zza() >= 52) {
                                        m20VarA.f("lat_clsg", strValueOf);
                                    } else {
                                        m20VarA.f("lat_gmssg", strValueOf);
                                    }
                                }
                            } finally {
                            }
                            break;
                        }
                    }
                    ((ed0) m20VarA.f6810d).f3908b.execute(new dd0(m20VarA, 1));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ jw(uo0 uo0Var, long j10, to0 to0Var, Bundle bundle) {
        this.f6093d = uo0Var;
        this.f6092b = j10;
        this.f6094f = to0Var;
        this.f6095h = bundle;
    }
}
