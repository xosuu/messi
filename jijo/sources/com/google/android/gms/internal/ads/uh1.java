package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class uh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f9488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sh1 f9489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public th1 f9490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f9492e = 1.0f;

    public uh1(Context context, Handler handler, ri1 ri1Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f9488a = audioManager;
        this.f9490c = ri1Var;
        this.f9489b = new sh1(this, handler);
        this.f9491d = 0;
    }

    public final void a() {
        if (this.f9491d == 0) {
            return;
        }
        if (yn0.f10944a < 26) {
            this.f9488a.abandonAudioFocus(this.f9489b);
        }
        c(0);
    }

    public final void b(int i10) {
        th1 th1Var = this.f9490c;
        if (th1Var != null) {
            ui1 ui1Var = ((ri1) th1Var).f8608a;
            boolean zZzu = ui1Var.zzu();
            int i11 = 1;
            if (zZzu && i10 != 1) {
                i11 = 2;
            }
            ui1Var.o(i10, i11, zZzu);
        }
    }

    public final void c(int i10) {
        if (this.f9491d == i10) {
            return;
        }
        this.f9491d = i10;
        float f10 = i10 == 3 ? 0.2f : 1.0f;
        if (this.f9492e != f10) {
            this.f9492e = f10;
            th1 th1Var = this.f9490c;
            if (th1Var != null) {
                ui1 ui1Var = ((ri1) th1Var).f8608a;
                ui1Var.l(1, 2, Float.valueOf(ui1Var.K * ui1Var.f9518v.f9492e));
            }
        }
    }
}
