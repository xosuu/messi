package k8;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f14751b;

    public /* synthetic */ a(b bVar, int i10) {
        this.f14750a = i10;
        this.f14751b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f14750a;
        b bVar = this.f14751b;
        switch (i10) {
            case 0:
                try {
                    b.a(bVar);
                } catch (IOException unused) {
                    return;
                }
                break;
            default:
                try {
                    b.c(bVar);
                } catch (IOException | InterruptedException unused2) {
                    return;
                }
                break;
        }
    }
}
