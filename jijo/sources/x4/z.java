package x4;

import android.view.View;
import java.util.WeakHashMap;
import o0.h0;
import o0.v0;

/* JADX INFO: loaded from: classes.dex */
public final class z implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = v0.f16075a;
        h0.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
