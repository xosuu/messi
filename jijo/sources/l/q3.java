package l;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14981d;

    public q3(int i10) {
        if (i10 != 1) {
            return;
        }
        this.f14980c = new SparseIntArray();
        this.f14981d = new SparseIntArray();
        this.f14978a = false;
        this.f14979b = false;
    }

    public final void a(f7.g... gVarArr) {
        if (!this.f14978a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[gVarArr.length];
        for (int i10 = 0; i10 < gVarArr.length; i10++) {
            strArr[i10] = gVarArr[i10].f13285a;
        }
        b(strArr);
    }

    public final void b(String... strArr) {
        if (!this.f14978a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f14980c = (String[]) strArr.clone();
    }

    public final int c(int i10, int i11) {
        if (!this.f14979b) {
            return e(i10, i11);
        }
        int i12 = ((SparseIntArray) this.f14981d).get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int iE = e(i10, i11);
        ((SparseIntArray) this.f14981d).put(i10, iE);
        return iE;
    }

    public final int d(int i10, int i11) {
        if (!this.f14978a) {
            return i10 % i11;
        }
        int i12 = ((SparseIntArray) this.f14980c).get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int i13 = i10 % i11;
        ((SparseIntArray) this.f14980c).put(i10, i13);
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(int r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7.f14979b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L49
            java.lang.Object r0 = r7.f14981d
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            int r3 = r0.size()
            int r3 = r3 - r1
            r4 = 0
        L10:
            if (r4 > r3) goto L22
            int r5 = r4 + r3
            int r5 = r5 >>> r1
            int r6 = r0.keyAt(r5)
            if (r6 >= r8) goto L1e
            int r4 = r5 + 1
            goto L10
        L1e:
            int r5 = r5 + (-1)
            r3 = r5
            goto L10
        L22:
            int r4 = r4 - r1
            r3 = -1
            if (r4 < 0) goto L31
            int r5 = r0.size()
            if (r4 >= r5) goto L31
            int r0 = r0.keyAt(r4)
            goto L32
        L31:
            r0 = -1
        L32:
            if (r0 == r3) goto L49
            java.lang.Object r3 = r7.f14981d
            android.util.SparseIntArray r3 = (android.util.SparseIntArray) r3
            int r3 = r3.get(r0)
            int r4 = r0 + 1
            int r0 = r7.d(r0, r9)
            int r0 = r0 + r1
            if (r0 != r9) goto L4c
            int r3 = r3 + 1
            r0 = 0
            goto L4c
        L49:
            r0 = 0
            r3 = 0
            r4 = 0
        L4c:
            if (r4 >= r8) goto L5e
            int r0 = r0 + 1
            if (r0 != r9) goto L56
            int r3 = r3 + 1
            r0 = 0
            goto L5b
        L56:
            if (r0 <= r9) goto L5b
            int r3 = r3 + 1
            r0 = 1
        L5b:
            int r4 = r4 + 1
            goto L4c
        L5e:
            int r0 = r0 + r1
            if (r0 <= r9) goto L63
            int r3 = r3 + 1
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.q3.e(int, int):int");
    }

    public final void f() {
        ((SparseIntArray) this.f14980c).clear();
    }

    public final void g(f7.f0... f0VarArr) {
        if (!this.f14978a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        String[] strArr = new String[f0VarArr.length];
        for (int i10 = 0; i10 < f0VarArr.length; i10++) {
            strArr[i10] = f0VarArr[i10].f13263a;
        }
        h(strArr);
    }

    public final void h(String... strArr) {
        if (!this.f14978a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f14981d = (String[]) strArr.clone();
    }

    public q3(boolean z9) {
        this.f14978a = z9;
    }

    public q3(f7.j jVar) {
        this.f14978a = jVar.f13298a;
        this.f14980c = jVar.f13300c;
        this.f14981d = jVar.f13301d;
        this.f14979b = jVar.f13299b;
    }
}
