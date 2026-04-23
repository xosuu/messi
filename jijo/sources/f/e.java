package f;

import android.app.ActionBar;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static void a(ActionBar actionBar, int i10) {
        actionBar.setHomeActionContentDescription(i10);
    }

    public static void b(ActionBar actionBar, Drawable drawable) {
        actionBar.setHomeAsUpIndicator(drawable);
    }
}
