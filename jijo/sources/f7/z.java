package f7;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f13396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f13398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t3.i f13399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f13400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile d f13401f;

    public z(n3.b bVar) {
        this.f13396a = (q) bVar.f15930a;
        this.f13397b = (String) bVar.f15931b;
        e eVar = (e) bVar.f15932d;
        eVar.getClass();
        this.f13398c = new p(eVar);
        this.f13399d = (t3.i) bVar.f15933f;
        Object obj = bVar.f15934h;
        this.f13400e = obj == null ? this : obj;
    }

    public final n3.b a() {
        n3.b bVar = new n3.b();
        bVar.f15930a = this.f13396a;
        bVar.f15931b = this.f13397b;
        bVar.f15933f = this.f13399d;
        bVar.f15934h = this.f13400e;
        bVar.f15932d = this.f13398c.c();
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f13397b);
        sb.append(", url=");
        sb.append(this.f13396a);
        sb.append(", tag=");
        Object obj = this.f13400e;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
}
