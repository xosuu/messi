package c2;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.sf;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.material.tabs.TabLayout;
import g4.b0;
import g4.c0;
import g4.r0;
import g4.u0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public class n implements RewardItem, b4.b, r0, l5.g, com.google.gson.internal.l, v5.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static n f1534b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static n f1535d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1536a;

    public /* synthetic */ n(int i10) {
        this.f1536a = i10;
    }

    public static RectF e(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.Q || !(view instanceof g5.j)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        g5.j jVar = (g5.j) view;
        int contentWidth = jVar.getContentWidth();
        int contentHeight = jVar.getContentHeight();
        int iN = (int) en1.n(jVar.getContext(), 24);
        if (contentWidth < iN) {
            contentWidth = iN;
        }
        int right = (jVar.getRight() + jVar.getLeft()) / 2;
        int bottom = (jVar.getBottom() + jVar.getTop()) / 2;
        int i10 = contentWidth / 2;
        return new RectF(right - i10, bottom - (contentHeight / 2), i10 + right, (right / 2) + bottom);
    }

    public static synchronized n i() {
        try {
            if (f1534b == null) {
                f1534b = new n(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1534b;
    }

    public static String l(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // b4.b
    public int a(Context context, String str) {
        return b4.d.a(context, str);
    }

    @Override // b4.b
    public int b(Context context, String str, boolean z9) {
        return b4.d.d(context, str, z9);
    }

    @Override // v5.s
    public Object c(float f10, Number number, Number number2) {
        float fFloatValue = number.floatValue();
        return Float.valueOf(((number2.floatValue() - fFloatValue) * f10) + fFloatValue);
    }

    @Override // l5.g
    public void d(l5.f fVar) {
        "Failed to load and cache a form, error=".concat(String.valueOf(fVar.f15222b));
    }

    @Override // com.google.gson.internal.l
    public Object f() {
        switch (this.f1536a) {
            case 19:
                return new TreeSet();
            case 20:
                return new LinkedHashSet();
            case sf.zzm /* 21 */:
                return new ArrayDeque();
            case 22:
                return new ArrayList();
            case 23:
                return new ConcurrentSkipListMap();
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                return new ConcurrentHashMap();
            case 25:
                return new TreeMap();
            case 26:
                return new LinkedHashMap();
            default:
                return new com.google.gson.internal.k(true);
        }
    }

    public void g(Throwable... thArr) {
        if (this.f1536a > 3 || thArr.length < 1) {
            return;
        }
        Throwable th = thArr[0];
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return 1;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public void h(Throwable... thArr) {
        if (this.f1536a > 6 || thArr.length < 1) {
            return;
        }
        Throwable th = thArr[0];
    }

    public void j(Throwable... thArr) {
        if (this.f1536a > 4 || thArr.length < 1) {
            return;
        }
        Throwable th = thArr[0];
    }

    public b4.c k(Context context, String str, b4.b bVar) {
        int iB;
        int iB2;
        switch (this.f1536a) {
            case 4:
                b4.c cVar = new b4.c();
                int iB3 = bVar.b(context, str, true);
                cVar.f1310b = iB3;
                if (iB3 != 0) {
                    cVar.f1311c = 1;
                } else {
                    int iA = bVar.a(context, str);
                    cVar.f1309a = iA;
                    if (iA != 0) {
                        cVar.f1311c = -1;
                    }
                }
                return cVar;
            case 5:
                b4.c cVar2 = new b4.c();
                int iA2 = bVar.a(context, str);
                cVar2.f1309a = iA2;
                if (iA2 != 0) {
                    cVar2.f1311c = -1;
                } else {
                    int iB4 = bVar.b(context, str, true);
                    cVar2.f1310b = iB4;
                    if (iB4 != 0) {
                        cVar2.f1311c = 1;
                    }
                }
                return cVar2;
            case 6:
                b4.c cVar3 = new b4.c();
                int iB5 = bVar.b(context, str, false);
                cVar3.f1310b = iB5;
                cVar3.f1311c = iB5 != 0 ? 1 : 0;
                return cVar3;
            case 7:
                b4.c cVar4 = new b4.c();
                cVar4.f1309a = bVar.a(context, str);
                int iB6 = bVar.b(context, str, true);
                cVar4.f1310b = iB6;
                int i10 = cVar4.f1309a;
                if (i10 == 0) {
                    if (iB6 != 0) {
                    }
                    cVar4.f1311c = i;
                    return cVar4;
                }
                i = i10;
                i = i >= iB6 ? -1 : 1;
                cVar4.f1311c = i;
                return cVar4;
            case 8:
                b4.c cVar5 = new b4.c();
                int iA3 = bVar.a(context, str);
                cVar5.f1309a = iA3;
                if (iA3 != 0) {
                    iB = bVar.b(context, str, false);
                    cVar5.f1310b = iB;
                } else {
                    iB = bVar.b(context, str, true);
                    cVar5.f1310b = iB;
                }
                int i11 = cVar5.f1309a;
                if (i11 == 0) {
                    if (iB != 0) {
                    }
                    cVar5.f1311c = i;
                    return cVar5;
                }
                i = i11;
                i = i >= iB ? -1 : 1;
                cVar5.f1311c = i;
                return cVar5;
            case 9:
                b4.c cVar6 = new b4.c();
                cVar6.f1309a = bVar.a(context, str);
                int iB7 = bVar.b(context, str, true);
                cVar6.f1310b = iB7;
                int i12 = cVar6.f1309a;
                if (i12 == 0) {
                    if (iB7 != 0) {
                    }
                    cVar6.f1311c = i;
                    return cVar6;
                }
                i = i12;
                i = iB7 >= i ? 1 : -1;
                cVar6.f1311c = i;
                return cVar6;
            default:
                b4.c cVar7 = new b4.c();
                int iA4 = bVar.a(context, str);
                cVar7.f1309a = iA4;
                if (iA4 != 0) {
                    iB2 = bVar.b(context, str, false);
                    cVar7.f1310b = iB2;
                } else {
                    iB2 = bVar.b(context, str, true);
                    cVar7.f1310b = iB2;
                }
                int i13 = cVar7.f1309a;
                if (i13 == 0) {
                    if (iB2 != 0) {
                    }
                    cVar7.f1311c = i;
                    return cVar7;
                }
                i = i13;
                i = iB2 >= i ? 1 : -1;
                cVar7.f1311c = i;
                return cVar7;
        }
    }

    public void m(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        RectF rectFE = e(tabLayout, view);
        RectF rectFE2 = e(tabLayout, view2);
        drawable.setBounds(m4.a.a(f10, (int) rectFE.left, (int) rectFE2.left), drawable.getBounds().top, m4.a.a(f10, (int) rectFE.right, (int) rectFE2.right), drawable.getBounds().bottom);
    }

    public void n(Throwable... thArr) {
        if (this.f1536a > 5 || thArr.length < 1) {
            return;
        }
        Throwable th = thArr[0];
    }

    @Override // g4.t0
    public Object zza() {
        switch (this.f1536a) {
            case 12:
                return new g4.b();
            case 13:
                Handler handler = c0.f13708a;
                tp1.K(handler);
                return handler;
            case 14:
                b0 b0Var = c0.f13709b;
                tp1.K(b0Var);
                return b0Var;
            default:
                b0 b0Var2 = c0.f13709b;
                tp1.K(b0Var2);
                return new u0(b0Var2);
        }
    }

    public /* synthetic */ n(int i10, int i11) {
        this.f1536a = i10;
    }

    public /* synthetic */ n(int i10, Object obj) {
        this.f1536a = i10;
    }
}
