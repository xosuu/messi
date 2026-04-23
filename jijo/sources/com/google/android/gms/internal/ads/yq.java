package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yq extends sq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11005b;

    public /* synthetic */ yq(Object obj, int i10) {
        this.f11004a = i10;
        this.f11005b = obj;
    }

    @Override // com.google.android.gms.internal.ads.tq
    public final void a(String str) {
        int i10 = this.f11004a;
        Object obj = this.f11005b;
        switch (i10) {
            case 0:
                ((UpdateImpressionUrlsCallback) obj).onFailure(str);
                break;
            default:
                ((UpdateClickUrlCallback) obj).onFailure(str);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.tq
    public final void h0(List list) {
        int i10 = this.f11004a;
        Object obj = this.f11005b;
        switch (i10) {
            case 0:
                ((UpdateImpressionUrlsCallback) obj).onSuccess(list);
                break;
            default:
                ((UpdateClickUrlCallback) obj).onSuccess((Uri) list.get(0));
                break;
        }
    }
}
