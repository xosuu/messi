package i3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.bv0;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.tu0;
import com.google.android.gms.internal.ads.zzaup;
import com.google.android.gms.internal.consent_sdk.zzg;
import g4.j;
import g4.o;
import g4.r;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14170b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f14169a = i10;
        this.f14170b = obj;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        switch (this.f14169a) {
            case 2:
                o oVar = (o) this.f14170b;
                int i10 = o.f13767f;
                if (str != null && str.startsWith("consent://")) {
                    oVar.f13769b.b(str);
                    break;
                }
                break;
            default:
                super.onLoadResource(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        switch (this.f14169a) {
            case 2:
                o oVar = (o) this.f14170b;
                if (!oVar.f13770d) {
                    oVar.f13770d = true;
                }
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        switch (this.f14169a) {
            case 2:
                r rVar = ((o) this.f14170b).f13769b;
                rVar.getClass();
                zzg zzgVar = new zzg(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i10), str2, str));
                j jVar = (j) rVar.f13785g.f13743i.getAndSet(null);
                if (jVar != null) {
                    jVar.d(zzgVar.a());
                    break;
                }
                break;
            default:
                super.onReceivedError(webView, i10, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.f14169a) {
            case 1:
                renderProcessGoneDetail.toString();
                String.valueOf(webView);
                tu0 tu0Var = (tu0) this.f14170b;
                if (tu0Var.a() == webView) {
                    tu0Var.f8278b = new bv0(null);
                }
                webView.destroy();
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f14169a) {
            case 2:
                String string = webResourceRequest.getUrl().toString();
                o oVar = (o) this.f14170b;
                int i10 = o.f13767f;
                if (string == null || !string.startsWith("consent://")) {
                    return false;
                }
                oVar.f13769b.b(string);
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public /* synthetic */ a(o oVar) {
        this.f14169a = 2;
        this.f14170b = oVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i10 = this.f14169a;
        int iZzy = 0;
        Object obj = this.f14170b;
        switch (i10) {
            case 0:
                zzt zztVar = (zzt) obj;
                if (str.startsWith(zztVar.zzq())) {
                    return false;
                }
                if (str.startsWith("gmsg://noAdLoaded")) {
                    zzbh zzbhVar = zztVar.f2242s;
                    if (zzbhVar != null) {
                        try {
                            zzbhVar.zzf(en1.u0(3, null, null));
                        } catch (RemoteException e10) {
                            zzm.zzl("#007 Could not call remote method.", e10);
                        }
                    }
                    zzbh zzbhVar2 = zztVar.f2242s;
                    if (zzbhVar2 != null) {
                        try {
                            zzbhVar2.zze(3);
                        } catch (RemoteException e11) {
                            zzm.zzl("#007 Could not call remote method.", e11);
                        }
                    }
                    zztVar.u1(0);
                    break;
                } else {
                    if (str.startsWith("gmsg://scriptLoadFailed")) {
                        zzbh zzbhVar3 = zztVar.f2242s;
                        if (zzbhVar3 != null) {
                            try {
                                zzbhVar3.zzf(en1.u0(1, null, null));
                            } catch (RemoteException e12) {
                                zzm.zzl("#007 Could not call remote method.", e12);
                            }
                        }
                        zzbh zzbhVar4 = zztVar.f2242s;
                        if (zzbhVar4 != null) {
                            try {
                                zzbhVar4.zze(0);
                            } catch (RemoteException e13) {
                                zzm.zzl("#007 Could not call remote method.", e13);
                            }
                        }
                        zztVar.u1(0);
                    } else {
                        boolean zStartsWith = str.startsWith("gmsg://adResized");
                        Context context = zztVar.f2239f;
                        if (zStartsWith) {
                            zzbh zzbhVar5 = zztVar.f2242s;
                            if (zzbhVar5 != null) {
                                try {
                                    zzbhVar5.zzi();
                                } catch (RemoteException e14) {
                                    zzm.zzl("#007 Could not call remote method.", e14);
                                }
                            }
                            String queryParameter = Uri.parse(str).getQueryParameter("height");
                            if (!TextUtils.isEmpty(queryParameter)) {
                                try {
                                    zzay.zzb();
                                    iZzy = zzf.zzy(context, Integer.parseInt(queryParameter));
                                    break;
                                } catch (NumberFormatException unused) {
                                }
                            }
                            zztVar.u1(iZzy);
                        } else if (!str.startsWith("gmsg://")) {
                            zzbh zzbhVar6 = zztVar.f2242s;
                            if (zzbhVar6 != null) {
                                try {
                                    zzbhVar6.zzc();
                                    ((zzt) obj).f2242s.zzh();
                                } catch (RemoteException e15) {
                                    zzm.zzl("#007 Could not call remote method.", e15);
                                }
                            }
                            if (zztVar.f2243t != null) {
                                Uri uriA = Uri.parse(str);
                                try {
                                    uriA = zztVar.f2243t.a(uriA, context, null, null);
                                } catch (zzaup e16) {
                                    zzm.zzk("Unable to process ad data", e16);
                                }
                                str = uriA.toString();
                            }
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(str));
                            context.startActivity(intent);
                        }
                    }
                    break;
                }
                return true;
            case 1:
            default:
                return super.shouldOverrideUrlLoading(webView, str);
            case 2:
                o oVar = (o) obj;
                int i11 = o.f13767f;
                if (str == null || !str.startsWith("consent://")) {
                    return false;
                }
                oVar.f13769b.b(str);
                return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f14169a) {
            case 0:
                zzt zztVar = (zzt) this.f14170b;
                zzbh zzbhVar = zztVar.f2242s;
                if (zzbhVar != null) {
                    try {
                        zzbhVar.zzf(en1.u0(1, null, null));
                    } catch (RemoteException e10) {
                        zzm.zzl("#007 Could not call remote method.", e10);
                    }
                }
                zzbh zzbhVar2 = zztVar.f2242s;
                if (zzbhVar2 != null) {
                    try {
                        zzbhVar2.zze(0);
                    } catch (RemoteException e11) {
                        zzm.zzl("#007 Could not call remote method.", e11);
                        return;
                    }
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }
}
