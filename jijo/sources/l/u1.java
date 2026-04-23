package l;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public abstract class u1 {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z9) {
        absListView.setSelectedChildViewEnabled(z9);
    }
}
