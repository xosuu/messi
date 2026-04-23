package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import f.k0;
import f.w;
import k.o;
import l.m1;
import l.n1;
import l.x3;
import o0.d1;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TypedValue f284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f285b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f286d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f287f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TypedValue f288h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TypedValue f289q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f290s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m1 f291t;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f290s = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f288h == null) {
            this.f288h = new TypedValue();
        }
        return this.f288h;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f289q == null) {
            this.f289q = new TypedValue();
        }
        return this.f289q;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f286d == null) {
            this.f286d = new TypedValue();
        }
        return this.f286d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f287f == null) {
            this.f287f = new TypedValue();
        }
        return this.f287f;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f284a == null) {
            this.f284a = new TypedValue();
        }
        return this.f284a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f285b == null) {
            this.f285b = new TypedValue();
        }
        return this.f285b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1 m1Var = this.f291t;
        if (m1Var != null) {
            m1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b bVar;
        super.onDetachedFromWindow();
        m1 m1Var = this.f291t;
        if (m1Var != null) {
            k0 k0Var = ((w) m1Var).f12981a;
            n1 n1Var = k0Var.D;
            if (n1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) n1Var;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((x3) actionBarOverlayLayout.f254h).f15068a.f343a;
                if (actionMenuView != null && (bVar = actionMenuView.F) != null) {
                    bVar.e();
                    l.h hVar = bVar.G;
                    if (hVar != null && hVar.b()) {
                        hVar.f14498j.dismiss();
                    }
                }
            }
            if (k0Var.I != null) {
                k0Var.f12913x.getDecorView().removeCallbacks(k0Var.J);
                if (k0Var.I.isShowing()) {
                    try {
                        k0Var.I.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                k0Var.I = null;
            }
            d1 d1Var = k0Var.K;
            if (d1Var != null) {
                d1Var.b();
            }
            o oVar = k0Var.D(0).f12877h;
            if (oVar != null) {
                oVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(m1 m1Var) {
        this.f291t = m1Var;
    }
}
