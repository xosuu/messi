package z7;

import f8.x;
import f8.y;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f20732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f20733c;

    public b(byte b10, x xVar, y yVar) {
        this.f20731a = Integer.toString(b10 & 255);
        this.f20732b = xVar;
        this.f20733c = yVar;
    }

    @Override // z7.h
    public final String a() {
        return this.f20732b.name() + " algorithm " + this.f20731a + " required to verify " + ((Object) this.f20733c.f13522a) + " is unknown or not supported by platform";
    }
}
