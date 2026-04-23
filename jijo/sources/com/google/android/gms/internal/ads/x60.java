package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;

/* JADX INFO: loaded from: classes.dex */
public abstract class x60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10455a = Integer.toString(0, 36);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f10456b = Integer.toString(1, 36);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f10457c = Integer.toString(2, 36);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f10458d = Integer.toString(3, 36);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f10459e = Integer.toString(4, 36);

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f10455a, spanned.getSpanStart(obj));
        bundle2.putInt(f10456b, spanned.getSpanEnd(obj));
        bundle2.putInt(f10457c, spanned.getSpanFlags(obj));
        bundle2.putInt(f10458d, i10);
        if (bundle != null) {
            bundle2.putBundle(f10459e, bundle);
        }
        return bundle2;
    }
}
