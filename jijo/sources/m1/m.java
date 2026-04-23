package m1;

import androidx.recyclerview.widget.RecyclerView;
import team.dev.epro.apkcustom.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class m extends t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15544b;

    public /* synthetic */ m(int i10, Object obj) {
        this.f15543a = i10;
        this.f15544b = obj;
    }

    @Override // m1.t0
    public final void a(RecyclerView recyclerView, int i10) {
        t8.z zVar;
        switch (this.f15543a) {
            case 1:
                if (i10 == 0 && (zVar = ((t8.a0) this.f15544b).f17024h0) != null) {
                    ((MainActivity) zVar).O(true);
                    break;
                }
                break;
        }
    }

    @Override // m1.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12 = this.f15543a;
        Object obj = this.f15544b;
        switch (i12) {
            case 0:
                p pVar = (p) obj;
                int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int iComputeVerticalScrollRange = pVar.f15577s.computeVerticalScrollRange();
                int i13 = pVar.f15576r;
                int i14 = iComputeVerticalScrollRange - i13;
                int i15 = pVar.f15559a;
                pVar.f15578t = i14 > 0 && i13 >= i15;
                int iComputeHorizontalScrollRange = pVar.f15577s.computeHorizontalScrollRange();
                int i16 = pVar.f15575q;
                boolean z9 = iComputeHorizontalScrollRange - i16 > 0 && i16 >= i15;
                pVar.f15579u = z9;
                boolean z10 = pVar.f15578t;
                if (z10 || z9) {
                    if (z10) {
                        float f10 = i13;
                        pVar.f15570l = (int) ((((f10 / 2.0f) + iComputeVerticalScrollOffset) * f10) / iComputeVerticalScrollRange);
                        pVar.f15569k = Math.min(i13, (i13 * i13) / iComputeVerticalScrollRange);
                    }
                    if (pVar.f15579u) {
                        float f11 = iComputeHorizontalScrollOffset;
                        float f12 = i16;
                        pVar.f15573o = (int) ((((f12 / 2.0f) + f11) * f12) / iComputeHorizontalScrollRange);
                        pVar.f15572n = Math.min(i16, (i16 * i16) / iComputeHorizontalScrollRange);
                    }
                    int i17 = pVar.f15580v;
                    if (i17 == 0 || i17 == 1) {
                        pVar.g(1);
                    }
                } else if (pVar.f15580v != 0) {
                    pVar.g(0);
                }
                break;
            default:
                t8.a0 a0Var = (t8.a0) obj;
                t8.z zVar = a0Var.f17024h0;
                if (zVar != null) {
                    if (i11 > 0) {
                        ((MainActivity) zVar).O(false);
                        ((MainActivity) a0Var.f17024h0).A(2131231158);
                    } else if (i11 <= 0) {
                        if (i11 < 0) {
                            ((MainActivity) zVar).O(false);
                        }
                        ((MainActivity) a0Var.f17024h0).A(2131231208);
                    }
                }
                break;
        }
    }
}
