package p7;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public interface f extends s, WritableByteChannel {
    f d(long j10);

    @Override // p7.s, java.io.Flushable
    void flush();

    f j(int i10);

    f l(int i10);

    f o(int i10);

    f q(byte[] bArr);

    f s(h hVar);

    f w(String str);
}
