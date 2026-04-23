package xyz.easypro.ecrypt.utils;

import androidx.annotation.Keep;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public class Crypt {
    static {
        System.loadLibrary(a.a("瓢凒⋹콲䓘È\u0001"));
    }

    public static String a(String str) {
        byte[] bArr;
        try {
            if (str.length() < 1) {
                bArr = null;
            } else {
                bArr = new byte[str.length() / 2];
                for (int i10 = 0; i10 < str.length() / 2; i10++) {
                    int i11 = i10 * 2;
                    int i12 = i11 + 1;
                    bArr[i10] = (byte) ((Integer.parseInt(str.substring(i11, i12), 16) * 16) + Integer.parseInt(str.substring(i12, i11 + 2), 16));
                }
            }
            return new String(easyCrypt(bArr), xrc("-\u000b\u001cUg"));
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    @Keep
    public static native int[] arrInt();

    @Keep
    private static native byte[] easyCrypt(byte[] bArr);

    @Keep
    public static native byte[] load(byte[] bArr);

    @Keep
    public static native String xrc(String str);
}
