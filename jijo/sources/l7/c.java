package l7;

import androidx.core.app.NotificationCompat;
import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7.e f15250a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15252c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15251b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b[] f15254e = new b[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15255f = 7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15256g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15257h = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15253d = NotificationCompat.FLAG_BUBBLE;

    public c(p7.e eVar) {
        this.f15250a = eVar;
    }

    public final void a(int i10) {
        int i11;
        if (i10 > 0) {
            int length = this.f15254e.length - 1;
            int i12 = 0;
            while (true) {
                i11 = this.f15255f;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                int i13 = this.f15254e[length].f15249c;
                i10 -= i13;
                this.f15257h -= i13;
                this.f15256g--;
                i12++;
                length--;
            }
            b[] bVarArr = this.f15254e;
            int i14 = i11 + 1;
            System.arraycopy(bVarArr, i14, bVarArr, i14 + i12, this.f15256g);
            b[] bVarArr2 = this.f15254e;
            int i15 = this.f15255f + 1;
            Arrays.fill(bVarArr2, i15, i15 + i12, (Object) null);
            this.f15255f += i12;
        }
    }

    public final void b(b bVar) {
        int i10 = this.f15253d;
        int i11 = bVar.f15249c;
        if (i11 > i10) {
            Arrays.fill(this.f15254e, (Object) null);
            this.f15255f = this.f15254e.length - 1;
            this.f15256g = 0;
            this.f15257h = 0;
            return;
        }
        a((this.f15257h + i11) - i10);
        int i12 = this.f15256g + 1;
        b[] bVarArr = this.f15254e;
        if (i12 > bVarArr.length) {
            b[] bVarArr2 = new b[bVarArr.length * 2];
            System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
            this.f15255f = this.f15254e.length - 1;
            this.f15254e = bVarArr2;
        }
        int i13 = this.f15255f;
        this.f15255f = i13 - 1;
        this.f15254e[i13] = bVar;
        this.f15256g++;
        this.f15257h += i11;
    }

    public final void c(p7.h hVar) {
        z.f15359d.getClass();
        long j10 = 0;
        long j11 = 0;
        for (int i10 = 0; i10 < hVar.size(); i10++) {
            j11 += (long) z.f15358c[hVar.h(i10) & 255];
        }
        int i11 = (int) ((j11 + 7) >> 3);
        int size = hVar.size();
        p7.e eVar = this.f15250a;
        if (i11 >= size) {
            e(hVar.size(), 127, 0);
            eVar.I(hVar);
            return;
        }
        p7.e eVar2 = new p7.e();
        z.f15359d.getClass();
        int i12 = 0;
        for (int i13 = 0; i13 < hVar.size(); i13++) {
            int iH = hVar.h(i13) & 255;
            int i14 = z.f15357b[iH];
            byte b10 = z.f15358c[iH];
            j10 = (j10 << b10) | ((long) i14);
            i12 += b10;
            while (i12 >= 8) {
                i12 -= 8;
                eVar2.K((int) (j10 >> i12));
            }
        }
        if (i12 > 0) {
            eVar2.K((int) ((j10 << (8 - i12)) | ((long) (255 >>> i12))));
        }
        try {
            byte[] bArrP = eVar2.p(eVar2.f16276b);
            p7.h hVar2 = new p7.h(bArrP);
            e(bArrP.length, 127, NotificationCompat.FLAG_HIGH_PRIORITY);
            eVar.I(hVar2);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.util.ArrayList r14) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.c.d(java.util.ArrayList):void");
    }

    public final void e(int i10, int i11, int i12) {
        p7.e eVar = this.f15250a;
        if (i10 < i11) {
            eVar.K(i10 | i12);
            return;
        }
        eVar.K(i12 | i11);
        int i13 = i10 - i11;
        while (i13 >= 128) {
            eVar.K(128 | (i13 & 127));
            i13 >>>= 7;
        }
        eVar.K(i13);
    }
}
