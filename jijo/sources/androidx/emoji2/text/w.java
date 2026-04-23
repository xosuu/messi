package androidx.emoji2.text;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f651b;

    public w(int i10) {
        this.f650a = new SparseArray(i10);
    }

    public final void a(p pVar, int i10, int i11) {
        int iA = pVar.a(i10);
        SparseArray sparseArray = this.f650a;
        w wVar = sparseArray == null ? null : (w) sparseArray.get(iA);
        if (wVar == null) {
            wVar = new w(1);
            sparseArray.put(pVar.a(i10), wVar);
        }
        if (i11 > i10) {
            wVar.a(pVar, i10 + 1, i11);
        } else {
            wVar.f651b = pVar;
        }
    }
}
