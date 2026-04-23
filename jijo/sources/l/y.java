package l;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f15083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m2.f f15084b;

    public y(TextView textView) {
        this.f15083a = textView;
        this.f15084b = new m2.f(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((d5.e) this.f15084b.f15701b).h(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f15083a.getContext().obtainStyledAttributes(attributeSet, e.a.f12602i, i10, 0);
        try {
            boolean z9 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z9);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z9) {
        ((d5.e) this.f15084b.f15701b).q(z9);
    }

    public final void d(boolean z9) {
        ((d5.e) this.f15084b.f15701b).t(z9);
    }
}
