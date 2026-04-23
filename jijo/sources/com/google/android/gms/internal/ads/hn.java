package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.InputEvent;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class hn implements y11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5352e;

    public hn(ym ymVar, String str, dn dnVar, cn cnVar) {
        this.f5348a = 0;
        this.f5352e = ymVar;
        this.f5349b = str;
        this.f5351d = dnVar;
        this.f5350c = cnVar;
    }

    public final n5.a a(Object obj) {
        qu quVar = new qu();
        tm tmVarA = ((ym) this.f5352e).a();
        zze.zza("callJs > getEngine: Promise created");
        tmVarA.n(new xq(this, tmVarA, obj, quVar, 7, 0), new m20(quVar, tmVarA, 9));
        return quVar;
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final n5.a zza(Object obj) {
        n5.a aVarZ;
        m21 m21VarD0;
        int i10 = 3;
        Object obj2 = null;
        switch (this.f5348a) {
            case 0:
                return a(obj);
            case 1:
                n00 n00Var = (n00) this.f5350c;
                Uri.Builder builder = (Uri.Builder) this.f5351d;
                String str = (String) this.f5349b;
                InputEvent inputEvent = (InputEvent) this.f5352e;
                n00Var.getClass();
                if (((Integer) obj).intValue() != 1) {
                    builder.appendQueryParameter((String) zzba.zzc().a(eg.p9), "10");
                    return tc1.d0(builder.toString());
                }
                Uri.Builder builderBuildUpon = builder.build().buildUpon();
                builderBuildUpon.appendQueryParameter((String) zzba.zzc().a(eg.q9), "1");
                builderBuildUpon.appendQueryParameter((String) zzba.zzc().a(eg.p9), "12");
                if (str.contains((CharSequence) zzba.zzc().a(eg.r9))) {
                    builderBuildUpon.authority((String) zzba.zzc().a(eg.s9));
                }
                Uri uriBuild = builderBuildUpon.build();
                ai0 ai0Var = n00Var.f7089c;
                ai0Var.getClass();
                try {
                    h1.d dVar = ai0Var.f2687a;
                    Objects.requireNonNull(dVar);
                    aVarZ = dVar.c(uriBuild, inputEvent);
                    break;
                } catch (Exception e10) {
                    aVarZ = tc1.Z(e10);
                }
                return tc1.q0(h21.r(aVarZ), new if0(i10, builder), n00Var.f7092f);
            case 2:
                tl0 tl0Var = (tl0) this.f5350c;
                return tc1.q0(((zf0) this.f5351d).n((zzbvb) this.f5352e), (y11) this.f5349b, (p21) tl0Var.f9185a);
            case 3:
                return ((li0) this.f5350c).c((fr0) this.f5351d, (kr0) this.f5352e, (p80) this.f5349b);
            case 4:
                wi0 wi0Var = (wi0) this.f5350c;
                Uri uri = (Uri) this.f5351d;
                kr0 kr0Var = (kr0) this.f5352e;
                fr0 fr0Var = (fr0) this.f5349b;
                wi0Var.getClass();
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                        Bundle bundle = new Bundle();
                        androidx.core.app.j.b(bundle, "android.support.customtabs.extra.SESSION", null);
                        intent.putExtras(bundle);
                    }
                    intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent.putExtras(new Bundle());
                    intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                    f.f fVar = new f.f(intent, i10, obj2);
                    ((Intent) fVar.f12832b).setData(uri);
                    zzc zzcVar = new zzc((Intent) fVar.f12832b, null);
                    qu quVar = new qu();
                    kz kzVarA = ((i80) wi0Var.f10198c).a(new ep(kr0Var, fr0Var, (String) null), new p80(new ul(quVar), 18, obj2));
                    quVar.b(new AdOverlayInfoParcel(zzcVar, null, (l50) kzVarA.G.zzb(), null, new VersionInfoParcel(0, 0, false), null, null));
                    ((er0) wi0Var.f10200e).c(2, 3);
                    return tc1.d0(kzVarA.q0());
                } catch (Throwable th) {
                    zzm.zzh("Error in CustomTabsAdRenderer", th);
                    throw th;
                }
            case 5:
                return ((li0) this.f5350c).c((fr0) this.f5351d, (kr0) this.f5352e, (p80) this.f5349b);
            case 6:
                wj0 wj0Var = (wj0) this.f5350c;
                fr0 fr0Var2 = (fr0) this.f5351d;
                kr0 kr0Var2 = (kr0) this.f5352e;
                ci0 ci0Var = (ci0) this.f5349b;
                bt0 bt0VarD = tc1.d(wj0Var.f10210j, 12);
                bt0VarD.v(fr0Var2.E);
                bt0VarD.zzi();
                n5.a aVarR0 = tc1.r0(ci0Var.a(kr0Var2, fr0Var2), fr0Var2.R, TimeUnit.MILLISECONDS, wj0Var.f10206f);
                wj0Var.f10208h.b(kr0Var2, fr0Var2, aVarR0, wj0Var.f10203c);
                tc1.b0(aVarR0, wj0Var.f10211k, bt0VarD, false);
                return aVarR0;
            case 7:
                return ((li0) this.f5350c).c((fr0) this.f5351d, (kr0) this.f5352e, (p80) this.f5349b);
            default:
                ps0 ps0Var = (ps0) this.f5350c;
                aa aaVar = (aa) this.f5351d;
                ep epVar = (ep) this.f5352e;
                bq0 bq0Var = (bq0) this.f5349b;
                es0 es0Var = (es0) obj;
                synchronized (ps0Var) {
                    try {
                        ps0Var.f7963d = true;
                        es0Var.f4285a = ((zp0) ((nq0) aaVar.f2626b)).f11288a;
                        if (ps0Var.f7962c) {
                            m21VarD0 = tc1.d0(new ls0(es0Var, bq0Var));
                        } else {
                            epVar.t(bq0Var.f3077g, es0Var);
                            m21VarD0 = tc1.d0(null);
                        }
                    } finally {
                    }
                }
                return m21VarD0;
        }
    }

    public /* synthetic */ hn(n00 n00Var, Uri.Builder builder, String str, InputEvent inputEvent) {
        this.f5348a = 1;
        this.f5350c = n00Var;
        this.f5351d = builder;
        this.f5349b = str;
        this.f5352e = inputEvent;
    }

    public /* synthetic */ hn(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f5348a = i10;
        this.f5350c = obj;
        this.f5351d = obj2;
        this.f5352e = obj3;
        this.f5349b = obj4;
    }
}
