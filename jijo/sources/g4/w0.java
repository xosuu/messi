package g4;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.jt;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.gms.internal.consent_sdk.zzg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f13811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f13812b;

    public w0(Application application, g gVar) {
        this.f13811a = application;
        this.f13812b = gVar;
    }

    public final jt a(Activity activity, l5.e eVar) throws zzg {
        Bundle bundle;
        List listEmptyList;
        List listEmptyList2;
        PackageInfo packageInfo;
        c8.a aVar = eVar.f15220c;
        Application application = this.f13811a;
        if (aVar == null) {
            boolean z9 = tp1.M() || new ArrayList().contains(z.K(application.getApplicationContext()));
            c8.a aVar2 = new c8.a();
            aVar2.f1584b = z9;
            aVar2.f1583a = 0;
            aVar = aVar2;
        }
        jt jtVar = new jt(7);
        String string = eVar.f15219b;
        if (TextUtils.isEmpty(string)) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), NotificationCompat.FLAG_HIGH_PRIORITY).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(string)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        jtVar.f6072a = string;
        if (aVar.f1584b) {
            ArrayList arrayList = new ArrayList();
            int i10 = aVar.f1583a;
            if (i10 == 1) {
                arrayList.add(u.f13796a);
            } else if (i10 == 2) {
                arrayList.add(u.f13797b);
            }
            arrayList.add(u.f13798d);
            listEmptyList = arrayList;
        } else {
            listEmptyList = Collections.emptyList();
        }
        jtVar.f6080i = listEmptyList;
        jtVar.f6076e = this.f13812b.a();
        jtVar.f6075d = Boolean.valueOf(eVar.f15218a);
        jtVar.f6074c = Locale.getDefault().toLanguageTag();
        f0.d dVar = new f0.d();
        int i11 = Build.VERSION.SDK_INT;
        dVar.f13016d = Integer.valueOf(i11);
        dVar.f13015c = Build.MODEL;
        dVar.f13014b = 2;
        jtVar.f6073b = dVar;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        j2.h hVar = new j2.h(8);
        hVar.f14297a = Integer.valueOf(configuration.screenWidthDp);
        hVar.f14298b = Integer.valueOf(configuration.screenHeightDp);
        hVar.f14299d = Double.valueOf(application.getResources().getDisplayMetrics().density);
        if (i11 < 28) {
            listEmptyList2 = Collections.emptyList();
        } else {
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                listEmptyList2 = Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        v vVar = new v();
                        vVar.f13802b = Integer.valueOf(rect.left);
                        vVar.f13803c = Integer.valueOf(rect.right);
                        vVar.f13801a = Integer.valueOf(rect.top);
                        vVar.f13804d = Integer.valueOf(rect.bottom);
                        arrayList2.add(vVar);
                    }
                }
                listEmptyList2 = arrayList2;
            }
        }
        hVar.f14300f = listEmptyList2;
        jtVar.f6077f = hVar;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        t tVar = new t();
        tVar.f13793a = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        tVar.f13794b = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            tVar.f13795c = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        jtVar.f6078g = tVar;
        w wVar = new w();
        wVar.f13810a = "3.0.0";
        jtVar.f6079h = wVar;
        return jtVar;
    }
}
