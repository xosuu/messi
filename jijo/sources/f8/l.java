package f8;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class l extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13439d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final org.minidns.dnsname.a f13440f;

    public l(int i10, org.minidns.dnsname.a aVar) {
        this.f13439d = i10;
        this.f13440f = aVar;
    }

    @Override // f8.h
    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.f13439d);
        this.f13440f.o(dataOutputStream);
    }

    public final String toString() {
        return this.f13439d + " " + ((Object) this.f13440f) + '.';
    }
}
