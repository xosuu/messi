package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class j implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f781a;

    public j(m mVar) {
        this.f781a = mVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        m mVar = this.f781a;
        Dialog dialog = mVar.f829s0;
        if (dialog != null) {
            mVar.onDismiss(dialog);
        }
    }
}
