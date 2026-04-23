package l;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class f2 {
    public static int a(PopupWindow popupWindow, View view, int i10, boolean z9) {
        return popupWindow.getMaxAvailableHeight(view, i10, z9);
    }
}
