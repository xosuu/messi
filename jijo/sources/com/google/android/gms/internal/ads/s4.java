package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class s4 implements c4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f8784f = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f8785h = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f8786a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8787b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ik0 f8788d = new ik0();

    public static long a(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i10 + 2);
        strGroup2.getClass();
        long j11 = (Long.parseLong(strGroup2) * 60000) + j10;
        String strGroup3 = matcher.group(i10 + 3);
        strGroup3.getClass();
        long j12 = (Long.parseLong(strGroup3) * 1000) + j11;
        String strGroup4 = matcher.group(i10 + 4);
        if (strGroup4 != null) {
            j12 += Long.parseLong(strGroup4);
        }
        return j12 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014e  */
    @Override // com.google.android.gms.internal.ads.c4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(byte[] r28, int r29, int r30, com.google.android.gms.internal.ads.e4 r31) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s4.c(byte[], int, int, com.google.android.gms.internal.ads.e4):void");
    }

    @Override // com.google.android.gms.internal.ads.c4
    public final /* synthetic */ void zzb() {
    }
}
