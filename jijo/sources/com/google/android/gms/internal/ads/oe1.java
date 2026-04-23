package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class oe1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7565a;

    public abstract void A0(long j10, byte[] bArr, long j11, long j12);

    public abstract void B0(Object obj, long j10, boolean z9);

    public abstract void C0(Object obj, long j10, byte b10);

    public abstract void D0(Object obj, long j10, double d10);

    public abstract void E0(Object obj, long j10, float f10);

    public abstract boolean F0(long j10, Object obj);

    public final synchronized void G0(n70 n70Var) {
        H0(n70Var.f7187a, n70Var.f7188b);
    }

    public final synchronized void H0(Object obj, Executor executor) {
        ((Map) this.f7565a).put(obj, executor);
    }

    public final synchronized void I0(s60 s60Var) {
        for (Map.Entry entry : ((Map) this.f7565a).entrySet()) {
            ((Executor) entry.getValue()).execute(new vm(s60Var, 22, entry.getKey()));
        }
    }

    public abstract byte v0(long j10);

    public final void w0(Object obj, nh1 nh1Var) {
        if (nh1Var == null) {
            throw new NullPointerException("provider");
        }
        ((LinkedHashMap) this.f7565a).put(obj, nh1Var);
    }

    public abstract double x0(long j10, Object obj);

    public void y0(String str, nh1 nh1Var) {
        w0(str, nh1Var);
    }

    public abstract float z0(long j10, Object obj);

    public oe1(int i10) {
        this.f7565a = tp1.W(i10);
    }

    public oe1(View view) {
        this.f7565a = new WeakReference(view);
    }

    public oe1(Set set) {
        this.f7565a = new HashMap();
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                G0((n70) it.next());
            }
        }
    }
}
