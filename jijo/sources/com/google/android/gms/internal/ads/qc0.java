package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f8156a = new HashMap();

    public final synchronized pc0 a(String str) {
        return (pc0) this.f8156a.get(str);
    }

    public final synchronized void b(String str, vr0 vr0Var) {
        zzbra zzbraVarZzl;
        if (this.f8156a.containsKey(str)) {
            return;
        }
        zzbra zzbraVarZzm = null;
        if (vr0Var == null) {
            zzbraVarZzl = null;
        } else {
            try {
                zzbraVarZzl = vr0Var.f9963a.zzl();
            } catch (Throwable th) {
                try {
                    throw new zzffn(th);
                } catch (zzffn unused) {
                }
            }
        }
        if (vr0Var != null) {
            try {
                zzbraVarZzm = vr0Var.f9963a.zzm();
            } catch (Throwable th2) {
                try {
                    throw new zzffn(th2);
                } catch (zzffn unused2) {
                }
            }
        }
        boolean z9 = true;
        if (((Boolean) zzba.zzc().a(eg.f4179x8)).booleanValue()) {
            if (vr0Var == null) {
                z9 = false;
            } else {
                try {
                    vr0Var.a();
                } catch (zzffn unused3) {
                    z9 = false;
                }
            }
        }
        this.f8156a.put(str, new pc0(str, zzbraVarZzl, zzbraVarZzm, z9));
    }
}
