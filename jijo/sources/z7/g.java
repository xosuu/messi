package z7;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final org.minidns.dnsname.a f20740b;

    public /* synthetic */ g(int i10, org.minidns.dnsname.a aVar) {
        this.f20739a = i10;
        this.f20740b = aVar;
    }

    @Override // z7.h
    public final String a() {
        int i10 = this.f20739a;
        org.minidns.dnsname.a aVar = this.f20740b;
        switch (i10) {
            case 0:
                return "No secure entry point was found for zone " + ((Object) aVar);
            default:
                return "No trust anchor was found for zone " + ((Object) aVar) + ". Try enabling DLV";
        }
    }
}
