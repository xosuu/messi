package m5;

import com.google.android.gms.internal.ads.m01;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g extends m01 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15761b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15762d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Object obj) {
        super(3);
        this.f15762d = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f15761b;
    }

    @Override // com.google.android.gms.internal.ads.m01, java.util.Iterator
    public final Object next() {
        if (this.f15761b) {
            throw new NoSuchElementException();
        }
        this.f15761b = true;
        return this.f15762d;
    }
}
