package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class xg0 implements rs0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f10551f = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bt0 f10553b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft0 f10554d;

    public xg0(String str, ft0 ft0Var, bt0 bt0Var) {
        this.f10552a = str;
        this.f10554d = ft0Var;
        this.f10553b = bt0Var;
    }

    @Override // com.google.android.gms.internal.ads.rs0
    public final Object zza(Object obj) throws zzdwl {
        zzdwl zzdwlVar;
        String strConcat;
        wg0 wg0Var = (wg0) obj;
        int iOptInt = wg0Var.f10180a.optInt("http_timeout_millis", DateTimeConstants.MILLIS_PER_MINUTE);
        tr trVar = wg0Var.f10181b;
        int i10 = trVar.f9265g;
        bt0 bt0Var = this.f10553b;
        ft0 ft0Var = this.f10554d;
        String strJoin = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (i10 != -2) {
            if (i10 == 1) {
                List list = trVar.f9259a;
                if (list != null) {
                    strJoin = TextUtils.join(", ", list);
                    zzm.zzg(strJoin);
                }
                zzdwlVar = new zzdwl(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzdwlVar = new zzdwl(1);
            }
            bt0Var.e(zzdwlVar);
            bt0Var.x(false);
            ft0Var.a(bt0Var);
            throw zzdwlVar;
        }
        HashMap map = new HashMap();
        if (trVar.f9263e) {
            String str = this.f10552a;
            if (!TextUtils.isEmpty(str)) {
                if (((Boolean) zzba.zzc().a(eg.G0)).booleanValue()) {
                    if (TextUtils.isEmpty(str)) {
                        strConcat = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } else {
                        Matcher matcher = f10551f.matcher(str);
                        strConcat = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            if (strGroup != null) {
                                Locale locale = Locale.ROOT;
                                if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(strConcat)) {
                                        strConcat = strConcat.concat("; ");
                                    }
                                    strConcat = strConcat.concat(strGroup);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strConcat)) {
                        map.put("Cookie", strConcat);
                    }
                } else {
                    map.put("Cookie", str);
                }
            }
        }
        if (trVar.f9262d) {
            rk0.b(map, wg0Var.f10180a);
        }
        String str2 = trVar.f9261c;
        if (!TextUtils.isEmpty(str2)) {
            strJoin = str2;
        }
        bt0Var.x(true);
        ft0Var.a(bt0Var);
        return new ug0(trVar.f9264f, iOptInt, map, strJoin.getBytes(fx0.f4681c), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, trVar.f9262d);
    }
}
