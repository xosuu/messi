package j;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import o0.d1;
import o0.e1;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f14276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e1 f14277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14278e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14275b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f14279f = new k(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14274a = new ArrayList();

    public final void a() {
        if (this.f14278e) {
            Iterator it = this.f14274a.iterator();
            while (it.hasNext()) {
                ((d1) it.next()).b();
            }
            this.f14278e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f14278e) {
            return;
        }
        for (d1 d1Var : this.f14274a) {
            long j10 = this.f14275b;
            if (j10 >= 0) {
                d1Var.c(j10);
            }
            Interpolator interpolator = this.f14276c;
            if (interpolator != null && (view = (View) d1Var.f16019a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f14277d != null) {
                d1Var.d(this.f14279f);
            }
            View view2 = (View) d1Var.f16019a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f14278e = true;
    }
}
