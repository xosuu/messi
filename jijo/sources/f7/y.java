package f7;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f13390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j7.h f13391b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f13392d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z f13393f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f13394h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13395q;

    public y(w wVar, z zVar, boolean z9) {
        this.f13390a = wVar;
        this.f13393f = zVar;
        this.f13394h = z9;
        this.f13391b = new j7.h(wVar, z9);
    }

    public static y c(w wVar, z zVar, boolean z9) {
        y yVar = new y(wVar, zVar, z9);
        yVar.f13392d = (n) wVar.f13375s.f13091b;
        return yVar;
    }

    public final b0 a() {
        synchronized (this) {
            if (this.f13395q) {
                throw new IllegalStateException("Already Executed");
            }
            this.f13395q = true;
        }
        this.f13391b.f14465c = m7.h.f15802a.i();
        this.f13392d.getClass();
        try {
            try {
                this.f13390a.f13369a.a(this);
                return b();
            } catch (IOException e10) {
                this.f13392d.getClass();
                throw e10;
            }
        } finally {
            this.f13390a.f13369a.b(this);
        }
    }

    public final b0 b() {
        ArrayList arrayList = new ArrayList();
        w wVar = this.f13390a;
        arrayList.addAll(wVar.f13373h);
        arrayList.add(this.f13391b);
        arrayList.add(new j7.a(wVar.f13377u));
        arrayList.add(new h7.a(0, null));
        arrayList.add(new h7.a(1, wVar));
        boolean z9 = this.f13394h;
        if (!z9) {
            arrayList.addAll(wVar.f13374q);
        }
        arrayList.add(new j7.c(z9));
        z zVar = this.f13393f;
        return new j7.g(arrayList, null, null, null, 0, zVar, this, this.f13392d, wVar.H, wVar.I, wVar.J).a(zVar);
    }

    public final Object clone() {
        return c(this.f13390a, this.f13393f, this.f13394h);
    }
}
