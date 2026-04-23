package x7;

import f8.x;
import f8.y;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f18506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f18507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18514j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18515k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f18516l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f18517m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f18518n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f18519o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c8.a f18520p;

    public final void a(StringBuilder sb) {
        sb.append('(');
        sb.append(this.f18505a);
        sb.append(' ');
        sb.append(this.f18506b);
        sb.append(' ');
        sb.append(this.f18507c);
        sb.append(' ');
        if (this.f18508d) {
            sb.append("resp[qr=1]");
        } else {
            sb.append("query[qr=0]");
        }
        if (this.f18509e) {
            sb.append(" aa");
        }
        if (this.f18510f) {
            sb.append(" tr");
        }
        if (this.f18511g) {
            sb.append(" rd");
        }
        if (this.f18512h) {
            sb.append(" ra");
        }
        if (this.f18513i) {
            sb.append(" ad");
        }
        if (this.f18514j) {
            sb.append(" cd");
        }
        sb.append(")\n");
        ArrayList<Object> arrayList = this.f18516l;
        if (arrayList != null) {
            for (Object obj : arrayList) {
                sb.append("[Q: ");
                sb.append(obj);
                sb.append("]\n");
            }
        }
        ArrayList<Object> arrayList2 = this.f18517m;
        if (arrayList2 != null) {
            for (Object obj2 : arrayList2) {
                sb.append("[A: ");
                sb.append(obj2);
                sb.append("]\n");
            }
        }
        ArrayList<Object> arrayList3 = this.f18518n;
        if (arrayList3 != null) {
            for (Object obj3 : arrayList3) {
                sb.append("[N: ");
                sb.append(obj3);
                sb.append("]\n");
            }
        }
        ArrayList<y> arrayList4 = this.f18519o;
        if (arrayList4 != null) {
            for (y yVar : arrayList4) {
                sb.append("[X: ");
                c8.c cVar = yVar.f13523b != x.OPT ? null : new c8.c(yVar);
                if (cVar != null) {
                    sb.append(cVar.toString());
                } else {
                    sb.append(yVar);
                }
                sb.append("]\n");
            }
        }
        if (sb.charAt(sb.length() - 1) == '\n') {
            sb.setLength(sb.length() - 1);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Builder of DnsMessage");
        a(sb);
        return sb.toString();
    }
}
