package s3;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.j0;

/* JADX INFO: loaded from: classes.dex */
public class h extends androidx.fragment.app.m {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Dialog f16693x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f16694y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public AlertDialog f16695z0;

    @Override // androidx.fragment.app.m
    public final Dialog b0() {
        Dialog dialog = this.f16693x0;
        if (dialog != null) {
            return dialog;
        }
        this.f825o0 = false;
        if (this.f16695z0 == null) {
            Context contextL = l();
            z3.a.l(contextL);
            this.f16695z0 = new AlertDialog.Builder(contextL).create();
        }
        return this.f16695z0;
    }

    @Override // androidx.fragment.app.m
    public final void d0(j0 j0Var, String str) {
        super.d0(j0Var, str);
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f16694y0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
