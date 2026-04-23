package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class mb0 extends pb implements gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n90 f6895b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w90 f6896d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i90 f6897f;

    public mb0(Context context, n90 n90Var, w90 w90Var, i90 i90Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        this.f6894a = context;
        this.f6895b = n90Var;
        this.f6896d = w90Var;
        this.f6897f = i90Var;
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final String P0(String str) {
        s.k kVar;
        n90 n90Var = this.f6895b;
        synchronized (n90Var) {
            kVar = n90Var.f7220w;
        }
        return (String) kVar.getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final void Y0(String str) {
        i90 i90Var = this.f6897f;
        if (i90Var != null) {
            synchronized (i90Var) {
                i90Var.f5531l.l(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        n90 n90Var = this.f6895b;
        switch (i10) {
            case 1:
                String string = parcel.readString();
                qb.b(parcel);
                String strP0 = P0(string);
                parcel2.writeNoException();
                parcel2.writeString(strP0);
                return true;
            case 2:
                String string2 = parcel.readString();
                qb.b(parcel);
                pi piVarO = o(string2);
                parcel2.writeNoException();
                qb.e(parcel2, piVarO);
                return true;
            case 3:
                List<String> listZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzk);
                return true;
            case 4:
                String strA = n90Var.a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case 5:
                String string3 = parcel.readString();
                qb.b(parcel);
                Y0(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarG = n90Var.G();
                parcel2.writeNoException();
                qb.e(parcel2, zzdqVarG);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                a4.a aVarZzh = zzh();
                parcel2.writeNoException();
                qb.e(parcel2, aVarZzh);
                return true;
            case 10:
                a4.a aVarT = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                boolean zN = n(aVarT);
                parcel2.writeNoException();
                parcel2.writeInt(zN ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                qb.e(parcel2, null);
                return true;
            case 12:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                ClassLoader classLoader = qb.f8146a;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 13:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                ClassLoader classLoader2 = qb.f8146a;
                parcel2.writeInt(zZzt ? 1 : 0);
                return true;
            case 14:
                a4.a aVarT2 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                s1(aVarT2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                ni niVarZzf = zzf();
                parcel2.writeNoException();
                qb.e(parcel2, niVarZzf);
                return true;
            case 17:
                a4.a aVarT3 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                boolean zR = r(aVarT3);
                parcel2.writeNoException();
                parcel2.writeInt(zR ? 1 : 0);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final boolean n(a4.a aVar) {
        w90 w90Var;
        Object objA0 = a4.b.a0(aVar);
        if (!(objA0 instanceof ViewGroup) || (w90Var = this.f6896d) == null || !w90Var.c((ViewGroup) objA0, true)) {
            return false;
        }
        this.f6895b.O().i0(new p80(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final pi o(String str) {
        s.k kVar;
        n90 n90Var = this.f6895b;
        synchronized (n90Var) {
            kVar = n90Var.f7219v;
        }
        return (pi) kVar.getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final boolean r(a4.a aVar) {
        w90 w90Var;
        Object objA0 = a4.b.a0(aVar);
        if (!(objA0 instanceof ViewGroup) || (w90Var = this.f6896d) == null || !w90Var.c((ViewGroup) objA0, false)) {
            return false;
        }
        this.f6895b.M().i0(new p80(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final void s1(a4.a aVar) {
        i90 i90Var;
        Object objA0 = a4.b.a0(aVar);
        if (!(objA0 instanceof View) || this.f6895b.Q() == null || (i90Var = this.f6897f) == null) {
            return;
        }
        i90Var.f((View) objA0);
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final ni zzf() {
        try {
            return this.f6897f.C.a();
        } catch (NullPointerException e10) {
            zzu.zzo().i("InternalNativeCustomTemplateAdShim.getMediaContent", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final a4.a zzh() {
        return new a4.b(this.f6894a);
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final String zzi() {
        return this.f6895b.a();
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final List zzk() {
        s.k kVar;
        n90 n90Var = this.f6895b;
        try {
            synchronized (n90Var) {
                kVar = n90Var.f7219v;
            }
            s.k kVarF = n90Var.F();
            String[] strArr = new String[kVar.f16626d + kVarF.f16626d];
            int i10 = 0;
            for (int i11 = 0; i11 < kVar.f16626d; i11++) {
                strArr[i10] = (String) kVar.h(i11);
                i10++;
            }
            for (int i12 = 0; i12 < kVarF.f16626d; i12++) {
                strArr[i10] = (String) kVarF.h(i12);
                i10++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e10) {
            zzu.zzo().i("InternalNativeCustomTemplateAdShim.getAvailableAssetNames", e10);
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final void zzl() {
        i90 i90Var = this.f6897f;
        if (i90Var != null) {
            i90Var.v();
        }
        this.f6897f = null;
        this.f6896d = null;
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final void zzm() {
        String str;
        try {
            n90 n90Var = this.f6895b;
            synchronized (n90Var) {
                str = n90Var.f7222y;
            }
            if (Objects.equals(str, "Google")) {
                zzm.zzj("Illegal argument specified for omid partner name.");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                zzm.zzj("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            i90 i90Var = this.f6897f;
            if (i90Var != null) {
                i90Var.w(str, false);
            }
        } catch (NullPointerException e10) {
            zzu.zzo().i("InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final void zzo() {
        i90 i90Var = this.f6897f;
        if (i90Var != null) {
            synchronized (i90Var) {
                if (!i90Var.f5542w) {
                    i90Var.f5531l.zzr();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final boolean zzq() {
        i90 i90Var = this.f6897f;
        if (i90Var != null && !i90Var.f5533n.c()) {
            return false;
        }
        n90 n90Var = this.f6895b;
        return n90Var.N() != null && n90Var.O() == null;
    }

    @Override // com.google.android.gms.internal.ads.gj
    public final boolean zzt() {
        n90 n90Var = this.f6895b;
        zh0 zh0VarQ = n90Var.Q();
        if (zh0VarQ == null) {
            zzm.zzj("Trying to start OMID session before creation.");
            return false;
        }
        ((k70) zzu.zzA()).e(zh0VarQ.f11241a);
        if (n90Var.N() == null) {
            return true;
        }
        n90Var.N().j("onSdkLoaded", new s.b());
        return true;
    }
}
