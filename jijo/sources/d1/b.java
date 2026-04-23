package d1;

import androidx.lifecycle.k0;
import com.google.android.gms.internal.ads.fb1;
import s.l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f12295d = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f12296c = new l();

    @Override // androidx.lifecycle.k0
    public final void a() {
        l lVar = this.f12296c;
        int i10 = lVar.f16630d;
        if (i10 > 0) {
            fb1.t(lVar.f16629b[0]);
            throw null;
        }
        Object[] objArr = lVar.f16629b;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        lVar.f16630d = 0;
    }
}
