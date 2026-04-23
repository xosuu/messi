package com.trilead.ssh2.crypto.cipher;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class CipherInputStream {
    InputStream bi;
    int blockSize;
    byte[] buffer;
    BlockCipher currentCipher;
    byte[] enc;
    int pos;
    final int BUFF_SIZE = 2048;
    byte[] input_buffer = new byte[2048];
    int input_buffer_pos = 0;
    int input_buffer_size = 0;

    public CipherInputStream(BlockCipher blockCipher, InputStream inputStream) {
        this.bi = inputStream;
        changeCipher(blockCipher);
    }

    private int fill_buffer() throws IOException {
        this.input_buffer_pos = 0;
        int i10 = this.bi.read(this.input_buffer, 0, 2048);
        this.input_buffer_size = i10;
        return i10;
    }

    private void getBlock() throws IOException {
        int i10 = 0;
        while (true) {
            int i11 = this.blockSize;
            if (i10 >= i11) {
                try {
                    this.currentCipher.transformBlock(this.enc, 0, this.buffer, 0);
                    this.pos = 0;
                    return;
                } catch (Exception unused) {
                    throw new IOException("Error while decrypting block.");
                }
            } else {
                int iInternal_read = internal_read(this.enc, i10, i11 - i10);
                if (iInternal_read < 0) {
                    throw new IOException("Cannot read full block, EOF reached.");
                }
                i10 += iInternal_read;
            }
        }
    }

    private int internal_read(byte[] bArr, int i10, int i11) {
        int i12 = this.input_buffer_size;
        if (i12 < 0) {
            return -1;
        }
        if (this.input_buffer_pos >= i12 && fill_buffer() <= 0) {
            return -1;
        }
        int i13 = this.input_buffer_size;
        int i14 = this.input_buffer_pos;
        int i15 = i13 - i14;
        if (i11 > i15) {
            i11 = i15;
        }
        System.arraycopy(this.input_buffer, i14, bArr, i10, i11);
        this.input_buffer_pos += i11;
        return i11;
    }

    public void changeCipher(BlockCipher blockCipher) {
        this.currentCipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.buffer = new byte[blockSize];
        this.enc = new byte[blockSize];
        this.pos = blockSize;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int readPlain(byte[] bArr, int i10, int i11) throws IOException {
        if (this.pos != this.blockSize) {
            throw new IOException("Cannot read plain since crypto buffer is not aligned.");
        }
        int i12 = 0;
        while (i12 < i11) {
            int iInternal_read = internal_read(bArr, i10 + i12, i11 - i12);
            if (iInternal_read < 0) {
                throw new IOException("Cannot fill buffer, EOF reached.");
            }
            i12 += iInternal_read;
        }
        return i12;
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i11 > 0) {
            if (this.pos >= this.blockSize) {
                getBlock();
            }
            int iMin = Math.min(this.blockSize - this.pos, i11);
            System.arraycopy(this.buffer, this.pos, bArr, i10, iMin);
            this.pos += iMin;
            i10 += iMin;
            i11 -= iMin;
            i12 += iMin;
        }
        return i12;
    }

    public int read() throws IOException {
        if (this.pos >= this.blockSize) {
            getBlock();
        }
        byte[] bArr = this.buffer;
        int i10 = this.pos;
        this.pos = i10 + 1;
        return bArr[i10] & 255;
    }
}
