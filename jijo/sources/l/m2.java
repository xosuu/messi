package l;

import android.transition.Transition;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class m2 {
    public static void a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    public static void b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
