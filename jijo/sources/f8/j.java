package f8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13431d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v7.c f13432f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte f13433h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v7.b f13434q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte f13435s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f13436t;

    public j(byte b10, byte b11, int i10, byte[] bArr) {
        this.f13431d = i10;
        this.f13433h = b10;
        v7.c cVar = v7.c.RSAMD5;
        this.f13432f = (v7.c) v7.d.f17905a.get(Byte.valueOf(b10));
        this.f13435s = b11;
        v7.b bVar = v7.b.SHA1;
        this.f13434q = (v7.b) v7.d.f17906b.get(Byte.valueOf(b11));
        this.f13436t = bArr;
    }

    public static i e(DataInputStream dataInputStream, int i10) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        byte b10 = dataInputStream.readByte();
        byte b11 = dataInputStream.readByte();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        if (dataInputStream.read(bArr) == i11) {
            return new i(unsignedShort, b10, b11, bArr);
        }
        throw new IOException();
    }

    @Override // f8.h
    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.f13431d);
        dataOutputStream.writeByte(this.f13433h);
        dataOutputStream.writeByte(this.f13435s);
        dataOutputStream.write(this.f13436t);
    }

    public final String toString() {
        return this.f13431d + ' ' + this.f13432f + ' ' + this.f13434q + ' ' + new BigInteger(1, this.f13436t).toString(16).toUpperCase();
    }
}
