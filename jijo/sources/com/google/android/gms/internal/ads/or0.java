package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzfh;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zzt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class or0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzfk f7641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzblh f7642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kl0 f7643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzl f7644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzq f7645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f7647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f7648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzbes f7649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzw f7650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f7651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AdManagerAdViewOptions f7652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final PublisherAdViewOptions f7653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zzcb f7654n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b4.j f7655o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f7656p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f7657q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f7658r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Bundle f7659s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zzcf f7660t;

    public /* synthetic */ or0(nr0 nr0Var) {
        this.f7645e = nr0Var.f7359b;
        this.f7646f = nr0Var.f7360c;
        this.f7660t = nr0Var.f7378u;
        zzl zzlVar = nr0Var.f7358a;
        int i10 = zzlVar.zza;
        long j10 = zzlVar.zzb;
        Bundle bundle = zzlVar.zzc;
        int i11 = zzlVar.zzd;
        List list = zzlVar.zze;
        boolean z9 = zzlVar.zzf;
        int i12 = zzlVar.zzg;
        boolean z10 = zzlVar.zzh || nr0Var.f7362e;
        String str = zzlVar.zzi;
        zzfh zzfhVar = zzlVar.zzj;
        Location location = zzlVar.zzk;
        String str2 = zzlVar.zzl;
        Bundle bundle2 = zzlVar.zzm;
        Bundle bundle3 = zzlVar.zzn;
        List list2 = zzlVar.zzo;
        String str3 = zzlVar.zzp;
        String str4 = zzlVar.zzq;
        boolean z11 = zzlVar.zzr;
        zzc zzcVar = zzlVar.zzs;
        int i13 = zzlVar.zzt;
        String str5 = zzlVar.zzu;
        List list3 = zzlVar.zzv;
        int iZza = zzt.zza(zzlVar.zzw);
        zzl zzlVar2 = nr0Var.f7358a;
        this.f7644d = new zzl(i10, j10, bundle, i11, list, z9, i12, z10, str, zzfhVar, location, str2, bundle2, bundle3, list2, str3, str4, z11, zzcVar, i13, str5, list3, iZza, zzlVar2.zzx, zzlVar2.zzy, zzlVar2.zzz);
        zzfk zzfkVar = nr0Var.f7361d;
        zzbes zzbesVar = null;
        if (zzfkVar == null) {
            zzbes zzbesVar2 = nr0Var.f7365h;
            zzfkVar = zzbesVar2 != null ? zzbesVar2.f11481q : null;
        }
        this.f7641a = zzfkVar;
        ArrayList arrayList = nr0Var.f7363f;
        this.f7647g = arrayList;
        this.f7648h = nr0Var.f7364g;
        if (arrayList != null && (zzbesVar = nr0Var.f7365h) == null) {
            zzbesVar = new zzbes(new NativeAdOptions.Builder().build());
        }
        this.f7649i = zzbesVar;
        this.f7650j = nr0Var.f7366i;
        this.f7651k = nr0Var.f7370m;
        this.f7652l = nr0Var.f7367j;
        this.f7653m = nr0Var.f7368k;
        this.f7654n = nr0Var.f7369l;
        this.f7642b = nr0Var.f7371n;
        this.f7655o = new b4.j(nr0Var.f7372o);
        this.f7656p = nr0Var.f7373p;
        this.f7657q = nr0Var.f7374q;
        this.f7643c = nr0Var.f7375r;
        this.f7658r = nr0Var.f7376s;
        this.f7659s = nr0Var.f7377t;
    }

    public final ak a() {
        AdManagerAdViewOptions adManagerAdViewOptions = this.f7652l;
        PublisherAdViewOptions publisherAdViewOptions = this.f7653m;
        if (publisherAdViewOptions == null && adManagerAdViewOptions == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : adManagerAdViewOptions.zza();
    }
}
