package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y40 implements s60, wh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f10767a;

    public /* synthetic */ y40(Context context) {
        this.f10767a = context;
    }

    @Override // com.google.android.gms.internal.ads.wh0, com.google.android.gms.internal.ads.q20
    public final Object zza() {
        c8.a aVar = tp1.f9254v;
        if (aVar.f1584b) {
            return Boolean.TRUE;
        }
        Context applicationContext = this.f10767a.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Application Context cannot be null");
        }
        if (!aVar.f1584b) {
            int i10 = 1;
            aVar.f1584b = true;
            nu0 nu0VarA = nu0.a();
            nu0VarA.getClass();
            nu0VarA.f7391b = new eu0(new Handler(), applicationContext, nu0VarA);
            gu0 gu0Var = gu0.f5069f;
            boolean z9 = applicationContext instanceof Application;
            if (z9) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(gu0Var);
            }
            tp1.f9255w = (UiModeManager) applicationContext.getSystemService("uimode");
            WindowManager windowManager = uu0.f9616a;
            uu0.f9618c = applicationContext.getResources().getDisplayMetrics().density;
            uu0.f9616a = (WindowManager) applicationContext.getSystemService("window");
            applicationContext.registerReceiver(new l3.h(i10), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
            mu0.f7055b.f7056a = applicationContext.getApplicationContext();
            fu0 fu0Var = fu0.f4664e;
            if (!fu0Var.f4666b) {
                ju0 ju0Var = fu0Var.f4667c;
                ju0Var.getClass();
                if (z9) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(ju0Var);
                }
                ju0Var.f6090d = fu0Var;
                ju0Var.f6088a = true;
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                boolean z10 = runningAppProcessInfo.importance == 100 || ju0Var.b();
                ju0Var.f6089b = z10;
                ju0Var.a(z10);
                fu0Var.f4668d = ju0Var.f6089b;
                fu0Var.f4666b = true;
            }
        }
        return Boolean.valueOf(aVar.f1584b);
    }

    @Override // com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        ((x40) obj).z(this.f10767a);
    }
}
