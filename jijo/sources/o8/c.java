package o8;

import android.os.Bundle;
import androidx.fragment.app.j0;
import androidx.fragment.app.s;
import com.google.android.gms.internal.ads.hc;
import f.q;
import n8.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends hc {
    @Override // com.google.android.gms.internal.ads.hc
    public final void g(String str, String str2, String str3, int i10, int i11, String... strArr) {
        j0 j0VarD;
        b bVar = (b) this;
        Object obj = bVar.f5252a;
        switch (bVar.f16116c) {
            case 0:
                j0VarD = ((q) obj).A.d();
                break;
            default:
                j0VarD = ((s) obj).k();
                break;
        }
        if (j0VarD.A("RationaleDialogFragmentCompat") instanceof d) {
            return;
        }
        d dVar = new d();
        Bundle bundle = new Bundle();
        bundle.putString("positiveButton", str2);
        bundle.putString("negativeButton", str3);
        bundle.putString("rationaleMsg", str);
        bundle.putInt("theme", i10);
        bundle.putInt("requestCode", i11);
        bundle.putStringArray("permissions", strArr);
        dVar.W(bundle);
        if (j0VarD.I()) {
            return;
        }
        dVar.d0(j0VarD, "RationaleDialogFragmentCompat");
    }
}
