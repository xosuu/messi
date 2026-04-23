package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sz implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tz f8996b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f8997d;

    public /* synthetic */ sz(tz tzVar, Runnable runnable, int i10) {
        this.f8995a = i10;
        this.f8996b = tzVar;
        this.f8997d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzffn zzffnVar;
        int i10 = this.f8995a;
        Runnable runnable = this.f8997d;
        tz tzVar = this.f8996b;
        switch (i10) {
            case 0:
                nu.f7387e.execute(new sz(tzVar, runnable, 1));
                return;
            default:
                tzVar.getClass();
                z3.a.j("Adapters must be initialized on the main thread.");
                HashMap map = zzu.zzo().d().zzh().f3442c;
                if (map.isEmpty()) {
                    return;
                }
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        zzm.zzk("Could not initialize rewarded ads.", th);
                        return;
                    }
                    break;
                }
                if (((rn) ((AtomicReference) tzVar.f9308d.f8572a.f9602f).get()) != null) {
                    HashMap map2 = new HashMap();
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        for (mn mnVar : ((nn) it.next()).f7324a) {
                            String str = mnVar.f7010b;
                            for (String str2 : mnVar.f7009a) {
                                if (!map2.containsKey(str2)) {
                                    map2.put(str2, new ArrayList());
                                }
                                if (str != null) {
                                    ((List) map2.get(str2)).add(str);
                                }
                            }
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map2.entrySet()) {
                        String str3 = (String) entry.getKey();
                        try {
                            fi0 fi0VarA = tzVar.f9309f.a(jSONObject, str3);
                            if (fi0VarA != null) {
                                vr0 vr0Var = (vr0) fi0VarA.f4535b;
                                boolean zA = vr0Var.a();
                                tn tnVar = vr0Var.f9963a;
                                if (!zA) {
                                    try {
                                        if (tnVar.u()) {
                                            try {
                                                tnVar.O0(new a4.b(tzVar.f9306a), (aj0) fi0VarA.f4536c, (List) entry.getValue());
                                                zzm.zze("Initialized rewarded video mediation adapter " + str3);
                                            } finally {
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } catch (zzffn e10) {
                            zzm.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e10);
                        }
                    }
                    return;
                }
                return;
        }
    }
}
