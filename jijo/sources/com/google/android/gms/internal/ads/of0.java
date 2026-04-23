package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class of0 implements v3.b, v3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qu f7566a = new qu();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7567b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7568d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7569f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zzbvb f7570h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public cd f7571q;

    public static void b(Context context, qu quVar, Executor executor) {
        if (((Boolean) dh.f3658j.k()).booleanValue() || ((Boolean) dh.f3656h.k()).booleanValue()) {
            tc1.u0(quVar, new lf0(context), executor);
        }
    }

    public final void a() {
        synchronized (this.f7567b) {
            try {
                this.f7569f = true;
                if (this.f7571q.isConnected() || this.f7571q.isConnecting()) {
                    this.f7571q.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v3.b
    public final void m(int i10) {
        zzm.zze("Cannot connect to remote service, fallback to local instance.");
    }
}
