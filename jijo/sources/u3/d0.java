package u3;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends androidx.fragment.app.s implements f {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Map f17581h0 = Collections.synchronizedMap(new s.b());

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f17582i0 = 0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Bundle f17583j0;

    static {
        new WeakHashMap();
    }

    @Override // androidx.fragment.app.s
    public final void A(Bundle bundle) {
        super.A(bundle);
        this.f17582i0 = 1;
        this.f17583j0 = bundle;
        for (Map.Entry entry : this.f17581h0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).c(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.s
    public final void D() {
        this.Q = true;
        this.f17582i0 = 5;
        Iterator it = this.f17581h0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // androidx.fragment.app.s
    public final void J() {
        this.Q = true;
        this.f17582i0 = 3;
        Iterator it = this.f17581h0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).d();
        }
    }

    @Override // androidx.fragment.app.s
    public final void K(Bundle bundle) {
        for (Map.Entry entry : this.f17581h0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).e(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.s
    public final void L() {
        this.Q = true;
        this.f17582i0 = 2;
        Iterator it = this.f17581h0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).f();
        }
    }

    @Override // androidx.fragment.app.s
    public final void M() {
        this.Q = true;
        this.f17582i0 = 4;
        Iterator it = this.f17581h0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // androidx.fragment.app.s
    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f17581h0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).getClass();
        }
    }

    @Override // androidx.fragment.app.s
    public final void y(int i10, int i11, Intent intent) {
        super.y(i10, i11, intent);
        Iterator it = this.f17581h0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).b(i10, i11, intent);
        }
    }
}
