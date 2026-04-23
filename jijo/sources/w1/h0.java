package w1;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowId f18105a;

    public h0(View view) {
        this.f18105a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h0) && ((h0) obj).f18105a.equals(this.f18105a);
    }

    public final int hashCode() {
        return this.f18105a.hashCode();
    }
}
