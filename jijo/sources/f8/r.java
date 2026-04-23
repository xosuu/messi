package f8;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class r extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f13461d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient String f13462f;

    public r(byte[] bArr) {
        this.f13461d = bArr;
    }

    @Override // f8.h
    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.f13461d);
    }

    public final String toString() {
        if (this.f13462f == null) {
            this.f13462f = b4.f.k(this.f13461d);
        }
        return this.f13462f;
    }
}
