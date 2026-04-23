package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r61 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r61 f8428b = new r61();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f8429a = new HashMap();

    public final synchronized l31 a() {
        if (!this.f8429a.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (l31) this.f8429a.get("AES128_GCM");
    }

    public final synchronized void b(String str, l31 l31Var) {
        try {
            if (!this.f8429a.containsKey(str)) {
                this.f8429a.put(str, l31Var);
                return;
            }
            if (((l31) this.f8429a.get(str)).equals(l31Var)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.f8429a.get(str)) + "), cannot insert " + String.valueOf(l31Var));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            b((String) entry.getKey(), (l31) entry.getValue());
        }
    }
}
