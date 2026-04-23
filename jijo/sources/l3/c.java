package l3;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f15177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15178b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f15179d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f15180f;

    public c(Context context, String str, boolean z9, boolean z10) {
        this.f15177a = context;
        this.f15178b = str;
        this.f15179d = z9;
        this.f15180f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzu.zzp();
        AlertDialog.Builder builderZzK = zzt.zzK(this.f15177a);
        builderZzK.setMessage(this.f15178b);
        if (this.f15179d) {
            builderZzK.setTitle("Error");
        } else {
            builderZzK.setTitle("Info");
        }
        if (this.f15180f) {
            builderZzK.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderZzK.setPositiveButton("Learn More", new b(0, this));
            builderZzK.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderZzK.create().show();
    }
}
