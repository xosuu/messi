package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c60 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f3195p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f3196q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f3197r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f3198s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f3199t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f3200u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f3201v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f3202w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f3203x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f3204y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f3205z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f3206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f3207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f3208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f3209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f3210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f3213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f3215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f3216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f3218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f3219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f3220o;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        float f10 = -3.4028235E38f;
        int i10 = Integer.MIN_VALUE;
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        new c60(str, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f10, i10, i10, f10, i10, i10, f10, f10, f10, i10, 0.0f);
        f3195p = Integer.toString(0, 36);
        f3196q = Integer.toString(17, 36);
        f3197r = Integer.toString(1, 36);
        f3198s = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f3199t = Integer.toString(18, 36);
        f3200u = Integer.toString(4, 36);
        f3201v = Integer.toString(5, 36);
        f3202w = Integer.toString(6, 36);
        f3203x = Integer.toString(7, 36);
        f3204y = Integer.toString(8, 36);
        f3205z = Integer.toString(9, 36);
        A = Integer.toString(10, 36);
        B = Integer.toString(11, 36);
        C = Integer.toString(12, 36);
        D = Integer.toString(13, 36);
        E = Integer.toString(14, 36);
        F = Integer.toString(15, 36);
        G = Integer.toString(16, 36);
    }

    public /* synthetic */ c60(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, int i14, float f15) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            tc1.K(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f3206a = SpannedString.valueOf(charSequence);
        } else {
            this.f3206a = charSequence != null ? charSequence.toString() : null;
        }
        this.f3207b = alignment;
        this.f3208c = alignment2;
        this.f3209d = bitmap;
        this.f3210e = f10;
        this.f3211f = i10;
        this.f3212g = i11;
        this.f3213h = f11;
        this.f3214i = i12;
        this.f3215j = f13;
        this.f3216k = f14;
        this.f3217l = i13;
        this.f3218m = f12;
        this.f3219n = i14;
        this.f3220o = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c60.class == obj.getClass()) {
            c60 c60Var = (c60) obj;
            if (TextUtils.equals(this.f3206a, c60Var.f3206a) && this.f3207b == c60Var.f3207b && this.f3208c == c60Var.f3208c) {
                Bitmap bitmap = c60Var.f3209d;
                Bitmap bitmap2 = this.f3209d;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.f3210e == c60Var.f3210e && this.f3211f == c60Var.f3211f && this.f3212g == c60Var.f3212g && this.f3213h == c60Var.f3213h && this.f3214i == c60Var.f3214i && this.f3215j == c60Var.f3215j && this.f3216k == c60Var.f3216k && this.f3217l == c60Var.f3217l && this.f3218m == c60Var.f3218m && this.f3219n == c60Var.f3219n && this.f3220o == c60Var.f3220o) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3206a, this.f3207b, this.f3208c, this.f3209d, Float.valueOf(this.f3210e), Integer.valueOf(this.f3211f), Integer.valueOf(this.f3212g), Float.valueOf(this.f3213h), Integer.valueOf(this.f3214i), Float.valueOf(this.f3215j), Float.valueOf(this.f3216k), Boolean.FALSE, -16777216, Integer.valueOf(this.f3217l), Float.valueOf(this.f3218m), Integer.valueOf(this.f3219n), Float.valueOf(this.f3220o)});
    }
}
