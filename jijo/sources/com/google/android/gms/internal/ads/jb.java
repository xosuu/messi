package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class jb implements InitializationStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f5880a;

    public jb(HashMap map) {
        this.f5880a = map;
    }

    public final AtomicReference a(String str) {
        synchronized (this) {
            try {
                if (!this.f5880a.containsKey(str)) {
                    this.f5880a.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) this.f5880a.get(str);
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public final Map getAdapterStatusMap() {
        return this.f5880a;
    }

    public jb() {
        this.f5880a = new HashMap();
    }
}
