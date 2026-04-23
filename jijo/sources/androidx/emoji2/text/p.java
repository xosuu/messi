package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f619d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2.h f621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f622c = 0;

    public p(j2.h hVar, int i10) {
        this.f621b = hVar;
        this.f620a = i10;
    }

    public final int a(int i10) {
        y0.a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = aVarC.f20433b;
        int i11 = iA + aVarC.f20432a;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    public final int b() {
        y0.a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        int i10 = iA + aVarC.f20432a;
        return aVarC.f20433b.getInt(aVarC.f20433b.getInt(i10) + i10);
    }

    public final y0.a c() {
        ThreadLocal threadLocal = f619d;
        y0.a aVar = (y0.a) threadLocal.get();
        if (aVar == null) {
            aVar = new y0.a();
            threadLocal.set(aVar);
        }
        y0.b bVar = (y0.b) this.f621b.f14297a;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i10 = iA + bVar.f20432a;
            int i11 = (this.f620a * 4) + bVar.f20433b.getInt(i10) + i10 + 4;
            int i12 = bVar.f20433b.getInt(i11) + i11;
            ByteBuffer byteBuffer = bVar.f20433b;
            aVar.f20433b = byteBuffer;
            if (byteBuffer != null) {
                aVar.f20432a = i12;
                int i13 = i12 - byteBuffer.getInt(i12);
                aVar.f20434c = i13;
                aVar.f20435d = aVar.f20433b.getShort(i13);
            } else {
                aVar.f20432a = 0;
                aVar.f20434c = 0;
                aVar.f20435d = 0;
            }
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        y0.a aVarC = c();
        int iA = aVarC.a(4);
        sb.append(Integer.toHexString(iA != 0 ? aVarC.f20433b.getInt(iA + aVarC.f20432a) : 0));
        sb.append(", codepoints:");
        int iB = b();
        for (int i10 = 0; i10 < iB; i10++) {
            sb.append(Integer.toHexString(a(i10)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
