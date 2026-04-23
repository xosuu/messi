package m1;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15542e;

    public /* synthetic */ l1(int i10, int i11, int i12, int i13, int i14) {
        this.f15538a = i10;
        this.f15539b = i11;
        this.f15540c = i12;
        this.f15541d = i13;
        this.f15542e = i14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m1.l1 b(java.lang.String r9) {
        /*
            java.lang.String r0 = "Format:"
            boolean r0 = r9.startsWith(r0)
            com.google.android.gms.internal.ads.tc1.K(r0)
            r0 = 7
            java.lang.String r9 = r9.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r9 = android.text.TextUtils.split(r9, r0)
            r0 = 0
            r1 = -1
            r2 = 0
            r4 = -1
            r5 = -1
            r6 = -1
            r7 = -1
        L1b:
            int r8 = r9.length
            if (r2 >= r8) goto L6d
            r3 = r9[r2]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = com.google.android.gms.internal.ads.tc1.g(r3)
            r3.getClass()
            int r8 = r3.hashCode()
            switch(r8) {
                case 100571: goto L55;
                case 3556653: goto L4a;
                case 109757538: goto L3f;
                case 109780401: goto L34;
                default: goto L32;
            }
        L32:
            r3 = -1
            goto L5f
        L34:
            java.lang.String r8 = "style"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L3d
            goto L32
        L3d:
            r3 = 3
            goto L5f
        L3f:
            java.lang.String r8 = "start"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L48
            goto L32
        L48:
            r3 = 2
            goto L5f
        L4a:
            java.lang.String r8 = "text"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L53
            goto L32
        L53:
            r3 = 1
            goto L5f
        L55:
            java.lang.String r8 = "end"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L5e
            goto L32
        L5e:
            r3 = 0
        L5f:
            switch(r3) {
                case 0: goto L69;
                case 1: goto L67;
                case 2: goto L65;
                case 3: goto L63;
                default: goto L62;
            }
        L62:
            goto L6a
        L63:
            r6 = r2
            goto L6a
        L65:
            r4 = r2
            goto L6a
        L67:
            r7 = r2
            goto L6a
        L69:
            r5 = r2
        L6a:
            int r2 = r2 + 1
            goto L1b
        L6d:
            if (r4 == r1) goto L7a
            if (r5 == r1) goto L7a
            if (r7 == r1) goto L7a
            m1.l1 r9 = new m1.l1
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            return r9
        L7a:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.l1.b(java.lang.String):m1.l1");
    }

    public final boolean a() {
        int i10 = this.f15538a;
        int i11 = 2;
        if ((i10 & 7) != 0) {
            int i12 = this.f15541d;
            int i13 = this.f15539b;
            if (((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 112) != 0) {
            int i14 = this.f15541d;
            int i15 = this.f15540c;
            if ((((i14 > i15 ? 1 : i14 == i15 ? 2 : 4) << 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 1792) != 0) {
            int i16 = this.f15542e;
            int i17 = this.f15539b;
            if ((((i16 > i17 ? 1 : i16 == i17 ? 2 : 4) << 8) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 28672) != 0) {
            int i18 = this.f15542e;
            int i19 = this.f15540c;
            if (i18 > i19) {
                i11 = 1;
            } else if (i18 != i19) {
                i11 = 4;
            }
            if ((i10 & (i11 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
