package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yl0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10925a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10928d;

    public yl0(Context context, zzq zzqVar, ArrayList arrayList) {
        this.f10926b = context;
        this.f10927c = zzqVar;
        this.f10928d = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        int i10 = this.f10925a;
        Object obj2 = this.f10928d;
        Object obj3 = this.f10927c;
        Object obj4 = this.f10926b;
        switch (i10) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (((Boolean) oh.f7575a.k()).booleanValue()) {
                    Bundle bundle2 = new Bundle();
                    zzu.zzp();
                    String className = null;
                    try {
                        ActivityManager activityManager = (ActivityManager) ((Context) obj4).getSystemService("activity");
                        if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                            className = runningTaskInfo.topActivity.getClassName();
                        }
                        break;
                    } catch (Exception unused) {
                    }
                    bundle2.putString("activity", className);
                    Bundle bundle3 = new Bundle();
                    zzq zzqVar = (zzq) obj3;
                    bundle3.putInt("width", zzqVar.zze);
                    bundle3.putInt("height", zzqVar.zzb);
                    bundle2.putBundle("size", bundle3);
                    List list = (List) obj2;
                    if (!list.isEmpty()) {
                        bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
                    }
                    bundle.putBundle("view_hierarchy", bundle2);
                    break;
                }
                break;
            default:
                Bundle bundle4 = (Bundle) obj;
                bundle4.putString("consent_string", (String) obj4);
                bundle4.putString("fc_consent", (String) obj3);
                bundle4.putBundle("iab_consent_info", (Bundle) obj2);
                break;
        }
    }

    public /* synthetic */ yl0(String str, String str2, Bundle bundle) {
        this.f10926b = str;
        this.f10927c = str2;
        this.f10928d = bundle;
    }
}
