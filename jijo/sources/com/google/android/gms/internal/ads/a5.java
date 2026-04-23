package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a5 implements c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik0 f2581a = new ik0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2582b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2583d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2584f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2585h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f2586q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2587s;

    public a5(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f2583d = 0;
            this.f2584f = -1;
            this.f2585h = "sans-serif";
            this.f2582b = false;
            this.f2586q = 0.85f;
            this.f2587s = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f2583d = bArr[24];
        this.f2584f = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f2585h = true == "Serif".equals(new String(bArr, 43, bArr.length + (-43), fx0.f4681c)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f2587s = i10;
        boolean z9 = (bArr[0] & 32) != 0;
        this.f2582b = z9;
        if (z9) {
            this.f2586q = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.95f));
        } else {
            this.f2586q = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            int i16 = i10 & 1;
            int i17 = i10 & 2;
            boolean z9 = true;
            if (i16 != 0) {
                if (i17 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                    z9 = false;
                }
            } else if (i17 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            } else {
                z9 = false;
            }
            if ((i10 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            } else {
                if (i16 != 0 || z9) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.c4
    public final void c(byte[] bArr, int i10, int i11, e4 e4Var) {
        String strA;
        ik0 ik0Var = this.f2581a;
        ik0Var.g(bArr, i10 + i11);
        ik0Var.i(i10);
        int i12 = 1;
        int i13 = 2;
        tc1.K(ik0Var.n() >= 2);
        int iZ = ik0Var.z();
        if (iZ == 0) {
            strA = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else {
            int i14 = ik0Var.f5634b;
            Charset charsetB = ik0Var.b();
            int i15 = ik0Var.f5634b - i14;
            if (charsetB == null) {
                charsetB = fx0.f4681c;
            }
            strA = ik0Var.a(iZ - i15, charsetB);
        }
        if (strA.isEmpty()) {
            zy0 zy0Var = bz0.f3132b;
            e4Var.mo0zza(new y3(wz0.f10382h, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA);
        b(spannableStringBuilder, this.f2583d, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f2584f, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f2585h;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fMax = this.f2586q;
        while (ik0Var.n() >= 8) {
            int i16 = ik0Var.f5634b;
            int iQ = ik0Var.q();
            int iQ2 = ik0Var.q();
            if (iQ2 == 1937013100) {
                tc1.K(ik0Var.n() >= i13);
                int iZ2 = ik0Var.z();
                int i17 = 0;
                while (i17 < iZ2) {
                    tc1.K(ik0Var.n() >= 12);
                    int iZ3 = ik0Var.z();
                    int iZ4 = ik0Var.z();
                    ik0Var.j(i13);
                    int iV = ik0Var.v();
                    ik0Var.j(i12);
                    int iQ3 = ik0Var.q();
                    if (iZ4 > spannableStringBuilder.length()) {
                        fg0.f("Truncating styl end (" + iZ4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        iZ4 = spannableStringBuilder.length();
                    }
                    if (iZ3 >= iZ4) {
                        fg0.f("Ignoring styl with start (" + iZ3 + ") >= end (" + iZ4 + ").");
                    } else {
                        int i18 = iZ4;
                        b(spannableStringBuilder, iV, this.f2583d, iZ3, i18, 0);
                        a(spannableStringBuilder, iQ3, this.f2584f, iZ3, i18, 0);
                    }
                    i17++;
                    i12 = 1;
                    i13 = 2;
                }
            } else {
                if (iQ2 == 1952608120 && this.f2582b) {
                    tc1.K(ik0Var.n() >= 2);
                    fMax = Math.max(0.0f, Math.min(ik0Var.z() / this.f2587s, 0.95f));
                }
                ik0Var.i(i16 + iQ);
                i12 = 1;
                i13 = 2;
            }
            ik0Var.i(i16 + iQ);
            i12 = 1;
            i13 = 2;
        }
        e4Var.mo0zza(new y3(bz0.n(new c60(spannableStringBuilder, null, null, null, fMax, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f)), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.c4
    public final /* synthetic */ void zzb() {
    }
}
