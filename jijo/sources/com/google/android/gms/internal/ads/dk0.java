package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class dk0 implements ei0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rc0 f3689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3690c;

    public dk0(xk0 xk0Var, rc0 rc0Var) {
        this.f3688a = 1;
        this.f3690c = xk0Var;
        this.f3689b = rc0Var;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final fi0 a(JSONObject jSONObject, String str) {
        fi0 fi0Var;
        bp bpVarA;
        switch (this.f3688a) {
            case 0:
                synchronized (this) {
                    try {
                        fi0Var = (fi0) ((Map) this.f3690c).get(str);
                        if (fi0Var == null) {
                            fi0Var = new fi0(this.f3689b.b(jSONObject, str), new aj0(), str);
                            ((Map) this.f3690c).put(str, fi0Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return fi0Var;
            default:
                if (((Boolean) zzba.zzc().a(eg.f4144u1)).booleanValue()) {
                    try {
                        bpVarA = this.f3689b.a(str);
                    } catch (RemoteException e10) {
                        zzm.zzh("Coundn't create RTB adapter: ", e10);
                    }
                    break;
                } else {
                    ConcurrentHashMap concurrentHashMap = ((xk0) this.f3690c).f10596a;
                    bpVarA = concurrentHashMap.containsKey(str) ? (bp) concurrentHashMap.get(str) : null;
                }
                if (bpVarA == null) {
                    return null;
                }
                return new fi0(bpVarA, new zi0(), str);
        }
    }

    public dk0(rc0 rc0Var) {
        this.f3688a = 0;
        this.f3690c = new HashMap();
        this.f3689b = rc0Var;
    }
}
