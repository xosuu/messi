package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class np extends p80 implements wk {
    public int A;
    public int B;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fx f7341f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f7342h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final WindowManager f7343q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mu0 f7344s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public DisplayMetrics f7345t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f7346u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7347v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7348w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7349x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f7350y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f7351z;

    public np(fx fxVar, Context context, mu0 mu0Var) {
        super(fxVar, 10, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        this.f7347v = -1;
        this.f7348w = -1;
        this.f7350y = -1;
        this.f7351z = -1;
        this.A = -1;
        this.B = -1;
        this.f7341f = fxVar;
        this.f7342h = context;
        this.f7344s = mu0Var;
        this.f7343q = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.wk
    public final void b(Object obj, Map map) {
        JSONObject jSONObjectPut;
        this.f7345t = new DisplayMetrics();
        Display defaultDisplay = this.f7343q.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f7345t);
        this.f7346u = this.f7345t.density;
        this.f7349x = defaultDisplay.getRotation();
        zzay.zzb();
        DisplayMetrics displayMetrics = this.f7345t;
        this.f7347v = zzf.zzw(displayMetrics, displayMetrics.widthPixels);
        zzay.zzb();
        DisplayMetrics displayMetrics2 = this.f7345t;
        this.f7348w = zzf.zzw(displayMetrics2, displayMetrics2.heightPixels);
        fx fxVar = this.f7341f;
        Activity activityZzi = fxVar.zzi();
        if (activityZzi == null || activityZzi.getWindow() == null) {
            this.f7350y = this.f7347v;
            this.f7351z = this.f7348w;
        } else {
            zzu.zzp();
            int[] iArrZzQ = zzt.zzQ(activityZzi);
            zzay.zzb();
            this.f7350y = zzf.zzw(this.f7345t, iArrZzQ[0]);
            zzay.zzb();
            this.f7351z = zzf.zzw(this.f7345t, iArrZzQ[1]);
        }
        if (fxVar.e().b()) {
            this.A = this.f7347v;
            this.B = this.f7348w;
        } else {
            fxVar.measure(0, 0);
        }
        i(this.f7347v, this.f7348w, this.f7350y, this.f7351z, this.f7346u, this.f7349x);
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        mu0 mu0Var = this.f7344s;
        boolean zA = mu0Var.a(intent);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        boolean zA2 = mu0Var.a(intent2);
        boolean zA3 = mu0Var.a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
        try {
            jSONObjectPut = new JSONObject().put("sms", zA2).put("tel", zA).put("calendar", zA3).put("storePicture", mu0Var.b()).put("inlineVideo", true);
        } catch (JSONException e10) {
            zzm.zzh("Error occurred while obtaining the MRAID capabilities.", e10);
            jSONObjectPut = null;
        }
        fxVar.E(jSONObjectPut, "onDeviceFeaturesReceived");
        int[] iArr = new int[2];
        fxVar.getLocationOnScreen(iArr);
        zzf zzfVarZzb = zzay.zzb();
        int i10 = iArr[0];
        Context context = this.f7342h;
        l(zzfVarZzb.zzb(context, i10), zzay.zzb().zzb(context, iArr[1]));
        if (zzm.zzm(2)) {
            zzm.zzi("Dispatching Ready Event.");
        }
        try {
            ((fx) this.f7834b).E(new JSONObject().put("js", fxVar.zzn().afmaVersion), "onReadyEventReceived");
        } catch (JSONException e11) {
            zzm.zzh("Error occurred while dispatching ready Event.", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[PHI: r4
      0x0060: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:11:0x003f, B:17:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r9, int r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f7342h
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L14
            com.google.android.gms.ads.internal.zzu.zzp()
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            int[] r1 = com.google.android.gms.ads.internal.util.zzt.zzR(r1)
            r1 = r1[r2]
            goto L15
        L14:
            r1 = 0
        L15:
            com.google.android.gms.internal.ads.fx r3 = r8.f7341f
            b4.c r4 = r3.e()
            if (r4 == 0) goto L27
            b4.c r4 = r3.e()
            boolean r4 = r4.b()
            if (r4 != 0) goto L75
        L27:
            int r4 = r3.getWidth()
            int r5 = r3.getHeight()
            com.google.android.gms.internal.ads.xf r6 = com.google.android.gms.internal.ads.eg.K
            com.google.android.gms.internal.ads.cg r7 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r6 = r7.a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L60
            if (r4 != 0) goto L51
            b4.c r4 = r3.e()
            if (r4 == 0) goto L50
            b4.c r4 = r3.e()
            int r4 = r4.f1311c
            goto L51
        L50:
            r4 = 0
        L51:
            if (r5 != 0) goto L60
            b4.c r5 = r3.e()
            if (r5 == 0) goto L61
            b4.c r2 = r3.e()
            int r2 = r2.f1310b
            goto L61
        L60:
            r2 = r5
        L61:
            com.google.android.gms.ads.internal.util.client.zzf r5 = com.google.android.gms.ads.internal.client.zzay.zzb()
            int r4 = r5.zzb(r0, r4)
            r8.A = r4
            com.google.android.gms.ads.internal.util.client.zzf r4 = com.google.android.gms.ads.internal.client.zzay.zzb()
            int r0 = r4.zzb(r0, r2)
            r8.B = r0
        L75:
            int r0 = r10 - r1
            int r1 = r8.A
            int r2 = r8.B
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> La2
            r4.<init>()     // Catch: org.json.JSONException -> La2
            java.lang.String r5 = "x"
            org.json.JSONObject r4 = r4.put(r5, r9)     // Catch: org.json.JSONException -> La2
            java.lang.String r5 = "y"
            org.json.JSONObject r0 = r4.put(r5, r0)     // Catch: org.json.JSONException -> La2
            java.lang.String r4 = "width"
            org.json.JSONObject r0 = r0.put(r4, r1)     // Catch: org.json.JSONException -> La2
            java.lang.String r1 = "height"
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> La2
            java.lang.Object r1 = r8.f7834b     // Catch: org.json.JSONException -> La2
            com.google.android.gms.internal.ads.fx r1 = (com.google.android.gms.internal.ads.fx) r1     // Catch: org.json.JSONException -> La2
            java.lang.String r2 = "onDefaultPositionReceived"
            r1.E(r0, r2)     // Catch: org.json.JSONException -> La2
            goto La8
        La2:
            r0 = move-exception
            java.lang.String r1 = "Error occurred while dispatching default position."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
        La8:
            com.google.android.gms.internal.ads.ix r0 = r3.g()
            com.google.android.gms.internal.ads.kp r0 = r0.I
            if (r0 == 0) goto Lb4
            r0.f6354q = r9
            r0.f6355s = r10
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.np.l(int, int):void");
    }
}
