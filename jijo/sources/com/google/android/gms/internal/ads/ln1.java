package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ln1 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ on1 f6673a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Pattern pattern = pn1.f7924a;
        on1 on1Var = this.f6673a;
        return on1Var.zza(obj2) - on1Var.zza(obj);
    }
}
