package n8;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import l.o0;
import z.f;

/* JADX INFO: loaded from: classes.dex */
public final class c extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f15990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15991b = false;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() != null) {
            if (getParentFragment() instanceof b) {
                this.f15990a = (b) getParentFragment();
            }
            getParentFragment();
        }
        if (context instanceof b) {
            this.f15990a = (b) context;
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        f fVar = new f(getArguments());
        o0 o0Var = new o0(this, fVar, this.f15990a);
        Activity activity = getActivity();
        int i10 = fVar.f20531a;
        return (i10 > 0 ? new AlertDialog.Builder(activity, i10) : new AlertDialog.Builder(activity)).setCancelable(false).setPositiveButton((String) fVar.f20533c, o0Var).setNegativeButton((String) fVar.f20534d, o0Var).setMessage((String) fVar.f20535e).create();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f15990a = null;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        this.f15991b = true;
        super.onSaveInstanceState(bundle);
    }
}
