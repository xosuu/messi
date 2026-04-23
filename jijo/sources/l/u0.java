package l;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends q7.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WeakReference f15014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f15015e;

    public u0(b1 b1Var, int i10, int i11, WeakReference weakReference) {
        this.f15015e = b1Var;
        this.f15012b = i10;
        this.f15013c = i11;
        this.f15014d = weakReference;
    }

    @Override // q7.b
    public final void m(int i10) {
    }

    @Override // q7.b
    public final void n(Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f15012b) != -1) {
            typeface = a1.a(typeface, i10, (this.f15013c & 2) != 0);
        }
        b1 b1Var = this.f15015e;
        if (b1Var.f14806m) {
            b1Var.f14805l = typeface;
            TextView textView = (TextView) this.f15014d.get();
            if (textView != null) {
                WeakHashMap weakHashMap = o0.v0.f16075a;
                if (o0.g0.b(textView)) {
                    textView.post(new v0(b1Var, textView, typeface, b1Var.f14803j));
                } else {
                    textView.setTypeface(typeface, b1Var.f14803j);
                }
            }
        }
    }
}
