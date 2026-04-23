package t;

/* JADX INFO: loaded from: classes.dex */
public final class j extends h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f16800t;

    public j(k kVar) {
        this.f16800t = kVar;
    }

    @Override // t.h
    public final String f() {
        i iVar = (i) this.f16800t.f16801a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f16796a + "]";
    }
}
