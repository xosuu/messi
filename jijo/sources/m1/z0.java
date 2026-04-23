package m1;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Interpolator f15684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15685f;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.f15683d;
        if (i10 >= 0) {
            this.f15683d = -1;
            recyclerView.M(i10);
            this.f15685f = false;
        } else if (this.f15685f) {
            Interpolator interpolator = this.f15684e;
            if (interpolator != null && this.f15682c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f15682c;
            if (i11 < 1) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            recyclerView.f1056l0.b(this.f15680a, this.f15681b, i11, interpolator);
            this.f15685f = false;
        }
    }
}
