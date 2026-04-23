package t;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f16796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f16797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f16798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16799d;

    public final void finalize() {
        l lVar;
        k kVar = this.f16797b;
        if (kVar != null) {
            j jVar = kVar.f16802b;
            if (!jVar.isDone()) {
                jVar.h(new c("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f16796a, 1));
            }
        }
        if (this.f16799d || (lVar = this.f16798c) == null) {
            return;
        }
        lVar.i(null);
    }
}
