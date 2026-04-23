package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sb0 implements wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8837a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8838b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8839d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f8840f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f8841h;

    public /* synthetic */ sb0(q70 q70Var, n00 n00Var, vt0 vt0Var, lh0 lh0Var) {
        this.f8838b = q70Var;
        this.f8839d = n00Var;
        this.f8840f = vt0Var;
        this.f8841h = lh0Var;
    }

    @Override // com.google.android.gms.internal.ads.wk
    public final void b(Object obj, Map map) {
        int i10 = this.f8837a;
        Object obj2 = this.f8839d;
        Object obj3 = this.f8840f;
        Object obj4 = this.f8841h;
        Object obj5 = this.f8838b;
        switch (i10) {
            case 0:
                Object obj6 = ((WeakReference) obj5).get();
                if (obj6 != null) {
                    ((wk) obj3).b(obj6, map);
                } else {
                    ((tb0) obj4).d((String) obj2, this);
                }
                break;
            default:
                fx fxVar = (fx) obj;
                vk.b(map, (q70) obj5);
                String str = (String) map.get("u");
                if (str != null) {
                    n00 n00Var = (n00) obj2;
                    tc1.u0(vk.a(fxVar, str), new xq(fxVar, n00Var, (vt0) obj3, (lh0) obj4, 21), nu.f7383a);
                } else {
                    zzm.zzj("URL missing from click GMSG.");
                }
                break;
        }
    }

    public /* synthetic */ sb0(tb0 tb0Var, WeakReference weakReference, String str, wk wkVar) {
        this.f8841h = tb0Var;
        this.f8838b = weakReference;
        this.f8839d = str;
        this.f8840f = wkVar;
    }
}
