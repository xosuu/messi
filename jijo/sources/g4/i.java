package g4;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.gms.internal.consent_sdk.zzg;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f13727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f13728b;

    public i(k kVar, Activity activity) {
        this.f13728b = kVar;
        this.f13727a = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        k kVar = this.f13728b;
        Dialog dialog = kVar.f13740f;
        if (dialog == null || !kVar.f13746l) {
            return;
        }
        dialog.setOwnerActivity(activity);
        q qVar = kVar.f13736b;
        if (qVar != null) {
            qVar.f13775a = activity;
        }
        AtomicReference atomicReference = kVar.f13745k;
        i iVar = (i) atomicReference.getAndSet(null);
        if (iVar != null) {
            iVar.f13728b.f13735a.unregisterActivityLifecycleCallbacks(iVar);
            i iVar2 = new i(kVar, activity);
            kVar.f13735a.registerActivityLifecycleCallbacks(iVar2);
            atomicReference.set(iVar2);
        }
        Dialog dialog2 = kVar.f13740f;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        if (activity != this.f13727a) {
            return;
        }
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        k kVar = this.f13728b;
        if (zIsChangingConfigurations && kVar.f13746l && (dialog = kVar.f13740f) != null) {
            dialog.dismiss();
            return;
        }
        zzg zzgVar = new zzg(3, "Activity is destroyed.");
        Dialog dialog2 = kVar.f13740f;
        if (dialog2 != null) {
            dialog2.dismiss();
            kVar.f13740f = null;
        }
        kVar.f13736b.f13775a = null;
        i iVar = (i) kVar.f13745k.getAndSet(null);
        if (iVar != null) {
            iVar.f13728b.f13735a.unregisterActivityLifecycleCallbacks(iVar);
        }
        l5.a aVar = (l5.a) kVar.f13744j.getAndSet(null);
        if (aVar == null) {
            return;
        }
        zzgVar.a();
        aVar.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
