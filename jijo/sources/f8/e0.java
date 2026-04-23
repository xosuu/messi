package f8;

import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final HashMap f13409s = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final HashMap f13410t = new HashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final HashMap f13411u = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte f13412d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte f13413f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte f13414h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final byte[] f13415q;

    static {
        b0.values();
        d0.values();
        c0.values();
    }

    public e0(byte b10, byte b11, byte b12, byte[] bArr) {
        this.f13412d = b10;
        this.f13413f = b11;
        this.f13414h = b12;
        this.f13415q = bArr;
    }

    @Override // f8.h
    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.f13412d);
        dataOutputStream.writeByte(this.f13413f);
        dataOutputStream.writeByte(this.f13414h);
        dataOutputStream.write(this.f13415q);
    }

    public final String toString() {
        return ((int) this.f13412d) + ' ' + ((int) this.f13413f) + ' ' + ((int) this.f13414h) + ' ' + new BigInteger(1, this.f13415q).toString(16);
    }
}
