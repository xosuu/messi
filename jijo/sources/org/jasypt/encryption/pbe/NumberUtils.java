package org.jasypt.encryption.pbe;

import org.jasypt.exceptions.EncryptionOperationNotPossibleException;

/* JADX INFO: loaded from: classes.dex */
final class NumberUtils {
    private NumberUtils() {
    }

    public static byte[] byteArrayFromInt(int i10) {
        return new byte[]{(byte) ((i10 >> 24) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 8) & 255), (byte) (i10 & 255)};
    }

    public static int intFromByteArray(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("Cannot convert an empty array into an int");
        }
        int i10 = bArr[0] & 255;
        for (int i11 = 1; i11 < bArr.length; i11++) {
            i10 = (i10 << 8) | (bArr[i11] & 255);
        }
        return i10;
    }

    private static int maxSafeSizeInBytes() {
        long jMaxMemory = Runtime.getRuntime().maxMemory();
        return (int) (((jMaxMemory - Runtime.getRuntime().totalMemory()) + Runtime.getRuntime().freeMemory()) / 2);
    }

    public static byte[] processBigIntegerEncryptedByteArray(byte[] bArr, int i10) {
        if (bArr.length <= 4) {
            return (byte[]) bArr.clone();
        }
        byte[] bArr2 = new byte[4];
        int length = bArr.length - 4;
        System.arraycopy(bArr, length, bArr2, 0, 4);
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        int iIntFromByteArray = intFromByteArray(bArr2);
        if (iIntFromByteArray < 0 || iIntFromByteArray > maxSafeSizeInBytes()) {
            throw new EncryptionOperationNotPossibleException();
        }
        if (length == iIntFromByteArray) {
            return bArr3;
        }
        int i11 = iIntFromByteArray - length;
        byte[] bArr4 = new byte[iIntFromByteArray];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr4[i12] = i10 >= 0 ? (byte) 0 : (byte) -1;
        }
        System.arraycopy(bArr3, 0, bArr4, i11, length);
        return bArr4;
    }
}
