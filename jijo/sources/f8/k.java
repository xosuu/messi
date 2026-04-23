package f8;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f13437d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient InetAddress f13438f;

    public k(byte[] bArr) {
        this.f13437d = bArr;
    }

    @Override // f8.h
    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.f13437d);
    }

    public final InetAddress e() {
        if (this.f13438f == null) {
            try {
                this.f13438f = InetAddress.getByAddress(this.f13437d);
            } catch (UnknownHostException e10) {
                throw new IllegalStateException(e10);
            }
        }
        return this.f13438f;
    }
}
