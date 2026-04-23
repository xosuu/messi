package d5;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12410a;

    public h(float f10) {
        this.f12410a = f10;
    }

    @Override // d5.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f12410a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f12410a == ((h) obj).f12410a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f12410a)});
    }
}
