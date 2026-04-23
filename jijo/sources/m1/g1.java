package m1;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class g1 extends o0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f15479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f1 f15480e;

    public g1(RecyclerView recyclerView) {
        this.f15479d = recyclerView;
        f1 f1Var = this.f15480e;
        if (f1Var != null) {
            this.f15480e = f1Var;
        } else {
            this.f15480e = new f1(this);
        }
    }

    @Override // o0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f15479d.K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().O(accessibilityEvent);
        }
    }

    @Override // o0.c
    public void d(View view, p0.g gVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f16016a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f16195a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f15479d;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        p0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f15586b;
        w0 w0Var = recyclerView2.f1042b;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f15586b.canScrollHorizontally(-1)) {
            gVar.a(8192);
            gVar.k(true);
        }
        if (layoutManager.f15586b.canScrollVertically(1) || layoutManager.f15586b.canScrollHorizontally(1)) {
            gVar.a(NotificationCompat.FLAG_BUBBLE);
            gVar.k(true);
        }
        b1 b1Var = recyclerView2.f1059o0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.F(w0Var, b1Var), layoutManager.x(w0Var, b1Var), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[PHI: r0
      0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.g(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L8
            return r6
        L8:
            androidx.recyclerview.widget.RecyclerView r4 = r3.f15479d
            boolean r0 = r4.K()
            r1 = 0
            if (r0 != 0) goto L8d
            m1.p0 r0 = r4.getLayoutManager()
            if (r0 == 0) goto L8d
            m1.p0 r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.f15586b
            m1.w0 r2 = r0.f1042b
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L58
            r2 = 8192(0x2000, float:1.148E-41)
            if (r5 == r2) goto L2a
            r5 = 0
            r0 = 0
            goto L81
        L2a:
            r5 = -1
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 == 0) goto L3f
            int r0 = r4.f15599o
            int r2 = r4.C()
            int r0 = r0 - r2
            int r2 = r4.z()
            int r0 = r0 - r2
            int r0 = -r0
            goto L40
        L3f:
            r0 = 0
        L40:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f15586b
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L56
            int r5 = r4.f15598n
            int r2 = r4.A()
            int r5 = r5 - r2
            int r2 = r4.B()
            int r5 = r5 - r2
            int r5 = -r5
            goto L81
        L56:
            r5 = 0
            goto L81
        L58:
            boolean r5 = r0.canScrollVertically(r6)
            if (r5 == 0) goto L6c
            int r5 = r4.f15599o
            int r0 = r4.C()
            int r5 = r5 - r0
            int r0 = r4.z()
            int r5 = r5 - r0
            r0 = r5
            goto L6d
        L6c:
            r0 = 0
        L6d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.f15586b
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L56
            int r5 = r4.f15598n
            int r2 = r4.A()
            int r5 = r5 - r2
            int r2 = r4.B()
            int r5 = r5 - r2
        L81:
            if (r0 != 0) goto L87
            if (r5 != 0) goto L87
            r6 = 0
            goto L8c
        L87:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f15586b
            r4.b0(r5, r0, r6)
        L8c:
            return r6
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.g1.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
