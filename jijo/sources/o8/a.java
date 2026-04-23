package o8;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.e;
import androidx.fragment.app.s;
import com.google.android.gms.internal.ads.hc;

/* JADX INFO: loaded from: classes.dex */
public final class a extends hc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, Object obj) {
        super(obj);
        this.f16115c = i10;
    }

    @Override // com.google.android.gms.internal.ads.hc
    public final void b(int i10, String... strArr) {
        switch (this.f16115c) {
            case 0:
                e.d((Activity) this.f5252a, strArr, i10);
                return;
            default:
                throw new IllegalStateException("Should never be requesting permissions on API < 23!");
        }
    }

    @Override // com.google.android.gms.internal.ads.hc
    public final Context c() {
        Object obj = this.f5252a;
        switch (this.f16115c) {
            case 0:
                return (Context) obj;
            default:
                if (obj instanceof Activity) {
                    return (Context) obj;
                }
                if (obj instanceof s) {
                    return ((s) obj).l();
                }
                throw new IllegalStateException("Unknown host: " + obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.hc
    public final boolean f(String str) {
        switch (this.f16115c) {
            case 0:
                return e.e((Activity) this.f5252a, str);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.hc
    public final void g(String str, String str2, String str3, int i10, int i11, String... strArr) {
        switch (this.f16115c) {
            case 0:
                FragmentManager fragmentManager = ((Activity) this.f5252a).getFragmentManager();
                if (fragmentManager.findFragmentByTag("RationaleDialogFragment") instanceof n8.c) {
                    return;
                }
                n8.c cVar = new n8.c();
                Bundle bundle = new Bundle();
                bundle.putString("positiveButton", str2);
                bundle.putString("negativeButton", str3);
                bundle.putString("rationaleMsg", str);
                bundle.putInt("theme", i10);
                bundle.putInt("requestCode", i11);
                bundle.putStringArray("permissions", strArr);
                cVar.setArguments(bundle);
                if ((Build.VERSION.SDK_INT < 26 || !fragmentManager.isStateSaved()) && !cVar.f15991b) {
                    cVar.show(fragmentManager, "RationaleDialogFragment");
                    return;
                }
                return;
            default:
                throw new IllegalStateException("Should never be requesting permissions on API < 23!");
        }
    }
}
