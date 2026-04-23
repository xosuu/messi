package x1;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class i extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f0.d f18310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0.d f18312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f18315j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18316k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f18317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint.Cap f18318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Paint.Join f18319n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f18320o;

    @Override // x1.k
    public final boolean a() {
        return this.f18312g.b() || this.f18310e.b();
    }

    @Override // x1.k
    public final boolean b(int[] iArr) {
        return this.f18310e.c(iArr) | this.f18312g.c(iArr);
    }

    public float getFillAlpha() {
        return this.f18314i;
    }

    public int getFillColor() {
        return this.f18312g.f13014b;
    }

    public float getStrokeAlpha() {
        return this.f18313h;
    }

    public int getStrokeColor() {
        return this.f18310e.f13014b;
    }

    public float getStrokeWidth() {
        return this.f18311f;
    }

    public float getTrimPathEnd() {
        return this.f18316k;
    }

    public float getTrimPathOffset() {
        return this.f18317l;
    }

    public float getTrimPathStart() {
        return this.f18315j;
    }

    public void setFillAlpha(float f10) {
        this.f18314i = f10;
    }

    public void setFillColor(int i10) {
        this.f18312g.f13014b = i10;
    }

    public void setStrokeAlpha(float f10) {
        this.f18313h = f10;
    }

    public void setStrokeColor(int i10) {
        this.f18310e.f13014b = i10;
    }

    public void setStrokeWidth(float f10) {
        this.f18311f = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f18316k = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f18317l = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f18315j = f10;
    }
}
