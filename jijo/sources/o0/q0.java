package o0;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 {
    public static CharSequence a(View view) {
        return view.getStateDescription();
    }

    public static void b(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
