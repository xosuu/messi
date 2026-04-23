package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gp0 f2640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z0.b f2641f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2649n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f2642g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f2643h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f2644i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f2645j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2646k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2647l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2648m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f2650o = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f2651p = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f2652q = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    public ac(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z9) {
        this.f2636a = i10;
        this.f2637b = i11;
        this.f2638c = i12;
        this.f2639d = z9;
        this.f2640e = new gp0(i13, 5);
        this.f2641f = new z0.b(i14, i15, i16);
    }

    public static final String g(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            sb.append((String) arrayList.get(i10));
            sb.append(' ');
            i10++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final void a() {
        synchronized (this.f2642g) {
            this.f2649n -= 100;
        }
    }

    public final void b(String str, boolean z9, float f10, float f11, float f12, float f13) {
        f(str, z9, f10, f11, f12, f13);
        synchronized (this.f2642g) {
            try {
                if (this.f2648m < 0) {
                    zzm.zze("ActivityContent: negative number of WebViews.");
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f2642g) {
            try {
                int i10 = this.f2646k;
                int i11 = this.f2647l;
                boolean z9 = this.f2639d;
                int i12 = this.f2637b;
                if (!z9) {
                    i12 = (i11 * i12) + (i10 * this.f2636a);
                }
                if (i12 > this.f2649n) {
                    this.f2649n = i12;
                    if (!zzu.zzo().d().zzP()) {
                        this.f2650o = this.f2640e.s(this.f2643h);
                        this.f2651p = this.f2640e.s(this.f2644i);
                    }
                    if (!zzu.zzo().d().zzQ()) {
                        this.f2652q = this.f2641f.a(this.f2644i, this.f2645j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f2642g) {
            try {
                int i10 = this.f2646k;
                int i11 = this.f2647l;
                boolean z9 = this.f2639d;
                int i12 = this.f2637b;
                if (!z9) {
                    i12 = (i11 * i12) + (i10 * this.f2636a);
                }
                if (i12 > this.f2649n) {
                    this.f2649n = i12;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        boolean z9;
        synchronized (this.f2642g) {
            z9 = this.f2648m == 0;
        }
        return z9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ac)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((ac) obj).f2650o;
        return str != null && str.equals(this.f2650o);
    }

    public final void f(String str, boolean z9, float f10, float f11, float f12, float f13) {
        if (str != null) {
            if (str.length() < this.f2638c) {
                return;
            }
            synchronized (this.f2642g) {
                try {
                    this.f2643h.add(str);
                    this.f2646k += str.length();
                    if (z9) {
                        this.f2644i.add(str);
                        this.f2645j.add(new gc(f10, f11, f12, f13, this.f2644i.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final int hashCode() {
        return this.f2650o.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.f2643h;
        return "ActivityContent fetchId: " + this.f2647l + " score:" + this.f2649n + " total_length:" + this.f2646k + "\n text: " + g(arrayList) + "\n viewableText" + g(this.f2644i) + "\n signture: " + this.f2650o + "\n viewableSignture: " + this.f2651p + "\n viewableSignatureForVertical: " + this.f2652q;
    }
}
