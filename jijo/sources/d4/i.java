package d4;

import android.content.Context;
import k.q;
import k4.k;
import k4.l;

/* JADX INFO: loaded from: classes.dex */
public final class i implements q3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f12364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f12365b;

    public i(Context context) {
        f fVar;
        this.f12364a = new h(context, s3.d.f16687b);
        synchronized (f.class) {
            try {
                if (f.f12357c == null) {
                    f.f12357c = new f(context.getApplicationContext());
                }
                fVar = f.f12357c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f12365b = fVar;
    }

    @Override // q3.a
    public final l a() {
        l lVarA = this.f12364a.a();
        q qVar = new q(22, this);
        lVarA.getClass();
        k kVar = k4.f.f14670a;
        l lVar = new l();
        lVarA.f14683b.e(new k4.g(kVar, qVar, lVar, 1));
        lVarA.i();
        return lVar;
    }
}
