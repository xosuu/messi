package x1;

import p7.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0.f[] f18333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18336d;

    public l() {
        this.f18333a = null;
        this.f18335c = 0;
    }

    public g0.f[] getPathData() {
        return this.f18333a;
    }

    public String getPathName() {
        return this.f18334b;
    }

    public void setPathData(g0.f[] fVarArr) {
        if (!q.a(this.f18333a, fVarArr)) {
            this.f18333a = q.e(fVarArr);
            return;
        }
        g0.f[] fVarArr2 = this.f18333a;
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            fVarArr2[i10].f13606a = fVarArr[i10].f13606a;
            int i11 = 0;
            while (true) {
                float[] fArr = fVarArr[i10].f13607b;
                if (i11 < fArr.length) {
                    fVarArr2[i10].f13607b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f18333a = null;
        this.f18335c = 0;
        this.f18334b = lVar.f18334b;
        this.f18336d = lVar.f18336d;
        this.f18333a = q.e(lVar.f18333a);
    }
}
