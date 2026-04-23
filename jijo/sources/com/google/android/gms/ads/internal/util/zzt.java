package com.google.android.gms.ads.internal.util;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.core.app.NotificationCompat;
import androidx.core.app.j;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.ew0;
import com.google.android.gms.internal.ads.ex0;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.fr0;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.hr0;
import com.google.android.gms.internal.ads.ks0;
import com.google.android.gms.internal.ads.mc0;
import com.google.android.gms.internal.ads.pg;
import com.google.android.gms.internal.ads.px0;
import com.google.android.gms.internal.ads.rh1;
import com.google.android.gms.internal.ads.tc1;
import com.google.android.gms.internal.ads.uh;
import com.google.android.gms.internal.ads.ur0;
import com.google.android.gms.internal.ads.xf;
import com.google.android.gms.internal.ads.y21;
import com.google.android.gms.internal.ads.zr;
import f.g0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import l3.h;
import org.jasypt.digest.StandardStringDigester;
import org.joda.time.DateTimeConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s3.f;
import y3.c;
import z3.a;
import z3.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzt {
    public static final ew0 zza = new zzf(Looper.getMainLooper());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile String f2212h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f2205a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f2206b = new AtomicReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f2207c = new AtomicReference(new Bundle());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f2208d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2209e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f2210f = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2213i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2214j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ExecutorService f2215k = Executors.newSingleThreadExecutor();

    public static Bundle a(Context context) {
        try {
            return b.a(context).b(NotificationCompat.FLAG_HIGH_PRIORITY, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            zze.zzb("Error getting metadata", e10);
            return null;
        }
    }

    public static String b(Bundle bundle) {
        if (bundle == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public static boolean c(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static final String d(final Context context, String str) {
        final Context contextCreatePackageContext;
        if (str == null) {
            return e();
        }
        String strE = null;
        try {
            zzcg zzcgVarZza = zzcg.zza();
            if (TextUtils.isEmpty(zzcgVarZza.f2164a)) {
                AtomicBoolean atomicBoolean = f.f16689a;
                try {
                    contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    contextCreatePackageContext = null;
                }
                zzcgVarZza.f2164a = (String) zzcd.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        SharedPreferences sharedPreferences;
                        Context context2 = contextCreatePackageContext;
                        Context context3 = context;
                        boolean z9 = false;
                        if (context2 != null) {
                            zze.zza("Attempting to read user agent from Google Play Services.");
                            sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                        } else {
                            zze.zza("Attempting to read user agent from local cache.");
                            sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                            z9 = true;
                        }
                        String string = sharedPreferences.getString("user_agent", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        if (TextUtils.isEmpty(string)) {
                            zze.zza("Reading user agent from WebSettings");
                            string = WebSettings.getDefaultUserAgent(context3);
                            if (z9) {
                                sharedPreferences.edit().putString("user_agent", string).apply();
                                zze.zza("Persisting user agent.");
                            }
                        }
                        return string;
                    }
                });
            }
            strE = zzcgVarZza.f2164a;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(strE)) {
            strE = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strE)) {
            strE = e();
        }
        String strX = fb1.x(strE, " (Mobile; ", str);
        try {
            if (b.a(context).f()) {
                strX = strX + ";aia";
            }
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzu.zzo().i("AdUtil.getUserAgent", e10);
        }
        return strX.concat(")");
    }

    public static final String e() {
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_LOCAL_ONLY);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final boolean zzA(Context context, String str) {
        int i10 = zr.f11315a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return b.a(context).f16692a.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static final boolean zzB(Context context) {
        try {
            if (c.f20458g == null) {
                c.f20458g = Boolean.valueOf(a.L() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return c.f20458g.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzC(String str) {
        if (!com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4156v4)).booleanValue()) {
            return false;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4175x4);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4165w4);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzD(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("keyguard");
        KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
        return keyguardManager != null && keyguardManager.isKeyguardLocked();
    }

    public static final boolean zzE(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error loading class.", th);
            com.google.android.gms.ads.internal.zzu.zzo().i("AdUtil.isLiteSdk", th);
            return false;
        }
    }

    public static final boolean zzF() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    public static final boolean zzG(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzH(Context context) {
        try {
            Bundle bundleA = a(context);
            String string = bundleA.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(b(bundleA))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean zzI(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzJ(View view, int i10, MotionEvent motionEvent) {
        String strA;
        int i11;
        int iHeight;
        int iWidth;
        String str;
        fr0 fr0VarI;
        hr0 hr0VarZzR;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (childAt instanceof mc0) {
                childAt = ((mc0) childAt).getChildAt(0);
            }
            if ((childAt instanceof com.google.android.gms.ads.formats.zzj) || (childAt instanceof NativeAdView)) {
                strA = "NATIVE";
                i11 = 1;
            } else {
                strA = "UNKNOWN";
                i11 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            long jZzw = zzw(childAt);
            childAt.getLocationOnScreen(iArr);
            int i12 = iArr[0];
            int i13 = iArr[1];
            String str2 = "none";
            if (!(childAt instanceof fx) || (hr0VarZzR = ((fx) childAt).zzR()) == null) {
                str = "none";
            } else {
                str = hr0VarZzR.f5371b;
                childAt.setContentDescription(str + ":" + childAt.hashCode());
            }
            if ((childAt instanceof fx) && (fr0VarI = ((fx) childAt).i()) != null) {
                strA = fr0.a(fr0VarI.f4602b);
                i11 = fr0VarI.f4608e;
                str2 = fr0VarI.E;
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(childAt.hashCode()), packageName, str2, str, strA, Integer.valueOf(i11), childAt.getClass().getName(), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), Integer.valueOf(iWidth), Integer.valueOf(iHeight), Long.valueOf(jZzw), Integer.toString(i10, 2)));
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failure getting view location.", e10);
        }
    }

    public static final AlertDialog.Builder zzK(Context context) {
        com.google.android.gms.ads.internal.zzu.zzq();
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void zzL(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new zzbw(context, str, (String) it.next()).zzb();
        }
    }

    public static final void zzM(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        try {
            if (((Boolean) uh.f9480b.k()).booleanValue()) {
                a.l(th);
            }
        } catch (IllegalStateException | Exception unused) {
        }
    }

    public static final String zzN(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int i10 = inputStreamReader.read(cArr);
            if (i10 == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i10);
        }
    }

    public static final int zzO(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse value:".concat(e10.toString()));
            return 0;
        }
    }

    public static final Map zzP(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                map.put(str, uri.getQueryParameter(str));
            }
        }
        return map;
    }

    public static final int[] zzQ(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] zzR(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, iArr[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, iArr[1])};
    }

    public static final boolean zzS(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z9 = com.google.android.gms.ads.internal.zzu.zzp().f2209e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzn(view);
        long jZzw = zzw(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z9)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f3957c1)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.I9)).booleanValue()) {
                    return true;
                }
                if (jZzw >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.K9)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void zzT(Context context, Intent intent) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f3966ca)).booleanValue()) {
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            try {
                context.startActivity(intent);
            } catch (Throwable unused2) {
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (SecurityException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            com.google.android.gms.ads.internal.zzu.zzo().i("AdUtil.startActivityWithUnknownContext", e10);
        }
    }

    public static final void zzU(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzo(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            com.google.android.gms.ads.internal.util.client.zzm.zze("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("No browser is found.", e10);
        }
    }

    public static final int[] zzV(Activity activity) {
        int[] iArrZzQ = zzQ(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, iArrZzQ[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(activity, iArrZzQ[1])};
    }

    public static final boolean zzW(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return zzS(view, powerManager, keyguardManager);
    }

    public static int zza(int i10) {
        if (i10 >= 5000) {
            return i10;
        }
        if (i10 <= 0) {
            return DateTimeConstants.MILLIS_PER_MINUTE;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("HTTP timeout too low: " + i10 + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return DateTimeConstants.MILLIS_PER_MINUTE;
    }

    public static List zzd() {
        xf xfVar = eg.f3933a;
        ArrayList<String> arrayListB = com.google.android.gms.ads.internal.client.zzba.zza().b();
        ArrayList arrayList = new ArrayList();
        for (String str : arrayListB) {
            ks0 ks0VarO = ks0.o(new ex0(','));
            str.getClass();
            Iterator itF = ((px0) ks0VarO.f6384a).f(ks0VarO, str);
            while (itF.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) itF.next()));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzn(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzt.zzn(android.view.View):boolean");
    }

    public static final void zzo(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String zzp(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return b(a(context));
    }

    public static final String zzr() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : fb1.x(str, " ", str2);
    }

    public static final Integer zzs(Context context) {
        Object systemService = context.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final DisplayMetrics zzt(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final Map zzv(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i10);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.zzu.zzo().i("AdUtil.getMapOfFileNamesToKeysFromJsonString", e10);
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzw(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    public static final WebResourceResponse zzx(Context context, String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", com.google.android.gms.ads.internal.zzu.zzp().zzc(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbo(context).zzb(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", StandardStringDigester.MESSAGE_CHARSET, new ByteArrayInputStream(str3.getBytes(StandardStringDigester.MESSAGE_CHARSET)));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not fetch MRAID JS.", e10);
        }
        return null;
    }

    public static final String zzy() {
        Resources resourcesB = com.google.android.gms.ads.internal.zzu.zzo().b();
        return resourcesB != null ? resourcesB.getString(com.google.android.gms.ads.impl.R.string.f1954s7) : "Test Ad";
    }

    public static final zzbr zzz(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(objNewInstance instanceof IBinder)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof zzbr ? (zzbr) iInterfaceQueryLocalInterface : new zzbp(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzu.zzo().i("Failed to instantiate WorkManagerUtil", e10);
            return null;
        }
    }

    public final n5.a zzb(final Uri uri) {
        y21 y21Var = new y21(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ew0 ew0Var = zzt.zza;
                com.google.android.gms.ads.internal.zzu.zzp();
                return zzt.zzP(uri);
            }
        });
        this.f2215k.execute(y21Var);
        return y21Var;
    }

    public final String zzc(Context context, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.pa)).booleanValue()) {
            if (this.f2212h != null) {
                return this.f2212h;
            }
            this.f2212h = d(context, str);
            return this.f2212h;
        }
        synchronized (this.f2210f) {
            try {
                String str2 = this.f2211g;
                if (str2 != null) {
                    return str2;
                }
                String strD = d(context, str);
                this.f2211g = strD;
                return strD;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf(Context context, String str, boolean z9, HttpURLConnection httpURLConnection, boolean z10, int i10) {
        int iZza = zza(i10);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("HTTP timeout: " + iZza + " milliseconds.");
        httpURLConnection.setConnectTimeout(iZza);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iZza);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zzc(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void zzh(final Context context, final String str, String str2, Bundle bundle, boolean z9) {
        com.google.android.gms.ads.internal.zzu.zzp();
        bundle.putString("device", zzr());
        xf xfVar = eg.f3933a;
        bundle.putString("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zza().a()));
        if (bundle.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Empty or null bundle.");
        } else {
            final String str3 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.G9);
            boolean andSet = this.f2208d.getAndSet(true);
            AtomicReference atomicReference = this.f2207c;
            if (!andSet) {
                atomicReference.set(zzad.zza(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        this.zza.f2207c.set(zzad.zzb(context, str3));
                    }
                }));
            }
            bundle.putAll((Bundle) atomicReference.get());
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        com.google.android.gms.ads.internal.util.client.zzf.zzx(context, str, "gmob-apps", bundle, true, new com.google.android.gms.ads.internal.util.client.zze() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final boolean zza(String str4) {
                ew0 ew0Var = zzt.zza;
                com.google.android.gms.ads.internal.zzu.zzp();
                zzt.zzL(context, str, str4);
                return true;
            }
        });
    }

    public final boolean zzi(String str) {
        return c(str, this.f2205a, (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.V));
    }

    public final boolean zzj(String str) {
        return c(str, this.f2206b, (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.W));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzk(Context context) {
        if (this.f2214j) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        eg.a(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.ba)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new h(), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new h(), intentFilter, 4);
        }
        this.f2214j = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzl(Context context) {
        if (this.f2213i) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        eg.a(context);
        int i10 = 4;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.ba)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new g0(this, i10), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new g0(this, i10), intentFilter, 4);
        }
        this.f2213i = true;
        return true;
    }

    public final int zzm(Context context, Uri uri) {
        int i10;
        String strF;
        int i11 = 3;
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (context instanceof Activity) {
            i10 = 0;
        } else {
            zze.zza("Chrome Custom Tabs can only work with Activity context.");
            i10 = 2;
        }
        xf xfVar = eg.f3960c4;
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(xfVar);
        xf xfVar2 = eg.f3972d4;
        if (true == bool.equals(com.google.android.gms.ads.internal.client.zzba.zzc().a(xfVar2))) {
            i10 = 9;
        }
        if (i10 != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i10;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(xfVar)).booleanValue()) {
            pg pgVar = new pg();
            pgVar.f7877d = new ur0(pgVar, context, uri);
            Activity activity = (Activity) context;
            if (pgVar.f7875b == null && (strF = tc1.f(activity)) != null) {
                rh1 rh1Var = new rh1(pgVar);
                pgVar.f7876c = rh1Var;
                rh1Var.f8600a = activity.getApplicationContext();
                Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(strF)) {
                    intent2.setPackage(strF);
                }
                activity.bindService(intent2, rh1Var, 33);
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(xfVar2)).booleanValue()) {
            return 5;
        }
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Object obj = null;
        if (!intent3.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            j.b(bundle, "android.support.customtabs.extra.SESSION", null);
            intent3.putExtras(bundle);
        }
        intent3.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent3.putExtras(new Bundle());
        intent3.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        f.f fVar = new f.f(intent3, i11, obj);
        ((Intent) fVar.f12832b).setPackage(tc1.f(context));
        ((Intent) fVar.f12832b).setData(uri);
        Intent intent4 = (Intent) fVar.f12832b;
        Bundle bundle2 = (Bundle) fVar.f12833d;
        Object obj2 = d0.f.f12287a;
        d0.a.b(context, intent4, bundle2);
        return 5;
    }
}
