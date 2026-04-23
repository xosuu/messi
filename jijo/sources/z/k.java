package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f20609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f20610d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f20638g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 1) {
                this.f20609c = typedArrayObtainStyledAttributes.getFloat(index, this.f20609c);
            } else if (index == 0) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f20607a);
                this.f20607a = i11;
                this.f20607a = m.f20625d[i11];
            } else if (index == 4) {
                this.f20608b = typedArrayObtainStyledAttributes.getInt(index, this.f20608b);
            } else if (index == 3) {
                this.f20610d = typedArrayObtainStyledAttributes.getFloat(index, this.f20610d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
