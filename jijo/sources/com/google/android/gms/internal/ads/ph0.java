package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class ph0 extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7879a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Timer f7880b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7881d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7882f;

    public ph0(AlertDialog alertDialog, Timer timer, zzm zzmVar) {
        this.f7881d = alertDialog;
        this.f7880b = timer;
        this.f7882f = zzmVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i10 = this.f7879a;
        Timer timer = this.f7880b;
        Object obj = this.f7882f;
        Object obj2 = this.f7881d;
        switch (i10) {
            case 0:
                ((AlertDialog) obj2).dismiss();
                timer.cancel();
                zzm zzmVar = (zzm) obj;
                if (zzmVar != null) {
                    zzmVar.zzb();
                    return;
                }
                return;
            default:
                cu0 cu0Var = (cu0) obj2;
                cu0Var.getClass();
                int i11 = a2.c.f10a;
                if (!b2.n.f1250c.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                b2.o.f1252a.createWebView(cu0Var.f3451b).removeWebMessageListener("omidJsSessionService");
                nx nxVar = (nx) ((jp0) obj).f6060b;
                nxVar.getClass();
                ew0 ew0Var = zzt.zza;
                fx fxVar = nxVar.f7407a;
                Objects.requireNonNull(fxVar);
                ew0Var.post(new mx(fxVar, 0));
                timer.cancel();
                return;
        }
    }

    public ph0(cu0 cu0Var, jp0 jp0Var, Timer timer) {
        this.f7882f = jp0Var;
        this.f7880b = timer;
        this.f7881d = cu0Var;
    }
}
