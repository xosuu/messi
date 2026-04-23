package v5;

import android.view.animation.Interpolator;
import com.google.android.gms.internal.ads.fb1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h extends l.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f17830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f17831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f17832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f17833k;

    public h(j... jVarArr) {
        super(jVarArr);
        this.f17833k = true;
    }

    @Override // l.q
    public final Object g(float f10) {
        return Float.valueOf(q(f10));
    }

    @Override // l.q
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h clone() {
        Object obj = this.f14974f;
        ArrayList arrayList = (ArrayList) obj;
        int size = ((ArrayList) obj).size();
        j[] jVarArr = new j[size];
        for (int i10 = 0; i10 < size; i10++) {
            jVarArr[i10] = ((j) ((k) arrayList.get(i10))).clone();
        }
        return new h(jVarArr);
    }

    public final float q(float f10) {
        int i10 = this.f14970b;
        if (i10 == 2) {
            if (this.f17833k) {
                this.f17833k = false;
                this.f17830h = ((j) ((ArrayList) this.f14974f).get(0)).f17834h;
                float f11 = ((j) ((ArrayList) this.f14974f).get(1)).f17834h;
                this.f17831i = f11;
                this.f17832j = f11 - this.f17830h;
            }
            Interpolator interpolator = (Interpolator) this.f14973e;
            if (interpolator != null) {
                f10 = interpolator.getInterpolation(f10);
            }
            s sVar = (s) this.f14975g;
            if (sVar == null) {
                return (f10 * this.f17832j) + this.f17830h;
            }
            return ((Number) sVar.c(f10, Float.valueOf(this.f17830h), Float.valueOf(this.f17831i))).floatValue();
        }
        if (f10 <= 0.0f) {
            j jVar = (j) ((ArrayList) this.f14974f).get(0);
            j jVar2 = (j) ((ArrayList) this.f14974f).get(1);
            float f12 = jVar.f17834h;
            float f13 = jVar2.f17834h;
            float f14 = jVar.f17835a;
            float f15 = jVar2.f17835a;
            Interpolator interpolator2 = jVar2.f17837d;
            if (interpolator2 != null) {
                f10 = interpolator2.getInterpolation(f10);
            }
            float f16 = (f10 - f14) / (f15 - f14);
            s sVar2 = (s) this.f14975g;
            return sVar2 == null ? fb1.c(f13, f12, f16, f12) : ((Number) sVar2.c(f16, Float.valueOf(f12), Float.valueOf(f13))).floatValue();
        }
        if (f10 >= 1.0f) {
            j jVar3 = (j) ((ArrayList) this.f14974f).get(i10 - 2);
            j jVar4 = (j) ((ArrayList) this.f14974f).get(this.f14970b - 1);
            float f17 = jVar3.f17834h;
            float f18 = jVar4.f17834h;
            float f19 = jVar3.f17835a;
            float f20 = jVar4.f17835a;
            Interpolator interpolator3 = jVar4.f17837d;
            if (interpolator3 != null) {
                f10 = interpolator3.getInterpolation(f10);
            }
            float f21 = (f10 - f19) / (f20 - f19);
            s sVar3 = (s) this.f14975g;
            return sVar3 == null ? fb1.c(f18, f17, f21, f17) : ((Number) sVar3.c(f21, Float.valueOf(f17), Float.valueOf(f18))).floatValue();
        }
        j jVar5 = (j) ((ArrayList) this.f14974f).get(0);
        int i11 = 1;
        while (true) {
            int i12 = this.f14970b;
            if (i11 >= i12) {
                return Float.valueOf(((j) ((k) ((ArrayList) this.f14974f).get(i12 - 1))).f17834h).floatValue();
            }
            j jVar6 = (j) ((ArrayList) this.f14974f).get(i11);
            if (f10 < jVar6.f17835a) {
                Interpolator interpolator4 = jVar6.f17837d;
                if (interpolator4 != null) {
                    f10 = interpolator4.getInterpolation(f10);
                }
                float f22 = jVar5.f17835a;
                float f23 = (f10 - f22) / (jVar6.f17835a - f22);
                float f24 = jVar5.f17834h;
                float f25 = jVar6.f17834h;
                s sVar4 = (s) this.f14975g;
                return sVar4 == null ? fb1.c(f25, f24, f23, f24) : ((Number) sVar4.c(f23, Float.valueOf(f24), Float.valueOf(f25))).floatValue();
            }
            i11++;
            jVar5 = jVar6;
        }
    }
}
