package com.google.android.gms.internal.ads;

import org.jasypt.digest.StandardStringDigester;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jm implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lm f5990b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5991d;

    public /* synthetic */ jm(lm lmVar, String str, int i10) {
        this.f5989a = i10;
        this.f5990b = lmVar;
        this.f5991d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5989a;
        String str = this.f5991d;
        lm lmVar = this.f5990b;
        switch (i10) {
            case 0:
                lmVar.f6659a.f7407a.loadUrl(str);
                break;
            case 1:
                lmVar.f6659a.zza(str);
                break;
            case 2:
                lmVar.f6659a.f7407a.loadData(str, "text/html", StandardStringDigester.MESSAGE_CHARSET);
                break;
            default:
                lmVar.f6659a.f7407a.loadData(str, "text/html", StandardStringDigester.MESSAGE_CHARSET);
                break;
        }
    }
}
