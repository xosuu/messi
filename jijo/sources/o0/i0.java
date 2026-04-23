package o0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t1 f16031a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f16032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f16033c;

    public i0(View view, t tVar) {
        this.f16032b = view;
        this.f16033c = tVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        t1 t1VarH = t1.h(windowInsets, view);
        int i10 = Build.VERSION.SDK_INT;
        t tVar = this.f16033c;
        if (i10 < 30) {
            j0.a(windowInsets, this.f16032b);
            if (t1VarH.equals(this.f16031a)) {
                return tVar.h(view, t1VarH).g();
            }
        }
        this.f16031a = t1VarH;
        t1 t1VarH2 = tVar.h(view, t1VarH);
        if (i10 >= 30) {
            return t1VarH2.g();
        }
        WeakHashMap weakHashMap = v0.f16075a;
        h0.c(view);
        return t1VarH2.g();
    }
}
