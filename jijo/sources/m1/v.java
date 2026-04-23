package m1;

import android.view.View;
import com.google.android.gms.internal.ads.tc1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15630a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f15635f;

    public v(int i10) {
        this.f15631b = i10;
        byte[] bArr = new byte[131];
        this.f15635f = bArr;
        bArr[2] = 1;
    }

    public final void a() {
        this.f15634e = this.f15632c ? ((a0) this.f15635f).e() : ((a0) this.f15635f).f();
    }

    public final void b(View view, int i10) {
        if (this.f15632c) {
            this.f15634e = ((a0) this.f15635f).h() + ((a0) this.f15635f).b(view);
        } else {
            this.f15634e = ((a0) this.f15635f).d(view);
        }
        this.f15631b = i10;
    }

    public final void c(View view, int i10) {
        int iH = ((a0) this.f15635f).h();
        if (iH >= 0) {
            b(view, i10);
            return;
        }
        this.f15631b = i10;
        if (!this.f15632c) {
            int iD = ((a0) this.f15635f).d(view);
            int iF = iD - ((a0) this.f15635f).f();
            this.f15634e = iD;
            if (iF > 0) {
                int iE = (((a0) this.f15635f).e() - Math.min(0, (((a0) this.f15635f).e() - iH) - ((a0) this.f15635f).b(view))) - (((a0) this.f15635f).c(view) + iD);
                if (iE < 0) {
                    this.f15634e -= Math.min(iF, -iE);
                    return;
                }
                return;
            }
            return;
        }
        int iE2 = (((a0) this.f15635f).e() - iH) - ((a0) this.f15635f).b(view);
        this.f15634e = ((a0) this.f15635f).e() - iE2;
        if (iE2 > 0) {
            int iC = this.f15634e - ((a0) this.f15635f).c(view);
            int iF2 = ((a0) this.f15635f).f();
            int iMin = iC - (Math.min(((a0) this.f15635f).d(view) - iF2, 0) + iF2);
            if (iMin < 0) {
                this.f15634e = Math.min(iE2, -iMin) + this.f15634e;
            }
        }
    }

    public final void d() {
        this.f15631b = -1;
        this.f15634e = Integer.MIN_VALUE;
        this.f15632c = false;
        this.f15633d = false;
    }

    public final void e(int i10, byte[] bArr, int i11) {
        if (this.f15632c) {
            int i12 = i11 - i10;
            byte[] bArr2 = (byte[]) this.f15635f;
            int length = bArr2.length;
            int i13 = this.f15634e + i12;
            if (length < i13) {
                this.f15635f = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, (byte[]) this.f15635f, this.f15634e, i12);
            this.f15634e += i12;
        }
    }

    public final void f() {
        this.f15632c = false;
        this.f15633d = false;
    }

    public final void g(int i10) {
        tc1.W(!this.f15632c);
        boolean z9 = i10 == this.f15631b;
        this.f15632c = z9;
        if (z9) {
            this.f15634e = 3;
            this.f15633d = false;
        }
    }

    public final boolean h(int i10) {
        if (!this.f15632c) {
            return false;
        }
        this.f15634e -= i10;
        this.f15632c = false;
        this.f15633d = true;
        return true;
    }

    public final String toString() {
        switch (this.f15630a) {
            case 0:
                return "AnchorInfo{mPosition=" + this.f15631b + ", mCoordinate=" + this.f15634e + ", mLayoutFromEnd=" + this.f15632c + ", mValid=" + this.f15633d + '}';
            default:
                return super.toString();
        }
    }

    public v() {
        d();
    }
}
