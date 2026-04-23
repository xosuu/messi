package f8;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends h implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13402d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13403f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13404h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final org.minidns.dnsname.a f13405q;

    public a0(int i10, int i11, int i12, org.minidns.dnsname.a aVar) {
        this.f13402d = i10;
        this.f13403f = i11;
        this.f13404h = i12;
        this.f13405q = aVar;
    }

    @Override // f8.h
    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.f13402d);
        dataOutputStream.writeShort(this.f13403f);
        dataOutputStream.writeShort(this.f13404h);
        this.f13405q.o(dataOutputStream);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a0 a0Var = (a0) obj;
        int i10 = a0Var.f13402d - this.f13402d;
        return i10 == 0 ? this.f13403f - a0Var.f13403f : i10;
    }

    public final String toString() {
        return this.f13402d + " " + this.f13403f + " " + this.f13404h + " " + ((Object) this.f13405q) + ".";
    }
}
