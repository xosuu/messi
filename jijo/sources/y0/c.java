package y0;

import d5.e;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f20433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20435d;

    public c() {
        if (e.f12369a == null) {
            e.f12369a = new e(11);
        }
    }

    public final int a(int i10) {
        if (i10 < this.f20435d) {
            return this.f20433b.getShort(this.f20434c + i10);
        }
        return 0;
    }
}
