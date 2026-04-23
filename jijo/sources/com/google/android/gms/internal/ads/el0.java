package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class el0 extends com.google.android.gms.ads.internal.client.zzbp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gy f4233b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nr0 f4234d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l.b4 f4235f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zzbh f4236h;

    public el0(zy zyVar, Context context, String str) {
        nr0 nr0Var = new nr0();
        this.f4234d = nr0Var;
        this.f4235f = new l.b4();
        this.f4233b = zyVar;
        nr0Var.f7360c = str;
        this.f4232a = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() {
        l.b4 b4Var = this.f4235f;
        b4Var.getClass();
        r90 r90Var = new r90(b4Var);
        ArrayList arrayList = new ArrayList();
        if (r90Var.f8539c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (r90Var.f8537a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (r90Var.f8538b != null) {
            arrayList.add(Integer.toString(2));
        }
        s.k kVar = r90Var.f8542f;
        if (!kVar.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (r90Var.f8541e != null) {
            arrayList.add(Integer.toString(7));
        }
        nr0 nr0Var = this.f4234d;
        nr0Var.f7363f = arrayList;
        ArrayList arrayList2 = new ArrayList(kVar.f16626d);
        for (int i10 = 0; i10 < kVar.f16626d; i10++) {
            arrayList2.add((String) kVar.h(i10));
        }
        nr0Var.f7364g = arrayList2;
        if (nr0Var.f7359b == null) {
            nr0Var.f7359b = zzq.zzc();
        }
        return new fl0(this.f4232a, this.f4233b, this.f4234d, r90Var, this.f4236h);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(jj jjVar) {
        this.f4235f.f14810b = jjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(lj ljVar) {
        this.f4235f.f14809a = ljVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, rj rjVar, oj ojVar) {
        l.b4 b4Var = this.f4235f;
        ((s.k) b4Var.f14814q).put(str, rjVar);
        if (ojVar != null) {
            ((s.k) b4Var.f14815s).put(str, ojVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(fm fmVar) {
        this.f4235f.f14813h = fmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(uj ujVar, zzq zzqVar) {
        this.f4235f.f14812f = ujVar;
        this.f4234d.f7359b = zzqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(xj xjVar) {
        this.f4235f.f14811d = xjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(zzbh zzbhVar) {
        this.f4236h = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        nr0 nr0Var = this.f4234d;
        nr0Var.f7367j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            nr0Var.f7362e = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzblh zzblhVar) {
        nr0 nr0Var = this.f4234d;
        nr0Var.f7371n = zzblhVar;
        nr0Var.f7361d = new zzfk(false, true, false);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbes zzbesVar) {
        this.f4234d.f7365h = zzbesVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        nr0 nr0Var = this.f4234d;
        nr0Var.f7368k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            nr0Var.f7362e = publisherAdViewOptions.zzc();
            nr0Var.f7369l = publisherAdViewOptions.zza();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcf zzcfVar) {
        this.f4234d.f7378u = zzcfVar;
    }
}
