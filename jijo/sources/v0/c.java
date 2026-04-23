package v0;

import android.graphics.Rect;
import java.util.Comparator;
import p0.g;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f17685a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f17686b = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17687d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d5.e f17688f;

    public c(boolean z9, d5.e eVar) {
        this.f17687d = z9;
        this.f17688f = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f17688f.getClass();
        Rect rect = this.f17685a;
        ((g) obj).d(rect);
        Rect rect2 = this.f17686b;
        ((g) obj2).d(rect2);
        int i10 = rect.top;
        int i11 = rect2.top;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = rect.left;
        int i13 = rect2.left;
        boolean z9 = this.f17687d;
        if (i12 < i13) {
            return z9 ? 1 : -1;
        }
        if (i12 > i13) {
            return z9 ? -1 : 1;
        }
        int i14 = rect.bottom;
        int i15 = rect2.bottom;
        if (i14 < i15) {
            return -1;
        }
        if (i14 > i15) {
            return 1;
        }
        int i16 = rect.right;
        int i17 = rect2.right;
        if (i16 < i17) {
            return z9 ? 1 : -1;
        }
        if (i16 > i17) {
            return z9 ? -1 : 1;
        }
        return 0;
    }
}
