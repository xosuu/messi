package w1;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class m implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g0.f[] f18116b;

    public /* synthetic */ m(int i10) {
        this.f18115a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        switch (this.f18115a) {
            case 0:
                Rect rect = (Rect) obj;
                Rect rect2 = (Rect) obj2;
                int i10 = rect.left + ((int) ((rect2.left - r0) * f10));
                int i11 = rect.top + ((int) ((rect2.top - r1) * f10));
                int i12 = rect.right + ((int) ((rect2.right - r2) * f10));
                int i13 = rect.bottom + ((int) ((rect2.bottom - r10) * f10));
                Rect rect3 = (Rect) this.f18116b;
                if (rect3 == null) {
                    return new Rect(i10, i11, i12, i13);
                }
                rect3.set(i10, i11, i12, i13);
                return (Rect) this.f18116b;
            default:
                g0.f[] fVarArr = (g0.f[]) obj;
                g0.f[] fVarArr2 = (g0.f[]) obj2;
                if (!p7.q.a(fVarArr, fVarArr2)) {
                    throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
                }
                if (!p7.q.a(this.f18116b, fVarArr)) {
                    this.f18116b = p7.q.e(fVarArr);
                }
                for (int i14 = 0; i14 < fVarArr.length; i14++) {
                    g0.f fVar = this.f18116b[i14];
                    g0.f fVar2 = fVarArr[i14];
                    g0.f fVar3 = fVarArr2[i14];
                    fVar.getClass();
                    fVar.f13606a = fVar2.f13606a;
                    int i15 = 0;
                    while (true) {
                        float[] fArr = fVar2.f13607b;
                        if (i15 < fArr.length) {
                            fVar.f13607b[i15] = (fVar3.f13607b[i15] * f10) + ((1.0f - f10) * fArr[i15]);
                            i15++;
                        }
                    }
                }
                return this.f18116b;
        }
    }
}
