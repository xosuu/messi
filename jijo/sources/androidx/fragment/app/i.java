package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class i implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f777a;

    public i(m mVar) {
        this.f777a = mVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m mVar = this.f777a;
        Dialog dialog = mVar.f829s0;
        if (dialog != null) {
            mVar.onCancel(dialog);
        }
    }
}
