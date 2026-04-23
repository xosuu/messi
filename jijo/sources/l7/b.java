package l7;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p7.h f15241d = p7.h.g(":");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p7.h f15242e = p7.h.g(":status");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p7.h f15243f = p7.h.g(":method");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p7.h f15244g = p7.h.g(":path");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p7.h f15245h = p7.h.g(":scheme");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p7.h f15246i = p7.h.g(":authority");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7.h f15247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p7.h f15248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15249c;

    public b(String str, String str2) {
        this(p7.h.g(str), p7.h.g(str2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15247a.equals(bVar.f15247a) && this.f15248b.equals(bVar.f15248b);
    }

    public final int hashCode() {
        return this.f15248b.hashCode() + ((this.f15247a.hashCode() + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f15247a.o(), this.f15248b.o()};
        byte[] bArr = g7.b.f13888a;
        return String.format(Locale.US, "%s: %s", objArr);
    }

    public b(p7.h hVar, String str) {
        this(hVar, p7.h.g(str));
    }

    public b(p7.h hVar, p7.h hVar2) {
        this.f15247a = hVar;
        this.f15248b = hVar2;
        this.f15249c = hVar2.size() + hVar.size() + 32;
    }
}
