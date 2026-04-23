package com.trilead.ssh2.crypto;

import com.google.android.gms.internal.ads.fb1;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class SimpleDERReader {
    byte[] buffer;
    int count;
    int pos;

    public SimpleDERReader(byte[] bArr) {
        resetInput(bArr);
    }

    private byte readByte() throws IOException {
        int i10 = this.count;
        if (i10 <= 0) {
            throw new IOException("DER byte array: out of data");
        }
        this.count = i10 - 1;
        byte[] bArr = this.buffer;
        int i11 = this.pos;
        this.pos = i11 + 1;
        return bArr[i11];
    }

    private byte[] readBytes(int i10) throws IOException {
        if (i10 > this.count) {
            throw new IOException("DER byte array: out of data");
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.buffer, this.pos, bArr, 0, i10);
        this.pos += i10;
        this.count -= i10;
        return bArr;
    }

    private int readLength() throws IOException {
        byte b10 = readByte();
        int i10 = b10 & 255;
        if ((b10 & 128) == 0) {
            return i10;
        }
        int i11 = b10 & 127;
        if (i11 == 0 || i11 > 4) {
            return -1;
        }
        int i12 = 0;
        while (i11 > 0) {
            i12 = (i12 << 8) | (readByte() & 255);
            i11--;
        }
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }

    public int available() {
        return this.count;
    }

    public int ignoreNextObject() throws IOException {
        int i10 = readByte() & 255;
        int length = readLength();
        if (length < 0 || length > available()) {
            throw new IOException(fb1.h("Illegal len in DER object (", length, ")"));
        }
        readBytes(length);
        return i10;
    }

    public SimpleDERReader readConstructed() throws IOException {
        int length = readLength();
        if (length < 0 || length > available()) {
            throw new IOException(fb1.h("Illegal length in DER object (", length, ")"));
        }
        SimpleDERReader simpleDERReader = new SimpleDERReader(this.buffer, this.pos, length);
        this.pos += length;
        this.count -= length;
        return simpleDERReader;
    }

    public int readConstructedType() throws IOException {
        byte b10 = readByte();
        int i10 = b10 & 255;
        if ((b10 & 32) == 32) {
            return b10 & 31;
        }
        throw new IOException(fb1.g("Expected constructed type, but was ", i10));
    }

    public BigInteger readInt() throws IOException {
        int i10 = readByte() & 255;
        if (i10 != 2) {
            throw new IOException(fb1.g("Expected DER Integer, but found type ", i10));
        }
        int length = readLength();
        if (length < 0 || length > available()) {
            throw new IOException(fb1.h("Illegal len in DER object (", length, ")"));
        }
        return new BigInteger(1, readBytes(length));
    }

    public byte[] readOctetString() throws IOException {
        int i10 = readByte() & 255;
        if (i10 != 4 && i10 != 3) {
            throw new IOException(fb1.g("Expected DER Octetstring, but found type ", i10));
        }
        int length = readLength();
        if (length < 0 || length > available()) {
            throw new IOException(fb1.h("Illegal len in DER object (", length, ")"));
        }
        return readBytes(length);
    }

    public String readOid() throws IOException {
        int i10 = readByte() & 255;
        if (i10 != 6) {
            throw new IOException(fb1.g("Expected DER OID, but found type ", i10));
        }
        int length = readLength();
        if (length < 1 || length > available()) {
            throw new IOException(fb1.h("Illegal len in DER object (", length, ")"));
        }
        byte[] bytes = readBytes(length);
        StringBuilder sb = new StringBuilder(64);
        int i11 = bytes[0] / 40;
        if (i11 == 0) {
            sb.append('0');
        } else if (i11 != 1) {
            sb.append('2');
            bytes[0] = (byte) (bytes[0] - 80);
        } else {
            sb.append('1');
            bytes[0] = (byte) (bytes[0] - 40);
        }
        long j10 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            byte b10 = bytes[i12];
            j10 = (j10 << 7) + ((long) (b10 & 127));
            if ((b10 & 128) == 0) {
                sb.append('.');
                sb.append(j10);
                j10 = 0;
            }
        }
        return sb.toString();
    }

    public byte[] readSequenceAsByteArray() throws IOException {
        int i10 = readByte() & 255;
        if (i10 != 48) {
            throw new IOException(fb1.g("Expected DER Sequence, but found type ", i10));
        }
        int length = readLength();
        if (length < 0 || length > available()) {
            throw new IOException(fb1.h("Illegal len in DER object (", length, ")"));
        }
        return readBytes(length);
    }

    public void resetInput(byte[] bArr, int i10, int i11) {
        this.buffer = bArr;
        this.pos = i10;
        this.count = i11;
    }

    public void resetInput(byte[] bArr) {
        resetInput(bArr, 0, bArr.length);
    }

    public SimpleDERReader(byte[] bArr, int i10, int i11) {
        resetInput(bArr, i10, i11);
    }
}
