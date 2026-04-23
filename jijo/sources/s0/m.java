package s0;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static boolean a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(PopupWindow popupWindow, boolean z9) {
        popupWindow.setOverlapAnchor(z9);
    }

    public static void d(PopupWindow popupWindow, int i10) {
        popupWindow.setWindowLayoutType(i10);
    }
}
