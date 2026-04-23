package l7;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class o extends m2.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15294d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15295f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15296h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ r f15297q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, boolean z9, int i10, int i11) {
        super("OkHttp %s ping %08x%08x", new Object[]{rVar.f15305f, Integer.valueOf(i10), Integer.valueOf(i11)});
        this.f15297q = rVar;
        this.f15294d = z9;
        this.f15295f = i10;
        this.f15296h = i11;
    }

    @Override // m2.c
    public final void b() {
        boolean z9;
        r rVar = this.f15297q;
        boolean z10 = this.f15294d;
        int i10 = this.f15295f;
        int i11 = this.f15296h;
        if (z10) {
            rVar.getClass();
        } else {
            synchronized (rVar) {
                z9 = rVar.f15312w;
                rVar.f15312w = true;
            }
            if (z9) {
                rVar.c();
                return;
            }
        }
        try {
            rVar.D.D(i10, i11, z10);
        } catch (IOException unused) {
            rVar.c();
        }
    }
}
