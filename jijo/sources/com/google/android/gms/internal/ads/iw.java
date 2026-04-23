package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class iw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5701a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5702b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5703d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5704f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5705h;

    public iw(lw lwVar, String str, String str2, int i10) {
        this.f5703d = str;
        this.f5704f = str2;
        this.f5702b = i10;
        this.f5705h = lwVar;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [android.os.IInterface, com.google.android.gms.internal.ads.pw0] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f5701a;
        Object obj = this.f5705h;
        int i11 = this.f5702b;
        Object obj2 = this.f5704f;
        Object obj3 = this.f5703d;
        switch (i10) {
            case 0:
                HashMap map = new HashMap();
                map.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
                map.put("src", (String) obj3);
                map.put("cachedSrc", (String) obj2);
                map.put("totalBytes", Integer.toString(i11));
                lw.j((lw) obj, map);
                break;
            case 1:
                ((ix) obj3).T((View) obj2, (dt) obj, i11 - 1);
                break;
            default:
                ww0 ww0Var = (ww0) obj3;
                uw0 uw0Var = (uw0) obj2;
                k.q qVar = (k.q) obj;
                String str = ww0Var.f10367b;
                try {
                    ek0 ek0Var = ww0Var.f10366a;
                    ek0Var.getClass();
                    ?? r52 = (IInterface) ek0Var.f4221v;
                    if (r52 != 0) {
                        Bundle bundle = new Bundle();
                        bundle.putString("sessionToken", uw0Var.f9637a);
                        bundle.putInt("displayMode", i11);
                        bundle.putString("callerPackage", str);
                        bundle.putString("appId", uw0Var.f9638b);
                        r52.R(bundle, new vw0(ww0Var, qVar));
                    }
                } catch (RemoteException e10) {
                    ww0.f10364c.c(e10, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i11), str);
                }
                break;
        }
    }

    public /* synthetic */ iw(ix ixVar, View view, dt dtVar, int i10) {
        this.f5703d = ixVar;
        this.f5704f = view;
        this.f5705h = dtVar;
        this.f5702b = i10;
    }

    public /* synthetic */ iw(ww0 ww0Var, uw0 uw0Var, int i10, k.q qVar) {
        this.f5703d = ww0Var;
        this.f5704f = uw0Var;
        this.f5702b = i10;
        this.f5705h = qVar;
    }
}
