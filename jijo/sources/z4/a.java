package z4;

import android.R;
import android.content.res.ColorStateList;
import g4.a0;
import l.g0;
import s0.b;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[][] f20698s = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f20699h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f20700q;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f20699h == null) {
            int i10 = a0.i(this, xyz.easypro.httpcustom.R.attr.gt);
            int i11 = a0.i(this, xyz.easypro.httpcustom.R.attr.h8);
            int i12 = a0.i(this, xyz.easypro.httpcustom.R.attr.ho);
            this.f20699h = new ColorStateList(f20698s, new int[]{a0.p(1.0f, i12, i10), a0.p(0.54f, i12, i11), a0.p(0.38f, i12, i11), a0.p(0.38f, i12, i11)});
        }
        return this.f20699h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f20700q && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z9) {
        this.f20700q = z9;
        if (z9) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
