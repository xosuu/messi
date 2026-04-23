package b4;

import com.google.android.gms.internal.ads.eb1;
import com.google.android.gms.internal.ads.h71;
import com.google.android.gms.internal.ads.p51;
import com.google.android.gms.internal.ads.x51;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
import org.jasypt.salt.RandomSaltGenerator;

/* JADX INFO: loaded from: classes.dex */
public final class h extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1328a;

    public final ArrayList a() {
        switch (this.f1328a) {
        }
        return new ArrayList();
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        SecureRandom secureRandom;
        switch (this.f1328a) {
            case 0:
                return 0L;
            case 1:
                return ByteBuffer.allocate(32);
            case 2:
                try {
                    Cipher cipher = (Cipher) eb1.f3896b.f3898a.zza("ChaCha20-Poly1305");
                    if (p51.b(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException unused) {
                    return null;
                }
            case 3:
                try {
                    return (Cipher) eb1.f3896b.f3898a.zza("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            case 4:
                try {
                    Cipher cipher2 = (Cipher) eb1.f3896b.f3898a.zza("AES/GCM-SIV/NoPadding");
                    if (x51.b(cipher2)) {
                        return cipher2;
                    }
                    return null;
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
            case 5:
                h hVar = h71.f5230a;
                try {
                } catch (GeneralSecurityException unused2) {
                    secureRandom = new SecureRandom();
                }
                try {
                    try {
                        try {
                            try {
                                secureRandom = SecureRandom.getInstance(RandomSaltGenerator.DEFAULT_SECURE_RANDOM_ALGORITHM, "GmsCore_OpenSSL");
                            } catch (GeneralSecurityException unused3) {
                                secureRandom = SecureRandom.getInstance(RandomSaltGenerator.DEFAULT_SECURE_RANDOM_ALGORITHM, (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", new Class[0]).invoke(null, new Object[0]));
                            }
                        } catch (GeneralSecurityException unused4) {
                            secureRandom = SecureRandom.getInstance(RandomSaltGenerator.DEFAULT_SECURE_RANDOM_ALGORITHM, "Conscrypt");
                        }
                        break;
                    } catch (GeneralSecurityException unused5) {
                        secureRandom = SecureRandom.getInstance(RandomSaltGenerator.DEFAULT_SECURE_RANDOM_ALGORITHM, "AndroidOpenSSL");
                        break;
                    }
                    secureRandom.nextLong();
                    return secureRandom;
                } catch (ClassNotFoundException e12) {
                    e = e12;
                    throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                } catch (IllegalAccessException e13) {
                    e = e13;
                    throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                } catch (IllegalArgumentException e14) {
                    e = e14;
                    throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                } catch (NoSuchMethodException e15) {
                    e = e15;
                    throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                } catch (InvocationTargetException e16) {
                    e = e16;
                    throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                }
            case 6:
                try {
                    return (Cipher) eb1.f3896b.f3898a.zza("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e17) {
                    throw new IllegalStateException(e17);
                }
            case 7:
                try {
                    return (Cipher) eb1.f3896b.f3898a.zza("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e18) {
                    throw new IllegalStateException(e18);
                }
            case 8:
                try {
                    return (Cipher) eb1.f3896b.f3898a.zza("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e19) {
                    throw new IllegalStateException(e19);
                }
            case 9:
                try {
                    return (Cipher) eb1.f3896b.f3898a.zza("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e20) {
                    throw new IllegalStateException(e20);
                }
            case 10:
                return a();
            case 11:
                return a();
            case 12:
                return a();
            case 13:
                return a();
            case 14:
                return a();
            case 15:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(g7.b.f13892e);
                return simpleDateFormat;
        }
    }

    public h() {
        this.f1328a = 1;
    }
}
