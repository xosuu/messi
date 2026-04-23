package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class eu0 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioManager f4300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f4301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nu0 f4302d;

    public eu0(Handler handler, Context context, nu0 nu0Var) {
        super(handler);
        this.f4299a = context;
        this.f4300b = (AudioManager) context.getSystemService("audio");
        this.f4302d = nu0Var;
    }

    public final float a() {
        AudioManager audioManager = this.f4300b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f10 = streamVolume / streamMaxVolume;
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    public final void b() {
        float f10 = this.f4301c;
        nu0 nu0Var = this.f4302d;
        nu0Var.f7390a = f10;
        if (nu0Var.f7392c == null) {
            nu0Var.f7392c = hu0.f5402c;
        }
        Iterator it = Collections.unmodifiableCollection(nu0Var.f7392c.f5404b).iterator();
        while (it.hasNext()) {
            qu0 qu0Var = ((yt0) it.next()).f11033d;
            en1.g0(qu0Var.a(), "setDeviceVolume", Float.valueOf(f10), qu0Var.f8277a);
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z9) {
        super.onChange(z9);
        float fA = a();
        if (fA != this.f4301c) {
            this.f4301c = fA;
            b();
        }
    }
}
