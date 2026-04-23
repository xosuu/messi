package d5;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12366a;

    public a(float f10) {
        this.f12366a = f10;
    }

    @Override // d5.c
    public final float a(RectF rectF) {
        return this.f12366a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f12366a == ((a) obj).f12366a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f12366a)});
    }
}
