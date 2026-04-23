package b3;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1260a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1261b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f1262d;

    public e(f fVar, int i10) {
        this.f1262d = fVar;
        this.f1261b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1260a;
        f fVar = this.f1262d;
        switch (i10) {
            case 0:
                fVar.setSelection(this.f1261b);
                break;
            default:
                int i11 = this.f1261b;
                fVar.f1269q = i11;
                int i12 = fVar.f1268h;
                if (i11 == 0 && i12 != 0) {
                    if (i12 != 1) {
                        fVar.f1268h = i11;
                        View childAt = fVar.getChildAt(0);
                        int i13 = 0;
                        while (childAt != null && childAt.getBottom() <= 0) {
                            i13++;
                            childAt = fVar.getChildAt(i13);
                        }
                        if (childAt != null) {
                            boolean z9 = (fVar.getFirstVisiblePosition() == 0 || fVar.getLastVisiblePosition() == fVar.getCount() - 1) ? false : true;
                            int top = childAt.getTop();
                            int bottom = childAt.getBottom();
                            int height = fVar.getHeight() / 2;
                            if (z9 && top < -1) {
                                if (bottom <= height) {
                                    fVar.smoothScrollBy(bottom, 250);
                                } else {
                                    fVar.smoothScrollBy(top, 250);
                                }
                                break;
                            }
                        }
                    }
                }
                fVar.f1268h = i11;
                break;
        }
    }

    public e(j jVar) {
        this.f1262d = jVar;
    }
}
