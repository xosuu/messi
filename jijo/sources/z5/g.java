package z5;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.jasypt.salt.RandomSaltGenerator;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20725a = 0;

    static {
        c6.a.a(g.class);
        try {
            SecureRandom.getInstance(RandomSaltGenerator.DEFAULT_SECURE_RANDOM_ALGORITHM);
        } catch (NoSuchAlgorithmException unused) {
            new SecureRandom();
        }
    }
}
