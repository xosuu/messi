package g4;

import com.google.android.gms.internal.ads.m01;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends m01 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13751b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13752d;

    public l0(Object obj) {
        super(2);
        this.f13751b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f13752d;
    }

    @Override // com.google.android.gms.internal.ads.m01, java.util.Iterator
    public final Object next() {
        if (this.f13752d) {
            throw new NoSuchElementException();
        }
        this.f13752d = true;
        return this.f13751b;
    }
}
