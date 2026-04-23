package i2;

import android.content.Context;
import android.os.Build;
import c2.o;
import j2.f;
import j2.g;
import j2.h;
import l2.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14164e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, o2.a aVar, int i10) {
        super((j2.a) h.n(context, aVar).f14297a);
        this.f14164e = i10;
        if (i10 == 1) {
            super((j2.b) h.n(context, aVar).f14298b);
            return;
        }
        if (i10 == 2) {
            super((f) h.n(context, aVar).f14299d);
            return;
        }
        if (i10 == 3) {
            super((f) h.n(context, aVar).f14299d);
        } else if (i10 != 4) {
        } else {
            super((g) h.n(context, aVar).f14300f);
        }
    }

    @Override // i2.c
    public final boolean a(j jVar) {
        switch (this.f14164e) {
            case 0:
                return jVar.f15151j.f1516b;
            case 1:
                return jVar.f15151j.f1518d;
            case 2:
                return jVar.f15151j.f1515a == o.f1538b;
            case 3:
                o oVar = jVar.f15151j.f1515a;
                if (oVar != o.f1539d) {
                    return Build.VERSION.SDK_INT >= 30 && oVar == o.f1542q;
                }
                return true;
            default:
                return jVar.f15151j.f1519e;
        }
    }

    @Override // i2.c
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        switch (this.f14164e) {
            case 0:
                return f((Boolean) obj);
            case 1:
                return f((Boolean) obj);
            case 2:
                return e((h2.a) obj);
            case 3:
                return e((h2.a) obj);
            default:
                return f((Boolean) obj);
        }
    }

    public final boolean e(h2.a aVar) {
        switch (this.f14164e) {
            case 2:
                return Build.VERSION.SDK_INT >= 26 ? (aVar.f13937a && aVar.f13938b) ? false : true : true ^ aVar.f13937a;
            default:
                return !aVar.f13937a || aVar.f13939c;
        }
    }

    public final boolean f(Boolean bool) {
        switch (this.f14164e) {
        }
        return !bool.booleanValue();
    }
}
