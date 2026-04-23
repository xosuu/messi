package e6;

import com.trilead.ssh2.crypto.cipher.BlockCipher;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ o[] f12736f = {new j("DESEDE_CBC", 0, 24, 8, "des-ede3-cbc", new String[0]), new k("DES_CBC", 1, 8, 8, "des-cbc", new String[0]), new l("AES128_CBC", 2, 16, 16, "aes-128-cbc", new String[]{"aes128-cbc"}), new m("AES192_CBC", 3, 24, 16, "aes-192-cbc", new String[]{"aes192-cbc"}), new n("AES256_CBC", 4, 32, 16, "aes-256-cbc", new String[]{"aes256-cbc"})};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f12737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12738b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12739d;

    /* JADX INFO: Fake field, exist only in values array */
    o EF15;

    public o(String str, int i10, int i11, int i12, String str2, String[] strArr) {
        this.f12738b = i11;
        this.f12739d = i12;
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = str2;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        this.f12737a = strArr2;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f12736f.clone();
    }

    public abstract BlockCipher a(byte[] bArr, byte[] bArr2);
}
