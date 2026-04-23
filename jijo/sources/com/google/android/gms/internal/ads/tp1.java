package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import de.blinkt.openvpn.core.OpenVPNService;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.security.GeneralSecurityException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.Vector;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class tp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f9233a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f9234b = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f9235c = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f9236d = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final qs0 f9237e = new qs0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final qs0 f9238f = new qs0(14);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final qs0 f9239g = new qs0(21);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final qs0 f9240h = new qs0(24);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final qs0 f9241i = new qs0(27);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v60 f9242j = new v60(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v60 f9243k = new v60(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v60 f9244l = new v60(15);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final v60 f9245m = new v60(19);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final v60 f9246n = new v60(22);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final v60 f9247o = new v60(25);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final v60 f9248p = new v60(28);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final cf0 f9249q = new cf0(2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final cf0 f9250r = new cf0(10);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final cf0 f9251s = new cf0(13);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final cf0 f9252t = new cf0(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final cf0 f9253u = new cf0(20);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c8.a f9254v = new c8.a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static UiModeManager f9255w;

    public static Object A(Future future) {
        Object obj;
        boolean z9 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z9 = true;
            } catch (Throwable th) {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static String B(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static String C(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static Date D(long j10) {
        return new Date((j10 - 2082844800) * 1000);
    }

    public static void E() {
        wt0.f10343a.booleanValue();
    }

    public static /* bridge */ /* synthetic */ void F(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws zzgyn {
        if (!s0(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !s0(b12) && !s0(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw zzgyn.b();
    }

    public static void G(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static void H(long j10, String str) {
        if (j10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j10 + ") must be >= 0");
    }

    public static void I(Context context, boolean z9) {
        if (z9) {
            zzm.zzi("This request is sent from a test device.");
            return;
        }
        zzay.zzb();
        zzm.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzf.zzz(context) + "\")) to get test ads on this device.");
    }

    public static void J(SpannableStringBuilder spannableStringBuilder, Object obj, int i10, int i11) {
        for (Object obj2 : spannableStringBuilder.getSpans(i10, i11, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i10 && spannableStringBuilder.getSpanEnd(obj2) == i11 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i10, i11, 33);
    }

    public static void K(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void L(String str, boolean z9) throws zzdq {
        if (!z9) {
            throw new zzdq(str);
        }
    }

    public static boolean M() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }

    public static boolean N(int i10) {
        Boolean bool;
        if (i10 - 1 == 0) {
            return !y51.a();
        }
        if (y51.a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
                y51.f10786a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean O(int i10, boolean z9) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z9 && i11 == 3;
        }
        return true;
    }

    public static boolean P(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static byte[] Q(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 + i10;
            int iDigit = Character.digit(str.charAt(i11), 16);
            int iDigit2 = Character.digit(str.charAt(i11 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i10] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static int R(long j10) {
        int i10 = (int) j10;
        en1.H0(j10, "Out of range: %s", ((long) i10) == j10);
        return i10;
    }

    public static int S(Object obj) {
        return r(obj == null ? 0 : obj.hashCode());
    }

    public static wz0 T(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (j0(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strC = C(xmlPullParser, strConcat2);
                String strC2 = C(xmlPullParser, strConcat3);
                String strC3 = C(xmlPullParser, strConcat4);
                String strC4 = C(xmlPullParser, strConcat5);
                if (strC == null || strC2 == null) {
                    zy0 zy0Var = bz0.f3132b;
                    return wz0.f10382h;
                }
                w1 w1Var = new w1(strC, strC3 != null ? Long.parseLong(strC3) : 0L, strC4 != null ? Long.parseLong(strC4) : 0L);
                int i11 = i10 + 1;
                int length = objArrCopyOf.length;
                if (length < i11) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, vy0.d(length, i11));
                }
                objArrCopyOf[i10] = w1Var;
                i10 = i11;
            }
        } while (!d0(xmlPullParser, str.concat(":Directory")));
        return bz0.j(i10, objArrCopyOf);
    }

    public static f01 U(fz0 fz0Var, fz0 fz0Var2) {
        if (fz0Var == null) {
            throw new NullPointerException("set1");
        }
        if (fz0Var2 != null) {
            return new f01(fz0Var, fz0Var2);
        }
        throw new NullPointerException("set2");
    }

    public static AbstractList V(List list, b3 b3Var) {
        return list instanceof RandomAccess ? new lz0(list, b3Var) : new mz0(list, b3Var);
    }

    public static LinkedHashMap W(int i10) {
        return new LinkedHashMap(i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0018 A[PHI: r2
      0x0018: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0012, B:11:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ void X(byte r2, byte r3, byte r4, char[] r5, int r6) throws com.google.android.gms.internal.ads.zzgyn {
        /*
            boolean r0 = s0(r3)
            if (r0 != 0) goto L2e
            r0 = -96
            r1 = -32
            if (r2 != r1) goto L10
            if (r3 < r0) goto L2e
            r2 = -32
        L10:
            r1 = -19
            if (r2 != r1) goto L18
            if (r3 >= r0) goto L2e
            r2 = -19
        L18:
            boolean r0 = s0(r4)
            if (r0 != 0) goto L2e
            r2 = r2 & 15
            r3 = r3 & 63
            r4 = r4 & 63
            int r2 = r2 << 12
            int r3 = r3 << 6
            r2 = r2 | r3
            r2 = r2 | r4
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2e:
            com.google.android.gms.internal.ads.zzgyn r2 = com.google.android.gms.internal.ads.zzgyn.b()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tp1.X(byte, byte, byte, char[], int):void");
    }

    public static void Y(int i10, ik0 ik0Var) {
        ik0Var.f(7);
        byte[] bArr = ik0Var.f5633a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    public static void Z(int i10, String str, Throwable th) {
        zzm.zzi("Ad failed to load : " + i10);
        zze.zzb(str, th);
        if (i10 == 3) {
            return;
        }
        zzu.zzo().h(str, th);
    }

    public static k6.f a(int i10, String str) {
        k6.f fVar = new k6.f();
        if (str.length() == i10) {
            fVar.f14716a = true;
        } else {
            fVar.d(new k6.h('0', '9', a(i10 + 1, str)));
        }
        return fVar;
    }

    public static void a0(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(fb1.g("at index ", i11));
            }
        }
    }

    public static k6.f b(String str, int i10, ArrayList arrayList, boolean z9) {
        k6.f fVar = new k6.f();
        if (str.length() == i10) {
            fVar.f14716a = true;
        } else {
            if (z9) {
                arrayList.add(fVar);
            }
            char cCharAt = str.charAt(i10);
            int i11 = i10 + 1;
            fVar.d(new k6.h(cCharAt, b(str, i11, arrayList, z9 && cCharAt == '0')));
            if (cCharAt < '9') {
                fVar.d(new k6.h((char) (cCharAt + 1), '9', a(i11, str)));
            }
        }
        return fVar;
    }

    public static void b0(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static k6.f c(int i10, String str) {
        k6.f fVar = new k6.f();
        if (str.length() == i10) {
            fVar.f14716a = true;
        } else {
            char cCharAt = str.charAt(i10);
            fVar.d(new k6.h(cCharAt, c(((char) i10) + 1, str)));
            if (cCharAt > '0') {
                fVar.d(new k6.h('0', (char) (cCharAt - 1), a(i10 + 1, str)));
            }
        }
        return fVar;
    }

    public static void c0(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(fb1.i("null value in entry: ", obj.toString(), "=null"));
        }
    }

    public static void d(t6.p pVar) {
        if (pVar != null) {
            if (pVar instanceof u6.d) {
                if (((u6.d) pVar).b() == 2) {
                    return;
                }
            } else if (!(pVar instanceof t6.a) && !(pVar instanceof t6.l)) {
                return;
            }
            ClassCastException classCastException = new ClassCastException(pVar.getClass().getName().concat(" cannot be cast to kotlin.jvm.functions.Function2"));
            g4.a0.z(tp1.class.getName(), classCastException);
            throw classCastException;
        }
    }

    public static boolean d0(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static k6.f e(String str, String str2, int i10, ArrayList arrayList, boolean z9) {
        k6.f fVar = new k6.f();
        if (str.length() == i10) {
            fVar.f14716a = true;
        } else {
            if (z9) {
                arrayList.add(fVar);
            }
            char cCharAt = str.charAt(i10);
            char cCharAt2 = str2.charAt(i10);
            boolean z10 = false;
            if (cCharAt == cCharAt2) {
                fVar.d(new k6.h(cCharAt, e(str, str2, i10 + 1, arrayList, z9 && cCharAt == '0')));
            } else {
                int i11 = i10 + 1;
                if (z9 && cCharAt == '0') {
                    z10 = true;
                }
                fVar.d(new k6.h(cCharAt, b(str, i11, arrayList, z10)));
                fVar.d(new k6.h(cCharAt2, c(i11, str2)));
                int i12 = cCharAt + 1;
                if (i12 < cCharAt2) {
                    fVar.d(new k6.h((char) i12, (char) (cCharAt2 - 1), a(i11, str)));
                }
            }
        }
        return fVar;
    }

    public static byte[] e0(t31 t31Var) {
        return ((g71) t61.f9074b.d(t31Var)).f4843b.d();
    }

    public static Drawable f(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        boolean z9 = Build.VERSION.SDK_INT < 23;
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            if (!z9) {
                return drawable;
            }
            drawable.mutate();
            return drawable;
        }
        Drawable drawableMutate = g4.z.I(drawable).mutate();
        if (mode == null) {
            return drawableMutate;
        }
        h0.b.i(drawableMutate, mode);
        return drawableMutate;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Collection, java.util.Set] */
    public static g01 f0(Set set, g21 g21Var) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof g01)) {
                set.getClass();
                return new g01(set, g21Var);
            }
            g01 g01Var = (g01) set;
            ix0 ix0Var = g01Var.f4743b;
            ix0Var.getClass();
            return new g01(g01Var.f4742a, new jx0(Arrays.asList(ix0Var, g21Var)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof g01)) {
            set2.getClass();
            return new h01(set2, g21Var);
        }
        g01 g01Var2 = (g01) set2;
        ix0 ix0Var2 = g01Var2.f4743b;
        ix0Var2.getClass();
        return new h01((SortedSet) g01Var2.f4742a, new jx0(Arrays.asList(ix0Var2, g21Var)));
    }

    public static ColorStateList g(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListC = d0.f.c(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListC;
    }

    public static /* bridge */ /* synthetic */ void g0(byte b10, byte b11, char[] cArr, int i10) throws zzgyn {
        if (b10 < -62 || s0(b11)) {
            throw zzgyn.b();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    public static ColorStateList h(Context context, ur0 ur0Var, int i10) {
        int iD;
        ColorStateList colorStateListC;
        return (!ur0Var.H(i10) || (iD = ur0Var.D(i10, 0)) == 0 || (colorStateListC = d0.f.c(context, iD)) == null) ? ur0Var.v(i10) : colorStateListC;
    }

    public static void h0(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static Drawable i(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable drawableG;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (drawableG = p7.q.g(context, resourceId)) == null) ? typedArray.getDrawable(i10) : drawableG;
    }

    public static void i0(String str, Bundle bundle, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static Vector j(OpenVPNService openVPNService, boolean z9) {
        Vector vector = new Vector();
        ConnectivityManager connectivityManager = (ConnectivityManager) openVPNService.getSystemService("connectivity");
        for (Network network : connectivityManager.getAllNetworks()) {
            connectivityManager.getNetworkInfo(network);
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (!networkCapabilities.hasTransport(4) && !networkCapabilities.hasTransport(0)) {
                for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
                    if (((linkAddress.getAddress() instanceof Inet4Address) && !z9) || ((linkAddress.getAddress() instanceof Inet6Address) && z9)) {
                        vector.add(linkAddress.toString());
                    }
                }
            }
        }
        return vector;
    }

    public static boolean j0(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static final void k(n6.j jVar, Throwable th) {
        try {
            b7.s sVar = (b7.s) jVar.A(b7.r.f1439a);
            if (sVar != null) {
                ((c7.b) sVar).D(jVar, th);
            } else {
                en1.t(jVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                g4.a0.a(runtimeException, th);
                th = runtimeException;
            }
            en1.t(jVar, th);
        }
    }

    public static int k0(byte[] bArr) {
        int length = bArr.length;
        if (length >= 4) {
            return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        }
        throw new IllegalArgumentException(tc1.v("array too small: %s < %s", Integer.valueOf(length), 4));
    }

    public static boolean l(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean l0(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static k6.a m(char c10, char c11) {
        if (c10 == c11) {
            k6.a aVar = new k6.a();
            aVar.f14692f = Character.toString(c10);
            aVar.f14690b = true;
            return aVar;
        }
        k6.a aVar2 = new k6.a();
        k6.f fVar = new k6.f();
        k6.f fVar2 = new k6.f();
        aVar2.f14689a = fVar;
        fVar2.f14716a = true;
        if (c10 <= c11) {
            fVar.f14717b.add(new k6.h(c10, c11, fVar2));
        }
        aVar2.f14690b = true;
        return aVar2;
    }

    public static int m0(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static k6.a n() {
        k6.a aVar = new k6.a();
        aVar.f14689a = new k6.f();
        aVar.f14690b = true;
        return aVar;
    }

    public static boolean n0(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof tz0) {
            collection = ((tz0) collection).zza();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= set.remove(it.next());
            }
            return zRemove;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static n6.j o(n6.j jVar, n6.j jVar2) {
        g4.a0.f(jVar2, "context");
        return jVar2 == n6.k.f15981a ? jVar : (n6.j) jVar2.u(jVar, n6.c.f15976f);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Integer o0(java.lang.String r15) {
        /*
            r15.getClass()
            boolean r0 = r15.isEmpty()
            r1 = 0
            if (r0 == 0) goto Ld
        La:
            r15 = r1
            goto L7f
        Ld:
            r0 = 0
            char r2 = r15.charAt(r0)
            r3 = 45
            if (r2 != r3) goto L17
            r0 = 1
        L17:
            int r4 = r15.length()
            if (r0 != r4) goto L1e
            goto La
        L1e:
            int r4 = r0 + 1
            char r0 = r15.charAt(r0)
            r5 = -1
            r6 = 128(0x80, float:1.8E-43)
            if (r0 >= r6) goto L2e
            byte[] r7 = com.google.android.gms.internal.ads.x01.f10397a
            r0 = r7[r0]
            goto L31
        L2e:
            byte[] r0 = com.google.android.gms.internal.ads.x01.f10397a
            r0 = -1
        L31:
            if (r0 < 0) goto La
            r7 = 10
            if (r0 < r7) goto L38
            goto La
        L38:
            int r0 = -r0
            long r8 = (long) r0
        L3a:
            int r0 = r15.length()
            r10 = -9223372036854775808
            if (r4 >= r0) goto L6e
            int r0 = r4 + 1
            char r4 = r15.charAt(r4)
            if (r4 >= r6) goto L4f
            byte[] r12 = com.google.android.gms.internal.ads.x01.f10397a
            r4 = r12[r4]
            goto L52
        L4f:
            byte[] r4 = com.google.android.gms.internal.ads.x01.f10397a
            r4 = -1
        L52:
            if (r4 < 0) goto La
            if (r4 >= r7) goto La
            r12 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 >= 0) goto L60
            goto La
        L60:
            r12 = 10
            long r8 = r8 * r12
            long r12 = (long) r4
            long r10 = r10 + r12
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 >= 0) goto L6b
            goto La
        L6b:
            long r8 = r8 - r12
            r4 = r0
            goto L3a
        L6e:
            if (r2 != r3) goto L75
            java.lang.Long r15 = java.lang.Long.valueOf(r8)
            goto L7f
        L75:
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 != 0) goto L7a
            goto La
        L7a:
            long r2 = -r8
            java.lang.Long r15 = java.lang.Long.valueOf(r2)
        L7f:
            if (r15 == 0) goto L98
            long r2 = r15.longValue()
            int r0 = r15.intValue()
            long r4 = (long) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L8f
            goto L98
        L8f:
            int r15 = r15.intValue()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            return r15
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tp1.o0(java.lang.String):java.lang.Integer");
    }

    public static void p(View view, float f10) {
        if (!x5.a.C) {
            view.setAlpha(f10);
            return;
        }
        x5.a aVarE = x5.a.e(view);
        if (aVarE.f18487f != f10) {
            aVarE.f18487f = f10;
            View view2 = (View) aVarE.f18484a.get();
            if (view2 != null) {
                view2.invalidate();
            }
        }
    }

    public static void p0(Bundle bundle, String str, String str2, boolean z9) {
        if (!z9 || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static void q(Drawable drawable, int i10) {
        boolean z9 = i10 != 0;
        if (Build.VERSION.SDK_INT == 21) {
            if (z9) {
                drawable.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
                return;
            } else {
                drawable.setColorFilter(null);
                return;
            }
        }
        if (z9) {
            h0.b.g(drawable, i10);
        } else {
            h0.b.h(drawable, null);
        }
    }

    public static List q0(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.emptyList() : new w01(0, length, iArr);
    }

    public static int r(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    public static void r0(Bundle bundle, String str, boolean z9, boolean z10) {
        if (z10) {
            bundle.putBoolean(str, z9);
        }
    }

    public static int s(int i10, int i11) {
        long j10 = ((long) i10) + ((long) i11);
        int i12 = (int) j10;
        if (j10 == i12) {
            return i12;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i10 + ", " + i11 + ")");
    }

    public static boolean s0(byte b10) {
        return b10 > -65;
    }

    public static int t(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static int[] t0(fz0 fz0Var) {
        Object[] array = fz0Var.toArray(wy0.f10380a);
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static Bundle u(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static b4.c v(com.google.android.gms.internal.ads.d1 r10) {
        /*
            r0 = 16
            int r1 = r10.e(r0)
            int r0 = r10.e(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r10.e(r0)
            r2 = 7
            goto L19
        L18:
            r2 = 4
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r10.e(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r10.e(r1)
            boolean r2 = r10.o()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r10.e(r2)
            boolean r5 = r10.o()
            if (r5 == 0) goto L47
            int r5 = r10.e(r4)
            if (r5 <= 0) goto L47
            r10.m(r1)
        L47:
            boolean r5 = r10.o()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            r8 = 1
            if (r8 == r5) goto L58
            r5 = 44100(0xac44, float:6.1797E-41)
            goto L5b
        L58:
            r5 = 48000(0xbb80, float:6.7262E-41)
        L5b:
            int r10 = r10.e(r3)
            int[] r9 = com.google.android.gms.internal.ads.tp1.f9233a
            if (r5 != r7) goto L6a
            r7 = 13
            if (r10 != r7) goto L6a
            r10 = r9[r7]
            goto L98
        L6a:
            r7 = 0
            if (r5 != r6) goto L97
            r6 = 14
            if (r10 >= r6) goto L97
            r6 = r9[r10]
            int r2 = r2 % 5
            r7 = 8
            if (r2 == r8) goto L90
            r8 = 11
            if (r2 == r1) goto L8b
            if (r2 == r4) goto L90
            if (r2 == r3) goto L82
            goto L95
        L82:
            if (r10 == r4) goto L88
            if (r10 == r7) goto L88
            if (r10 != r8) goto L95
        L88:
            int r10 = r6 + 1
            goto L98
        L8b:
            if (r10 == r7) goto L88
            if (r10 != r8) goto L95
            goto L88
        L90:
            if (r10 == r4) goto L88
            if (r10 != r7) goto L95
            goto L88
        L95:
            r10 = r6
            goto L98
        L97:
            r10 = 0
        L98:
            b4.c r1 = new b4.c
            r1.<init>()
            r1.f1309a = r5
            r1.f1310b = r0
            r1.f1311c = r10
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tp1.v(com.google.android.gms.internal.ads.d1):b4.c");
    }

    public static mu w() {
        if (((Boolean) zzba.zzc().a(eg.f3984e5)).booleanValue()) {
            return nu.f7385c;
        }
        return ((Boolean) zzba.zzc().a(eg.f3973d5)).booleanValue() ? nu.f7383a : nu.f7387e;
    }

    public static zzfqa x(Context context, int i10, String str, String str2, cv0 cv0Var) {
        zzfqa zzfqaVar;
        ev0 ev0Var = new ev0(context, i10, str, str2, cv0Var);
        try {
            zzfqaVar = (zzfqa) ev0Var.f4308f.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            ev0Var.b(2009, ev0Var.f4311s, e10);
            zzfqaVar = null;
        }
        ev0Var.b(3004, ev0Var.f4311s, null);
        if (zzfqaVar != null) {
            if (zzfqaVar.f11641d == 7) {
                cv0.f3456e = 3;
            } else {
                cv0.f3456e = 2;
            }
        }
        return zzfqaVar == null ? new zzfqa(1, null, 1) : zzfqaVar;
    }

    public static final l31 y(l31 l31Var) {
        if (l31Var != null) {
            return l31Var;
        }
        try {
            return z(((g71) t61.f9074b.d(null)).f4843b.d());
        } catch (GeneralSecurityException e10) {
            throw new zzgnz("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e10);
        }
    }

    public static l31 z(byte[] bArr) throws GeneralSecurityException {
        try {
            pc1 pc1Var = pc1.f7857a;
            yd1 yd1Var = yd1.f10857c;
            ba1 ba1VarC = ba1.C(bArr, pc1.f7858b);
            t61 t61Var = t61.f9074b;
            tb1 tb1VarA = n71.a(ba1VarC.F());
            g71 g71Var = new g71(ba1VarC, tb1VarA);
            l71 l71Var = (l71) t61Var.f9075a.get();
            l71Var.getClass();
            return !l71Var.f6530d.containsKey(new j71(g71.class, tb1VarA)) ? new h61(g71Var) : t61Var.b(g71Var);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }
}
