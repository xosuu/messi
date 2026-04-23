package androidx.fragment.app;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public class k implements k0.a, g4.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f808a;

    public /* synthetic */ k(Object obj) {
        this.f808a = obj;
    }

    public static k f(int i10, int i11, int i12, int i13, boolean z9, boolean z10) {
        return new k(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z9, z10));
    }

    public p0.g a(int i10) {
        return null;
    }

    @Override // k0.a
    public void b() {
        ((b1) this.f808a).a();
    }

    public p0.g c(int i10) {
        return null;
    }

    public j0 d() {
        return ((v) this.f808a).A;
    }

    public void e() {
        ((v) this.f808a).A.L();
    }

    public boolean g(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override // g4.t0
    public Object zza() {
        return this.f808a;
    }

    public k() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f808a = new p0.j(this);
        } else {
            this.f808a = new p0.i(this);
        }
    }
}
