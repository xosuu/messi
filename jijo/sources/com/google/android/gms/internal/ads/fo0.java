package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class fo0 implements to0, so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApplicationInfo f4582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PackageInfo f4583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cd0 f4585d;

    public fo0(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context, cd0 cd0Var) {
        this.f4582a = applicationInfo;
        this.f4583b = packageInfo;
        this.f4584c = context;
        this.f4585d = cd0Var;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final void a(Object obj) {
        Context context = this.f4584c;
        Bundle bundle = (Bundle) obj;
        ApplicationInfo applicationInfo = this.f4582a;
        String str = applicationInfo.packageName;
        PackageInfo packageInfo = this.f4583b;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        cd0 cd0Var = this.f4585d;
        if (numValueOf != null) {
            bundle.putInt("vc", numValueOf.intValue());
            if (((Boolean) zzba.zzc().a(eg.V1)).booleanValue()) {
                cd0Var.a("vc", numValueOf.toString());
            }
        }
        String str2 = packageInfo != null ? packageInfo.versionName : null;
        if (str2 != null) {
            bundle.putString("vnm", str2);
            if (((Boolean) zzba.zzc().a(eg.V1)).booleanValue()) {
                cd0Var.a("vn", str2);
            }
        }
        try {
            String str3 = applicationInfo.packageName;
            ew0 ew0Var = zzt.zza;
            Context context2 = z3.b.a(context).f16692a;
            bundle.putString("dl", String.valueOf(context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str3, 0))));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) zzba.zzc().a(eg.Nb)).booleanValue()) {
                try {
                    InstallSourceInfo installSourceInfo = context.getPackageManager().getInstallSourceInfo(str);
                    if (installSourceInfo == null) {
                        return;
                    }
                    String installingPackageName = installSourceInfo.getInstallingPackageName();
                    if (TextUtils.isEmpty(installingPackageName)) {
                        zze.zza("No installing package name found");
                    } else {
                        bundle.putString("ins_pn", installingPackageName);
                    }
                    String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                    if (TextUtils.isEmpty(initiatingPackageName)) {
                        zze.zza("No initiating package name found");
                    } else {
                        bundle.putString("ini_pn", initiatingPackageName);
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    zzu.zzo().i("PackageInfoSignalsource.compose", e10);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        return 29;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final n5.a zzb() {
        return tc1.d0(this);
    }
}
