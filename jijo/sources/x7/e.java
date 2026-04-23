package x7;

import f8.w;
import f8.x;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final org.minidns.dnsname.a f18552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f18553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f18554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f18555d;

    public e(org.minidns.dnsname.a aVar, x xVar, int i10) {
        w wVar = w.IN;
        this.f18552a = aVar;
        this.f18553b = xVar;
        this.f18554c = wVar;
    }

    public final byte[] a() {
        if (this.f18555d == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                this.f18552a.o(dataOutputStream);
                dataOutputStream.writeShort(this.f18553b.f13520a);
                dataOutputStream.writeShort(this.f18554c.f13481a);
                dataOutputStream.flush();
                this.f18555d = byteArrayOutputStream.toByteArray();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
        return this.f18555d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return Arrays.equals(a(), ((e) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(a());
    }

    public final String toString() {
        return this.f18552a.f16143b + ".\t" + this.f18554c + '\t' + this.f18553b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(org.minidns.dnsname.a aVar, x xVar) {
        this(aVar, xVar, 0);
        w wVar = w.IN;
    }

    public e(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        this.f18552a = org.minidns.dnsname.a.j(dataInputStream, bArr);
        this.f18553b = x.a(dataInputStream.readUnsignedShort());
        this.f18554c = (w) w.f13479h.get(Integer.valueOf(dataInputStream.readUnsignedShort()));
    }
}
