package g4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13795c;

    public static final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = 0;
        boolean z9 = false;
        int i11 = 0;
        while (true) {
            int i12 = inputStream.read();
            if (i12 == -1) {
                throw new IOException("Premature connection close");
            }
            int i13 = i10 + 1;
            bArr[i10] = (byte) i12;
            if (i12 == 13) {
                i10 = i13;
                z9 = true;
            } else {
                if (i12 == 10) {
                    return i11;
                }
                if (z9) {
                    throw new IOException("Malformed line sent by the server, the line does not end correctly.");
                }
                i11++;
                if (i13 >= bArr.length) {
                    throw new IOException("The server sent a too long line, max length " + bArr.length);
                }
                i10 = i13;
            }
        }
    }
}
