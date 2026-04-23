package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class t implements q1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f903a;

    public t(f.q qVar) {
        this.f903a = qVar;
    }

    @Override // q1.c
    public final Bundle a() {
        w wVar;
        Bundle bundle = new Bundle();
        do {
            wVar = this.f903a;
        } while (w.p(wVar.A.d()));
        wVar.B.e(androidx.lifecycle.k.ON_STOP);
        Parcelable parcelableR = ((v) wVar.A.f808a).A.R();
        if (parcelableR != null) {
            bundle.putParcelable("android:support:fragments", parcelableR);
        }
        return bundle;
    }
}
