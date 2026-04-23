package com.trilead.ssh2.crypto;

import com.trilead.ssh2.crypto.digest.HashForSSH2Types;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class KeyMaterial {
    public byte[] enc_key_client_to_server;
    public byte[] enc_key_server_to_client;
    public byte[] initial_iv_client_to_server;
    public byte[] initial_iv_server_to_client;
    public byte[] integrity_key_client_to_server;
    public byte[] integrity_key_server_to_client;

    private static byte[] calculateKey(HashForSSH2Types hashForSSH2Types, BigInteger bigInteger, byte[] bArr, byte b10, byte[] bArr2, int i10) {
        byte[] bArr3 = new byte[i10];
        int digestLength = hashForSSH2Types.getDigestLength();
        int i11 = ((i10 + digestLength) - 1) / digestLength;
        byte[][] bArr4 = new byte[i11][];
        hashForSSH2Types.reset();
        hashForSSH2Types.updateBigInt(bigInteger);
        hashForSSH2Types.updateBytes(bArr);
        hashForSSH2Types.updateByte(b10);
        hashForSSH2Types.updateBytes(bArr2);
        bArr4[0] = hashForSSH2Types.getDigest();
        int iMin = Math.min(digestLength, i10);
        System.arraycopy(bArr4[0], 0, bArr3, 0, iMin);
        int i12 = i10 - iMin;
        for (int i13 = 1; i13 < i11; i13++) {
            hashForSSH2Types.updateBigInt(bigInteger);
            hashForSSH2Types.updateBytes(bArr);
            for (int i14 = 0; i14 < i13; i14++) {
                hashForSSH2Types.updateBytes(bArr4[i14]);
            }
            bArr4[i13] = hashForSSH2Types.getDigest();
            int iMin2 = Math.min(digestLength, i12);
            System.arraycopy(bArr4[i13], 0, bArr3, iMin, iMin2);
            i12 -= iMin2;
            iMin += iMin2;
        }
        return bArr3;
    }

    public static KeyMaterial create(String str, byte[] bArr, BigInteger bigInteger, byte[] bArr2, int i10, int i11, int i12, int i13, int i14, int i15) {
        KeyMaterial keyMaterial = new KeyMaterial();
        HashForSSH2Types hashForSSH2Types = new HashForSSH2Types(str);
        keyMaterial.initial_iv_client_to_server = calculateKey(hashForSSH2Types, bigInteger, bArr, (byte) 65, bArr2, i11);
        keyMaterial.initial_iv_server_to_client = calculateKey(hashForSSH2Types, bigInteger, bArr, (byte) 66, bArr2, i14);
        keyMaterial.enc_key_client_to_server = calculateKey(hashForSSH2Types, bigInteger, bArr, (byte) 67, bArr2, i10);
        keyMaterial.enc_key_server_to_client = calculateKey(hashForSSH2Types, bigInteger, bArr, (byte) 68, bArr2, i13);
        keyMaterial.integrity_key_client_to_server = calculateKey(hashForSSH2Types, bigInteger, bArr, (byte) 69, bArr2, i12);
        keyMaterial.integrity_key_server_to_client = calculateKey(hashForSSH2Types, bigInteger, bArr, (byte) 70, bArr2, i15);
        return keyMaterial;
    }
}
