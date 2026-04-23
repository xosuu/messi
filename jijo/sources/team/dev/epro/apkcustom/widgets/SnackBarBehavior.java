package team.dev.epro.apkcustom.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class SnackBarBehavior extends b0.b {
    static {
        NativeUtil.classesInit0(218);
    }

    public SnackBarBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override // b0.b
    public final native boolean b(View view, View view2);

    @Override // b0.b
    public final native boolean d(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // b0.b
    public final native void e(CoordinatorLayout coordinatorLayout, View view, View view2);
}
