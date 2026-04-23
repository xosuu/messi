package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class lw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6707b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f6708d;

    public lw(pv pvVar) {
        Context context = pvVar.getContext();
        this.f6706a = context;
        this.f6707b = zzu.zzp().zzc(context, pvVar.zzn().afmaVersion);
        this.f6708d = new WeakReference(pvVar);
    }

    public static /* bridge */ /* synthetic */ void j(lw lwVar, HashMap map) {
        pv pvVar = (pv) lwVar.f6708d.get();
        if (pvVar != null) {
            pvVar.j("onPrecacheEvent", map);
        }
    }

    public void i() {
    }

    public abstract void k();

    public final void l(String str, String str2, String str3, String str4) {
        zzf.zza.post(new kw(this, str, str2, str3, str4));
    }

    public void n(int i10) {
    }

    public void o(int i10) {
    }

    public void p(int i10) {
    }

    public void q(int i10) {
    }

    public abstract boolean r(String str);

    public boolean s(String str, String[] strArr) {
        return r(str);
    }

    public boolean t(String str, String[] strArr, dw dwVar) {
        return r(str);
    }
}
