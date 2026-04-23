package com.trilead.ssh2.crypto;

import java.io.CharArrayWriter;

/* JADX INFO: loaded from: classes.dex */
public class Base64 {
    static final char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] decode(char[] r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.trilead.ssh2.crypto.Base64.decode(char[]):byte[]");
    }

    public static char[] encode(byte[] bArr) {
        CharArrayWriter charArrayWriter = new CharArrayWriter((bArr.length * 4) / 3);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < bArr.length; i12++) {
            i11 = i10 == 0 ? (bArr[i12] & 255) << 16 : i11 | (i10 == 1 ? (bArr[i12] & 255) << 8 : bArr[i12] & 255);
            i10++;
            if (i10 == 3) {
                char[] cArr = alphabet;
                charArrayWriter.write(cArr[i11 >> 18]);
                charArrayWriter.write(cArr[(i11 >> 12) & 63]);
                charArrayWriter.write(cArr[(i11 >> 6) & 63]);
                charArrayWriter.write(cArr[i11 & 63]);
                i10 = 0;
            }
        }
        if (i10 == 1) {
            char[] cArr2 = alphabet;
            charArrayWriter.write(cArr2[i11 >> 18]);
            charArrayWriter.write(cArr2[(i11 >> 12) & 63]);
            charArrayWriter.write(61);
            charArrayWriter.write(61);
        }
        if (i10 == 2) {
            char[] cArr3 = alphabet;
            charArrayWriter.write(cArr3[i11 >> 18]);
            charArrayWriter.write(cArr3[(i11 >> 12) & 63]);
            charArrayWriter.write(cArr3[(i11 >> 6) & 63]);
            charArrayWriter.write(61);
        }
        return charArrayWriter.toCharArray();
    }
}
