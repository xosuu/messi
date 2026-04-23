package com.google.gson.internal.bind;

import com.google.gson.internal.k;
import com.google.gson.j;
import com.google.gson.r;
import com.google.gson.v;
import com.google.gson.w;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public final class ObjectTypeAdapter extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f12091c = new AnonymousClass1(v.f12259a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f12092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f12093b;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w f12094a;

        public AnonymousClass1(r rVar) {
            this.f12094a = rVar;
        }

        @Override // com.google.gson.y
        public final x a(j jVar, r5.a aVar) {
            if (aVar.f16536a == Object.class) {
                return new ObjectTypeAdapter(jVar, this.f12094a);
            }
            return null;
        }
    }

    public ObjectTypeAdapter(j jVar, w wVar) {
        this.f12092a = jVar;
        this.f12093b = wVar;
    }

    public static y d(r rVar) {
        return rVar == v.f12259a ? f12091c : new AnonymousClass1(rVar);
    }

    @Override // com.google.gson.x
    public final Object b(s5.a aVar) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iT = aVar.T();
        if (iT == 0) {
            throw null;
        }
        int i10 = iT - 1;
        if (i10 == 0) {
            aVar.a();
            arrayList = new ArrayList();
        } else if (i10 != 2) {
            arrayList = null;
        } else {
            aVar.c();
            arrayList = new k(true);
        }
        if (arrayList == null) {
            return e(aVar, iT);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.G()) {
                String strN = arrayList instanceof Map ? aVar.N() : null;
                int iT2 = aVar.T();
                if (iT2 == 0) {
                    throw null;
                }
                int i11 = iT2 - 1;
                if (i11 == 0) {
                    aVar.a();
                    arrayList2 = new ArrayList();
                } else if (i11 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.c();
                    arrayList2 = new k(true);
                }
                boolean z9 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = e(aVar, iT2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strN, arrayList2);
                }
                if (z9) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.A();
                } else {
                    aVar.D();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.x
    public final void c(s5.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.G();
            return;
        }
        Class<?> cls = obj.getClass();
        j jVar = this.f12092a;
        jVar.getClass();
        x xVarC = jVar.c(new r5.a(cls));
        if (!(xVarC instanceof ObjectTypeAdapter)) {
            xVarC.c(bVar, obj);
        } else {
            bVar.e();
            bVar.D();
        }
    }

    public final Serializable e(s5.a aVar, int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 5) {
            return aVar.R();
        }
        if (i11 == 6) {
            return this.f12093b.a(aVar);
        }
        if (i11 == 7) {
            return Boolean.valueOf(aVar.J());
        }
        if (i11 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(a0.u(i10)));
        }
        aVar.P();
        return null;
    }
}
