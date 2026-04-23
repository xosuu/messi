package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzu;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qr implements gx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8268b;

    public /* synthetic */ qr(int i10, Object obj) {
        this.f8267a = i10;
        this.f8268b = obj;
    }

    @Override // com.google.android.gms.internal.ads.gx0
    public final Object apply(Object obj) {
        String str;
        boolean z9;
        String strZzm;
        float f10;
        int i10;
        int i11;
        int i12;
        DisplayMetrics displayMetrics;
        int i13 = this.f8267a;
        int i14 = 0;
        int i15 = -1;
        String str2 = null;
        Object obj2 = this.f8268b;
        switch (i13) {
            case 0:
                rr rrVar = (rr) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                rrVar.getClass();
                xf xfVar = eg.f3933a;
                zzba.zzb();
                SharedPreferences sharedPreferencesA = ag.a(rrVar.f8682d);
                if (sharedPreferencesA != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
                    zzba.zza();
                    for (yf yfVar : zzba.zza().f11227a) {
                        if (yfVar.f10864a == 1) {
                            Object objA = yfVar.a(jSONObject);
                            xf xfVar2 = (xf) yfVar;
                            int i16 = xfVar2.f10545e;
                            String str3 = xfVar2.f10865b;
                            switch (i16) {
                                case 0:
                                    editorEdit.putBoolean(str3, ((Boolean) objA).booleanValue());
                                    break;
                                case 1:
                                    editorEdit.putInt(str3, ((Integer) objA).intValue());
                                    break;
                                case 2:
                                    editorEdit.putLong(str3, ((Long) objA).longValue());
                                    break;
                                case 3:
                                    editorEdit.putFloat(str3, ((Float) objA).floatValue());
                                    break;
                                default:
                                    editorEdit.putString(str3, (String) objA);
                                    break;
                            }
                        }
                    }
                    if (jSONObject != null) {
                        editorEdit.putString("flag_configuration", jSONObject.toString());
                    } else {
                        zzm.zzg("Flag Json is null.");
                    }
                    zzba.zzb();
                    editorEdit.commit();
                    SharedPreferences sharedPreferences = rrVar.f8683f;
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                        ((y3.b) zzu.zzB()).getClass();
                        editorEdit2.putLong("js_last_update", System.currentTimeMillis()).apply();
                    }
                }
                return null;
            case 1:
                tb0 tb0Var = (tb0) obj2;
                fx fxVar = (fx) obj;
                fxVar.l0("/result", tb0Var.f9103h);
                ix ixVarG = fxVar.g();
                zzb zzbVar = new zzb(tb0Var.f9098c, null, null);
                lh0 lh0Var = tb0Var.f9104i;
                vt0 vt0Var = tb0Var.f9105j;
                ed0 ed0Var = tb0Var.f9099d;
                ob0 ob0Var = tb0Var.f9096a;
                ixVarG.E(null, ob0Var, ob0Var, ob0Var, ob0Var, false, null, zzbVar, null, null, lh0Var, vt0Var, ed0Var, null, null, null, null, null, null);
                return fxVar;
            case 2:
                ug0 ug0Var = (ug0) obj2;
                rk0.b(ug0Var.f9474c, (JSONObject) obj);
                return ug0Var;
            case 3:
                return ((m10) obj2).q0();
            case 4:
                im0 im0Var = (im0) obj2;
                or0 or0Var = (or0) im0Var.f5642c;
                zzq zzqVar = or0Var.f7645e;
                zzq[] zzqVarArr = zzqVar.zzg;
                if (zzqVarArr == null) {
                    String str4 = zzqVar.zza;
                    z9 = zzqVar.zzi;
                    str = str4;
                } else {
                    String str5 = null;
                    boolean z10 = false;
                    boolean z11 = false;
                    boolean z12 = false;
                    for (zzq zzqVar2 : zzqVarArr) {
                        boolean z13 = zzqVar2.zzi;
                        if (!z13 && !z10) {
                            str5 = zzqVar2.zza;
                            z10 = true;
                        }
                        if (z13) {
                            if (z11) {
                                z11 = true;
                            } else {
                                z11 = true;
                                z12 = true;
                            }
                        }
                        if (z10 && z11) {
                            str = str5;
                            z9 = z12;
                        }
                    }
                    str = str5;
                    z9 = z12;
                }
                Resources resources = ((Context) im0Var.f5643d).getResources();
                if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                    strZzm = null;
                    f10 = 0.0f;
                    i10 = 0;
                    i11 = 0;
                } else {
                    gu guVar = (gu) im0Var.f5644e;
                    float f11 = displayMetrics.density;
                    int i17 = displayMetrics.widthPixels;
                    int i18 = displayMetrics.heightPixels;
                    strZzm = guVar.d().zzm();
                    i11 = i18;
                    i10 = i17;
                    f10 = f11;
                }
                StringBuilder sb = new StringBuilder();
                zzq[] zzqVarArr2 = zzqVar.zzg;
                if (zzqVarArr2 != null) {
                    boolean z14 = false;
                    for (zzq zzqVar3 : zzqVarArr2) {
                        if (zzqVar3.zzi) {
                            z14 = true;
                        } else {
                            if (sb.length() != 0) {
                                sb.append("|");
                            }
                            int i19 = zzqVar3.zze;
                            if (i19 == -1) {
                                i19 = f10 != 0.0f ? (int) (zzqVar3.zzf / f10) : -1;
                            }
                            sb.append(i19);
                            sb.append("x");
                            int i20 = zzqVar3.zzb;
                            if (i20 == -2) {
                                i20 = f10 != 0.0f ? (int) (zzqVar3.zzc / f10) : -2;
                            }
                            sb.append(i20);
                        }
                    }
                    if (z14) {
                        if (sb.length() != 0) {
                            i12 = 0;
                            sb.insert(0, "|");
                        } else {
                            i12 = 0;
                        }
                        sb.insert(i12, "320x50");
                    }
                }
                return new jm0(zzqVar, str, z9, sb.toString(), f10, i10, i11, strZzm, or0Var.f7657q);
            case 5:
                ((gu) ((xl0) obj2).f10601d).i("AppSetIdInfoSignal", (Exception) obj);
                return new vm0(str2, i15, i14);
            case 6:
                ((gu) ((hm0) obj2).f5345b).i("AppSetIdInfoGmscoreSignal", (Exception) obj);
                return new vm0(str2, i15, 2);
            case 7:
                ((gu) ((hm0) obj2).f5345b).i("AttestationTokenSignal", (Exception) obj);
                return null;
            case 8:
                ((pp0) obj2).f7938a.i("TrustlessTokenSignal", (Exception) obj);
                return null;
            default:
                es0 es0Var = (es0) obj2;
                es0Var.f4287c = (r20) obj;
                return es0Var;
        }
    }
}
