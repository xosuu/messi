package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d30 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3559e;

    public /* synthetic */ d30(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f3555a = i10;
        this.f3559e = obj;
        this.f3556b = obj2;
        this.f3557c = obj3;
        this.f3558d = obj4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        Bundle bundle2;
        int i10 = this.f3555a;
        Object obj = this.f3558d;
        Object obj2 = this.f3557c;
        Object obj3 = this.f3556b;
        Object obj4 = this.f3559e;
        switch (i10) {
            case 0:
                f30 f30Var = (f30) obj4;
                f30Var.getClass();
                zzbvb zzbvbVar = (zzbvb) ((n5.a) obj3).get();
                JSONObject jSONObject = (JSONObject) ((n5.a) obj2).get();
                tr trVar = (tr) ((n5.a) obj).get();
                l2.l lVar = f30Var.f4380n;
                ((s50) lVar.f15161a).J(zzbvbVar);
                tl0 tl0VarB = ((xs0) lVar.f15163d).b(tc1.o0(((xs0) lVar.f15163d).b(tc1.d0(new wg0(jSONObject, trVar)), ws0.f10334t).j(new xg0(zzbvbVar.f11580s, (ft0) lVar.f15167s, tc1.d((Context) lVar.f15168t, 9))).d(), new in(lVar, 2, zzbvbVar), (p21) lVar.f15169u), ws0.f10336v);
                xq xqVar = (xq) lVar.f15162b;
                Objects.requireNonNull(xqVar);
                ts0 ts0VarD = tl0VarB.l(new if0(12, xqVar)).d();
                lVar.f15170v = ts0VarD;
                r11 r11VarQ0 = tc1.q0(((xs0) lVar.f15163d).b(ts0VarD, ws0.f10337w).j(new p80(jSONObject, 27, trVar)).l(zzu.zzf().a((Context) lVar.f15168t, (VersionInfoParcel) lVar.f15165h, (gt0) lVar.f15166q).a("google.afma.response.normalize", rg0.f8590d, en.f4245c)).d(), new jn(lVar, 9, zzbvbVar), (p21) lVar.f15169u);
                tc1.u0(r11VarQ0, new aa(15, lVar), (p21) lVar.f15169u);
                return r11VarQ0;
            case 1:
                if (((Boolean) zzba.zzc().a(eg.S1)).booleanValue() && (bundle = ((zzbvb) obj4).f11586y) != null) {
                    ((y3.b) zzu.zzB()).getClass();
                    bundle.putLong("http-response-ready", System.currentTimeMillis());
                }
                return new rg0((vg0) ((n5.a) obj3).get(), (JSONObject) ((n5.a) obj2).get(), (tr) ((n5.a) obj).get());
            default:
                Iterator it = ((List) obj4).iterator();
                while (it.hasNext()) {
                    so0 so0Var = (so0) ((n5.a) it.next()).get();
                    if (so0Var != null) {
                        so0Var.a(obj3);
                    }
                }
                if (((Boolean) zzba.zzc().a(eg.S1)).booleanValue() && (bundle2 = (Bundle) obj2) != null) {
                    Bundle bundle3 = (Bundle) obj;
                    ((y3.b) zzu.zzB()).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (obj3 instanceof Bundle) {
                        bundle2.putLong("client-signals-end", jCurrentTimeMillis);
                        bundle2.putBundle("client_sig_latency_key", bundle3);
                    } else {
                        bundle2.putLong("gms-signals-end", jCurrentTimeMillis);
                        bundle2.putBundle("gms_sig_latency_key", bundle3);
                    }
                }
                return obj3;
        }
    }
}
