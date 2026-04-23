package f8;

import java.io.DataOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class u extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f13464d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v7.c f13465f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte f13466h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final byte f13467q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f13468s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Date f13469t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Date f13470u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f13471v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final org.minidns.dnsname.a f13472w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final byte[] f13473x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public transient String f13474y;

    public u(x xVar, byte b10, byte b11, long j10, Date date, Date date2, int i10, org.minidns.dnsname.a aVar, byte[] bArr) {
        this.f13464d = xVar;
        this.f13466h = b10;
        v7.c cVar = v7.c.RSAMD5;
        this.f13465f = (v7.c) v7.d.f17905a.get(Byte.valueOf(b10));
        this.f13467q = b11;
        this.f13468s = j10;
        this.f13469t = date;
        this.f13470u = date2;
        this.f13471v = i10;
        this.f13472w = aVar;
        this.f13473x = bArr;
    }

    @Override // f8.h
    public final void a(DataOutputStream dataOutputStream) throws IOException {
        e(dataOutputStream);
        dataOutputStream.write(this.f13473x);
    }

    public final void e(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.f13464d.f13520a);
        dataOutputStream.writeByte(this.f13466h);
        dataOutputStream.writeByte(this.f13467q);
        dataOutputStream.writeInt((int) this.f13468s);
        dataOutputStream.writeInt((int) (this.f13469t.getTime() / 1000));
        dataOutputStream.writeInt((int) (this.f13470u.getTime() / 1000));
        dataOutputStream.writeShort(this.f13471v);
        this.f13472w.o(dataOutputStream);
    }

    public final String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13464d);
        sb.append(' ');
        sb.append(this.f13465f);
        sb.append(' ');
        sb.append((int) this.f13467q);
        sb.append(' ');
        sb.append(this.f13468s);
        sb.append(' ');
        sb.append(simpleDateFormat.format(this.f13469t));
        sb.append(' ');
        sb.append(simpleDateFormat.format(this.f13470u));
        sb.append(' ');
        sb.append(this.f13471v);
        sb.append(' ');
        sb.append((CharSequence) this.f13472w);
        sb.append(". ");
        if (this.f13474y == null) {
            this.f13474y = b4.f.k(this.f13473x);
        }
        sb.append(this.f13474y);
        return sb.toString();
    }
}
