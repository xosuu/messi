package z;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f20642t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f20643u;

    @Override // z.b
    public final void e(ConstraintLayout constraintLayout) {
        d(constraintLayout);
    }

    @Override // z.b
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f20633b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 6) {
                    this.f20642t = true;
                } else if (index == 22) {
                    this.f20643u = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public abstract void j(w.g gVar, int i10, int i11);

    @Override // z.b, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f20642t || this.f20643u) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f20477b; i10++) {
                    View view = (View) constraintLayout.f412a.get(this.f20476a[i10]);
                    if (view != null) {
                        if (this.f20642t) {
                            view.setVisibility(visibility);
                        }
                        if (this.f20643u && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }
}
