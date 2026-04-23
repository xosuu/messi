package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes.dex */
public final class sr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f8967a;

    public sr0() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) zzba.zzc().a(eg.f4029i6));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.f8967a = patternCompile;
    }
}
