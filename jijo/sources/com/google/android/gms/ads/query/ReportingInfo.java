package com.google.android.gms.ads.query;

import a4.b;
import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.ep;
import com.google.android.gms.internal.ads.m20;
import com.google.android.gms.internal.ads.ut;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ReportingInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ep f2437a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m20 f2438a;

        public Builder(View view) {
            m20 m20Var = new m20(12);
            this.f2438a = m20Var;
            m20Var.f6809b = view;
        }

        public ReportingInfo build() {
            return new ReportingInfo(this);
        }

        public Builder setAssetViews(Map<String, View> map) {
            m20 m20Var = this.f2438a;
            ((Map) m20Var.f6810d).clear();
            for (Map.Entry<String, View> entry : map.entrySet()) {
                View value = entry.getValue();
                if (value != null) {
                    ((Map) m20Var.f6810d).put(entry.getKey(), new WeakReference(value));
                }
            }
            return this;
        }
    }

    public /* synthetic */ ReportingInfo(Builder builder) {
        this.f2437a = new ep(builder.f2438a);
    }

    public void recordClick(List<Uri> list) {
        ep epVar = this.f2437a;
        epVar.getClass();
        if (list == null || list.isEmpty()) {
            zzm.zzj("No click urls were passed to recordClick");
            return;
        }
        if (((ut) epVar.f4271f) == null) {
            zzm.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            ((ut) epVar.f4271f).zzh(list, new b((View) epVar.f4269b), new zq(list, 1));
        } catch (RemoteException e10) {
            zzm.zzg("RemoteException recording click: ".concat(e10.toString()));
        }
    }

    public void recordImpression(List<Uri> list) {
        ep epVar = this.f2437a;
        epVar.getClass();
        if (list == null || list.isEmpty()) {
            zzm.zzj("No impression urls were passed to recordImpression");
            return;
        }
        ut utVar = (ut) epVar.f4271f;
        if (utVar == null) {
            zzm.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        try {
            utVar.zzi(list, new b((View) epVar.f4269b), new zq(list, 0));
        } catch (RemoteException e10) {
            zzm.zzg("RemoteException recording impression urls: ".concat(e10.toString()));
        }
    }

    public void reportTouchEvent(MotionEvent motionEvent) {
        ut utVar = (ut) this.f2437a.f4271f;
        if (utVar == null) {
            zzm.zze("Failed to get internal reporting info generator.");
            return;
        }
        try {
            utVar.zzk(new b(motionEvent));
        } catch (RemoteException unused) {
            zzm.zzg("Failed to call remote method.");
        }
    }

    public void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        ep epVar = this.f2437a;
        if (((ut) epVar.f4271f) == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            ((ut) epVar.f4271f).zzl(new ArrayList(Arrays.asList(uri)), new b((View) epVar.f4269b), new yq(updateClickUrlCallback, 1));
        } catch (RemoteException e10) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e10.toString()));
        }
    }

    public void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        ep epVar = this.f2437a;
        if (((ut) epVar.f4271f) == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            ((ut) epVar.f4271f).zzm(list, new b((View) epVar.f4269b), new yq(updateImpressionUrlsCallback, 0));
        } catch (RemoteException e10) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e10.toString()));
        }
    }
}
