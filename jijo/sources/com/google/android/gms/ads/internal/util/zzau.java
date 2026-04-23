package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.je0;
import com.google.android.gms.internal.ads.le0;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.nu;
import com.google.android.gms.internal.ads.p21;
import g1.a;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzau {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final le0 f2115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f2119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PointF f2122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PointF f2123j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Handler f2124k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zzah f2125l;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.ads.internal.util.zzah] */
    public zzau(Context context) {
        this.f2120g = 0;
        this.f2125l = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzah
            @Override // java.lang.Runnable
            public final void run() {
                zzau zzauVar = this.zza;
                zzauVar.f2120g = 4;
                zzauVar.zzr();
            }
        };
        this.f2114a = context;
        this.f2121h = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzu.zzt().zzb();
        this.f2124k = com.google.android.gms.ads.internal.zzu.zzt().zza();
        this.f2115b = com.google.android.gms.ads.internal.zzu.zzs().zza();
    }

    public static final int c(String str, ArrayList arrayList, boolean z9) {
        if (!z9) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final void a(Context context) {
        ArrayList arrayList = new ArrayList();
        int iC = c("None", arrayList, true);
        final int iC2 = c("Shake", arrayList, true);
        final int iC3 = c("Flick", arrayList, true);
        int iOrdinal = this.f2115b.f6595r.ordinal();
        final int i10 = iOrdinal != 1 ? iOrdinal != 2 ? iC : iC3 : iC2;
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder builderZzK = zzt.zzK(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i10);
        builderZzK.setTitle("Setup gesture");
        builderZzK.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i10, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzap
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                atomicInteger.set(i11);
            }
        });
        builderZzK.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.zza.zzr();
            }
        });
        builderZzK.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzar
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                zzau zzauVar = this.zza;
                AtomicInteger atomicInteger2 = atomicInteger;
                int i12 = i10;
                int i13 = iC2;
                int i14 = iC3;
                zzauVar.getClass();
                if (atomicInteger2.get() != i12) {
                    int i15 = atomicInteger2.get();
                    le0 le0Var = zzauVar.f2115b;
                    if (i15 == i13) {
                        le0Var.k(je0.f5920b, true);
                    } else if (atomicInteger2.get() == i14) {
                        le0Var.k(je0.f5921d, true);
                    } else {
                        le0Var.k(je0.f5919a, true);
                    }
                }
                zzauVar.zzr();
            }
        });
        builderZzK.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzas
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.zza.zzr();
            }
        });
        builderZzK.create().show();
    }

    public final boolean b(float f10, float f11, float f12, float f13) {
        float fAbs = Math.abs(this.f2122i.x - f10);
        int i10 = this.f2121h;
        return fAbs < ((float) i10) && Math.abs(this.f2122i.y - f11) < ((float) i10) && Math.abs(this.f2123j.x - f12) < ((float) i10) && Math.abs(this.f2123j.y - f13) < ((float) i10);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f2116c);
        sb.append(",DebugSignal: ");
        sb.append(this.f2119f);
        sb.append(",AFMA Version: ");
        sb.append(this.f2118e);
        sb.append(",Ad Unit ID: ");
        return a.r(sb, this.f2117d, "}");
    }

    public final void zzm(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f2120g = 0;
            this.f2122i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i10 = this.f2120g;
        if (i10 == -1) {
            return;
        }
        zzah zzahVar = this.f2125l;
        Handler handler = this.f2124k;
        if (i10 == 0) {
            if (actionMasked == 5) {
                this.f2120g = 5;
                this.f2123j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                handler.postDelayed(zzahVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4005g4)).longValue());
                return;
            }
            return;
        }
        if (i10 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z9 = false;
                for (int i11 = 0; i11 < historySize; i11++) {
                    z9 |= !b(motionEvent.getHistoricalX(0, i11), motionEvent.getHistoricalY(0, i11), motionEvent.getHistoricalX(1, i11), motionEvent.getHistoricalY(1, i11));
                }
                if (b(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z9) {
                    return;
                }
            }
            this.f2120g = -1;
            handler.removeCallbacks(zzahVar);
        }
    }

    public final void zzn(String str) {
        this.f2117d = str;
    }

    public final void zzo(String str) {
        this.f2118e = str;
    }

    public final void zzp(String str) {
        this.f2116c = str;
    }

    public final void zzq(String str) {
        this.f2119f = str;
    }

    public final void zzr() {
        Context context = this.f2114a;
        try {
            if (!(context instanceof Activity)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzu.zzs().zzb())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzu.zzs().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iC = c("Ad information", arrayList, true);
            final int iC2 = c(str, arrayList, true);
            final int iC3 = c(str2, arrayList, true);
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4102p8)).booleanValue();
            final int iC4 = c("Open ad inspector", arrayList, zBooleanValue);
            final int iC5 = c("Ad inspector settings", arrayList, zBooleanValue);
            com.google.android.gms.ads.internal.zzu.zzp();
            AlertDialog.Builder builderZzK = zzt.zzK(context);
            builderZzK.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzao
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    final zzau zzauVar = this.zza;
                    int i11 = iC;
                    int i12 = iC2;
                    int i13 = iC3;
                    int i14 = iC4;
                    int i15 = iC5;
                    zzauVar.getClass();
                    if (i10 != i11) {
                        if (i10 == i12) {
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Debug mode [Creative Preview] selected.");
                            nu.f7383a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzai
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzau zzauVar2 = zzauVar;
                                    zzauVar2.getClass();
                                    zzay zzayVarZzs = com.google.android.gms.ads.internal.zzu.zzs();
                                    Context context2 = zzauVar2.f2114a;
                                    String str3 = zzauVar2.f2117d;
                                    String str4 = zzauVar2.f2118e;
                                    zzayVarZzs.getClass();
                                    String strB = zzay.b(context2, zzayVarZzs.c(context2, (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4027i4), str3, str4).toString(), str4);
                                    if (TextUtils.isEmpty(strB)) {
                                        com.google.android.gms.ads.internal.util.client.zzm.zze("Not linked for in app preview.");
                                    } else {
                                        try {
                                            JSONObject jSONObject = new JSONObject(strB.trim());
                                            String strOptString = jSONObject.optString("gct");
                                            zzayVarZzs.f2131f = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4102p8)).booleanValue()) {
                                                boolean z9 = "0".equals(zzayVarZzs.f2131f) || "2".equals(zzayVarZzs.f2131f);
                                                zzayVarZzs.zzf(z9);
                                                com.google.android.gms.ads.internal.zzu.zzo().d().zzB(!z9 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str3);
                                            }
                                            synchronized (zzayVarZzs.f2126a) {
                                                zzayVarZzs.f2128c = strOptString;
                                            }
                                            if ("2".equals(zzayVarZzs.f2131f)) {
                                                com.google.android.gms.ads.internal.util.client.zzm.zze("Creative is not pushed for this device.");
                                                zzay.a(context2, "There was no creative pushed from DFP to the device.", false, false);
                                                return;
                                            } else if ("1".equals(zzayVarZzs.f2131f)) {
                                                com.google.android.gms.ads.internal.util.client.zzm.zze("The app is not linked for creative preview.");
                                                zzayVarZzs.zzd(context2, str3, str4);
                                                return;
                                            } else {
                                                if ("0".equals(zzayVarZzs.f2131f)) {
                                                    com.google.android.gms.ads.internal.util.client.zzm.zze("Device is linked for in app preview.");
                                                    zzay.a(context2, "The device is successfully linked for creative preview.", false, true);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (JSONException e10) {
                                            com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to get in app preview response json.", e10);
                                        }
                                    }
                                    zzay.a(context2, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                                }
                            });
                            return;
                        }
                        if (i10 == i13) {
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Debug mode [Troubleshooting] selected.");
                            nu.f7383a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzau zzauVar2 = zzauVar;
                                    zzauVar2.getClass();
                                    zzay zzayVarZzs = com.google.android.gms.ads.internal.zzu.zzs();
                                    String str3 = zzauVar2.f2117d;
                                    String str4 = zzauVar2.f2118e;
                                    String str5 = zzauVar2.f2119f;
                                    boolean zZzm = zzayVarZzs.zzm();
                                    Context context2 = zzauVar2.f2114a;
                                    zzayVarZzs.zzh(zzayVarZzs.zzj(context2, str3, str4));
                                    if (!zzayVarZzs.zzm()) {
                                        zzayVarZzs.zzd(context2, str3, str4);
                                        return;
                                    }
                                    if (!zZzm && !TextUtils.isEmpty(str5)) {
                                        zzayVarZzs.zze(context2, str4, str5, str3);
                                    }
                                    com.google.android.gms.ads.internal.util.client.zzm.zze("Device is linked for debug signals.");
                                    zzay.a(context2, "The device is successfully linked for troubleshooting.", false, true);
                                }
                            });
                            return;
                        }
                        le0 le0Var = zzauVar.f2115b;
                        if (i10 == i14) {
                            final mu muVar = nu.f7387e;
                            mu muVar2 = nu.f7383a;
                            if (le0Var.f()) {
                                muVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzat
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzau zzauVar2 = zzauVar;
                                        zzauVar2.getClass();
                                        com.google.android.gms.ads.internal.zzu.zzs().zzc(zzauVar2.f2114a);
                                    }
                                });
                                return;
                            } else {
                                muVar2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final zzau zzauVar2 = zzauVar;
                                        p21 p21Var = muVar;
                                        zzauVar2.getClass();
                                        zzay zzayVarZzs = com.google.android.gms.ads.internal.zzu.zzs();
                                        String str3 = zzauVar2.f2117d;
                                        String str4 = zzauVar2.f2118e;
                                        Context context2 = zzauVar2.f2114a;
                                        if (!zzayVarZzs.zzj(context2, str3, str4)) {
                                            com.google.android.gms.ads.internal.zzu.zzs().zzd(context2, zzauVar2.f2117d, zzauVar2.f2118e);
                                        } else {
                                            ((mu) p21Var).execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzam
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    zzau zzauVar3 = zzauVar2;
                                                    zzauVar3.getClass();
                                                    com.google.android.gms.ads.internal.zzu.zzs().zzc(zzauVar3.f2114a);
                                                }
                                            });
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i10 == i15) {
                            final mu muVar3 = nu.f7387e;
                            mu muVar4 = nu.f7383a;
                            if (le0Var.f()) {
                                muVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzae
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzau zzauVar2 = zzauVar;
                                        zzauVar2.a(zzauVar2.f2114a);
                                    }
                                });
                                return;
                            } else {
                                muVar4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzal
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final zzau zzauVar2 = zzauVar;
                                        p21 p21Var = muVar3;
                                        zzauVar2.getClass();
                                        zzay zzayVarZzs = com.google.android.gms.ads.internal.zzu.zzs();
                                        String str3 = zzauVar2.f2117d;
                                        String str4 = zzauVar2.f2118e;
                                        Context context2 = zzauVar2.f2114a;
                                        if (!zzayVarZzs.zzj(context2, str3, str4)) {
                                            com.google.android.gms.ads.internal.zzu.zzs().zzd(context2, zzauVar2.f2117d, zzauVar2.f2118e);
                                        } else {
                                            ((mu) p21Var).execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzan
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    zzau zzauVar3 = zzauVar2;
                                                    zzauVar3.a(zzauVar3.f2114a);
                                                }
                                            });
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        return;
                    }
                    Context context2 = zzauVar.f2114a;
                    if (!(context2 instanceof Activity)) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzi("Can not create dialog without Activity Context");
                        return;
                    }
                    String str3 = zzauVar.f2116c;
                    final String str4 = "No debug information";
                    if (!TextUtils.isEmpty(str3)) {
                        Uri uriBuild = new Uri.Builder().encodedQuery(str3.replaceAll("\\+", "%20")).build();
                        StringBuilder sb = new StringBuilder();
                        com.google.android.gms.ads.internal.zzu.zzp();
                        Map mapZzP = zzt.zzP(uriBuild);
                        for (String str5 : mapZzP.keySet()) {
                            sb.append(str5);
                            sb.append(" = ");
                            sb.append((String) mapZzP.get(str5));
                            sb.append("\n\n");
                        }
                        String strTrim = sb.toString().trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            str4 = strTrim;
                        }
                    }
                    com.google.android.gms.ads.internal.zzu.zzp();
                    AlertDialog.Builder builderZzK2 = zzt.zzK(context2);
                    builderZzK2.setMessage(str4);
                    builderZzK2.setTitle("Ad Information");
                    builderZzK2.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaj
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i16) {
                            zzau zzauVar2 = zzauVar;
                            String str6 = str4;
                            zzauVar2.getClass();
                            com.google.android.gms.ads.internal.zzu.zzp();
                            zzt.zzT(zzauVar2.f2114a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str6), "Share via"));
                        }
                    });
                    builderZzK2.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzak
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i16) {
                        }
                    });
                    builderZzK2.create().show();
                }
            });
            builderZzK.create().show();
        } catch (WindowManager.BadTokenException e10) {
            zze.zzb(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    public zzau(Context context, String str) {
        this(context);
        this.f2116c = str;
    }
}
