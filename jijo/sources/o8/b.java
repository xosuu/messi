package o8;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.e;
import androidx.fragment.app.s;
import androidx.fragment.app.v;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16116c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, Object obj) {
        super(obj);
        this.f16116c = i10;
    }

    @Override // com.google.android.gms.internal.ads.hc
    public final void b(int i10, String... strArr) throws Exception {
        Object obj = this.f5252a;
        switch (this.f16116c) {
            case 0:
                e.d((Activity) obj, strArr, i10);
                break;
            default:
                ((s) obj).R(i10, strArr);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.hc
    public final Context c() {
        Object obj = this.f5252a;
        switch (this.f16116c) {
            case 0:
                return (Context) obj;
            default:
                return ((s) obj).c();
        }
    }

    @Override // com.google.android.gms.internal.ads.hc
    public final boolean f(String str) {
        Object obj = this.f5252a;
        switch (this.f16116c) {
            case 0:
                return e.e((Activity) obj, str);
            default:
                v vVar = ((s) obj).F;
                if (vVar != null) {
                    return e.e(vVar.B, str);
                }
                return false;
        }
    }
}
