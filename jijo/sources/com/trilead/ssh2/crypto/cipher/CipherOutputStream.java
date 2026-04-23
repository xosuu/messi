package com.trilead.ssh2.crypto.cipher;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class CipherOutputStream {
    int blockSize;
    OutputStream bo;
    byte[] buffer;
    BlockCipher currentCipher;
    byte[] enc;
    int pos;
    final int BUFF_SIZE = 2048;
    byte[] out_buffer = new byte[2048];
    int out_buffer_pos = 0;

    public CipherOutputStream(BlockCipher blockCipher, OutputStream outputStream) {
        this.bo = outputStream;
        changeCipher(blockCipher);
    }

    private void internal_write(byte[] bArr, int i10, int i11) throws IOException {
        while (i11 > 0) {
            int i12 = this.out_buffer_pos;
            int i13 = 2048 - i12;
            if (i11 <= i13) {
                i13 = i11;
            }
            System.arraycopy(bArr, i10, this.out_buffer, i12, i13);
            i10 += i13;
            int i14 = this.out_buffer_pos + i13;
            this.out_buffer_pos = i14;
            i11 -= i13;
            if (i14 >= 2048) {
                this.bo.write(this.out_buffer, 0, 2048);
                this.out_buffer_pos = 0;
            }
        }
    }

    private void writeBlock() throws IOException {
        try {
            this.currentCipher.transformBlock(this.buffer, 0, this.enc, 0);
            internal_write(this.enc, 0, this.blockSize);
            this.pos = 0;
        } catch (Exception e10) {
            throw ((IOException) new IOException("Error while decrypting block.").initCause(e10));
        }
    }

    public void changeCipher(BlockCipher blockCipher) {
        this.currentCipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.buffer = new byte[blockSize];
        this.enc = new byte[blockSize];
        this.pos = 0;
    }

    public void flush() throws IOException {
        if (this.pos != 0) {
            throw new IOException("FATAL: cannot flush since crypto buffer is not aligned.");
        }
        int i10 = this.out_buffer_pos;
        if (i10 > 0) {
            this.bo.write(this.out_buffer, 0, i10);
            this.out_buffer_pos = 0;
        }
        this.bo.flush();
    }

    public void write(byte[] bArr, int i10, int i11) throws IOException {
        while (i11 > 0) {
            int iMin = Math.min(this.blockSize - this.pos, i11);
            System.arraycopy(bArr, i10, this.buffer, this.pos, iMin);
            int i12 = this.pos + iMin;
            this.pos = i12;
            i10 += iMin;
            i11 -= iMin;
            if (i12 >= this.blockSize) {
                writeBlock();
            }
        }
    }

    public void writePlain(int i10) throws IOException {
        if (this.pos != 0) {
            throw new IOException("Cannot write plain since crypto buffer is not aligned.");
        }
        internal_write(i10);
    }

    private void internal_write(int i10) throws IOException {
        byte[] bArr = this.out_buffer;
        int i11 = this.out_buffer_pos;
        int i12 = i11 + 1;
        this.out_buffer_pos = i12;
        bArr[i11] = (byte) i10;
        if (i12 >= 2048) {
            this.bo.write(bArr, 0, 2048);
            this.out_buffer_pos = 0;
        }
    }

    public void writePlain(byte[] bArr, int i10, int i11) throws IOException {
        if (this.pos == 0) {
            internal_write(bArr, i10, i11);
            return;
        }
        throw new IOException("Cannot write plain since crypto buffer is not aligned.");
    }

    public void write(int i10) throws IOException {
        byte[] bArr = this.buffer;
        int i11 = this.pos;
        int i12 = i11 + 1;
        this.pos = i12;
        bArr[i11] = (byte) i10;
        if (i12 >= this.blockSize) {
            writeBlock();
        }
    }
}
