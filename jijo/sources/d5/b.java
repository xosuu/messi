package d5;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f12367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12368b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f12367a;
            f10 += ((b) cVar).f12368b;
        }
        this.f12367a = cVar;
        this.f12368b = f10;
    }

    @Override // d5.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f12367a.a(rectF) + this.f12368b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12367a.equals(bVar.f12367a) && this.f12368b == bVar.f12368b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12367a, Float.valueOf(this.f12368b)});
    }
}
