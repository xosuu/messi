package f8;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class z extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final org.minidns.dnsname.a f13530d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final org.minidns.dnsname.a f13531f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13532h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f13533q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f13534s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f13535t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f13536u;

    public z(org.minidns.dnsname.a aVar, org.minidns.dnsname.a aVar2, long j10, int i10, int i11, int i12, long j11) {
        this.f13530d = aVar;
        this.f13531f = aVar2;
        this.f13532h = j10;
        this.f13533q = i10;
        this.f13534s = i11;
        this.f13535t = i12;
        this.f13536u = j11;
    }

    @Override // f8.h
    public final void a(DataOutputStream dataOutputStream) throws IOException {
        this.f13530d.o(dataOutputStream);
        this.f13531f.o(dataOutputStream);
        dataOutputStream.writeInt((int) this.f13532h);
        dataOutputStream.writeInt(this.f13533q);
        dataOutputStream.writeInt(this.f13534s);
        dataOutputStream.writeInt(this.f13535t);
        dataOutputStream.writeInt((int) this.f13536u);
    }

    public final String toString() {
        return ((CharSequence) this.f13530d) + ". " + ((CharSequence) this.f13531f) + ". " + this.f13532h + ' ' + this.f13533q + ' ' + this.f13534s + ' ' + this.f13535t + ' ' + this.f13536u;
    }
}
