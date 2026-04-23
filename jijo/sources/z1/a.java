package z1;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import l.h2;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataSetObservable f20669a = new DataSetObservable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DataSetObserver f20670b;

    public abstract void a(ViewGroup viewGroup, int i10, Object obj);

    public void b() {
    }

    public abstract int c();

    public int d() {
        return -1;
    }

    public CharSequence e(int i10) {
        return null;
    }

    public abstract Object f(ViewGroup viewGroup, int i10);

    public abstract boolean g(View view, Object obj);

    public final void h() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f20670b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f20669a.notifyChanged();
    }

    public void i(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable j() {
        return null;
    }

    public void k(Object obj) {
    }

    public final void l(h2 h2Var) {
        synchronized (this) {
            this.f20670b = h2Var;
        }
    }

    public void m(ViewGroup viewGroup) {
    }
}
