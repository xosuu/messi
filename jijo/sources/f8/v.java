package f8;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class v extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final org.minidns.dnsname.a f13475d;

    public v(org.minidns.dnsname.a aVar) {
        this.f13475d = aVar;
    }

    @Override // f8.h
    public final void a(DataOutputStream dataOutputStream) throws IOException {
        this.f13475d.o(dataOutputStream);
    }

    public final String toString() {
        return ((Object) this.f13475d) + ".";
    }
}
