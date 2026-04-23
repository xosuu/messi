package m1;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((y0) ((Observable) this).mObservers.get(size)).f15678a;
            recyclerView.i(null);
            recyclerView.f1059o0.f15415f = true;
            recyclerView.U(true);
            if (!recyclerView.f1048f.g()) {
                recyclerView.requestLayout();
            }
        }
    }
}
