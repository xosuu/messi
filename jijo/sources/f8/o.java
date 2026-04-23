package f8;

import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o extends h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final HashMap f13443w = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f13444d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte f13445f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte f13446h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f13447q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte[] f13448s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f13449t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final byte[] f13450u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f13451v;

    public o(byte b10, byte b11, int i10, byte[] bArr, byte[] bArr2, ArrayList arrayList) {
        this.f13445f = b10;
        n nVar = n.SHA1;
        this.f13444d = (n) f13443w.get(Byte.valueOf(b10));
        this.f13446h = b11;
        this.f13447q = i10;
        this.f13448s = bArr;
        this.f13449t = bArr2;
        this.f13451v = arrayList;
        this.f13450u = q.e(arrayList);
    }

    @Override // f8.h
    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.f13445f);
        dataOutputStream.writeByte(this.f13446h);
        dataOutputStream.writeShort(this.f13447q);
        byte[] bArr = this.f13448s;
        dataOutputStream.writeByte(bArr.length);
        dataOutputStream.write(bArr);
        byte[] bArr2 = this.f13449t;
        dataOutputStream.writeByte(bArr2.length);
        dataOutputStream.write(bArr2);
        dataOutputStream.write(this.f13450u);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13444d);
        sb.append(' ');
        sb.append((int) this.f13446h);
        sb.append(' ');
        sb.append(this.f13447q);
        sb.append(' ');
        byte[] bArr = this.f13448s;
        sb.append(bArr.length == 0 ? "-" : new BigInteger(1, bArr).toString(16).toUpperCase());
        sb.append(' ');
        sb.append(z3.a.x(this.f13449t));
        for (x xVar : this.f13451v) {
            sb.append(' ');
            sb.append(xVar);
        }
        return sb.toString();
    }
}
