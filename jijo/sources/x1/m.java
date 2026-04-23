package x1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Matrix f18337p = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f18338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f18339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f18340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f18341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f18342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PathMeasure f18343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f18344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f18347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f18350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f18351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s.b f18352o;

    public m() {
        this.f18340c = new Matrix();
        this.f18345h = 0.0f;
        this.f18346i = 0.0f;
        this.f18347j = 0.0f;
        this.f18348k = 0.0f;
        this.f18349l = 255;
        this.f18350m = null;
        this.f18351n = null;
        this.f18352o = new s.b();
        this.f18344g = new j();
        this.f18338a = new Path();
        this.f18339b = new Path();
    }

    public final void a(j jVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f10;
        jVar.f18321a.set(matrix);
        Matrix matrix2 = jVar.f18321a;
        matrix2.preConcat(jVar.f18330j);
        canvas.save();
        char c10 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = jVar.f18322b;
            if (i13 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            k kVar = (k) arrayList.get(i13);
            if (kVar instanceof j) {
                a((j) kVar, matrix2, canvas, i10, i11);
            } else {
                if (kVar instanceof l) {
                    l lVar = (l) kVar;
                    float f11 = i10 / this.f18347j;
                    float f12 = i11 / this.f18348k;
                    float fMin = Math.min(f11, f12);
                    Matrix matrix3 = this.f18340c;
                    matrix3.set(matrix2);
                    matrix3.postScale(f11, f12);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c10], fArr[1]);
                    i12 = i13;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f13 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f13) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        lVar.getClass();
                        Path path = this.f18338a;
                        path.reset();
                        g0.f[] fVarArr = lVar.f18333a;
                        if (fVarArr != null) {
                            g0.f.b(fVarArr, path);
                        }
                        Path path2 = this.f18339b;
                        path2.reset();
                        if (lVar instanceof h) {
                            path2.setFillType(lVar.f18335c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix3);
                            canvas.clipPath(path2);
                        } else {
                            i iVar = (i) lVar;
                            float f14 = iVar.f18315j;
                            if (f14 != 0.0f || iVar.f18316k != 1.0f) {
                                float f15 = iVar.f18317l;
                                float f16 = (f14 + f15) % 1.0f;
                                float f17 = (iVar.f18316k + f15) % 1.0f;
                                if (this.f18343f == null) {
                                    this.f18343f = new PathMeasure();
                                }
                                this.f18343f.setPath(path, false);
                                float length = this.f18343f.getLength();
                                float f18 = f16 * length;
                                float f19 = f17 * length;
                                path.reset();
                                if (f18 > f19) {
                                    this.f18343f.getSegment(f18, length, path, true);
                                    f10 = 0.0f;
                                    this.f18343f.getSegment(0.0f, f19, path, true);
                                } else {
                                    f10 = 0.0f;
                                    this.f18343f.getSegment(f18, f19, path, true);
                                }
                                path.rLineTo(f10, f10);
                            }
                            path2.addPath(path, matrix3);
                            f0.d dVar = iVar.f18312g;
                            if ((((Shader) dVar.f13015c) == null && dVar.f13014b == 0) ? false : true) {
                                if (this.f18342e == null) {
                                    Paint paint = new Paint(1);
                                    this.f18342e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f18342e;
                                Object obj = dVar.f13015c;
                                if (((Shader) obj) != null) {
                                    Shader shader = (Shader) obj;
                                    shader.setLocalMatrix(matrix3);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(iVar.f18314i * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i14 = dVar.f13014b;
                                    float f20 = iVar.f18314i;
                                    PorterDuff.Mode mode = p.f18366v;
                                    paint2.setColor((i14 & 16777215) | (((int) (Color.alpha(i14) * f20)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(iVar.f18335c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            f0.d dVar2 = iVar.f18310e;
                            if (((Shader) dVar2.f13015c) != null || dVar2.f13014b != 0) {
                                if (this.f18341d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f18341d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f18341d;
                                Paint.Join join = iVar.f18319n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = iVar.f18318m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(iVar.f18320o);
                                Object obj2 = dVar2.f13015c;
                                if (((Shader) obj2) != null) {
                                    Shader shader2 = (Shader) obj2;
                                    shader2.setLocalMatrix(matrix3);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(iVar.f18313h * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i15 = dVar2.f13014b;
                                    float f21 = iVar.f18313h;
                                    PorterDuff.Mode mode2 = p.f18366v;
                                    paint4.setColor((i15 & 16777215) | (((int) (Color.alpha(i15) * f21)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(iVar.f18311f * fAbs * fMin);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i13 = i12 + 1;
                c10 = 0;
            }
            i12 = i13;
            i13 = i12 + 1;
            c10 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f18349l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f18349l = i10;
    }

    public m(m mVar) {
        this.f18340c = new Matrix();
        this.f18345h = 0.0f;
        this.f18346i = 0.0f;
        this.f18347j = 0.0f;
        this.f18348k = 0.0f;
        this.f18349l = 255;
        this.f18350m = null;
        this.f18351n = null;
        s.b bVar = new s.b();
        this.f18352o = bVar;
        this.f18344g = new j(mVar.f18344g, bVar);
        this.f18338a = new Path(mVar.f18338a);
        this.f18339b = new Path(mVar.f18339b);
        this.f18345h = mVar.f18345h;
        this.f18346i = mVar.f18346i;
        this.f18347j = mVar.f18347j;
        this.f18348k = mVar.f18348k;
        this.f18349l = mVar.f18349l;
        this.f18350m = mVar.f18350m;
        String str = mVar.f18350m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f18351n = mVar.f18351n;
    }
}
