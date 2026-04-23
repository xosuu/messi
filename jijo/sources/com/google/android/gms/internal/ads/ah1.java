package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class ah1 extends q7.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2684c;

    public ah1(String str, int i10) {
        this.f2683b = i10;
        if (i10 != 1) {
            this.f2684c = str;
        } else {
            this.f2684c = Logger.getLogger(str);
        }
    }

    public final void x(String str) {
        int i10 = this.f2683b;
        Object obj = this.f2684c;
        switch (i10) {
            case 0:
                new StringBuilder(String.valueOf(str).length() + String.valueOf((String) obj).length() + 1);
                break;
            default:
                ((Logger) obj).logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
                break;
        }
    }
}
