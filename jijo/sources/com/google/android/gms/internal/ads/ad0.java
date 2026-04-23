package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzay;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ad0 implements u50, e50, n40, v70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cd0 f2661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hd0 f2662b;

    public ad0(cd0 cd0Var, hd0 hd0Var) {
        this.f2661a = cd0Var;
        this.f2662b = hd0Var;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void J(zzbvb zzbvbVar) {
        this.f2661a.b(zzbvbVar.f11574a);
    }

    public final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j10 = bundle.getLong(str);
            if (j10 >= 0) {
                this.f2661a.a(str, String.valueOf(j10));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void b(kr0 kr0Var) {
        cd0 cd0Var = this.f2661a;
        cd0Var.getClass();
        boolean zIsEmpty = ((List) kr0Var.f6383b.f10630b).isEmpty();
        xq xqVar = kr0Var.f6383b;
        if (!zIsEmpty) {
            fr0 fr0Var = (fr0) ((List) xqVar.f10630b).get(0);
            cd0Var.a("ad_format", fr0.a(fr0Var.f4602b));
            if (fr0Var.f4602b == 6) {
                cd0Var.f3253a.put("as", true != cd0Var.f3254b.f6087g ? "0" : "1");
            }
        }
        cd0Var.a("gqi", ((hr0) xqVar.f10631d).f5371b);
    }

    public final void c(Bundle bundle, wz0 wz0Var) {
        if (!((Boolean) zzba.zzc().a(eg.S1)).booleanValue() || bundle == null) {
            return;
        }
        ((y3.b) zzu.zzB()).getClass();
        bundle.putLong("public-api-callback", System.currentTimeMillis());
        String str = true != bundle.getBoolean("ls") ? "0" : "1";
        cd0 cd0Var = this.f2661a;
        cd0Var.a("ls", str);
        int i10 = wz0Var.f10384f;
        for (int i11 = 0; i11 < i10; i11++) {
            bd0 bd0Var = (bd0) wz0Var.get(i11);
            long j10 = bundle.getLong(g1.a.j(bd0Var.f2995b), -1L);
            long j11 = bundle.getLong(g1.a.j(bd0Var.f2996c), -1L);
            if (j10 > 0 && j11 > 0) {
                cd0Var.a(bd0Var.f2994a, String.valueOf(j11 - j10));
            }
        }
        a(bundle.getBundle("client_sig_latency_key"));
        a(bundle.getBundle("gms_sig_latency_key"));
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final void t(zze zzeVar) {
        cd0 cd0Var = this.f2661a;
        cd0Var.f3253a.put("action", "ftl");
        cd0Var.a("ftl", String.valueOf(zzeVar.zza));
        cd0Var.a("ed", zzeVar.zzc);
        this.f2662b.a(cd0Var.f3253a, false);
    }

    @Override // com.google.android.gms.internal.ads.v70
    public final void zze(zzay zzayVar) {
        String str;
        if (((Boolean) zzba.zzc().a(eg.f4091o6)).booleanValue()) {
            hd0 hd0Var = this.f2662b;
            cd0 cd0Var = this.f2661a;
            if (zzayVar == null) {
                cd0Var.f3253a.put("action", "sgs");
                ConcurrentHashMap concurrentHashMap = cd0Var.f3253a;
                concurrentHashMap.put("request_id", "-1");
                hd0Var.a(concurrentHashMap, false);
                return;
            }
            zzbvb zzbvbVar = zzayVar.zzc;
            if (zzbvbVar != null) {
                c(zzbvbVar.f11586y, bd0.f2992d);
            }
            try {
                JSONObject jSONObject = new JSONObject(zzayVar.zzb);
                cd0Var.f3253a.put("action", "sgs");
                ConcurrentHashMap concurrentHashMap2 = cd0Var.f3253a;
                if (((Boolean) zzba.zzc().a(eg.M8)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e10) {
                        zzm.zzh("Error retrieving JSONObject from the requestJson, ", e10);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                concurrentHashMap2.put("tpc", str);
                zzbvb zzbvbVar2 = zzayVar.zzc;
                if (zzbvbVar2 != null) {
                    cd0Var.b(zzbvbVar2.f11574a);
                }
                hd0Var.a(concurrentHashMap2, false);
            } catch (JSONException unused) {
                cd0Var.f3253a.put("action", "sgf");
                ConcurrentHashMap concurrentHashMap3 = cd0Var.f3253a;
                concurrentHashMap3.put("sgf_reason", "request_invalid");
                hd0Var.a(concurrentHashMap3, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.v70
    public final void zzf(String str) {
        if (((Boolean) zzba.zzc().a(eg.f4091o6)).booleanValue()) {
            cd0 cd0Var = this.f2661a;
            cd0Var.f3253a.put("action", "sgf");
            cd0Var.a("sgf_reason", str);
            this.f2662b.a(cd0Var.f3253a, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final void zzs() {
        cd0 cd0Var = this.f2661a;
        cd0Var.f3253a.put("action", "loaded");
        c(cd0Var.f3255c, bd0.f2993e);
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.Gb)).booleanValue();
        ConcurrentHashMap concurrentHashMap = cd0Var.f3253a;
        if (zBooleanValue) {
            concurrentHashMap.put("mafe", true != b7.u.t("MUTE_AUDIO") ? "0" : "1");
        }
        this.f2662b.a(concurrentHashMap, false);
    }
}
