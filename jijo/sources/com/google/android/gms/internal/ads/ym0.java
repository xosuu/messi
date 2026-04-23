package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ym0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f10939b;

    public /* synthetic */ ym0(Integer num, int i10) {
        this.f10938a = i10;
        this.f10939b = num;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i10 = this.f10938a;
        Integer num = this.f10939b;
        switch (i10) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (num != null) {
                    bundle.putInt("aos", num.intValue());
                }
                break;
            default:
                Bundle bundle2 = (Bundle) obj;
                if (num != null) {
                    bundle2.putInt("dspct", Math.min(num.intValue(), 20));
                }
                break;
        }
    }
}
