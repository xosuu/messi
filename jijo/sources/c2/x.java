package c2;

import android.os.Build;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UUID f1554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l2.j f1555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashSet f1556c;

    public final q a() {
        p pVar = (p) this;
        UUID uuid = pVar.f1554a;
        l2.j jVar = pVar.f1555b;
        HashSet hashSet = pVar.f1556c;
        q qVar = new q();
        qVar.f1557a = uuid;
        qVar.f1558b = jVar;
        qVar.f1559c = hashSet;
        c cVar = this.f1555b.f15151j;
        int i10 = Build.VERSION.SDK_INT;
        boolean z9 = (i10 >= 24 && cVar.f1522h.f1525a.size() > 0) || cVar.f1518d || cVar.f1516b || (i10 >= 23 && cVar.f1517c);
        if (this.f1555b.f15158q && z9) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.f1554a = UUID.randomUUID();
        l2.j jVar2 = this.f1555b;
        l2.j jVar3 = new l2.j();
        jVar3.f15143b = w.f1547a;
        f fVar = f.f1526b;
        jVar3.f15146e = fVar;
        jVar3.f15147f = fVar;
        jVar3.f15151j = c.f1514i;
        jVar3.f15153l = 1;
        jVar3.f15154m = 30000L;
        jVar3.f15157p = -1L;
        jVar3.f15159r = 1;
        jVar3.f15142a = jVar2.f15142a;
        jVar3.f15144c = jVar2.f15144c;
        jVar3.f15143b = jVar2.f15143b;
        jVar3.f15145d = jVar2.f15145d;
        jVar3.f15146e = new f(jVar2.f15146e);
        jVar3.f15147f = new f(jVar2.f15147f);
        jVar3.f15148g = jVar2.f15148g;
        jVar3.f15149h = jVar2.f15149h;
        jVar3.f15150i = jVar2.f15150i;
        c cVar2 = jVar2.f15151j;
        c cVar3 = new c();
        cVar3.f1515a = o.f1537a;
        cVar3.f1520f = -1L;
        cVar3.f1521g = -1L;
        cVar3.f1522h = new e();
        cVar3.f1516b = cVar2.f1516b;
        cVar3.f1517c = cVar2.f1517c;
        cVar3.f1515a = cVar2.f1515a;
        cVar3.f1518d = cVar2.f1518d;
        cVar3.f1519e = cVar2.f1519e;
        cVar3.f1522h = cVar2.f1522h;
        jVar3.f15151j = cVar3;
        jVar3.f15152k = jVar2.f15152k;
        jVar3.f15153l = jVar2.f15153l;
        jVar3.f15154m = jVar2.f15154m;
        jVar3.f15155n = jVar2.f15155n;
        jVar3.f15156o = jVar2.f15156o;
        jVar3.f15157p = jVar2.f15157p;
        jVar3.f15158q = jVar2.f15158q;
        jVar3.f15159r = jVar2.f15159r;
        this.f1555b = jVar3;
        jVar3.f15142a = this.f1554a.toString();
        return qVar;
    }
}
