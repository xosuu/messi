package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wm0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10233c;

    public /* synthetic */ wm0(Object obj, int i10, Object obj2) {
        this.f10231a = i10;
        this.f10232b = obj;
        this.f10233c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final void a(Object obj) {
        switch (this.f10231a) {
            case 0:
                xm0 xm0Var = (xm0) this.f10232b;
                Bundle bundle = (Bundle) this.f10233c;
                Bundle bundle2 = (Bundle) obj;
                xm0Var.getClass();
                if (!((Boolean) zzba.zzc().a(eg.X4)).booleanValue()) {
                    if (((Boolean) zzba.zzc().a(eg.W4)).booleanValue()) {
                        synchronized (xm0.f10607k) {
                            xm0Var.f10612e.a(xm0Var.f10614g.f7644d);
                            bundle2.putBundle("quality_signals", xm0Var.f10613f.a());
                        }
                    } else {
                        xm0Var.f10612e.a(xm0Var.f10614g.f7644d);
                        bundle2.putBundle("quality_signals", xm0Var.f10613f.a());
                    }
                    break;
                } else {
                    bundle2.putBundle("quality_signals", bundle);
                }
                bundle2.putString("seq_num", xm0Var.f10609b);
                if (!xm0Var.f10615h.zzS()) {
                    bundle2.putString("session_id", xm0Var.f10610c);
                }
                bundle2.putBoolean("client_purpose_one", !xm0Var.f10615h.zzS());
                if (((Boolean) zzba.zzc().a(eg.Y4)).booleanValue()) {
                    try {
                        zzu.zzp();
                        bundle2.putString("_app_id", zzt.zzp(xm0Var.f10608a));
                    } catch (RemoteException | RuntimeException e10) {
                        zzu.zzo().i("AppStatsSignal_AppId", e10);
                    }
                    break;
                }
                if (((Boolean) zzba.zzc().a(eg.Z4)).booleanValue() && xm0Var.f10614g.f7646f != null) {
                    Bundle bundle3 = new Bundle();
                    Long l9 = (Long) xm0Var.f10617j.f6166d.get(xm0Var.f10614g.f7646f);
                    bundle3.putLong("dload", l9 == null ? -1L : l9.longValue());
                    Integer num = (Integer) xm0Var.f10617j.f6164b.get(xm0Var.f10614g.f7646f);
                    bundle3.putInt("pcc", num == null ? 0 : num.intValue());
                    bundle2.putBundle("ad_unit_quality_signals", bundle3);
                }
                if (!((Boolean) zzba.zzc().a(eg.Q8)).booleanValue() || zzu.zzo().f5064k.get() <= 0) {
                    return;
                }
                bundle2.putInt("nrwv", zzu.zzo().f5064k.get());
                return;
            case 1:
                JSONObject jSONObject = (JSONObject) this.f10232b;
                Bundle bundle4 = (Bundle) obj;
                if (jSONObject != null) {
                    bundle4.putString("fwd_cld", jSONObject.toString());
                }
                JSONObject jSONObject2 = (JSONObject) this.f10233c;
                if (jSONObject2 != null) {
                    bundle4.putString("fwd_common_cld", jSONObject2.toString());
                    return;
                }
                return;
            default:
                Bundle bundle5 = (Bundle) obj;
                bundle5.putString("rtb", (String) this.f10232b);
                Bundle bundle6 = (Bundle) this.f10233c;
                if (bundle6.isEmpty()) {
                    return;
                }
                bundle5.putBundle("adapter_initialization_status", bundle6);
                return;
        }
    }
}
