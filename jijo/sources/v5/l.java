package v5;

import java.util.HashMap;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends v {
    public static final HashMap N;
    public Object K;
    public String L;
    public w5.c M;

    static {
        HashMap map = new HashMap();
        N = map;
        map.put("alpha", o.f17841a);
        map.put("pivotX", o.f17842b);
        map.put("pivotY", o.f17843c);
        map.put("translationX", o.f17844d);
        map.put("translationY", o.f17845e);
        map.put("rotation", o.f17846f);
        map.put("rotationX", o.f17847g);
        map.put("rotationY", o.f17848h);
        map.put("scaleX", o.f17849i);
        map.put("scaleY", o.f17850j);
        map.put("scrollX", o.f17851k);
        map.put("scrollY", o.f17852l);
        map.put("x", o.f17853m);
        map.put("y", o.f17854n);
    }

    public static l o(Object obj, r... rVarArr) {
        l lVar = new l();
        lVar.K = obj;
        lVar.m(rVarArr);
        return lVar;
    }

    @Override // v5.b
    /* JADX INFO: renamed from: b */
    public final b clone() {
        return (l) super.j();
    }

    public final Object clone() {
        return (l) super.j();
    }

    @Override // v5.v, v5.b
    public final void f() {
        super.f();
    }

    @Override // v5.v
    public final void h(float f10) {
        super.h(f10);
        int length = this.A.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.A[i10].f(this.K);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    @Override // v5.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.l.l():void");
    }

    public final void p(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(a0.g("Animators cannot have negative duration: ", j10));
        }
        this.f17878w = j10;
    }

    public final String toString() {
        String string = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.K;
        if (this.A != null) {
            for (int i10 = 0; i10 < this.A.length; i10++) {
                StringBuilder sbK = a0.k(string, "\n    ");
                sbK.append(this.A[i10].toString());
                string = sbK.toString();
            }
        }
        return string;
    }
}
