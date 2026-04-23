package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class jc extends hc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MessageDigest f5886c;

    @Override // com.google.android.gms.internal.ads.hc
    public final byte[] i(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i10 = 4;
        if (length == 1) {
            int iW = b4.f.W(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iW);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    int iW2 = b4.f.W(strArrSplit[i11]);
                    int i12 = (iW2 >> 16) ^ ((char) iW2);
                    int i13 = i11 + i11;
                    bArr[i13] = (byte) i12;
                    bArr[i13 + 1] = (byte) (i12 >> 8);
                }
            } else {
                bArr = new byte[length];
                for (int i14 = 0; i14 < strArrSplit.length; i14++) {
                    int iW3 = b4.f.W(strArrSplit[i14]);
                    bArr[i14] = (byte) ((iW3 >> 24) ^ (((iW3 & 255) ^ ((iW3 >> 8) & 255)) ^ ((iW3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f5886c = h();
        synchronized (this.f5252a) {
            try {
                MessageDigest messageDigest = this.f5886c;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f5886c.update(bArrArray);
                byte[] bArrDigest = this.f5886c.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i10 = length2;
                }
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i10);
                return bArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
