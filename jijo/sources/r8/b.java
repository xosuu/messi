package r8;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import m1.e1;
import m1.m0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16548c;

    @Override // m1.m0
    public final void a(Rect rect, View view, RecyclerView recyclerView) {
        RecyclerView recyclerView2;
        recyclerView.getClass();
        e1 e1VarI = RecyclerView.I(view);
        int iF = -1;
        if (e1VarI != null && (recyclerView2 = e1VarI.f15462r) != null) {
            iF = recyclerView2.F(e1VarI);
        }
        int i10 = this.f16546a;
        int i11 = iF % i10;
        boolean z9 = this.f16548c;
        int i12 = this.f16547b;
        if (z9) {
            rect.left = i12 - ((i11 * i12) / i10);
            rect.right = ((i11 + 1) * i12) / i10;
            if (iF < i10) {
                rect.top = i12;
            }
            rect.bottom = i12;
            return;
        }
        rect.left = (i11 * i12) / i10;
        rect.right = i12 - (((i11 + 1) * i12) / i10);
        if (iF >= i10) {
            rect.top = i12;
        }
    }
}
