package o0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class x1 extends d5.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final WindowInsetsController f16085s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Window f16086t;

    public x1(Window window) {
        this.f16085s = window.getInsetsController();
        this.f16086t = window;
    }

    @Override // d5.e
    public final void r(boolean z9) {
        Window window = this.f16086t;
        WindowInsetsController windowInsetsController = this.f16085s;
        if (z9) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    @Override // d5.e
    public final void s(boolean z9) {
        Window window = this.f16086t;
        WindowInsetsController windowInsetsController = this.f16085s;
        if (z9) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }
}
