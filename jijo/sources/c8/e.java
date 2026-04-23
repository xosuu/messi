package c8;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d {
    static {
        new e(new byte[0]);
    }

    @Override // c8.d
    public final StringBuilder a() {
        return q7.b.h(this.f1599c);
    }

    @Override // c8.d
    public final b b() {
        return b.NSID;
    }

    @Override // c8.d
    public final CharSequence c() {
        StringBuilder sbS = g1.a.s(b.NSID + ": ");
        sbS.append(new String(this.f1599c, StandardCharsets.US_ASCII));
        return sbS.toString();
    }
}
