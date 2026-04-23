package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gu0 extends ju0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final gu0 f5069f = new gu0();

    @Override // com.google.android.gms.internal.ads.ju0
    public final void a(boolean z9) {
        Iterator it = Collections.unmodifiableCollection(hu0.f5402c.f5403a).iterator();
        while (it.hasNext()) {
            qu0 qu0Var = ((yt0) it.next()).f11033d;
            if (qu0Var.f8278b.get() != 0) {
                en1.g0(qu0Var.a(), "setState", true != z9 ? "backgrounded" : "foregrounded", qu0Var.f8277a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.ju0
    public final boolean b() {
        Iterator it = Collections.unmodifiableCollection(hu0.f5402c.f5404b).iterator();
        while (it.hasNext()) {
            View view = (View) ((yt0) it.next()).f11032c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
