package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.provider.Settings;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ek0 implements j80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4213b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4214d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f4215f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f4216h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f4217q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f4218s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f4219t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f4220u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f4221v;

    public ek0(Context context, kc0 kc0Var, or0 or0Var, VersionInfoParcel versionInfoParcel, fr0 fr0Var, qu quVar, nx nxVar, yk ykVar, boolean z9, qh0 qh0Var) {
        this.f4212a = context;
        this.f4214d = kc0Var;
        this.f4215f = or0Var;
        this.f4216h = versionInfoParcel;
        this.f4217q = fr0Var;
        this.f4218s = quVar;
        this.f4219t = nxVar;
        this.f4220u = ykVar;
        this.f4213b = z9;
        this.f4221v = qh0Var;
    }

    public final void a(AudioDeviceInfo audioDeviceInfo) {
        fl1 fl1Var = (fl1) this.f4219t;
        if (yn0.c(audioDeviceInfo, fl1Var == null ? null : fl1Var.f4571a)) {
            return;
        }
        fl1 fl1Var2 = audioDeviceInfo != null ? new fl1(audioDeviceInfo) : null;
        this.f4219t = fl1Var2;
        b(bl1.b(this.f4212a, (ce1) this.f4220u, fl1Var2));
    }

    public final void b(bl1 bl1Var) {
        yj1 yj1Var;
        if (!this.f4213b || bl1Var.equals((bl1) this.f4218s)) {
            return;
        }
        this.f4218s = bl1Var;
        gm1 gm1Var = (gm1) ((ks0) this.f4221v).f6384a;
        gm1Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = gm1Var.U;
        if (looper != looperMyLooper) {
            String name = looper == null ? "null" : looper.getThread().getName();
            throw new IllegalStateException("Current looper (" + (looperMyLooper == null ? "null" : looperMyLooper.getThread().getName()) + ") is not the playback looper (" + name + ")");
        }
        if (bl1Var.equals(gm1Var.f4987r)) {
            return;
        }
        gm1Var.f4987r = bl1Var;
        im1 im1Var = gm1Var.f4982m;
        if (im1Var != null) {
            jm1 jm1Var = im1Var.f5645a;
            synchronized (jm1Var.f9848a) {
                yj1Var = jm1Var.C;
            }
            if (yj1Var != null) {
                ((aq1) yj1Var).d();
            }
        }
    }

    public final void c(Runnable runnable) {
        ((Handler) ((qx0) this.f4214d).mo3zza()).post(new zw0(this, runnable, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    @Override // com.google.android.gms.internal.ads.j80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(boolean r24, android.content.Context r25, com.google.android.gms.internal.ads.s40 r26) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ek0.h(boolean, android.content.Context, com.google.android.gms.internal.ads.s40):void");
    }

    public ek0(Context context, ou ouVar, Intent intent) {
        this.f4217q = new ArrayList();
        this.f4212a = context;
        this.f4215f = ouVar;
        this.f4216h = "OverlayDisplayService";
        this.f4218s = intent;
        ou ouVar2 = new ou();
        ouVar2.f7670a = "OverlayDisplayService";
        this.f4214d = en1.S(ouVar2);
        this.f4219t = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.yw0
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                ek0 ek0Var = this.f11066a;
                ((ou) ek0Var.f4215f).d("%s : Binder has died.", (String) ek0Var.f4216h);
                synchronized (((List) ek0Var.f4217q)) {
                    ((List) ek0Var.f4217q).clear();
                }
            }
        };
    }

    public ek0(Context context, ks0 ks0Var, ce1 ce1Var, fl1 fl1Var) {
        Context applicationContext = context.getApplicationContext();
        this.f4212a = applicationContext;
        this.f4221v = ks0Var;
        this.f4220u = ce1Var;
        this.f4219t = fl1Var;
        int i10 = yn0.f10944a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f4214d = handler;
        this.f4215f = yn0.f10944a >= 23 ? new dl1(this) : null;
        this.f4216h = new f.g0(this, 8);
        bl1 bl1Var = bl1.f3054c;
        String str = yn0.f10946c;
        Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f4217q = uriFor != null ? new el1(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }
}
