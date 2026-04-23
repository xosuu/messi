package o0;

import android.view.DisplayCutout;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f16040a;

    public j(DisplayCutout displayCutout) {
        this.f16040a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return n0.b.a(this.f16040a, ((j) obj).f16040a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f16040a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f16040a + "}";
    }
}
