package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class nj0 implements ci0 {
    @Override // com.google.android.gms.internal.ads.ci0
    public final n5.a a(kr0 kr0Var, fr0 fr0Var) {
        String strOptString = fr0Var.f4642v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        or0 or0Var = (or0) kr0Var.f6382a.f6060b;
        nr0 nr0Var = new nr0();
        nr0Var.f7372o.f1331b = or0Var.f7655o.f1331b;
        zzl zzlVar = or0Var.f7644d;
        nr0Var.f7358a = zzlVar;
        nr0Var.f7359b = or0Var.f7645e;
        nr0Var.f7378u = or0Var.f7660t;
        nr0Var.f7360c = or0Var.f7646f;
        nr0Var.f7361d = or0Var.f7641a;
        nr0Var.f7363f = or0Var.f7647g;
        nr0Var.f7364g = or0Var.f7648h;
        nr0Var.f7365h = or0Var.f7649i;
        nr0Var.f7366i = or0Var.f7650j;
        AdManagerAdViewOptions adManagerAdViewOptions = or0Var.f7652l;
        nr0Var.f7367j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            nr0Var.f7362e = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        PublisherAdViewOptions publisherAdViewOptions = or0Var.f7653m;
        nr0Var.f7368k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            nr0Var.f7362e = publisherAdViewOptions.zzc();
            nr0Var.f7369l = publisherAdViewOptions.zza();
        }
        nr0Var.f7373p = or0Var.f7656p;
        nr0Var.f7374q = or0Var.f7657q;
        nr0Var.f7375r = or0Var.f7643c;
        nr0Var.f7376s = or0Var.f7658r;
        nr0Var.f7377t = or0Var.f7659s;
        nr0Var.f7360c = strOptString;
        Bundle bundle = zzlVar.zzm;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        Bundle bundle4 = bundle3 == null ? new Bundle() : new Bundle(bundle3);
        bundle4.putInt("gw", 1);
        JSONObject jSONObject = fr0Var.f4642v;
        String strOptString2 = jSONObject.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundle4.putString("mad_hac", strOptString2);
        }
        String strOptString3 = jSONObject.optString("adJson", null);
        if (strOptString3 != null) {
            bundle4.putString("_ad", strOptString3);
        }
        bundle4.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = fr0Var.D;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = jSONObject2.optString(next, null);
            if (next != null) {
                bundle4.putString(next, strOptString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        Bundle bundle5 = zzlVar.zzn;
        List list = zzlVar.zzo;
        String str = zzlVar.zzp;
        String str2 = zzlVar.zzq;
        int i10 = zzlVar.zzd;
        boolean z9 = zzlVar.zzr;
        List list2 = zzlVar.zze;
        zzc zzcVar = zzlVar.zzs;
        boolean z10 = zzlVar.zzf;
        int i11 = zzlVar.zzt;
        int i12 = zzlVar.zzg;
        String str3 = zzlVar.zzu;
        boolean z11 = zzlVar.zzh;
        List list3 = zzlVar.zzv;
        Bundle bundle6 = bundle2;
        nr0Var.f7358a = new zzl(zzlVar.zza, zzlVar.zzb, bundle4, i10, list2, z10, i12, z11, zzlVar.zzi, zzlVar.zzj, zzlVar.zzk, zzlVar.zzl, bundle6, bundle5, list, str, str2, z9, zzcVar, i11, str3, list3, zzlVar.zzw, zzlVar.zzx, zzlVar.zzy, zzlVar.zzz);
        or0 or0VarA = nr0Var.a();
        Bundle bundle7 = new Bundle();
        hr0 hr0Var = (hr0) kr0Var.f6383b.f10631d;
        Bundle bundle8 = new Bundle();
        bundle8.putStringArrayList("nofill_urls", new ArrayList<>(hr0Var.f5370a));
        bundle8.putInt("refresh_interval", hr0Var.f5372c);
        bundle8.putString("gws_query_id", hr0Var.f5371b);
        bundle7.putBundle("parent_common_config", bundle8);
        or0 or0Var2 = (or0) kr0Var.f6382a.f6060b;
        Bundle bundle9 = new Bundle();
        bundle9.putString("initial_ad_unit_id", or0Var2.f7646f);
        bundle9.putString("allocation_id", fr0Var.f4644w);
        bundle9.putString("ad_source_name", fr0Var.F);
        bundle9.putStringArrayList("click_urls", new ArrayList<>(fr0Var.f4604c));
        bundle9.putStringArrayList("imp_urls", new ArrayList<>(fr0Var.f4606d));
        bundle9.putStringArrayList("manual_tracking_urls", new ArrayList<>(fr0Var.f4630p));
        bundle9.putStringArrayList("fill_urls", new ArrayList<>(fr0Var.f4624m));
        bundle9.putStringArrayList("video_start_urls", new ArrayList<>(fr0Var.f4612g));
        bundle9.putStringArrayList("video_reward_urls", new ArrayList<>(fr0Var.f4614h));
        bundle9.putStringArrayList("video_complete_urls", new ArrayList<>(fr0Var.f4616i));
        bundle9.putString("transaction_id", fr0Var.f4618j);
        bundle9.putString("valid_from_timestamp", fr0Var.f4620k);
        bundle9.putBoolean("is_closable_area_disabled", fr0Var.P);
        bundle9.putString("recursive_server_response_data", fr0Var.f4629o0);
        zzbvz zzbvzVar = fr0Var.f4622l;
        if (zzbvzVar != null) {
            Bundle bundle10 = new Bundle();
            bundle10.putInt("rb_amount", zzbvzVar.f11590b);
            bundle10.putString("rb_type", zzbvzVar.f11589a);
            bundle9.putParcelableArray("rewards", new Bundle[]{bundle10});
        }
        bundle7.putBundle("parent_ad_config", bundle9);
        return c(or0VarA, bundle7, fr0Var, kr0Var);
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final boolean b(kr0 kr0Var, fr0 fr0Var) {
        return !TextUtils.isEmpty(fr0Var.f4642v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
    }

    public abstract ts0 c(or0 or0Var, Bundle bundle, fr0 fr0Var, kr0 kr0Var);
}
