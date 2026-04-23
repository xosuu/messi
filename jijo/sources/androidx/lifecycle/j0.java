package androidx.lifecycle;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import o0.v0;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f975b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f976d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f977f;

    public j0(s sVar, k kVar) {
        this.f974a = 0;
        this.f975b = false;
        this.f976d = sVar;
        this.f977f = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f974a;
        Object obj = this.f976d;
        Object obj2 = this.f977f;
        switch (i10) {
            case 0:
                if (!this.f975b) {
                    ((s) obj).e((k) obj2);
                    this.f975b = true;
                }
                break;
            default:
                v0.e eVar = ((SwipeDismissBehavior) obj2).f11758a;
                if (eVar != null && eVar.g()) {
                    WeakHashMap weakHashMap = v0.f16075a;
                    o0.d0.m((View) obj, this);
                    break;
                }
                break;
        }
    }

    public j0(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z9) {
        this.f974a = 1;
        this.f977f = swipeDismissBehavior;
        this.f976d = view;
        this.f975b = z9;
    }
}
