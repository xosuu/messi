package v3;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements DialogInterface.OnClickListener {
    public abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            a();
        } catch (ActivityNotFoundException unused) {
            Build.FINGERPRINT.contains("generic");
        } finally {
            dialogInterface.dismiss();
        }
    }
}
