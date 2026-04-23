package c8;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f1599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f1600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f1601e;

    public d(byte[] bArr, int i10) {
        this.f1597a = i10;
        this.f1598b = bArr.length;
        this.f1599c = bArr;
    }

    public abstract StringBuilder a();

    public abstract b b();

    public abstract CharSequence c();

    public final String toString() {
        if (this.f1600d == null) {
            this.f1600d = c().toString();
        }
        return this.f1600d;
    }

    public d(byte[] bArr) {
        b bVar = b.UNKNOWN;
        this.f1597a = 3;
        this.f1598b = bArr.length;
        this.f1599c = bArr;
    }
}
