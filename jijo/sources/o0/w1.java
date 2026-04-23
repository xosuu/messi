package o0;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class w1 extends v1 {
    @Override // d5.e
    public final void r(boolean z9) {
        Window window = this.f16073s;
        if (!z9) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}
