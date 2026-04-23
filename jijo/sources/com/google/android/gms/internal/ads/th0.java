package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class th0 implements wh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9160b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f9161d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f9162f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9163h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ WebView f9164q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f9165s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f9166t;

    public /* synthetic */ th0(String str, int i10, String str2, WebView webView, String str3, int i11) {
        this.f9159a = 0;
        this.f9160b = "Google";
        this.f9161d = str;
        this.f9163h = i10;
        this.f9162f = str2;
        this.f9164q = webView;
        this.f9165s = str3;
        this.f9166t = i11;
    }

    @Override // com.google.android.gms.internal.ads.wh0, com.google.android.gms.internal.ads.q20
    public final Object zza() {
        zt0 zt0Var = zt0.f11323h;
        du0 du0Var = du0.f3750f;
        c8.a aVar = tp1.f9254v;
        int i10 = this.f9159a;
        int i11 = this.f9166t;
        int i12 = this.f9163h;
        String str = this.f9162f;
        String str2 = this.f9161d;
        switch (i10) {
            case 0:
                kg kgVarA = kg.a("Google", str2);
                du0 du0VarK = k70.k("javascript");
                zt0 zt0VarG = k70.g(g1.a.e(i12));
                if (du0VarK == du0Var) {
                    zzm.zzj("Omid html session error; Unable to parse impression owner: javascript");
                    return null;
                }
                if (zt0VarG == null) {
                    zzm.zzj("Omid html session error; Unable to parse creative type: ".concat(g1.a.D(i12)));
                    return null;
                }
                du0 du0VarK2 = k70.k(str);
                if (zt0VarG == zt0Var && du0VarK2 == du0Var) {
                    zzm.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str)));
                    return null;
                }
                l.b4 b4Var = new l.b4(kgVarA, this.f9164q, this.f9165s, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, xt0.f10647b);
                androidx.emoji2.text.r rVarC = androidx.emoji2.text.r.c(zt0VarG, k70.j(g1.a.g(i11)), du0VarK, du0VarK2, true);
                if (aVar.f1584b) {
                    return new zh0(new yt0(rVarC, b4Var, UUID.randomUUID().toString()), b4Var);
                }
                throw new IllegalStateException("Method called before OM SDK activation");
            default:
                WebView webView = this.f9164q;
                String str3 = this.f9165s;
                kg kgVarA2 = kg.a(this.f9160b, str2);
                du0 du0VarK3 = k70.k("javascript");
                du0 du0VarK4 = k70.k(str);
                zt0 zt0VarG2 = k70.g(g1.a.e(i12));
                if (du0VarK3 == du0Var) {
                    zzm.zzj("Omid js session error; Unable to parse impression owner: javascript");
                    return null;
                }
                if (zt0VarG2 == null) {
                    zzm.zzj("Omid js session error; Unable to parse creative type: ".concat(g1.a.D(i12)));
                    return null;
                }
                if (zt0VarG2 == zt0Var && du0VarK4 == du0Var) {
                    zzm.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str)));
                    return null;
                }
                l.b4 b4Var2 = new l.b4(kgVarA2, webView, str3, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, xt0.f10648d);
                androidx.emoji2.text.r rVarC2 = androidx.emoji2.text.r.c(zt0VarG2, k70.j(g1.a.g(i11)), du0VarK3, du0VarK4, true);
                if (aVar.f1584b) {
                    return new zh0(new yt0(rVarC2, b4Var2, UUID.randomUUID().toString()), b4Var2);
                }
                throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public /* synthetic */ th0(String str, String str2, String str3, int i10, WebView webView, String str4, int i11) {
        this.f9159a = 1;
        this.f9160b = str;
        this.f9161d = str2;
        this.f9162f = str3;
        this.f9163h = i10;
        this.f9164q = webView;
        this.f9165s = str4;
        this.f9166t = i11;
    }
}
