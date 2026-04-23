package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzf;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kc0 f3887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tb0 f3888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public da0 f3889c = null;

    public ea0(kc0 kc0Var, tb0 tb0Var) {
        this.f3887a = kc0Var;
        this.f3888b = tb0Var;
    }

    public static final int b(int i10, Context context, String str) {
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        zzay.zzb();
        return zzf.zzy(context, i10);
    }

    public final View a(FrameLayout frameLayout, WindowManager windowManager) {
        nx nxVarA = this.f3887a.a(zzq.zzc(), null, null);
        nxVarA.setVisibility(4);
        nxVarA.setContentDescription("policy_validator");
        nxVarA.l0("/sendMessageToSdk", new ok(7, this));
        nxVarA.l0("/hideValidatorOverlay", new ca0(this, windowManager, frameLayout));
        nxVarA.l0("/open", new cl(null, null, null, null, null));
        WeakReference weakReference = new WeakReference(nxVarA);
        ca0 ca0Var = new ca0(this, frameLayout, windowManager);
        tb0 tb0Var = this.f3888b;
        tb0Var.getClass();
        tb0Var.c("/loadNativeAdPolicyViolations", new sb0(tb0Var, weakReference, "/loadNativeAdPolicyViolations", ca0Var));
        tb0Var.c("/showValidatorOverlay", new sb0(tb0Var, new WeakReference(nxVarA), "/showValidatorOverlay", new rk(28)));
        return nxVarA;
    }
}
