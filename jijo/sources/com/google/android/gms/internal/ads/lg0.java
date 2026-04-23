package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.ConnectionResult;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class lg0 implements v3.b, v3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qu f6606a = new qu();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6607b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6608d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public gr f6609f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f6610h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Looper f6611q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ScheduledExecutorService f6612s;

    public final synchronized void a() {
        try {
            if (this.f6609f == null) {
                Context context = this.f6610h;
                Looper looper = this.f6611q;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.f6609f = new gr(applicationContext, looper, 8, this, this);
            }
            this.f6609f.checkAvailabilityAndConnect();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            this.f6608d = true;
            gr grVar = this.f6609f;
            if (grVar == null) {
                return;
            }
            if (grVar.isConnected() || this.f6609f.isConnecting()) {
                this.f6609f.disconnect();
            }
            Binder.flushPendingCommands();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // v3.c
    public final void t(ConnectionResult connectionResult) {
        String str = String.format(Locale.US, "Remote ad service connection failed, cause: %d.", Integer.valueOf(connectionResult.f2470b));
        zzm.zze(str);
        this.f6606a.c(new zzdyp(1, str));
    }
}
