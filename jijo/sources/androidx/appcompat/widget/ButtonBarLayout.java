package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f282b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f283d;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f283d = -1;
        int[] iArr = e.a.f12604k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        v0.p(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f281a = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f281a);
        }
    }

    private void setStacked(boolean z9) {
        if (this.f282b != z9) {
            if (!z9 || this.f281a) {
                this.f282b = z9;
                setOrientation(z9 ? 1 : 0);
                setGravity(z9 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.u0);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z9 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }

    public void setAllowStacking(boolean z9) {
        if (this.f281a != z9) {
            this.f281a = z9;
            if (!z9 && this.f282b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
