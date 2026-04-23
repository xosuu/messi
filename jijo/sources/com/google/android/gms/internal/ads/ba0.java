package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.jasypt.digest.StandardStringDigester;

/* JADX INFO: loaded from: classes.dex */
public final class ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kc0 f2945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tb0 f2946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a10 f2947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q90 f2948d;

    public ba0(kc0 kc0Var, tb0 tb0Var, a10 a10Var, w80 w80Var) {
        this.f2945a = kc0Var;
        this.f2946b = tb0Var;
        this.f2947c = a10Var;
        this.f2948d = w80Var;
    }

    public final View a() {
        nx nxVarA = this.f2945a.a(zzq.zzc(), null, null);
        nxVarA.setVisibility(8);
        final int i10 = 0;
        nxVarA.l0("/sendMessageToSdk", new wk(this) { // from class: com.google.android.gms.internal.ads.aa0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ba0 f2628b;

            {
                this.f2628b = this;
            }

            @Override // com.google.android.gms.internal.ads.wk
            public final void b(Object obj, Map map) {
                int i11 = i10;
                ba0 ba0Var = this.f2628b;
                switch (i11) {
                    case 0:
                        ba0Var.f2946b.b(map);
                        break;
                    case 1:
                        ba0Var.f2948d.zzg();
                        break;
                    case 2:
                        fx fxVar = (fx) obj;
                        fxVar.g().f5715s = new m20(ba0Var, 19, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            fxVar.loadDataWithBaseURL(str2, str, "text/html", StandardStringDigester.MESSAGE_CHARSET, null);
                        } else {
                            fxVar.loadData(str, "text/html", StandardStringDigester.MESSAGE_CHARSET);
                        }
                        break;
                    case 3:
                        ba0Var.getClass();
                        zzm.zzi("Showing native ads overlay.");
                        ((fx) obj).d().setVisibility(0);
                        ba0Var.f2947c.f2560q = true;
                        break;
                    default:
                        ba0Var.getClass();
                        zzm.zzi("Hiding native ads overlay.");
                        ((fx) obj).d().setVisibility(8);
                        ba0Var.f2947c.f2560q = false;
                        break;
                }
            }
        });
        final int i11 = 1;
        nxVarA.l0("/adMuted", new wk(this) { // from class: com.google.android.gms.internal.ads.aa0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ba0 f2628b;

            {
                this.f2628b = this;
            }

            @Override // com.google.android.gms.internal.ads.wk
            public final void b(Object obj, Map map) {
                int i112 = i11;
                ba0 ba0Var = this.f2628b;
                switch (i112) {
                    case 0:
                        ba0Var.f2946b.b(map);
                        break;
                    case 1:
                        ba0Var.f2948d.zzg();
                        break;
                    case 2:
                        fx fxVar = (fx) obj;
                        fxVar.g().f5715s = new m20(ba0Var, 19, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            fxVar.loadDataWithBaseURL(str2, str, "text/html", StandardStringDigester.MESSAGE_CHARSET, null);
                        } else {
                            fxVar.loadData(str, "text/html", StandardStringDigester.MESSAGE_CHARSET);
                        }
                        break;
                    case 3:
                        ba0Var.getClass();
                        zzm.zzi("Showing native ads overlay.");
                        ((fx) obj).d().setVisibility(0);
                        ba0Var.f2947c.f2560q = true;
                        break;
                    default:
                        ba0Var.getClass();
                        zzm.zzi("Hiding native ads overlay.");
                        ((fx) obj).d().setVisibility(8);
                        ba0Var.f2947c.f2560q = false;
                        break;
                }
            }
        });
        WeakReference weakReference = new WeakReference(nxVarA);
        final int i12 = 2;
        wk wkVar = new wk(this) { // from class: com.google.android.gms.internal.ads.aa0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ba0 f2628b;

            {
                this.f2628b = this;
            }

            @Override // com.google.android.gms.internal.ads.wk
            public final void b(Object obj, Map map) {
                int i112 = i12;
                ba0 ba0Var = this.f2628b;
                switch (i112) {
                    case 0:
                        ba0Var.f2946b.b(map);
                        break;
                    case 1:
                        ba0Var.f2948d.zzg();
                        break;
                    case 2:
                        fx fxVar = (fx) obj;
                        fxVar.g().f5715s = new m20(ba0Var, 19, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            fxVar.loadDataWithBaseURL(str2, str, "text/html", StandardStringDigester.MESSAGE_CHARSET, null);
                        } else {
                            fxVar.loadData(str, "text/html", StandardStringDigester.MESSAGE_CHARSET);
                        }
                        break;
                    case 3:
                        ba0Var.getClass();
                        zzm.zzi("Showing native ads overlay.");
                        ((fx) obj).d().setVisibility(0);
                        ba0Var.f2947c.f2560q = true;
                        break;
                    default:
                        ba0Var.getClass();
                        zzm.zzi("Hiding native ads overlay.");
                        ((fx) obj).d().setVisibility(8);
                        ba0Var.f2947c.f2560q = false;
                        break;
                }
            }
        };
        tb0 tb0Var = this.f2946b;
        tb0Var.getClass();
        tb0Var.c("/loadHtml", new sb0(tb0Var, weakReference, "/loadHtml", wkVar));
        final int i13 = 3;
        tb0Var.c("/showOverlay", new sb0(tb0Var, new WeakReference(nxVarA), "/showOverlay", new wk(this) { // from class: com.google.android.gms.internal.ads.aa0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ba0 f2628b;

            {
                this.f2628b = this;
            }

            @Override // com.google.android.gms.internal.ads.wk
            public final void b(Object obj, Map map) {
                int i112 = i13;
                ba0 ba0Var = this.f2628b;
                switch (i112) {
                    case 0:
                        ba0Var.f2946b.b(map);
                        break;
                    case 1:
                        ba0Var.f2948d.zzg();
                        break;
                    case 2:
                        fx fxVar = (fx) obj;
                        fxVar.g().f5715s = new m20(ba0Var, 19, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            fxVar.loadDataWithBaseURL(str2, str, "text/html", StandardStringDigester.MESSAGE_CHARSET, null);
                        } else {
                            fxVar.loadData(str, "text/html", StandardStringDigester.MESSAGE_CHARSET);
                        }
                        break;
                    case 3:
                        ba0Var.getClass();
                        zzm.zzi("Showing native ads overlay.");
                        ((fx) obj).d().setVisibility(0);
                        ba0Var.f2947c.f2560q = true;
                        break;
                    default:
                        ba0Var.getClass();
                        zzm.zzi("Hiding native ads overlay.");
                        ((fx) obj).d().setVisibility(8);
                        ba0Var.f2947c.f2560q = false;
                        break;
                }
            }
        }));
        final int i14 = 4;
        tb0Var.c("/hideOverlay", new sb0(tb0Var, new WeakReference(nxVarA), "/hideOverlay", new wk(this) { // from class: com.google.android.gms.internal.ads.aa0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ba0 f2628b;

            {
                this.f2628b = this;
            }

            @Override // com.google.android.gms.internal.ads.wk
            public final void b(Object obj, Map map) {
                int i112 = i14;
                ba0 ba0Var = this.f2628b;
                switch (i112) {
                    case 0:
                        ba0Var.f2946b.b(map);
                        break;
                    case 1:
                        ba0Var.f2948d.zzg();
                        break;
                    case 2:
                        fx fxVar = (fx) obj;
                        fxVar.g().f5715s = new m20(ba0Var, 19, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            fxVar.loadDataWithBaseURL(str2, str, "text/html", StandardStringDigester.MESSAGE_CHARSET, null);
                        } else {
                            fxVar.loadData(str, "text/html", StandardStringDigester.MESSAGE_CHARSET);
                        }
                        break;
                    case 3:
                        ba0Var.getClass();
                        zzm.zzi("Showing native ads overlay.");
                        ((fx) obj).d().setVisibility(0);
                        ba0Var.f2947c.f2560q = true;
                        break;
                    default:
                        ba0Var.getClass();
                        zzm.zzi("Hiding native ads overlay.");
                        ((fx) obj).d().setVisibility(8);
                        ba0Var.f2947c.f2560q = false;
                        break;
                }
            }
        }));
        return nxVarA;
    }
}
