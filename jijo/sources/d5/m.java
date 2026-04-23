package d5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f12436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f12437d;

    public m(ArrayList arrayList, Matrix matrix) {
        this.f12436c = arrayList;
        this.f12437d = matrix;
    }

    @Override // d5.s
    public final void a(Matrix matrix, c5.a aVar, int i10, Canvas canvas) {
        Iterator it = this.f12436c.iterator();
        while (it.hasNext()) {
            ((s) it.next()).a(this.f12437d, aVar, i10, canvas);
        }
    }
}
