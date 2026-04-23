package l7;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j extends m2.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15280d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f15281f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, Object[] objArr, int i10, ArrayList arrayList, boolean z9) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f15281f = rVar;
        this.f15280d = i10;
    }

    @Override // m2.c
    public final void b() {
        this.f15281f.f15311v.getClass();
        try {
            this.f15281f.D.E(this.f15280d, a.CANCEL);
            synchronized (this.f15281f) {
                this.f15281f.F.remove(Integer.valueOf(this.f15280d));
            }
        } catch (IOException unused) {
        }
    }
}
