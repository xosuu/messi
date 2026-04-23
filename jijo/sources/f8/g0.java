package f8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f13424d;

    public g0(DataInputStream dataInputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        this.f13424d = bArr;
        dataInputStream.readFully(bArr);
    }

    @Override // f8.h
    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.f13424d);
    }
}
