package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.w;

/* JADX INFO: loaded from: classes.dex */
public final class f extends androidx.activity.result.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f144i;

    public f(w wVar) {
        this.f144i = wVar;
    }

    @Override // androidx.activity.result.f
    public final void b(int i10, t3.i iVar, Object obj) {
        Bundle bundle;
        i iVar2 = this.f144i;
        androidx.fragment.app.k kVarK = iVar.k(iVar2, obj);
        if (kVarK != null) {
            new Handler(Looper.getMainLooper()).post(new b.d(this, i10, kVarK, 1));
            return;
        }
        Intent intentJ = iVar.j(iVar2, obj);
        if (intentJ.getExtras() != null && intentJ.getExtras().getClassLoader() == null) {
            intentJ.setExtrasClassLoader(iVar2.getClassLoader());
        }
        if (intentJ.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentJ.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentJ.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentJ.getAction())) {
            String[] stringArrayExtra = intentJ.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            androidx.core.app.e.d(iVar2, stringArrayExtra, i10);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentJ.getAction())) {
            int i11 = androidx.core.app.e.f455b;
            androidx.core.app.a.b(iVar2, intentJ, i10, bundle);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentJ.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            IntentSender intentSender = intentSenderRequest.f178a;
            Intent intent = intentSenderRequest.f179b;
            int i12 = intentSenderRequest.f180d;
            int i13 = intentSenderRequest.f181f;
            int i14 = androidx.core.app.e.f455b;
            androidx.core.app.a.c(iVar2, intentSender, i10, intent, i12, i13, 0, bundle);
        } catch (IntentSender.SendIntentException e10) {
            new Handler(Looper.getMainLooper()).post(new b.d(this, i10, e10, 2));
        }
    }
}
