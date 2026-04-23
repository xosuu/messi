package z0;

import android.util.SparseArray;
import android.widget.EditText;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.fg0;
import com.google.android.gms.internal.ads.ik0;
import com.google.android.gms.internal.ads.lc;
import com.google.android.gms.internal.ads.s2;
import com.google.android.gms.internal.ads.w2;
import com.google.android.gms.internal.ads.y1;
import com.google.android.gms.internal.ads.yn0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20648c;

    public b(int i10, int i11, int i12) {
        this.f20646a = i10;
        i11 = (i11 > 64 || i11 < 0) ? 64 : i11;
        if (i12 <= 0) {
            this.f20647b = 1;
        } else {
            this.f20647b = i12;
        }
        this.f20648c = new lc(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
    
        if (r2.size() < r11) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.util.ArrayList r17, java.util.ArrayList r18) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.b.a(java.util.ArrayList, java.util.ArrayList):java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final int zza() {
        return this.f20646a;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final int zzb() {
        return this.f20647b;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final int zzc() {
        int i10 = this.f20646a;
        return i10 == -1 ? ((ik0) this.f20648c).y() : i10;
    }

    public b(int i10, int i11, SparseArray sparseArray) {
        this.f20646a = i10;
        this.f20647b = i11;
        this.f20648c = sparseArray;
    }

    public /* synthetic */ b(int i10, int i11, String str) {
        this.f20646a = i10;
        this.f20647b = i11;
        this.f20648c = str;
    }

    public b(s2 s2Var, y1 y1Var) {
        ik0 ik0Var = s2Var.f8774c;
        this.f20648c = ik0Var;
        ik0Var.i(12);
        int iY = ik0Var.y();
        if ("audio/raw".equals(y1Var.f10714m)) {
            int iS = yn0.s(y1Var.B, y1Var.f10727z);
            if (iY == 0 || iY % iS != 0) {
                fg0.f("Audio sample size mismatch. stsd sample size: " + iS + ", stsz sample size: " + iY);
                iY = iS;
            }
        }
        this.f20646a = iY == 0 ? -1 : iY;
        this.f20647b = ik0Var.y();
    }

    public b(EditText editText) {
        this.f20646a = Integer.MAX_VALUE;
        this.f20647b = 0;
        if (editText != null) {
            this.f20648c = new a(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }

    public b() {
        this.f20648c = new b[NotificationCompat.FLAG_LOCAL_ONLY];
        this.f20646a = 0;
        this.f20647b = 0;
    }

    public b(int i10, int i11) {
        this.f20648c = null;
        this.f20646a = i10;
        int i12 = i11 & 7;
        this.f20647b = i12 == 0 ? 8 : i12;
    }
}
