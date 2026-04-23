package l;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.gp0;
import com.google.android.gms.internal.ads.hc;
import java.util.Arrays;
import team.dev.epro.apkcustom.activities.ConfigImport;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements s0, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View.OnCreateContextMenuListener f14943b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14944d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f14945f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f14946h;

    public o0(n8.d dVar, z.f fVar, n8.b bVar) {
        this.f14942a = 1;
        View.OnCreateContextMenuListener onCreateContextMenuListener = dVar.H;
        this.f14943b = onCreateContextMenuListener == null ? dVar.c() : onCreateContextMenuListener;
        this.f14944d = fVar;
        this.f14945f = bVar;
        this.f14946h = null;
    }

    @Override // l.s0
    public final boolean a() {
        f.n nVar = (f.n) this.f14943b;
        if (nVar != null) {
            return nVar.isShowing();
        }
        return false;
    }

    @Override // l.s0
    public final int b() {
        return 0;
    }

    @Override // l.s0
    public final Drawable d() {
        return null;
    }

    @Override // l.s0
    public final void dismiss() {
        f.n nVar = (f.n) this.f14943b;
        if (nVar != null) {
            nVar.dismiss();
            this.f14943b = null;
        }
    }

    @Override // l.s0
    public final void f(CharSequence charSequence) {
        this.f14945f = charSequence;
    }

    @Override // l.s0
    public final void h(Drawable drawable) {
    }

    @Override // l.s0
    public final void j(int i10) {
    }

    @Override // l.s0
    public final void k(int i10) {
    }

    @Override // l.s0
    public final void l(int i10) {
    }

    @Override // l.s0
    public final void m(int i10, int i11) {
        if (((ListAdapter) this.f14944d) == null) {
            return;
        }
        gp0 gp0Var = new gp0(((androidx.appcompat.widget.c) this.f14946h).getPopupContext());
        CharSequence charSequence = (CharSequence) this.f14945f;
        if (charSequence != null) {
            gp0Var.q(charSequence);
        }
        ListAdapter listAdapter = (ListAdapter) this.f14944d;
        int selectedItemPosition = ((androidx.appcompat.widget.c) this.f14946h).getSelectedItemPosition();
        f.j jVar = (f.j) gp0Var.f5026d;
        jVar.f12865o = listAdapter;
        jVar.f12866p = this;
        jVar.f12869s = selectedItemPosition;
        jVar.f12868r = true;
        f.n nVarE = gp0Var.e();
        this.f14943b = nVarE;
        AlertController$RecycleListView alertController$RecycleListView = nVarE.f12945h.f12923g;
        m0.d(alertController$RecycleListView, i10);
        m0.c(alertController$RecycleListView, i11);
        ((f.n) this.f14943b).show();
    }

    @Override // l.s0
    public final int n() {
        return 0;
    }

    @Override // l.s0
    public final CharSequence o() {
        return (CharSequence) this.f14945f;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f14942a) {
            case 0:
                ((androidx.appcompat.widget.c) this.f14946h).setSelection(i10);
                if (((androidx.appcompat.widget.c) this.f14946h).getOnItemClickListener() != null) {
                    ((androidx.appcompat.widget.c) this.f14946h).performItemClick(null, i10, ((ListAdapter) this.f14944d).getItemId(i10));
                }
                dismiss();
                return;
            default:
                z.f fVar = (z.f) this.f14944d;
                int i11 = fVar.f20532b;
                if (i10 != -1) {
                    fb1.t(this.f14946h);
                    n8.b bVar = (n8.b) this.f14945f;
                    if (bVar != null) {
                        z.f fVar2 = (z.f) this.f14944d;
                        int i12 = fVar2.f20532b;
                        Arrays.asList((String[]) fVar2.f20536f);
                        ((ConfigImport) bVar).w();
                        return;
                    }
                    return;
                }
                String[] strArr = (String[]) fVar.f20536f;
                fb1.t(this.f14946h);
                View.OnCreateContextMenuListener onCreateContextMenuListener = this.f14943b;
                if (onCreateContextMenuListener instanceof androidx.fragment.app.s) {
                    androidx.fragment.app.s sVar = (androidx.fragment.app.s) onCreateContextMenuListener;
                    (Build.VERSION.SDK_INT < 23 ? new o8.a(1, sVar) : new o8.b(1, sVar)).b(i11, strArr);
                    return;
                } else {
                    if (!(onCreateContextMenuListener instanceof Activity)) {
                        throw new RuntimeException("Host must be an Activity or Fragment!");
                    }
                    hc.e((Activity) onCreateContextMenuListener).b(i11, strArr);
                    return;
                }
        }
    }

    @Override // l.s0
    public final void p(ListAdapter listAdapter) {
        this.f14944d = listAdapter;
    }

    public o0(n8.c cVar, z.f fVar, n8.b bVar) {
        this.f14942a = 1;
        this.f14943b = cVar.getActivity();
        this.f14944d = fVar;
        this.f14945f = bVar;
        this.f14946h = null;
    }

    public o0(androidx.appcompat.widget.c cVar) {
        this.f14942a = 0;
        this.f14946h = cVar;
    }
}
