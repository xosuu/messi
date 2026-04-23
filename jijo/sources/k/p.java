package k;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class p implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f14583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f.n f14584b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f14585d;

    @Override // k.c0
    public final void b(o oVar, boolean z9) {
        f.n nVar;
        if ((z9 || oVar == this.f14583a) && (nVar = this.f14584b) != null) {
            nVar.dismiss();
        }
    }

    @Override // k.c0
    public final boolean i(o oVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        k kVar = this.f14585d;
        if (kVar.f14551q == null) {
            kVar.f14551q = new j(kVar);
        }
        this.f14583a.q(kVar.f14551q.getItem(i10), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f14585d.b(this.f14583a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        o oVar = this.f14583a;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f14584b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f14584b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                oVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return oVar.performShortcut(i10, keyEvent, 0);
    }
}
