package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzcj;
import com.google.android.gms.ads.internal.zzu;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wf implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10166a;

    public /* synthetic */ wf(int i10) {
        this.f10166a = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String strZzj;
        String strZzk;
        String str;
        int i10 = 2;
        Bundle bundle = null;
        int i11 = 1;
        switch (this.f10166a) {
            case 0:
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            case 1:
                ((y3.b) zzu.zzB()).getClass();
                return new ln0(Long.valueOf(System.currentTimeMillis() - zzu.zzo().d().zzh().f3445f).longValue());
            case 2:
                zzu.zzp();
                fc fcVarZzg = zzu.zzo().d().zzg();
                if (fcVarZzg != null && (!zzu.zzo().d().zzP() || !zzu.zzo().d().zzQ())) {
                    if (fcVarZzg.f4449b) {
                        synchronized (fcVarZzg.f4450d) {
                            fcVarZzg.f4449b = false;
                            fcVarZzg.f4450d.notifyAll();
                            zzm.zze("ContentFetchThread: wakeup");
                        }
                    }
                    ac acVarA = fcVarZzg.a();
                    if (acVarA != null) {
                        strZzj = acVarA.f2650o;
                        str = acVarA.f2651p;
                        strZzk = acVarA.f2652q;
                        if (strZzj != null) {
                            zzu.zzo().d().zzx(strZzj);
                        }
                        if (strZzk != null) {
                            zzu.zzo().d().zzz(strZzk);
                        }
                    } else {
                        strZzj = zzu.zzo().d().zzj();
                        strZzk = zzu.zzo().d().zzk();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!zzu.zzo().d().zzQ()) {
                        if (strZzk == null || TextUtils.isEmpty(strZzk)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", strZzk);
                        }
                    }
                    if (strZzj != null && !zzu.zzo().d().zzP()) {
                        bundle2.putString("fingerprint", strZzj);
                        if (!strZzj.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                    break;
                }
                return new mm0(1, bundle);
            case 3:
                return new qm0(i11, zzu.zzs().zzb(), zzu.zzs().zzm());
            case 4:
                Bundle bundle3 = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle3.putLong("runtime_free", runtime.freeMemory());
                bundle3.putLong("runtime_max", runtime.maxMemory());
                bundle3.putLong("runtime_total", runtime.totalMemory());
                bundle3.putInt("web_view_count", zzu.zzo().f5063j.get());
                return new mm0(2, bundle3);
            case 5:
                return new gn0(i10, new JSONObject());
            case 6:
                HashMap map = new HashMap();
                String str2 = (String) zzba.zzc().a(eg.D);
                if (str2 != null && !str2.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) zzba.zzc().a(eg.E)).intValue()) {
                        for (String str3 : str2.split(",", -1)) {
                            map.put(str3, zzcj.zza(str3));
                        }
                    }
                }
                return new gn0(5, map);
            default:
                return null;
        }
    }

    public /* synthetic */ wf(int i10, int i11) {
        this.f10166a = i10;
    }
}
