package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class rc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ur0 f8572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qc0 f8573b;

    public rc0(ur0 ur0Var, qc0 qc0Var) {
        this.f8572a = ur0Var;
        this.f8573b = qc0Var;
    }

    public final bp a(String str) throws RemoteException {
        rn rnVar = (rn) ((AtomicReference) this.f8572a.f9602f).get();
        if (rnVar == null) {
            zzm.zzj("Unexpected call to adapter creator.");
            throw new RemoteException();
        }
        bp bpVarI = rnVar.i(str);
        qc0 qc0Var = this.f8573b;
        synchronized (qc0Var) {
            if (!qc0Var.f8156a.containsKey(str)) {
                try {
                    qc0Var.f8156a.put(str, new pc0(str, bpVarI.zzf(), bpVarI.zzg(), true));
                } catch (Throwable unused) {
                }
            }
        }
        return bpVarI;
    }

    public final vr0 b(JSONObject jSONObject, String str) {
        tn tnVarZzb;
        qc0 qc0Var = this.f8573b;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                tnVarZzb = new jo(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                tnVarZzb = new jo(new zzbre());
            } else {
                rn rnVar = (rn) ((AtomicReference) this.f8572a.f9602f).get();
                if (rnVar == null) {
                    zzm.zzj("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        tnVarZzb = rnVar.a(string) ? rnVar.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : rnVar.v(string) ? rnVar.zzb(string) : rnVar.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e10) {
                        zzm.zzh("Invalid custom event.", e10);
                        tnVarZzb = rnVar.zzb(str);
                    }
                } else {
                    tnVarZzb = rnVar.zzb(str);
                }
            }
            vr0 vr0Var = new vr0(tnVarZzb);
            qc0Var.b(str, vr0Var);
            return vr0Var;
        } catch (Throwable th) {
            if (((Boolean) zzba.zzc().a(eg.f4179x8)).booleanValue()) {
                qc0Var.b(str, null);
            }
            throw new zzffn(th);
        }
    }
}
