package f8;

import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class p extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f13452d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte f13453f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte f13454h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f13455q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte[] f13456s;

    public p(byte b10, byte b11, int i10, byte[] bArr) {
        this.f13453f = b10;
        n nVar = n.SHA1;
        this.f13452d = (n) o.f13443w.get(Byte.valueOf(b10));
        this.f13454h = b11;
        this.f13455q = i10;
        this.f13456s = bArr;
    }

    @Override // f8.h
    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.f13453f);
        dataOutputStream.writeByte(this.f13454h);
        dataOutputStream.writeShort(this.f13455q);
        byte[] bArr = this.f13456s;
        dataOutputStream.writeByte(bArr.length);
        dataOutputStream.write(bArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13452d);
        sb.append(' ');
        sb.append((int) this.f13454h);
        sb.append(' ');
        sb.append(this.f13455q);
        sb.append(' ');
        byte[] bArr = this.f13456s;
        sb.append(bArr.length == 0 ? "-" : new BigInteger(1, bArr).toString(16).toUpperCase());
        return sb.toString();
    }
}
