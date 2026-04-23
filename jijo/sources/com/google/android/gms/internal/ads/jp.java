package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class jp implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6058b;

    public /* synthetic */ jp(int i10, Object obj) {
        this.f6057a = i10;
        this.f6058b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f6057a;
        Object obj = this.f6058b;
        switch (i10) {
            case 0:
                ((kp) obj).l(true);
                break;
            default:
                ((jc0) obj).f5896j.zza();
                break;
        }
    }
}
