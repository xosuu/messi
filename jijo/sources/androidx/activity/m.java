package androidx.activity;

import android.window.OnBackInvokedCallback;
import f.k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f163b;

    public /* synthetic */ m(int i10, Object obj) {
        this.f162a = i10;
        this.f163b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f162a) {
            case 0:
                ((Runnable) this.f163b).run();
                break;
            case 1:
                ((Runnable) this.f163b).run();
                break;
            default:
                ((k0) this.f163b).H();
                break;
        }
    }
}
