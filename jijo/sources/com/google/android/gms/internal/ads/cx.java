package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: loaded from: classes.dex */
public final class cx implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsResult f3463b;

    public /* synthetic */ cx(JsResult jsResult, int i10) {
        this.f3462a = i10;
        this.f3463b = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f3462a;
        JsResult jsResult = this.f3463b;
        switch (i11) {
            case 0:
                jsResult.cancel();
                break;
            default:
                jsResult.confirm();
                break;
        }
    }
}
