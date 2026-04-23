package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.ads.ur0;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends Service implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ur0 f1000a = new ur0(this);

    @Override // androidx.lifecycle.q
    public final s h() {
        return (s) this.f1000a.f9600b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.f1000a.L(k.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f1000a.L(k.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        k kVar = k.ON_STOP;
        ur0 ur0Var = this.f1000a;
        ur0Var.L(kVar);
        ur0Var.L(k.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i10) {
        this.f1000a.L(k.ON_START);
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
