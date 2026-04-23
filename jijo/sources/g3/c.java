package g3;

import android.graphics.Canvas;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.github.clans.fab.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ShapeDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FloatingActionButton f13641c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FloatingActionButton floatingActionButton, OvalShape ovalShape) {
        int iAbs;
        super(ovalShape);
        this.f13641c = floatingActionButton;
        int iAbs2 = 0;
        if (floatingActionButton.f()) {
            iAbs = Math.abs(floatingActionButton.f1788h) + floatingActionButton.f1785f;
        } else {
            iAbs = 0;
        }
        this.f13639a = iAbs;
        if (floatingActionButton.f()) {
            iAbs2 = Math.abs(floatingActionButton.f1792q) + floatingActionButton.f1785f;
        }
        this.f13640b = iAbs2;
        if (floatingActionButton.F) {
            int i10 = floatingActionButton.G;
            this.f13639a = iAbs + i10;
            this.f13640b = iAbs2 + i10;
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        PorterDuffXfermode porterDuffXfermode = FloatingActionButton.f1776k0;
        FloatingActionButton floatingActionButton = this.f13641c;
        int iC = floatingActionButton.c();
        int i10 = this.f13639a;
        int iB = floatingActionButton.b();
        int i11 = this.f13640b;
        setBounds(i10, i11, iC - i10, iB - i11);
        super.draw(canvas);
    }
}
