package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.j;
import com.google.gson.s;
import com.google.gson.v;
import com.google.gson.w;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import l.a0;
import u.h;

/* JADX INFO: loaded from: classes.dex */
public final class NumberTypeAdapter extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f12088b = d(v.f12260b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f12089a;

    public NumberTypeAdapter(s sVar) {
        this.f12089a = sVar;
    }

    public static y d(s sVar) {
        return new y() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.y
            public final x a(j jVar, r5.a aVar) {
                if (aVar.f16536a == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.x
    public final Object b(s5.a aVar) throws IOException {
        int iT = aVar.T();
        int iB = h.b(iT);
        if (iB == 5 || iB == 6) {
            return this.f12089a.a(aVar);
        }
        if (iB == 8) {
            aVar.P();
            return null;
        }
        throw new JsonSyntaxException("Expecting number, got: " + a0.u(iT) + "; at path " + aVar.F(false));
    }

    @Override // com.google.gson.x
    public final void c(s5.b bVar, Object obj) throws IOException {
        bVar.M((Number) obj);
    }
}
