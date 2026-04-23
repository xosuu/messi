package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.k f1003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1005c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f1006d;

    public w(x xVar, androidx.fragment.app.k kVar) {
        this.f1006d = xVar;
        this.f1003a = kVar;
    }

    public final void b(boolean z9) {
        if (z9 == this.f1004b) {
            return;
        }
        this.f1004b = z9;
        int i10 = z9 ? 1 : -1;
        x xVar = this.f1006d;
        int i11 = xVar.f1010c;
        xVar.f1010c = i10 + i11;
        if (!xVar.f1011d) {
            xVar.f1011d = true;
            while (true) {
                try {
                    int i12 = xVar.f1010c;
                    if (i11 == i12) {
                        break;
                    } else {
                        i11 = i12;
                    }
                } finally {
                    xVar.f1011d = false;
                }
            }
        }
        if (this.f1004b) {
            xVar.c(this);
        }
    }

    public void c() {
    }

    public abstract boolean d();
}
