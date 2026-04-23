package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f7441c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7442a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7443b = -1;

    public final boolean a() {
        return (this.f7442a == -1 || this.f7443b == -1) ? false : true;
    }

    public final void b(zzbk zzbkVar) {
        int i10 = 0;
        while (true) {
            zzbj[] zzbjVarArr = zzbkVar.f11487a;
            if (i10 >= zzbjVarArr.length) {
                return;
            }
            zzbj zzbjVar = zzbjVarArr[i10];
            if (zzbjVar instanceof zzafx) {
                zzafx zzafxVar = (zzafx) zzbjVar;
                if ("iTunSMPB".equals(zzafxVar.f11429d) && c(zzafxVar.f11430f)) {
                    return;
                }
            } else if (zzbjVar instanceof zzagg) {
                zzagg zzaggVar = (zzagg) zzbjVar;
                if ("com.apple.iTunes".equals(zzaggVar.f11436b) && "iTunSMPB".equals(zzaggVar.f11437d) && c(zzaggVar.f11438f)) {
                    return;
                }
            } else {
                continue;
            }
            i10++;
        }
    }

    public final boolean c(String str) {
        Matcher matcher = f7441c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i10 = yn0.f10944a;
            int i11 = Integer.parseInt(strGroup, 16);
            int i12 = Integer.parseInt(matcher.group(2), 16);
            if (i11 <= 0 && i12 <= 0) {
                return false;
            }
            this.f7442a = i11;
            this.f7443b = i12;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
