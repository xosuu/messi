package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z90 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tb0 f11188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y3.a f11189b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public dk f11190d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public tk f11191f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f11192h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Long f11193q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public WeakReference f11194s;

    public z90(tb0 tb0Var, y3.a aVar) {
        this.f11188a = tb0Var;
        this.f11189b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        WeakReference weakReference = this.f11194s;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f11192h != null && this.f11193q != null) {
            HashMap map = new HashMap();
            map.put("id", this.f11192h);
            ((y3.b) this.f11189b).getClass();
            map.put("time_interval", String.valueOf(System.currentTimeMillis() - this.f11193q.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f11188a.b(map);
        }
        this.f11192h = null;
        this.f11193q = null;
        WeakReference weakReference2 = this.f11194s;
        if (weakReference2 == null || (view2 = (View) weakReference2.get()) == null) {
            return;
        }
        view2.setClickable(false);
        view2.setOnClickListener(null);
        this.f11194s = null;
    }
}
