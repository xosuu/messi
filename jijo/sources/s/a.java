package s;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16584e;

    public a(int i10, Object obj) {
        this.f16583d = i10;
        this.f16584e = obj;
    }

    @Override // k.d
    public final void c() {
        int i10 = this.f16583d;
        Object obj = this.f16584e;
        switch (i10) {
            case 0:
                ((b) obj).clear();
                break;
            default:
                ((c) obj).clear();
                break;
        }
    }

    @Override // k.d
    public final Object d(int i10, int i11) {
        int i12 = this.f16583d;
        Object obj = this.f16584e;
        switch (i12) {
            case 0:
                return ((b) obj).f16625b[(i10 << 1) + i11];
            default:
                return ((c) obj).f16593b[i10];
        }
    }

    @Override // k.d
    public final b e() {
        switch (this.f16583d) {
            case 0:
                return (b) this.f16584e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // k.d
    public final int f() {
        int i10 = this.f16583d;
        Object obj = this.f16584e;
        switch (i10) {
            case 0:
                return ((b) obj).f16626d;
            default:
                return ((c) obj).f16594d;
        }
    }

    @Override // k.d
    public final int g(Object obj) {
        int i10 = this.f16583d;
        Object obj2 = this.f16584e;
        switch (i10) {
            case 0:
                return ((b) obj2).e(obj);
            default:
                return ((c) obj2).indexOf(obj);
        }
    }

    @Override // k.d
    public final int h(Object obj) {
        int i10 = this.f16583d;
        Object obj2 = this.f16584e;
        switch (i10) {
            case 0:
                return ((b) obj2).g(obj);
            default:
                return ((c) obj2).indexOf(obj);
        }
    }

    @Override // k.d
    public final void i(Object obj, Object obj2) {
        int i10 = this.f16583d;
        Object obj3 = this.f16584e;
        switch (i10) {
            case 0:
                ((b) obj3).put(obj, obj2);
                break;
            default:
                ((c) obj3).add(obj);
                break;
        }
    }

    @Override // k.d
    public final void j(int i10) {
        int i11 = this.f16583d;
        Object obj = this.f16584e;
        switch (i11) {
            case 0:
                ((b) obj).i(i10);
                break;
            default:
                ((c) obj).f(i10);
                break;
        }
    }

    @Override // k.d
    public final Object k(int i10, Object obj) {
        switch (this.f16583d) {
            case 0:
                int i11 = (i10 << 1) + 1;
                Object[] objArr = ((b) this.f16584e).f16625b;
                Object obj2 = objArr[i11];
                objArr[i11] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
