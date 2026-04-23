package t3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.k;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.a0;
import com.google.android.gms.internal.ads.b1;
import com.google.android.gms.internal.ads.d11;
import com.google.android.gms.internal.ads.e4;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.fg0;
import com.google.android.gms.internal.ads.h0;
import com.google.android.gms.internal.ads.h7;
import com.google.android.gms.internal.ads.ik0;
import com.google.android.gms.internal.ads.l11;
import com.google.android.gms.internal.ads.m11;
import com.google.android.gms.internal.ads.m20;
import com.google.android.gms.internal.ads.o7;
import com.google.android.gms.internal.ads.rz0;
import com.google.android.gms.internal.ads.t6;
import com.google.android.gms.internal.ads.tc1;
import com.google.android.gms.internal.ads.w11;
import com.google.android.gms.internal.ads.xg;
import com.google.android.gms.internal.ads.y3;
import com.google.android.gms.internal.ads.z3;
import com.google.android.gms.internal.ads.z6;
import com.google.android.gms.internal.ads.zzbo;
import f7.s;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f16852a;

    public static long B(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if ("0".equals(str) || "-1".equals(str)) {
                o7.a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            o7.b("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static Uri C(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i10 = iIndexOf + 1;
        return Uri.parse(str.substring(0, i10) + str2 + "=" + str3 + "&" + str.substring(i10));
    }

    public static void F(long j10, ik0 ik0Var, b1[] b1VarArr) {
        int i10;
        int iQ;
        while (true) {
            if (ik0Var.n() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (ik0Var.n() == 0) {
                    i10 = -1;
                    break;
                }
                int iV = ik0Var.v();
                i11 += iV;
                if (iV != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            while (true) {
                if (ik0Var.n() == 0) {
                    i12 = -1;
                    break;
                }
                int iV2 = ik0Var.v();
                i12 += iV2;
                if (iV2 != 255) {
                    break;
                }
            }
            int i13 = ik0Var.f5634b + i12;
            if (i12 == -1 || i12 > ik0Var.n()) {
                fg0.f("Skipping remainder of malformed SEI NAL unit.");
                i13 = ik0Var.f5635c;
            } else if (i10 == 4 && i12 >= 8) {
                int iV3 = ik0Var.v();
                int iZ = ik0Var.z();
                if (iZ == 49) {
                    iQ = ik0Var.q();
                    iZ = 49;
                } else {
                    iQ = 0;
                }
                int iV4 = ik0Var.v();
                if (iZ == 47) {
                    ik0Var.j(1);
                    iZ = 47;
                }
                boolean z9 = iV3 == 181 && (iZ == 49 || iZ == 47) && iV4 == 3;
                if (iZ == 49) {
                    z9 &= iQ == 1195456820;
                }
                if (z9) {
                    L(j10, ik0Var, b1VarArr);
                }
            }
            ik0Var.i(i13);
        }
    }

    public static void G(z3 z3Var, e4 e4Var) {
        for (int i10 = 0; i10 < z3Var.zza(); i10++) {
            long jZzb = z3Var.zzb(i10);
            ArrayList arrayListQ = z3Var.q(jZzb);
            if (!arrayListQ.isEmpty()) {
                if (i10 == z3Var.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = z3Var.zzb(i10 + 1) - z3Var.zzb(i10);
                if (jZzb2 > 0) {
                    e4Var.mo0zza(new y3(arrayListQ, jZzb, jZzb2));
                }
            }
        }
    }

    public static z6 H(h7 h7Var) {
        boolean z9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = h7Var.f5227c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jB = str != null ? B(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z9 = false;
            j10 = 0;
            j11 = 0;
            while (i10 < strArrSplit.length) {
                String strTrim = strArrSplit[i10].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j11 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j10 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z9 = true;
                }
                i10++;
            }
            i10 = 1;
        } else {
            z9 = false;
            j10 = 0;
            j11 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jB2 = str3 != null ? B(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long jB3 = str4 != null ? B(str4) : 0L;
        String str5 = (String) map.get("ETag");
        if (i10 != 0) {
            j13 = jCurrentTimeMillis + (j11 * 1000);
            if (z9) {
                j14 = j13;
            } else {
                Long.signum(j10);
                j14 = (j10 * 1000) + j13;
            }
            j12 = j14;
        } else {
            j12 = 0;
            if (jB <= 0 || jB2 < jB) {
                j13 = 0;
            } else {
                j13 = jCurrentTimeMillis + (jB2 - jB);
                j12 = j13;
            }
        }
        z6 z6Var = new z6();
        z6Var.f11157a = h7Var.f5226b;
        z6Var.f11158b = str5;
        z6Var.f11162f = j13;
        z6Var.f11161e = j12;
        z6Var.f11159c = jB;
        z6Var.f11160d = jB3;
        z6Var.f11163g = map;
        z6Var.f11164h = h7Var.f5228d;
        return z6Var;
    }

    public static m20 I(ik0 ik0Var) {
        int i10;
        ik0Var.j(1);
        int iX = ik0Var.x();
        long j10 = ik0Var.f5634b;
        long j11 = iX;
        int i11 = iX / 18;
        long[] jArrCopyOf = new long[i11];
        long[] jArrCopyOf2 = new long[i11];
        int i12 = 0;
        while (true) {
            i10 = 2;
            if (i12 >= i11) {
                break;
            }
            long jC = ik0Var.C();
            if (jC == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i12);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i12);
                break;
            }
            jArrCopyOf[i12] = jC;
            jArrCopyOf2[i12] = ik0Var.C();
            ik0Var.j(2);
            i12++;
        }
        ik0Var.j((int) ((j10 + j11) - ((long) ik0Var.f5634b)));
        return new m20(jArrCopyOf, i10, jArrCopyOf2);
    }

    public static void L(long j10, ik0 ik0Var, b1[] b1VarArr) {
        int iV = ik0Var.v();
        if ((iV & 64) != 0) {
            int i10 = iV & 31;
            ik0Var.j(1);
            int i11 = ik0Var.f5634b;
            for (b1 b1Var : b1VarArr) {
                int i12 = i10 * 3;
                ik0Var.i(i11);
                b1Var.f(i12, ik0Var);
                tc1.W(j10 != -9223372036854775807L);
                b1Var.e(j10, 1, i12, 0, null);
            }
        }
    }

    public static String N(String str, Context context, boolean z9, Map map) {
        String strA;
        if ((((Boolean) zzba.zzc().a(eg.f4001g0)).booleanValue() && !z9) || !zzu.zzn().g(context) || TextUtils.isEmpty(str) || (strA = zzu.zzn().a(context)) == null) {
            return str;
        }
        String str2 = (String) zzba.zzc().a(eg.Z);
        if (((Boolean) zzba.zzc().a(eg.Y)).booleanValue() && str.contains(str2)) {
            if (zzu.zzp().zzi(str)) {
                zzu.zzn().d(context, strA, (Map) map.get("_ac"));
                return S(context, str).replace(str2, strA);
            }
            if (!zzu.zzp().zzj(str)) {
                return str;
            }
            zzu.zzn().e(context, strA, (Map) map.get("_ai"));
            return S(context, str).replace(str2, strA);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) zzba.zzc().a(eg.X)).booleanValue()) {
            return str;
        }
        if (zzu.zzp().zzi(str)) {
            zzu.zzn().d(context, strA, (Map) map.get("_ac"));
            return C(S(context, str), "fbs_aeid", strA).toString();
        }
        if (!zzu.zzp().zzj(str)) {
            return str;
        }
        zzu.zzn().e(context, strA, (Map) map.get("_ai"));
        return C(S(context, str), "fbs_aeid", strA).toString();
    }

    public static void P(ArrayList arrayList, xg xgVar) {
        String str = (String) xgVar.k();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    public static boolean Q(h0 h0Var) {
        ik0 ik0Var = new ik0(8);
        int i10 = t6.a(h0Var, ik0Var).f9057a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        ((a0) h0Var).m(ik0Var.f5633a, 0, 4, false);
        ik0Var.i(0);
        int iQ = ik0Var.q();
        if (iQ == 1463899717) {
            return true;
        }
        fg0.c("Unsupported form type: " + iQ);
        return false;
    }

    public static t6 R(int i10, h0 h0Var, ik0 ik0Var) throws zzbo {
        t6 t6VarA = t6.a(h0Var, ik0Var);
        while (true) {
            int i11 = t6VarA.f9057a;
            if (i11 == i10) {
                return t6VarA;
            }
            fb1.u("Ignoring unknown WAV chunk: ", i11);
            long j10 = t6VarA.f9058b;
            long j11 = 8 + j10;
            if ((1 & j10) != 0) {
                j11 = 9 + j10;
            }
            if (j11 > 2147483647L) {
                throw zzbo.b("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
            ((a0) h0Var).j((int) j11);
            t6VarA = t6.a(h0Var, ik0Var);
        }
    }

    public static String S(Context context, String str) {
        String strC = zzu.zzn().c(context);
        String strB = zzu.zzn().b(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strC)) {
            str = C(str, "gmp_app_id", strC).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strB)) ? str : C(str, "fbs_aiid", strB).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0 A[Catch: RuntimeException -> 0x00a6, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x00a6, blocks: (B:59:0x009a, B:61:0x00a0), top: B:72:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.fragment.app.z o(android.content.Context r4, androidx.fragment.app.s r5, boolean r6, boolean r7) {
        /*
            androidx.fragment.app.q r0 = r5.V
            r1 = 0
            if (r0 != 0) goto L7
            r2 = 0
            goto L9
        L7:
            int r2 = r0.f868h
        L9:
            if (r7 == 0) goto L1a
            if (r6 == 0) goto L14
            if (r0 != 0) goto L11
        Lf:
            r7 = 0
            goto L27
        L11:
            int r7 = r0.f866f
            goto L27
        L14:
            if (r0 != 0) goto L17
            goto Lf
        L17:
            int r7 = r0.f867g
            goto L27
        L1a:
            if (r6 == 0) goto L22
            if (r0 != 0) goto L1f
            goto Lf
        L1f:
            int r7 = r0.f864d
            goto L27
        L22:
            if (r0 != 0) goto L25
            goto Lf
        L25:
            int r7 = r0.f865e
        L27:
            r5.V(r1, r1, r1, r1)
            android.view.ViewGroup r0 = r5.R
            r1 = 0
            if (r0 == 0) goto L3d
            r3 = 2131297189(0x7f0903a5, float:1.8212316E38)
            java.lang.Object r0 = r0.getTag(r3)
            if (r0 == 0) goto L3d
            android.view.ViewGroup r0 = r5.R
            r0.setTag(r3, r1)
        L3d:
            android.view.ViewGroup r5 = r5.R
            if (r5 == 0) goto L48
            android.animation.LayoutTransition r5 = r5.getLayoutTransition()
            if (r5 == 0) goto L48
            return r1
        L48:
            if (r7 != 0) goto L7a
            if (r2 == 0) goto L7a
            r5 = 4097(0x1001, float:5.741E-42)
            if (r2 == r5) goto L70
            r5 = 4099(0x1003, float:5.744E-42)
            if (r2 == r5) goto L66
            r5 = 8194(0x2002, float:1.1482E-41)
            if (r2 == r5) goto L5b
            r5 = -1
            r7 = -1
            goto L7a
        L5b:
            if (r6 == 0) goto L61
            r5 = 2130837507(0x7f020003, float:1.727997E38)
            goto L64
        L61:
            r5 = 2130837508(0x7f020004, float:1.7279972E38)
        L64:
            r7 = r5
            goto L7a
        L66:
            if (r6 == 0) goto L6c
            r5 = 2130837509(0x7f020005, float:1.7279974E38)
            goto L64
        L6c:
            r5 = 2130837510(0x7f020006, float:1.7279976E38)
            goto L64
        L70:
            if (r6 == 0) goto L76
            r5 = 2130837511(0x7f020007, float:1.7279978E38)
            goto L64
        L76:
            r5 = 2130837512(0x7f020008, float:1.727998E38)
            goto L64
        L7a:
            if (r7 == 0) goto Lb6
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r7)
            java.lang.String r6 = "anim"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L9a
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)     // Catch: android.content.res.Resources.NotFoundException -> L98 java.lang.RuntimeException -> L9a
            if (r6 == 0) goto Lb6
            androidx.fragment.app.z r0 = new androidx.fragment.app.z     // Catch: android.content.res.Resources.NotFoundException -> L98 java.lang.RuntimeException -> L9a
            r0.<init>(r6)     // Catch: android.content.res.Resources.NotFoundException -> L98 java.lang.RuntimeException -> L9a
            return r0
        L98:
            r4 = move-exception
            throw r4
        L9a:
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r4, r7)     // Catch: java.lang.RuntimeException -> La6
            if (r6 == 0) goto Lb6
            androidx.fragment.app.z r0 = new androidx.fragment.app.z     // Catch: java.lang.RuntimeException -> La6
            r0.<init>(r6)     // Catch: java.lang.RuntimeException -> La6
            return r0
        La6:
            r6 = move-exception
            if (r5 != 0) goto Lb5
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)
            if (r4 == 0) goto Lb6
            androidx.fragment.app.z r5 = new androidx.fragment.app.z
            r5.<init>(r4)
            return r5
        Lb5:
            throw r6
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.i.o(android.content.Context, androidx.fragment.app.s, boolean, boolean):androidx.fragment.app.z");
    }

    public abstract int A(w11 w11Var);

    public abstract d11 D(m11 m11Var);

    public abstract Map E();

    public rz0 J() {
        return new rz0(this);
    }

    public abstract l11 K(m11 m11Var);

    public abstract void M(w11 w11Var, Set set);

    public abstract void O(l11 l11Var, l11 l11Var2);

    public abstract void T(l11 l11Var, Thread thread);

    public abstract boolean U(m11 m11Var, d11 d11Var, d11 d11Var2);

    public abstract boolean V(m11 m11Var, Object obj, Object obj2);

    public abstract boolean W(m11 m11Var, l11 l11Var, l11 l11Var2);

    public abstract v3.h a(Context context, Looper looper, v3.g gVar, b bVar, f fVar, g gVar2);

    public abstract boolean b(n2.g gVar, n2.c cVar, n2.c cVar2);

    public abstract boolean c(n2.g gVar, Object obj, Object obj2);

    public abstract boolean d(n2.g gVar, n2.f fVar, n2.f fVar2);

    public abstract int e(View view, int i10);

    public abstract int f(View view, int i10);

    public abstract List g(String str, List list);

    public abstract long h();

    public abstract s i();

    public abstract Intent j(androidx.activity.i iVar, Object obj);

    public k k(androidx.activity.i iVar, Object obj) {
        g4.a0.f(iVar, "context");
        return null;
    }

    public abstract Object l(k1.a aVar, n6.e eVar);

    public int m(View view) {
        return 0;
    }

    public int n() {
        return 0;
    }

    public void p(int i10, int i11) {
    }

    public void q() {
    }

    public void r(View view, int i10) {
    }

    public abstract void s(int i10);

    public abstract void t(View view, int i10, int i11);

    public abstract void u(View view, float f10, float f11);

    public abstract Object v(int i10, Intent intent);

    public abstract void w(n2.f fVar, n2.f fVar2);

    public abstract void x(n2.f fVar, Thread thread);

    public abstract boolean y(View view, int i10);

    public abstract void z(p7.f fVar);
}
