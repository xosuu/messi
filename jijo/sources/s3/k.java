package s3;

import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import v3.f0;
import v3.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16699b;

    public k(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 0);
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.f16699b = Arrays.hashCode(bArr);
    }

    public static byte[] t(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract byte[] a0();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof r)) {
            try {
                r rVar = (r) obj;
                if (((k) rVar).f16699b != this.f16699b) {
                    return false;
                }
                return Arrays.equals(a0(), (byte[]) a4.b.a0(new a4.b(((k) rVar).a0())));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16699b;
    }
}
