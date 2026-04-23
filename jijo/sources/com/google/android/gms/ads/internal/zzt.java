package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import b2.h;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.internal.ads.es;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.nq;
import com.google.android.gms.internal.ads.nu;
import com.google.android.gms.internal.ads.og;
import com.google.android.gms.internal.ads.pq;
import com.google.android.gms.internal.ads.uc;
import com.google.android.gms.internal.ads.y9;
import com.google.android.gms.internal.ads.yg;
import i3.b;
import java.util.Iterator;
import java.util.Map;
import l.j2;
import l.u;
import n5.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzt extends zzbt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VersionInfoParcel f2236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.ads.internal.client.zzq f2237b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f2238d = nu.f7383a.b(new h(1, this));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f2239f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f2240h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WebView f2241q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public zzbh f2242s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public y9 f2243t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AsyncTask f2244u;

    public zzt(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, VersionInfoParcel versionInfoParcel) {
        this.f2239f = context;
        this.f2236a = versionInfoParcel;
        this.f2237b = zzqVar;
        this.f2241q = new WebView(context);
        this.f2240h = new u(context, str);
        u1(0);
        this.f2241q.setVerticalScrollBarEnabled(false);
        this.f2241q.getSettings().setJavaScriptEnabled(true);
        this.f2241q.setWebViewClient(new i3.a(0, this));
        this.f2241q.setOnTouchListener(new j2(1, this));
    }

    public final void u1(int i10) {
        if (this.f2241q == null) {
            return;
        }
        this.f2241q.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() {
        z3.a.j("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) {
        this.f2242s = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(uc ucVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzciVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzduVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z9) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(nq nqVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z9) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(og ogVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(pq pqVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(es esVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfk zzfkVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(a4.a aVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzab(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Object obj;
        z3.a.m(this.f2241q, "This Search Ad has already been torn down");
        u uVar = this.f2240h;
        uVar.getClass();
        uVar.f15009f = zzlVar.zzj.zza;
        Bundle bundle = zzlVar.zzm;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) yg.f10872c.k();
            Iterator<String> it = bundle2.keySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                obj = uVar.f15008d;
                if (!zHasNext) {
                    break;
                }
                String next = it.next();
                if (str.equals(next)) {
                    uVar.f15010h = bundle2.getString(next);
                } else if (next.startsWith("csa_")) {
                    ((Map) obj).put(next.substring(4), bundle2.getString(next));
                }
            }
            Map map = (Map) obj;
            map.put("SDKVersion", this.f2236a.afmaVersion);
            if (((Boolean) yg.f10870a.k()).booleanValue()) {
                Bundle bundleZzb = zzad.zzb((Context) uVar.f15006a, (String) yg.f10871b.k());
                for (String str2 : bundleZzb.keySet()) {
                    map.put(str2, bundleZzb.get(str2).toString());
                }
            }
        }
        this.f2244u = new b(this).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzac(zzcf zzcfVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return this.f2237b;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdn zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final a4.a zzn() {
        z3.a.j("getAdFrame must be called on the main UI thread.");
        return new a4.b(this.f2241q);
    }

    public final String zzq() {
        String str = (String) this.f2240h.f15010h;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        return fb1.i("https://", str, (String) yg.f10873d.k());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() {
        z3.a.j("destroy must be called on the main UI thread.");
        this.f2244u.cancel(true);
        this.f2238d.cancel(false);
        this.f2241q.destroy();
        this.f2241q = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() {
        z3.a.j("pause must be called on the main UI thread.");
    }
}
