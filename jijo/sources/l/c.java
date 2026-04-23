package l;

import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: loaded from: classes.dex */
public final class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14816a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14817b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14818d;

    public c(ActionBarContextView actionBarContextView, j.b bVar) {
        this.f14818d = actionBarContextView;
        this.f14817b = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f14816a;
        Object obj = this.f14817b;
        switch (i10) {
            case 0:
                ((j.b) obj).a();
                break;
            default:
                x3 x3Var = (x3) this.f14818d;
                Window.Callback callback = x3Var.f15078k;
                if (callback != null && x3Var.f15079l) {
                    callback.onMenuItemSelected(0, (k.a) obj);
                    break;
                }
                break;
        }
    }

    public c(x3 x3Var) {
        this.f14818d = x3Var;
        this.f14817b = new k.a(x3Var.f15068a.getContext(), x3Var.f15075h);
    }
}
