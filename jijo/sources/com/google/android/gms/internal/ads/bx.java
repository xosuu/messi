package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import com.google.android.gms.ads.internal.overlay.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class bx implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3123b;

    public /* synthetic */ bx(int i10, Object obj) {
        this.f3122a = i10;
        this.f3123b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f3122a;
        Object obj = this.f3123b;
        switch (i10) {
            case 0:
                ((JsResult) obj).cancel();
                break;
            case 1:
                ((JsPromptResult) obj).cancel();
                break;
            default:
                zzm zzmVar = (zzm) obj;
                if (zzmVar != null) {
                    zzmVar.zzb();
                }
                break;
        }
    }
}
