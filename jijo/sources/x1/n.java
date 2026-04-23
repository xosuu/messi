package x1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f18354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f18355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f18356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f18358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f18359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f18360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f18364l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f18353a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
