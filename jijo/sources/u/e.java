package u;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f17486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17487c;

    public e(int i10, int i11) {
        this.f17485a = i11;
        if (i11 != 1) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f17486b = new Object[i10];
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f17486b = new Object[i10];
        }
    }

    public Object a() {
        int i10 = this.f17485a;
        Object[] objArr = this.f17486b;
        switch (i10) {
            case 0:
                int i11 = this.f17487c;
                if (i11 <= 0) {
                    return null;
                }
                int i12 = i11 - 1;
                Object obj = objArr[i12];
                objArr[i12] = null;
                this.f17487c = i12;
                return obj;
            default:
                int i13 = this.f17487c;
                if (i13 <= 0) {
                    return null;
                }
                int i14 = i13 - 1;
                Object obj2 = objArr[i14];
                objArr[i14] = null;
                this.f17487c = i14;
                return obj2;
        }
    }

    public boolean b(Object obj) {
        int i10 = this.f17485a;
        Object[] objArr = this.f17486b;
        switch (i10) {
            case 0:
                int i11 = this.f17487c;
                if (i11 >= objArr.length) {
                    return false;
                }
                objArr[i11] = obj;
                this.f17487c = i11 + 1;
                return true;
            default:
                int i12 = 0;
                while (true) {
                    int i13 = this.f17487c;
                    if (i12 >= i13) {
                        if (i13 >= objArr.length) {
                            return false;
                        }
                        objArr[i13] = obj;
                        this.f17487c = i13 + 1;
                        return true;
                    }
                    if (objArr[i12] == obj) {
                        throw new IllegalStateException("Already in the pool!");
                    }
                    i12++;
                }
                break;
        }
    }
}
