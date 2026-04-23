package androidx.emoji2.text;

import android.util.SparseArray;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f623a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f630h;

    public q(w wVar, boolean z9, int[] iArr) {
        this.f624b = wVar;
        this.f625c = wVar;
        this.f629g = z9;
        this.f630h = iArr;
    }

    public final int a(int i10) {
        SparseArray sparseArray = this.f625c.f650a;
        w wVar = sparseArray == null ? null : (w) sparseArray.get(i10);
        int i11 = 1;
        if (this.f623a == 2) {
            if (wVar != null) {
                this.f625c = wVar;
                this.f628f++;
            } else if (i10 == 65038) {
                b();
            } else if (i10 != 65039) {
                w wVar2 = this.f625c;
                if (wVar2.f651b != null) {
                    if (this.f628f != 1) {
                        this.f626d = wVar2;
                        b();
                    } else if (c()) {
                        this.f626d = this.f625c;
                        b();
                    } else {
                        b();
                    }
                    i11 = 3;
                } else {
                    b();
                }
            }
            i11 = 2;
        } else if (wVar == null) {
            b();
        } else {
            this.f623a = 2;
            this.f625c = wVar;
            this.f628f = 1;
            i11 = 2;
        }
        this.f627e = i10;
        return i11;
    }

    public final void b() {
        this.f623a = 1;
        this.f625c = this.f624b;
        this.f628f = 0;
    }

    public final boolean c() {
        int[] iArr;
        y0.a aVarC = this.f625c.f651b.c();
        int iA = aVarC.a(6);
        if ((iA == 0 || aVarC.f20433b.get(iA + aVarC.f20432a) == 0) && this.f627e != 65039) {
            return this.f629g && ((iArr = this.f630h) == null || Arrays.binarySearch(iArr, this.f625c.f651b.a(0)) < 0);
        }
        return true;
    }
}
