package o0;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class v1 extends u1 {
    @Override // d5.e
    public final void s(boolean z9) {
        Window window = this.f16073s;
        if (!z9) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
