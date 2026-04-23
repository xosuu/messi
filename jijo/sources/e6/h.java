package e6;

import java.security.Provider;
import java.security.PublicKey;
import java.util.List;
import net.i2p.crypto.eddsa.EdDSASecurityProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f12734c;

    public h(String str, String str2, EdDSASecurityProvider edDSASecurityProvider) {
        this.f12732a = str;
        this.f12733b = str2;
        this.f12734c = edDSASecurityProvider;
    }

    public abstract PublicKey a(byte[] bArr);

    public abstract byte[] b(byte[] bArr);

    public abstract List c();
}
