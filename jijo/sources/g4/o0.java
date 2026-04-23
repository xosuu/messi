package g4;

import com.google.android.gms.internal.ads.fb1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f13771d;

    public o0(Object obj) {
        this.f13771d = obj;
    }

    @Override // g4.g0
    public final int b(Object[] objArr) {
        objArr[0] = this.f13771d;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f13771d.equals(obj);
    }

    @Override // g4.k0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13771d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new l0(this.f13771d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return fb1.i("[", this.f13771d.toString(), "]");
    }
}
