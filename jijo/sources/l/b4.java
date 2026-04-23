package l;

import android.content.Context;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.ed;
import com.google.android.gms.internal.ads.kd;
import com.google.android.gms.internal.ads.kg;
import com.google.android.gms.internal.ads.kx;
import com.google.android.gms.internal.ads.lx;
import com.google.android.gms.internal.ads.nx;
import com.google.android.gms.internal.ads.pr0;
import com.google.android.gms.internal.ads.qh0;
import com.google.android.gms.internal.ads.w30;
import com.google.android.gms.internal.ads.x11;
import com.google.android.gms.internal.ads.xt0;
import com.google.android.gms.internal.ads.y9;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b4 implements x11, w30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f14809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14810b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14811d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f14812f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f14813h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f14814q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f14815s;

    public b4() {
        this.f14814q = new s.k();
        this.f14815s = new s.k();
    }

    @Override // com.google.android.gms.internal.ads.x11
    /* JADX INFO: renamed from: zza */
    public final n5.a mo2zza() {
        zzu.zzz();
        Context context = (Context) this.f14809a;
        b4.c cVar = new b4.c(0, 0, 0, 3);
        y9 y9Var = (y9) this.f14810b;
        qh0 qh0Var = (qh0) this.f14813h;
        zza zzaVar = (zza) this.f14812f;
        nx nxVarA = lx.a(context, (VersionInfoParcel) this.f14811d, zzaVar, null, cVar, y9Var, new kd(), null, qh0Var, null, null, (pr0) this.f14814q, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false, false);
        ed edVar = new ed(nxVarA);
        nxVarA.g().f5715s = new kx(edVar);
        nxVarA.f7407a.loadUrl((String) this.f14815s);
        return edVar;
    }

    public b4(kg kgVar, WebView webView, String str, String str2, xt0 xt0Var) {
        this.f14811d = new ArrayList();
        this.f14812f = new HashMap();
        this.f14809a = kgVar;
        this.f14810b = webView;
        this.f14815s = xt0Var;
        this.f14814q = str;
        this.f14813h = str2;
    }
}
