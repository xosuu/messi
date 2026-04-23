package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class hg extends ig {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5278d;

    public hg(int i10) {
        this.f5278d = i10;
    }

    public static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < str.length() && str.charAt(i11) == ',') {
            i11++;
        }
        while (length > 0) {
            int i12 = length - 1;
            if (str.charAt(i12) != ',') {
                break;
            }
            length = i12;
        }
        if (length < i11) {
            return null;
        }
        if (i11 != 0) {
            i10 = i11;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i10, length);
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final String a(String str, String str2) {
        switch (this.f5278d) {
            case 0:
                return str2;
            case 1:
                return str != null ? str : str2;
            default:
                String strB = b(str);
                String strB2 = b(str2);
                return TextUtils.isEmpty(strB) ? strB2 : TextUtils.isEmpty(strB2) ? strB : fb1.x(strB, ",", strB2);
        }
    }
}
