package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.security.KeyChainException;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import de.blinkt.openvpn.core.OpenVPNService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class en1 implements bd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f4248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f4249b = {1, 2, 3, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f4250d = {48000, 44100, 32000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f4251f = {24000, 22050, 16000};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f4252h = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f4253q = {32, 40, 48, 56, 64, 80, 96, 112, NotificationCompat.FLAG_HIGH_PRIORITY, 160, 192, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f4254s = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String[] f4255t = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f4256u = {44100, 48000, 32000};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f4257v = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f4258w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f4259x = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f4260y = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f4261z = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final int[] A = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static final qs0 B = new qs0(13);
    public static final qs0 C = new qs0(19);
    public static final qs0 D = new qs0(23);
    public static final qs0 E = new qs0(26);
    public static final v60 F = new v60(5);
    public static final v60 G = new v60(8);
    public static final byte[] H = {0, 0, 0, 1};
    public static final String[] I = {RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "A", "B", "C"};
    public static final v60 J = new v60(17);
    public static final v60 K = new v60(21);
    public static final v60 L = new v60(24);
    public static final v60 M = new v60(27);
    public static final cf0 N = new cf0(1);
    public static final cf0 O = new cf0(5);
    public static final cf0 P = new cf0(12);
    public static final cf0 Q = new cf0(16);
    public static final qs0 R = new qs0(0);
    public static final cf0 S = new cf0(23);

    public static n6.j A(n6.h hVar, n6.j jVar) {
        g4.a0.f(jVar, "context");
        return tp1.o(hVar, jVar);
    }

    public static boolean A0(File file) {
        boolean z9;
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            z9 = true;
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                File file2 = fileArrListFiles[i10];
                z9 = file2 != null && A0(file2) && z9;
            }
        } else {
            z9 = true;
        }
        return file.delete() && z9;
    }

    public static void B(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = g4.z.I(drawable).mutate();
        h0.b.h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void B0(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public static k6.a C(k6.a aVar) {
        k6.a aVarA = aVar.clone();
        aVarA.d();
        k6.f fVar = new k6.f();
        fVar.f14716a = true;
        fVar.a(aVarA.f14689a);
        Iterator it = aVarA.e().iterator();
        while (it.hasNext()) {
            ((k6.f) it.next()).a(fVar);
        }
        aVarA.f14689a = fVar;
        aVarA.f14690b = false;
        aVarA.f14691d = 0;
        return aVarA;
    }

    public static boolean C0(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                y3.c.b(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                y3.c.b(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                y3.c.b(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String D(f7.q qVar) {
        int length = qVar.f13324a.length() + 3;
        String str = qVar.f13331h;
        int iIndexOf = str.indexOf(47, length);
        String strSubstring = str.substring(iIndexOf, g7.b.i(str, iIndexOf, str.length(), "?#"));
        String strE = qVar.e();
        if (strE == null) {
            return strSubstring;
        }
        return strSubstring + '?' + strE;
    }

    public static int D0(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || (i12 = i11 >> 1) >= 19) {
            return -1;
        }
        int i13 = f4250d[i10];
        if (i13 == 44100) {
            int i14 = f4254s[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = f4253q[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }

    public static final void E(b7.a0 a0Var, n6.e eVar, boolean z9) {
        Object objH = a0Var.h();
        Throwable thE = a0Var.e(objH);
        Object objM = thE != null ? m(thE) : a0Var.f(objH);
        if (!z9) {
            eVar.d(objM);
            return;
        }
        g4.a0.d(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        d7.e eVar2 = (d7.e) eVar;
        n6.e eVar3 = eVar2.f12488h;
        n6.j context = eVar3.getContext();
        Object objC = d7.a.c(context, eVar2.f12490s);
        if (objC != d7.a.f12482e) {
            g4.a0.D(eVar3, context);
        }
        try {
            eVar3.d(objM);
        } finally {
            d7.a.a(context, objC);
        }
    }

    public static void E0(SQLiteDatabase sQLiteDatabase, boolean z9, boolean z10) {
        if (!z10) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "completed_requests"));
        if (z9) {
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
    }

    public static void F(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof d5.g) {
            ((d5.g) background).k(f10);
        }
    }

    public static void F0(String str, boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void G(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = o0.v0.f16075a;
        boolean zA = o0.c0.a(checkableImageButton);
        boolean z9 = onLongClickListener != null;
        boolean z10 = zA || z9;
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(zA);
        checkableImageButton.setPressable(zA);
        checkableImageButton.setLongClickable(z9);
        o0.d0.s(checkableImageButton, z10 ? 1 : 2);
    }

    public static Cursor G0(SQLiteDatabase sQLiteDatabase, int i10) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i10 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i10 == 1) {
            strArr2[0] = "total_requests";
        } else if (i10 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    public static void H(View view) {
        Drawable background = view.getBackground();
        if (background instanceof d5.g) {
            I(view, (d5.g) background);
        }
    }

    public static void H0(long j10, String str, boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException(tc1.v(str, Long.valueOf(j10)));
        }
    }

    public static void I(View view, d5.g gVar) {
        w4.a aVar = gVar.f12396a.f12376b;
        if (aVar == null || !aVar.f18156a) {
            return;
        }
        float fI = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = o0.v0.f16075a;
            fI += o0.j0.i((View) parent);
        }
        d5.f fVar = gVar.f12396a;
        if (fVar.f12387m != fI) {
            fVar.f12387m = fI;
            gVar.o();
        }
    }

    public static void I0(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static byte[] J(OpenVPNService openVPNService, byte[] bArr) throws KeyChainException {
        try {
            Context applicationContext = openVPNService.getApplicationContext();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper == applicationContext.getMainLooper()) {
                throw new IllegalStateException("calling this from your main thread can lead to deadlock");
            }
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(1);
            j6.d dVar = new j6.d(linkedBlockingQueue);
            Intent intent = new Intent("de.blinkt.openvpn.api.ExternalCertificateProvider");
            intent.setPackage(null);
            if (!applicationContext.bindService(intent, dVar, 1)) {
                throw new KeyChainException("could not bind to external authticator app: null");
            }
            try {
                byte[] bArrM = ((i6.b) ((i6.d) linkedBlockingQueue.take())).m(bArr);
                applicationContext.unbindService(dVar);
                return bArrM;
            } finally {
            }
        } catch (RemoteException e10) {
            throw new KeyChainException(e10);
        }
    }

    public static void J0(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? N0(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? N0(i11, i12, "end index") : tc1.v("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static final void K(Object obj) throws Throwable {
        if (obj instanceof l6.b) {
            throw ((l6.b) obj).f15226a;
        }
    }

    public static void K0(SQLiteDatabase sQLiteDatabase, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    public static int L(SQLiteDatabase sQLiteDatabase, int i10) {
        int i11 = 0;
        if (i10 == 2) {
            return 0;
        }
        Cursor cursorG0 = G0(sQLiteDatabase, i10);
        if (cursorG0.getCount() > 0) {
            cursorG0.moveToNext();
            i11 = cursorG0.getInt(cursorG0.getColumnIndexOrThrow("value"));
        }
        cursorG0.close();
        return i11;
    }

    public static final void L0(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            webView.evaluateJavascript(str, null);
        } catch (IllegalStateException unused) {
            webView.loadUrl("javascript: ".concat(String.valueOf(str)));
        }
    }

    public static zze M(Throwable th) {
        if (th instanceof zzeex) {
            zzeex zzeexVar = (zzeex) th;
            return m0(zzeexVar.f11605a, zzeexVar.f11606b);
        }
        if (th instanceof zzdwl) {
            if (th.getMessage() == null) {
                return u0(((zzdwl) th).f11605a, null, null);
            }
            zzdwl zzdwlVar = (zzdwl) th;
            return u0(zzdwlVar.f11605a, th.getMessage(), null);
        }
        if (!(th instanceof zzba)) {
            return u0(1, null, null);
        }
        zzba zzbaVar = (zzba) th;
        int iZza = zzbaVar.zza();
        String message = zzbaVar.getMessage();
        if (message == null) {
            message = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return new zze(iZza, message, MobileAds.ERROR_DOMAIN, null, null);
    }

    public static void M0(String str, boolean z9) {
        if (!z9) {
            throw new IllegalStateException(str);
        }
    }

    public static zzq N(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gr0 gr0Var = (gr0) it.next();
            if (gr0Var.f5039c) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(gr0Var.f5037a, gr0Var.f5038b));
            }
        }
        return new zzq(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static String N0(int i10, int i11, String str) {
        if (i10 < 0) {
            return tc1.v("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return tc1.v("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(fb1.g("negative size: ", i11));
    }

    public static x8 O(Context context, String str, String str2) {
        x8 x8Var;
        try {
            x8Var = (x8) ((LinkedBlockingQueue) new qp0(context, str, str2).f8254h).poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            x8Var = null;
        }
        return x8Var == null ? qp0.b() : x8Var;
    }

    public static ep P(rk0 rk0Var) throws GeneralSecurityException, IOException {
        Object obj = rk0Var.f8631b;
        try {
            pc1 pc1Var = pc1.f7857a;
            yd1 yd1Var = yd1.f10857c;
            ha1 ha1VarE = ha1.E((InputStream) obj, pc1.f7858b);
            ((InputStream) obj).close();
            if (ha1VarE.A() <= 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            ArrayList arrayList = new ArrayList(ha1VarE.A());
            for (ga1 ga1Var : ha1VarE.F()) {
                ga1Var.A();
                try {
                    f71 f71VarA = f71.a(ga1Var.B().E(), ga1Var.B().D(), ga1Var.B().B(), ga1Var.D(), ga1Var.D() == ua1.RAW ? null : Integer.valueOf(ga1Var.A()));
                    t61 t61Var = t61.f9074b;
                    l71 l71Var = (l71) t61Var.f9075a.get();
                    l71Var.getClass();
                    t.a g61Var = !l71Var.f6528b.containsKey(new j71(f71.class, f71VarA.f4422b)) ? new g61(f71VarA) : t61Var.a(f71VarA);
                    int I2 = ga1Var.I() - 2;
                    if (I2 != 1 && I2 != 2 && I2 != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new i31(g61Var));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            }
            return new ep(ha1VarE, Collections.unmodifiableList(arrayList));
        } catch (Throwable th) {
            ((InputStream) obj).close();
            throw th;
        }
    }

    public static yy Q(qh1 qh1Var) {
        return new yy(2, qh1Var);
    }

    public static lw0 R(k4.l lVar) {
        lw0 lw0Var = new lw0();
        lw0Var.f6709t = lVar;
        d21 d21Var = d21.f3541a;
        aa aaVar = new aa(29, lw0Var);
        lVar.getClass();
        lVar.f14683b.e(new k4.i(d21Var, aaVar));
        lVar.i();
        return lw0Var;
    }

    public static qx0 S(qx0 qx0Var) {
        if ((qx0Var instanceof sx0) || (qx0Var instanceof rx0)) {
            return qx0Var;
        }
        if (qx0Var instanceof Serializable) {
            return new rx0(qx0Var);
        }
        sx0 sx0Var = new sx0();
        sx0Var.f8992a = qx0Var;
        return sx0Var;
    }

    public static String T(ec1 ec1Var) {
        StringBuilder sb = new StringBuilder(ec1Var.f());
        for (int i10 = 0; i10 < ec1Var.f(); i10++) {
            byte bC = ec1Var.c(i10);
            if (bC == 34) {
                sb.append("\\\"");
            } else if (bC == 39) {
                sb.append("\\'");
            } else if (bC != 92) {
                switch (bC) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bC < 32 || bC > 126) {
                            sb.append('\\');
                            sb.append((char) (((bC >>> 6) & 3) + 48));
                            sb.append((char) (((bC >>> 3) & 7) + 48));
                            sb.append((char) ((bC & 7) + 48));
                        } else {
                            sb.append((char) bC);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String U(JSONObject jSONObject, String str, String str2) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("including");
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("excluding");
                    if (i0(jSONArrayOptJSONArray2, str) && !i0(jSONArrayOptJSONArray3, str)) {
                        return jSONObjectOptJSONObject.optString("effective_ad_unit_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                }
            }
        }
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public static void V(int i10, int i11) {
        String strG;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strG = g4.a0.G("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(fb1.g("negative size: ", i11));
                }
                strG = g4.a0.G("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strG);
        }
    }

    public static void W(File file, boolean z9) {
        if (z9 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static /* synthetic */ boolean X(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2 && atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static byte[] Y(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            byte b10 = bArr[i10];
            byte b11 = (byte) ((b10 + b10) & 254);
            bArr2[i10] = b11;
            if (i10 < 15) {
                bArr2[i10] = (byte) (((bArr[i11] >> 7) & 1) | b11);
            }
            i10 = i11;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static byte[] Z(byte[] bArr, byte[] bArr2) {
        long jL0 = l0(bArr, 0) & 67108863;
        long jL02 = (l0(bArr, 3) >> 2) & 67108611;
        long jL03 = (l0(bArr, 6) >> 4) & 67092735;
        long jL04 = (l0(bArr, 9) >> 6) & 66076671;
        long jL05 = (l0(bArr, 12) >> 8) & 1048575;
        int i10 = 17;
        byte[] bArr3 = new byte[17];
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        int i11 = 0;
        while (true) {
            int length = bArr2.length;
            if (i11 >= length) {
                long j15 = j10 + (j11 >> 26);
                long j16 = j15 & 67108863;
                long j17 = j12 + (j15 >> 26);
                long j18 = j17 & 67108863;
                long j19 = j13 + (j17 >> 26);
                long j20 = j19 & 67108863;
                long j21 = ((j19 >> 26) * 5) + j14;
                long j22 = j21 >> 26;
                long j23 = j21 & 67108863;
                long j24 = j23 + 5;
                long j25 = (j11 & 67108863) + j22;
                long j26 = j25 + (j24 >> 26);
                long j27 = j16 + (j26 >> 26);
                long j28 = j18 + (j27 >> 26);
                long j29 = (j20 + (j28 >> 26)) - 67108864;
                long j30 = j29 >> 63;
                long j31 = ~j30;
                long j32 = (j25 & j30) | (j26 & 67108863 & j31);
                long j33 = (j16 & j30) | (j27 & 67108863 & j31);
                long j34 = (j18 & j30) | (j28 & 67108863 & j31);
                long j35 = (j20 & j30) | (j29 & j31);
                long jL06 = l0(bArr, 16) + (((j23 & j30) | (j24 & 67108863 & j31) | (j32 << 26)) & 4294967295L);
                long jL07 = l0(bArr, 20) + (((j32 >> 6) | (j33 << 20)) & 4294967295L);
                long jL08 = l0(bArr, 24) + (((j33 >> 12) | (j34 << 14)) & 4294967295L);
                long jL09 = l0(bArr, 28) + (((j34 >> 18) | (j35 << 8)) & 4294967295L);
                byte[] bArr4 = new byte[16];
                y0(bArr4, jL06 & 4294967295L, 0);
                long j36 = jL07 + (jL06 >> 32);
                y0(bArr4, j36 & 4294967295L, 4);
                long j37 = jL08 + (j36 >> 32);
                y0(bArr4, j37 & 4294967295L, 8);
                y0(bArr4, (jL09 + (j37 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i11);
            System.arraycopy(bArr2, i11, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i10, (byte) 0);
            }
            long j38 = jL05 * 5;
            long j39 = jL04 * 5;
            long j40 = jL03 * 5;
            long jL010 = j14 + (l0(bArr3, 0) & 67108863);
            long jL011 = j11 + ((l0(bArr3, 3) >> 2) & 67108863);
            long jL012 = j10 + ((l0(bArr3, 6) >> 4) & 67108863);
            long jL013 = j12 + ((l0(bArr3, 9) >> 6) & 67108863);
            long jL014 = j13 + (((l0(bArr3, 12) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j41 = jL012 * jL0;
            long j42 = jL012 * jL02;
            long j43 = jL013 * jL0;
            long j44 = jL012 * jL03;
            long j45 = jL013 * jL02;
            long j46 = jL014 * jL0;
            long j47 = (jL02 * 5 * jL014) + (jL013 * j40) + (jL012 * j39) + (jL011 * j38) + (jL010 * jL0);
            long j48 = jL012 * j38;
            long j49 = j40 * jL014;
            long j50 = j49 + (jL013 * j39) + j48 + (jL010 * jL02) + (jL011 * jL0) + (j47 >> 26);
            long j51 = jL013 * j38;
            long j52 = j39 * jL014;
            long j53 = j52 + j51 + (jL010 * jL03) + (jL011 * jL02) + j41 + (j50 >> 26);
            long j54 = jL014 * j38;
            long j55 = j54 + (jL010 * jL04) + (jL011 * jL03) + j42 + j43 + (j53 >> 26);
            long j56 = j55 >> 26;
            long j57 = j55 & 67108863;
            long j58 = (jL010 * jL05) + (jL011 * jL04) + j44 + j45 + j46 + j56;
            long j59 = ((j58 >> 26) * 5) + (j47 & 67108863);
            j11 = (j50 & 67108863) + (j59 >> 26);
            i11 += 16;
            i10 = 17;
            j13 = j58 & 67108863;
            j14 = j59 & 67108863;
            j10 = j53 & 67108863;
            j12 = j57;
        }
    }

    public static final d7.c a(b7.q qVar) {
        n6.h hVarA = qVar.A(b7.r.f1440b);
        n6.j jVarO = qVar;
        if (hVarA == null) {
            jVarO = tp1.o(qVar, new b7.p0(null));
        }
        return new d7.c(jVarO);
    }

    public static void a0(int i10, int i11) {
        String strV;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strV = tc1.v("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(fb1.g("negative size: ", i11));
                }
                strV = tc1.v("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strV);
        }
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = g4.z.I(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                h0.b.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                h0.b.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                h0.b.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static int b0(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!((i10 & (-2097152)) == -2097152) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = i13 - 1;
        int i16 = f4256u[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f4257v[i15] : f4258w[i15]) * 12) / i16) + i17) * 4;
        }
        int i18 = i11 == 3 ? i12 == 2 ? f4259x[i15] : f4260y[i15] : f4261z[i15];
        if (i11 == 3) {
            return ((i18 * 144) / i16) + i17;
        }
        return (((i12 == 1 ? 72 : 144) * i18) / i16) + i17;
    }

    public static b7.y c(d7.c cVar, t6.p pVar) {
        n6.k kVar = n6.k.f15981a;
        Boolean bool = Boolean.FALSE;
        b7.m mVar = b7.m.f1430d;
        n6.j jVar = cVar.f12484a;
        n6.j jVarC = (((Boolean) jVar.u(bool, mVar)).booleanValue() || bool.booleanValue()) ? ((n6.j) jVar.u(kVar, new b7.n(2))).c(kVar) : jVar.c(kVar);
        e7.d dVar = b7.b0.f1396a;
        if (jVarC != dVar && jVarC.A(n6.f.f15980a) == null) {
            jVarC = jVarC.c(dVar);
        }
        b7.y yVar = new b7.y(jVarC, true);
        int iB = u.h.b(1);
        l6.f fVar = l6.f.f15231a;
        if (iB == 0) {
            try {
                d7.a.b(u(k(yVar, yVar, pVar)), null);
            } finally {
                yVar.d(m(th));
            }
        } else if (iB != 1) {
            if (iB == 2) {
                u(k(yVar, yVar, pVar)).d(fVar);
            } else {
                if (iB != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                try {
                    n6.j jVar2 = yVar.f1393d;
                    Object objC = d7.a.c(jVar2, null);
                    try {
                        tp1.d(pVar);
                        Object objC2 = pVar.c(yVar, yVar);
                        if (objC2 != o6.a.f16110a) {
                            yVar.d(objC2);
                        }
                    } finally {
                        d7.a.a(jVar2, objC);
                    }
                } catch (Throwable th) {
                }
            }
        }
        return yVar;
    }

    public static int c0(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int iS = tp1.S(obj);
        int i13 = iS & i10;
        int iK0 = k0(i13, obj3);
        if (iK0 != 0) {
            int i14 = ~i10;
            int i15 = iS & i14;
            int i16 = -1;
            while (true) {
                i11 = iK0 - 1;
                int i17 = iArr[i11];
                i12 = i17 & i10;
                if ((i17 & i14) != i15 || !tp1.P(obj, objArr[i11]) || (objArr2 != null && !tp1.P(obj2, objArr2[i11]))) {
                    if (i12 == 0) {
                        break;
                    }
                    i16 = i11;
                    iK0 = i12;
                } else {
                    break;
                }
            }
            if (i16 == -1) {
                B0(i13, i12, obj3);
            } else {
                iArr[i16] = (iArr[i16] & i14) | (i12 & i10);
            }
            return i11;
        }
        return -1;
    }

    public static String d(int i10, int i11, String str) {
        if (i10 < 0) {
            return g4.a0.q("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return g4.a0.q("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(fb1.g("negative size: ", i11));
    }

    public static zze d0(Throwable th, gi0 gi0Var) {
        zze zzeVar;
        zze zzeVarM = M(th);
        int i10 = zzeVarM.zza;
        if ((i10 == 3 || i10 == 0) && (zzeVar = zzeVarM.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zzeVarM.zzd = null;
        }
        if (gi0Var != null) {
            zzeVarM.zze = new h40(gi0Var.f4929e, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, gi0Var, gi0Var.f4928d, gi0Var.f4927c);
        }
        return zzeVarM;
    }

    public static void e(boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException();
        }
    }

    public static File e0(File file, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(o0(file, str), str2);
    }

    public static void f(int i10, int i11) {
        String strQ;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strQ = g4.a0.q("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(fb1.g("negative size: ", i11));
                }
                strQ = g4.a0.q("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strQ);
        }
    }

    public static String f0(int i10, boolean z9, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = new Object[5];
        objArr[0] = I[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        objArr[3] = Character.valueOf(true != z9 ? 'L' : 'H');
        objArr[4] = Integer.valueOf(i13);
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i14 = 6;
        while (i14 > 0) {
            int i15 = i14 - 1;
            if (iArr[i15] != 0) {
                break;
            }
            i14 = i15;
        }
        for (int i16 = 0; i16 < i14; i16++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i16])));
        }
        return sb.toString();
    }

    public static void g(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? d(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? d(i11, i12, "end index") : g4.a0.q("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static void g0(WebView webView, String str, Object... objArr) {
        if (webView == null) {
            wt0.f10343a.booleanValue();
            return;
        }
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
        sb.append("if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        for (Object obj : objArr) {
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof String) {
                String string = obj.toString();
                if (string.startsWith("{")) {
                    sb.append(string);
                } else {
                    sb.append('\"');
                    sb.append(string);
                    sb.append('\"');
                }
            } else {
                sb.append(obj);
            }
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append(")}");
        String string2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            L0(webView, string2);
        } else {
            handler.post(new vh0(webView, string2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k6.a h(java.util.ArrayList r9) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.en1.h(java.util.ArrayList):k6.a");
    }

    public static void h0(ep epVar, mx0 mx0Var) throws IOException {
        ha1 ha1Var = (ha1) epVar.f4269b;
        Object obj = mx0Var.f7073a;
        try {
            OutputStream outputStream = (OutputStream) obj;
            ha1Var.getClass();
            int iA = ha1Var.a(null);
            Logger logger = mc1.f6900d;
            if (iA > 4096) {
                iA = NotificationCompat.FLAG_BUBBLE;
            }
            lc1 lc1Var = new lc1(iA, outputStream);
            ha1Var.w(lc1Var);
            if (lc1Var.f6573h > 0) {
                lc1Var.M0();
            }
        } finally {
            ((OutputStream) obj).close();
        }
    }

    public static ImageView.ScaleType i(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 5 ? i10 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static boolean i0(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strOptString = jSONArray.optString(i10);
                try {
                } catch (PatternSyntaxException e10) {
                    zzu.zzo().i("RtbAdapterMap.hasAtleastOneRegexMatch", e10);
                }
                if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.X9)).booleanValue() ? Pattern.compile(strOptString, 2) : Pattern.compile(strOptString)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static b4.f j(int i10) {
        return i10 != 0 ? i10 != 1 ? new d5.i() : new d5.d() : new d5.i();
    }

    public static void j0(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(N0(i10, i11, "index"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n6.e k(Object obj, n6.e eVar, t6.p pVar) {
        g4.a0.f(eVar, "completion");
        return ((p6.a) pVar).e(eVar);
    }

    public static int k0(int i10, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i10] : ((int[]) obj)[i10];
    }

    public static d5.e l() {
        return new d5.e();
    }

    public static long l0(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((long) (((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16))) & 4294967295L;
    }

    public static final l6.b m(Throwable th) {
        g4.a0.f(th, "exception");
        return new l6.b(th);
    }

    public static zze m0(int i10, zze zzeVar) {
        if (i10 == 0) {
            throw null;
        }
        if (i10 == 8) {
            if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.f4159v7)).intValue() > 0) {
                return zzeVar;
            }
            i10 = 8;
        }
        return u0(i10, null, zzeVar);
    }

    public static float n(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011a, code lost:
    
        if (r11 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011e, code lost:
    
        return com.google.android.gms.internal.ads.f3.f4362d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0121, code lost:
    
        if (r25 == r4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0123, code lost:
    
        if (r4 == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012a, code lost:
    
        return com.google.android.gms.internal.ads.f3.f4361b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x012b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        return com.google.android.gms.internal.ads.f3.f4360a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.z0 n0(com.google.android.gms.internal.ads.h0 r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.en1.n0(com.google.android.gms.internal.ads.h0, boolean, boolean):com.google.android.gms.internal.ads.z0");
    }

    public static n6.h o(n6.h hVar, n6.i iVar) {
        g4.a0.f(iVar, "key");
        if (g4.a0.b(hVar.getKey(), iVar)) {
            return hVar;
        }
        return null;
    }

    public static File o0(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        W(file2, false);
        return file2;
    }

    public static SharedPreferences p(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 4);
    }

    public static Executor p0(Executor executor, f21 f21Var) {
        executor.getClass();
        return executor == d21.f3541a ? executor : new q21(executor, f21Var);
    }

    public static void q(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            fb1.t(it.next());
            throw null;
        }
    }

    public static void q0(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? w0(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? w0(i11, i12, "end index") : g4.a0.G("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static Proxy r(URL url) {
        System.setProperty("java.net.useSystemProxies", "true");
        List<Proxy> listSelect = ProxySelector.getDefault().select(url.toURI());
        if (listSelect == null) {
            return null;
        }
        for (Proxy proxy : listSelect) {
            if (proxy.address() != null) {
                return proxy;
            }
        }
        return null;
    }

    public static void r0(SQLiteDatabase sQLiteDatabase, long j10, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j10));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j10)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class s(y6.a aVar) {
        g4.a0.f(aVar, "<this>");
        Class clsA = ((u6.a) aVar).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return clsA;
    }

    public static final void s0(StringBuilder sb, Iterator it, String str) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) str);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public static final void t(n6.j jVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = d7.d.f12485a.iterator();
        while (it.hasNext()) {
            try {
                ((c7.b) ((b7.s) it.next())).D(jVar, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    g4.a0.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            g4.a0.a(th, new DiagnosticCoroutineContextException(jVar));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static void t0(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static n6.e u(n6.e eVar) {
        g4.a0.f(eVar, "<this>");
        p6.c cVar = eVar instanceof p6.c ? (p6.c) eVar : null;
        if (cVar == null) {
            return eVar;
        }
        n6.e eVar2 = cVar.f16256d;
        if (eVar2 != null) {
            return eVar2;
        }
        n6.j jVar = cVar.f16255b;
        g4.a0.c(jVar);
        n6.g gVar = (n6.g) jVar.A(n6.f.f15980a);
        n6.e eVar3 = gVar != null ? new d7.e((b7.q) gVar, cVar) : cVar;
        cVar.f16256d = eVar3;
        return eVar3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.internal.client.zze u0(int r8, java.lang.String r9, com.google.android.gms.ads.internal.client.zze r10) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.en1.u0(int, java.lang.String, com.google.android.gms.ads.internal.client.zze):com.google.android.gms.ads.internal.client.zze");
    }

    public static boolean v(View view) {
        WeakHashMap weakHashMap = o0.v0.f16075a;
        return o0.e0.d(view) == 1;
    }

    public static Object v0(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(fb1.g("must be power of 2 between 2^1 and 2^30: ", i10));
        }
        return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
    }

    public static int w(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static String w0(int i10, int i11, String str) {
        if (i10 < 0) {
            return g4.a0.G("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return g4.a0.G("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(fb1.g("negative size: ", i11));
    }

    public static n6.j x(n6.h hVar, n6.i iVar) {
        g4.a0.f(iVar, "key");
        return g4.a0.b(hVar.getKey(), iVar) ? n6.k.f15981a : hVar;
    }

    public static void x0(n5.a aVar, String str, Object obj) {
        if (aVar == null) {
            throw new NullPointerException(tc1.v(str, obj));
        }
    }

    public static PorterDuff.Mode y(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void y0(byte[] bArr, long j10, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i10 + i11] = (byte) (255 & j10);
            j10 >>= 8;
        }
    }

    public static String[] z(String str, char c10) {
        int i10 = 1;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == c10) {
                i10++;
            }
        }
        String[] strArr = new String[i10];
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i12 >= str.length()) {
                strArr[i13] = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            } else {
                int iIndexOf = str.indexOf(c10, i12);
                if (iIndexOf == -1) {
                    iIndexOf = str.length();
                }
                strArr[i13] = str.substring(i12, iIndexOf);
                i12 = iIndexOf + 1;
            }
        }
        return strArr;
    }

    public static boolean z0(int i10, boolean z9) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579) {
            if (z9) {
                return true;
            }
            i10 = 1751476579;
        }
        int[] iArr = A;
        for (int i11 = 0; i11 < 29; i11++) {
            if (iArr[i11] == i10) {
                return true;
            }
        }
        return false;
    }
}
