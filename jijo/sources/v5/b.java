package v5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f17808a = null;

    public final void a(a aVar) {
        if (this.f17808a == null) {
            this.f17808a = new ArrayList();
        }
        this.f17808a.add(aVar);
    }

    public b b() {
        try {
            b bVar = (b) super.clone();
            ArrayList arrayList = this.f17808a;
            if (arrayList != null) {
                bVar.f17808a = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bVar.f17808a.add(arrayList.get(i10));
                }
            }
            return bVar;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public abstract void c();

    public abstract boolean d();

    public final void e(a aVar) {
        ArrayList arrayList = this.f17808a;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(aVar);
        if (this.f17808a.size() == 0) {
            this.f17808a = null;
        }
    }

    public abstract void f();
}
