package x0;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z9 = false;
        boolean z10 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.J = windowInsets;
        drawerLayout.K = z10;
        if (!z10 && drawerLayout.getBackground() == null) {
            z9 = true;
        }
        drawerLayout.setWillNotDraw(z9);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
