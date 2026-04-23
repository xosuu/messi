package d6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import l7.z;
import p7.g;
import p7.h;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f12474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f12475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Serializable f12476h;

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        if (i10 > 0) {
            int length = ((l7.b[]) this.f12476h).length;
            while (true) {
                length--;
                i11 = this.f12471c;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                Object obj = this.f12476h;
                i10 -= ((l7.b[]) obj)[length].f15249c;
                this.f12473e -= ((l7.b[]) obj)[length].f15249c;
                this.f12472d--;
                i12++;
            }
            Object obj2 = this.f12476h;
            System.arraycopy((l7.b[]) obj2, i11 + 1, (l7.b[]) obj2, i11 + 1 + i12, this.f12472d);
            this.f12471c += i12;
        }
        return i12;
    }

    public final h b(int i10) throws IOException {
        if (i10 >= 0) {
            l7.b[] bVarArr = l7.d.f15258a;
            if (i10 <= bVarArr.length - 1) {
                return bVarArr[i10].f15247a;
            }
        }
        int length = this.f12471c + 1 + (i10 - l7.d.f15258a.length);
        if (length >= 0) {
            l7.b[] bVarArr2 = (l7.b[]) this.f12476h;
            if (length < bVarArr2.length) {
                return bVarArr2[length].f15247a;
            }
        }
        throw new IOException("Header index too large " + (i10 + 1));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Serializable, java.lang.Object, l7.b[]] */
    public final void c(l7.b bVar) {
        ((List) this.f12474f).add(bVar);
        int i10 = this.f12470b;
        int i11 = bVar.f15249c;
        if (i11 > i10) {
            Arrays.fill((l7.b[]) this.f12476h, (Object) null);
            this.f12471c = ((l7.b[]) this.f12476h).length - 1;
            this.f12472d = 0;
            this.f12473e = 0;
            return;
        }
        a((this.f12473e + i11) - i10);
        int i12 = this.f12472d + 1;
        l7.b[] bVarArr = (l7.b[]) this.f12476h;
        if (i12 > bVarArr.length) {
            ?? r02 = new l7.b[bVarArr.length * 2];
            System.arraycopy(bVarArr, 0, r02, bVarArr.length, bVarArr.length);
            this.f12471c = ((l7.b[]) this.f12476h).length - 1;
            this.f12476h = r02;
        }
        int i13 = this.f12471c;
        this.f12471c = i13 - 1;
        ((l7.b[]) this.f12476h)[i13] = bVar;
        this.f12472d++;
        this.f12473e += i11;
    }

    public final h d() {
        int i10;
        byte bC = ((g) this.f12475g).C();
        int i11 = bC & 255;
        boolean z9 = (bC & 128) == 128;
        int iE = e(i11, 127);
        Object obj = this.f12475g;
        if (!z9) {
            return ((g) obj).g(iE);
        }
        z zVar = z.f15359d;
        byte[] bArrP = ((g) obj).p(iE);
        zVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        z0.b bVar = zVar.f15360a;
        z0.b bVar2 = bVar;
        int i12 = 0;
        int i13 = 0;
        for (byte b10 : bArrP) {
            i12 = (i12 << 8) | (b10 & 255);
            i13 += 8;
            while (i13 >= 8) {
                bVar2 = ((z0.b[]) bVar2.f20648c)[(i12 >>> (i13 - 8)) & 255];
                if (((z0.b[]) bVar2.f20648c) == null) {
                    byteArrayOutputStream.write(bVar2.f20646a);
                    i13 -= bVar2.f20647b;
                    bVar2 = bVar;
                } else {
                    i13 -= 8;
                }
            }
        }
        while (i13 > 0) {
            z0.b bVar3 = ((z0.b[]) bVar2.f20648c)[(i12 << (8 - i13)) & 255];
            if (((z0.b[]) bVar3.f20648c) != null || (i10 = bVar3.f20647b) > i13) {
                break;
            }
            byteArrayOutputStream.write(bVar3.f20646a);
            i13 -= i10;
            bVar2 = bVar;
        }
        return h.j(byteArrayOutputStream.toByteArray());
    }

    public final int e(int i10, int i11) {
        int i12 = i10 & i11;
        if (i12 < i11) {
            return i12;
        }
        int i13 = 0;
        while (true) {
            byte bC = ((g) this.f12475g).C();
            int i14 = bC & 255;
            if ((bC & 128) == 0) {
                return i11 + (i14 << i13);
            }
            i11 += (bC & 127) << i13;
            i13 += 7;
        }
    }
}
