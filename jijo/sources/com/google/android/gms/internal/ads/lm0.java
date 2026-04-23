package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lm0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6661b;

    public /* synthetic */ lm0(int i10, ArrayList arrayList) {
        this.f6660a = i10;
        this.f6661b = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final void a(Object obj) {
        int i10 = this.f6660a;
        ArrayList<String> arrayList = this.f6661b;
        switch (i10) {
            case 0:
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
                break;
            default:
                ((Bundle) obj).putStringArrayList("android_permissions", arrayList);
                break;
        }
    }
}
