package net.i2p.crypto.eddsa;

/* JADX INFO: loaded from: classes.dex */
public class Utils {
    public static int bit(byte[] bArr, int i10) {
        return (bArr[i10 >> 3] >> (i10 & 7)) & 1;
    }

    public static String bytesToHex(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb.append(Character.forDigit((b10 & 240) >> 4, 16));
            sb.append(Character.forDigit(b10 & 15, 16));
        }
        return sb.toString();
    }

    public static int equal(int i10, int i11) {
        int i12 = i10 ^ i11;
        int i13 = 0;
        for (int i14 = 0; i14 < 8; i14++) {
            i13 |= i12 >> i14;
        }
        return (i13 ^ 1) & 1;
    }

    public static byte[] hexToBytes(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) (Character.digit(str.charAt(i10 + 1), 16) + (Character.digit(str.charAt(i10), 16) << 4));
        }
        return bArr;
    }

    public static int negative(int i10) {
        return (i10 >> 8) & 1;
    }

    public static int equal(byte[] bArr, byte[] bArr2) {
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            i10 |= bArr[i11] ^ bArr2[i11];
        }
        return equal(i10, 0);
    }
}
