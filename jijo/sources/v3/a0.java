package v3;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f17715a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17716b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f17718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f17719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComponentName f17720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0 f17721g;

    public a0(c0 c0Var, z zVar) {
        this.f17721g = c0Var;
        this.f17719e = zVar;
    }

    public final void a(String str, Executor executor) {
        this.f17716b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            c0 c0Var = this.f17721g;
            x3.b bVar = c0Var.f17730d;
            Context context = c0Var.f17728b;
            boolean zC = bVar.c(context, str, this.f17719e.a(context), this, 4225, executor);
            this.f17717c = zC;
            if (zC) {
                this.f17721g.f17729c.sendMessageDelayed(this.f17721g.f17729c.obtainMessage(1, this.f17719e), this.f17721g.f17732f);
            } else {
                this.f17716b = 2;
                try {
                    c0 c0Var2 = this.f17721g;
                    c0Var2.f17730d.b(c0Var2.f17728b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f17721g.f17727a) {
            try {
                this.f17721g.f17729c.removeMessages(1, this.f17719e);
                this.f17718d = iBinder;
                this.f17720f = componentName;
                Iterator it = this.f17715a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f17716b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f17721g.f17727a) {
            try {
                this.f17721g.f17729c.removeMessages(1, this.f17719e);
                this.f17718d = null;
                this.f17720f = componentName;
                Iterator it = this.f17715a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f17716b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
