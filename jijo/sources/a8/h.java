package a8;

import f8.u;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements z7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyFactory f60a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61b;

    public h(String str, String str2) throws NoSuchAlgorithmException {
        this.f60a = KeyFactory.getInstance(str);
        this.f61b = str2;
        Signature.getInstance(str2);
    }

    public abstract PublicKey a(f8.f fVar);

    public abstract byte[] b(u uVar);
}
