package f8;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f13416d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte f13417f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v7.c f13418h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final byte[] f13419q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public transient Integer f13420s;

    public f(short s9, byte b10, byte b11, byte[] bArr) {
        v7.c cVar = v7.c.RSAMD5;
        v7.c cVar2 = (v7.c) v7.d.f17905a.get(Byte.valueOf(b11));
        byte b12 = cVar2.f17904a;
        this.f13416d = s9;
        this.f13417f = b10;
        this.f13418h = cVar2;
        this.f13419q = bArr;
    }

    @Override // f8.h
    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.f13416d);
        dataOutputStream.writeByte(this.f13417f);
        dataOutputStream.writeByte(this.f13418h.f17904a);
        dataOutputStream.write(this.f13419q);
    }

    public final DataInputStream e() {
        return new DataInputStream(new ByteArrayInputStream(this.f13419q));
    }

    public final int f() {
        if (this.f13420s == null) {
            d();
            byte[] bArr = (byte[]) this.f13425a.clone();
            long j10 = 0;
            for (int i10 = 0; i10 < bArr.length; i10++) {
                j10 += (i10 & 1) > 0 ? ((long) bArr[i10]) & 255 : (((long) bArr[i10]) & 255) << 8;
            }
            this.f13420s = Integer.valueOf((int) ((j10 + ((j10 >> 16) & 65535)) & 65535));
        }
        return this.f13420s.intValue();
    }

    public final String toString() {
        return ((int) this.f13416d) + ' ' + ((int) this.f13417f) + ' ' + this.f13418h + ' ' + b4.f.k(this.f13419q);
    }
}
