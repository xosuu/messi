package v3;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends f implements t3.c {
    public final Set E;
    public final Account F;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Context context, Looper looper, int i10, g gVar, u3.c cVar, u3.h hVar) {
        c0 c0VarA = c0.a(context);
        s3.c cVar2 = s3.c.f16685d;
        if (cVar == null) {
            throw new NullPointerException("null reference");
        }
        if (hVar == null) {
            throw new NullPointerException("null reference");
        }
        super(context, looper, c0VarA, cVar2, i10, new k.q(21, cVar), new m2.f(25, hVar), gVar.f17769f);
        this.F = gVar.f17764a;
        Set set = gVar.f17766c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.E = set;
    }

    @Override // t3.c
    public final Set a() {
        return requiresSignIn() ? this.E : Collections.emptySet();
    }

    @Override // v3.f
    public final void e() {
    }

    @Override // v3.f
    public final Set g() {
        return this.E;
    }

    @Override // v3.f
    public final Account getAccount() {
        return this.F;
    }
}
