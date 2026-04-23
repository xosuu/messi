package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzu;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class et implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f4290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzg f4291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4292d = "-1";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4293e = -1;

    public et(Context context, zzg zzgVar) {
        this.f4290b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f4291c = zzgVar;
        this.f4289a = context;
    }

    public final void a(int i10, String str) {
        Context context;
        boolean z9 = true;
        if (!((Boolean) zzba.zzc().a(eg.f4104q0)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i10 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z9 = false;
        }
        this.f4291c.zzI(z9);
        if (((Boolean) zzba.zzc().a(eg.B5)).booleanValue() && z9 && (context = this.f4289a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (((Boolean) zzba.zzc().a(eg.f4124s0)).booleanValue()) {
                boolean zEquals = Objects.equals(str, "gad_has_consent_for_cookies");
                Context context = this.f4289a;
                zzg zzgVar = this.f4291c;
                if (zEquals) {
                    int i10 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    if (i10 != zzgVar.zzb()) {
                        zzgVar.zzI(true);
                        zzad.zzc(context);
                    }
                    zzgVar.zzF(i10);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    if (!Objects.equals(string, zzgVar.zzp())) {
                        zzgVar.zzI(true);
                        zzad.zzc(context);
                    }
                    zzgVar.zzO(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i11 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String strValueOf = String.valueOf(str);
            if (!strValueOf.equals("gad_has_consent_for_cookies")) {
                if (!strValueOf.equals("IABTCF_PurposeConsents") || string2.equals("-1") || this.f4292d.equals(string2)) {
                    return;
                }
                this.f4292d = string2;
                a(i11, string2);
                return;
            }
            if (!((Boolean) zzba.zzc().a(eg.f4104q0)).booleanValue() || i11 == -1 || this.f4293e == i11) {
                return;
            }
            this.f4293e = i11;
            a(i11, string2);
        } catch (Throwable th) {
            zzu.zzo().i("AdMobPlusIdlessListener.onSharedPreferenceChanged", th);
            zze.zzb("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }
}
