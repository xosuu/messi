package c8;

import f8.s;
import f8.y;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f1593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y f1595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f1596g;

    public c(y yVar) {
        this.f1590a = yVar.f13525d;
        long j10 = yVar.f13526e;
        this.f1591b = (int) ((j10 >> 16) & 255);
        this.f1592c = ((int) j10) & 65535;
        this.f1594e = (j10 & 32768) > 0;
        this.f1593d = ((s) yVar.f13527f).f13463d;
        this.f1595f = yVar;
    }

    public final String toString() {
        if (this.f1596g == null) {
            StringBuilder sb = new StringBuilder("EDNS: version: ");
            sb.append(this.f1591b);
            sb.append(", flags:");
            if (this.f1594e) {
                sb.append(" do");
            }
            sb.append("; udp: ");
            sb.append(this.f1590a);
            List list = this.f1593d;
            if (!list.isEmpty()) {
                sb.append('\n');
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    sb.append(dVar.b());
                    sb.append(": ");
                    if (dVar.f1601e == null) {
                        dVar.f1601e = dVar.a().toString();
                    }
                    sb.append(dVar.f1601e);
                    if (it.hasNext()) {
                        sb.append('\n');
                    }
                }
            }
            this.f1596g = sb.toString();
        }
        return this.f1596g;
    }

    public c(a aVar) {
        this.f1590a = aVar.f1583a;
        this.f1591b = 0;
        boolean z9 = aVar.f1584b;
        int i10 = z9 ? 32768 : 0;
        this.f1594e = z9;
        this.f1592c = i10;
        this.f1593d = Collections.emptyList();
    }
}
