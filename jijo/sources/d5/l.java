package d5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t[] f12424a = new t[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix[] f12425b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix[] f12426c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointF f12427d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f12428e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f12429f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f12430g = new t();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f12431h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f12432i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f12433j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f12434k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f12435l = true;

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f12424a[i10] = new t();
            this.f12425b[i10] = new Matrix();
            this.f12426c[i10] = new Matrix();
        }
    }

    public final void a(j jVar, float f10, RectF rectF, k.q qVar, Path path) {
        int i10;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        t[] tVarArr;
        Path path2;
        k.q qVar2;
        int i11;
        l lVar = this;
        k.q qVar3 = qVar;
        Path path3 = path;
        path.rewind();
        Path path4 = lVar.f12428e;
        path4.rewind();
        Path path5 = lVar.f12429f;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i12 = 0;
        while (true) {
            i10 = 4;
            matrixArr = lVar.f12426c;
            fArr = lVar.f12431h;
            matrixArr2 = lVar.f12425b;
            tVarArr = lVar.f12424a;
            if (i12 >= 4) {
                break;
            }
            c cVar = i12 != 1 ? i12 != 2 ? i12 != 3 ? jVar.f12416f : jVar.f12415e : jVar.f12418h : jVar.f12417g;
            b4.f fVar = i12 != 1 ? i12 != 2 ? i12 != 3 ? jVar.f12412b : jVar.f12411a : jVar.f12414d : jVar.f12413c;
            t tVar = tVarArr[i12];
            fVar.getClass();
            fVar.m(f10, cVar.a(rectF), tVar);
            int i13 = i12 + 1;
            float f11 = (i13 % 4) * 90;
            matrixArr2[i12].reset();
            PointF pointF = lVar.f12427d;
            if (i12 == 1) {
                i11 = i13;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i12 == 2) {
                i11 = i13;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i12 != 3) {
                i11 = i13;
                pointF.set(rectF.right, rectF.top);
            } else {
                i11 = i13;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i12].setTranslate(pointF.x, pointF.y);
            matrixArr2[i12].preRotate(f11);
            t tVar2 = tVarArr[i12];
            fArr[0] = tVar2.f12456c;
            fArr[1] = tVar2.f12457d;
            matrixArr2[i12].mapPoints(fArr);
            matrixArr[i12].reset();
            matrixArr[i12].setTranslate(fArr[0], fArr[1]);
            matrixArr[i12].preRotate(f11);
            i12 = i11;
        }
        int i14 = 0;
        while (i14 < i10) {
            t tVar3 = tVarArr[i14];
            fArr[0] = tVar3.f12454a;
            fArr[1] = tVar3.f12455b;
            matrixArr2[i14].mapPoints(fArr);
            if (i14 == 0) {
                path3.moveTo(fArr[0], fArr[1]);
            } else {
                path3.lineTo(fArr[0], fArr[1]);
            }
            tVarArr[i14].b(matrixArr2[i14], path3);
            if (qVar3 != null) {
                t tVar4 = tVarArr[i14];
                Matrix matrix = matrixArr2[i14];
                BitSet bitSet = ((g) qVar3.f14587b).f12399f;
                tVar4.getClass();
                bitSet.set(i14, false);
                s[] sVarArr = ((g) qVar3.f14587b).f12397b;
                tVar4.a(tVar4.f12459f);
                sVarArr[i14] = new m(new ArrayList(tVar4.f12461h), new Matrix(matrix));
            }
            int i15 = i14 + 1;
            int i16 = i15 % 4;
            t tVar5 = tVarArr[i14];
            fArr[0] = tVar5.f12456c;
            fArr[1] = tVar5.f12457d;
            matrixArr2[i14].mapPoints(fArr);
            t tVar6 = tVarArr[i16];
            float f12 = tVar6.f12454a;
            float[] fArr2 = lVar.f12432i;
            fArr2[0] = f12;
            fArr2[1] = tVar6.f12455b;
            matrixArr2[i16].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            t tVar7 = tVarArr[i14];
            fArr[0] = tVar7.f12456c;
            fArr[1] = tVar7.f12457d;
            matrixArr2[i14].mapPoints(fArr);
            if (i14 == 1 || i14 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            t tVar8 = lVar.f12430g;
            tVar8.d(0.0f, 270.0f, 0.0f);
            (i14 != 1 ? i14 != 2 ? i14 != 3 ? jVar.f12420j : jVar.f12419i : jVar.f12422l : jVar.f12421k).getClass();
            tVar8.c(fMax, 0.0f);
            Path path6 = lVar.f12433j;
            path6.reset();
            tVar8.b(matrixArr[i14], path6);
            if (lVar.f12435l && (lVar.b(path6, i14) || lVar.b(path6, i16))) {
                path6.op(path6, path5, Path.Op.DIFFERENCE);
                fArr[0] = tVar8.f12454a;
                fArr[1] = tVar8.f12455b;
                matrixArr[i14].mapPoints(fArr);
                path4.moveTo(fArr[0], fArr[1]);
                tVar8.b(matrixArr[i14], path4);
                qVar2 = qVar;
                path2 = path;
            } else {
                path2 = path;
                tVar8.b(matrixArr[i14], path2);
                qVar2 = qVar;
            }
            if (qVar2 != null) {
                Matrix matrix2 = matrixArr[i14];
                ((g) qVar2.f14587b).f12399f.set(i14 + 4, false);
                s[] sVarArr2 = ((g) qVar2.f14587b).f12398d;
                tVar8.a(tVar8.f12459f);
                sVarArr2[i14] = new m(new ArrayList(tVar8.f12461h), new Matrix(matrix2));
            }
            lVar = this;
            path3 = path2;
            i14 = i15;
            i10 = 4;
            qVar3 = qVar2;
        }
        Path path7 = path3;
        path.close();
        path4.close();
        if (path4.isEmpty()) {
            return;
        }
        path7.op(path4, Path.Op.UNION);
    }

    public final boolean b(Path path, int i10) {
        Path path2 = this.f12434k;
        path2.reset();
        this.f12424a[i10].b(this.f12425b[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
