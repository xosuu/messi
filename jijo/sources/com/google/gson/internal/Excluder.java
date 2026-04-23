package com.google.gson.internal;

import com.google.android.gms.internal.ads.fb1;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Excluder implements y, Cloneable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Excluder f12055q = new Excluder();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f12056a = -1.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12057b = 136;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12058d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f12059f = Collections.emptyList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f12060h = Collections.emptyList();

    public static boolean d(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.getModifiers() & 8) == 0 && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    @Override // com.google.gson.y
    public final x a(final com.google.gson.j jVar, final r5.a aVar) {
        final boolean z9;
        final boolean z10;
        boolean zB = b(aVar.f16536a);
        if (zB) {
            z9 = true;
        } else {
            c(true);
            z9 = false;
        }
        if (zB) {
            z10 = true;
        } else {
            c(false);
            z10 = false;
        }
        if (z9 || z10) {
            return new x() { // from class: com.google.gson.internal.Excluder.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public x f12061a;

                @Override // com.google.gson.x
                public final Object b(s5.a aVar2) throws IOException {
                    if (z10) {
                        aVar2.Z();
                        return null;
                    }
                    x xVarD = this.f12061a;
                    if (xVarD == null) {
                        xVarD = jVar.d(Excluder.this, aVar);
                        this.f12061a = xVarD;
                    }
                    return xVarD.b(aVar2);
                }

                @Override // com.google.gson.x
                public final void c(s5.b bVar, Object obj) throws IOException {
                    if (z9) {
                        bVar.G();
                        return;
                    }
                    x xVarD = this.f12061a;
                    if (xVarD == null) {
                        xVarD = jVar.d(Excluder.this, aVar);
                        this.f12061a = xVarD;
                    }
                    xVarD.c(bVar, obj);
                }
            };
        }
        return null;
    }

    public final boolean b(Class cls) {
        if (this.f12056a != -1.0d) {
            o5.c cVar = (o5.c) cls.getAnnotation(o5.c.class);
            o5.d dVar = (o5.d) cls.getAnnotation(o5.d.class);
            double d10 = this.f12056a;
            if ((cVar != null && d10 < cVar.value()) || (dVar != null && d10 >= dVar.value())) {
                return true;
            }
        }
        return (!this.f12058d && cls.isMemberClass() && (cls.getModifiers() & 8) == 0) || d(cls);
    }

    public final void c(boolean z9) {
        Iterator it = (z9 ? this.f12059f : this.f12060h).iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            throw null;
        }
    }

    public final Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }
}
