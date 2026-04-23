package n3;

import android.accounts.Account;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import b7.u;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zzak;
import com.google.android.gms.ads.nonagon.signalgeneration.zzay;
import com.google.android.gms.internal.ads.bt0;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.eh;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.ft0;
import com.google.android.gms.internal.ads.k21;
import com.google.android.gms.internal.ads.rt;
import com.google.android.gms.internal.ads.zzbyq;
import f7.q;
import f7.z;
import org.json.JSONException;
import org.json.JSONObject;
import t3.i;
import v3.g;

/* JADX INFO: loaded from: classes.dex */
public final class b implements k21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f15930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15931b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f15932d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f15933f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f15934h;

    public b(int i10) {
        if (i10 != 3) {
            this.f15934h = i4.a.f14173b;
        } else {
            this.f15931b = "GET";
            this.f15932d = new f7.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.k21
    public final void E(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) zzba.zzc().a(eg.T6)).booleanValue()) {
            zzu.zzo().h("SignalGeneratorImpl.generateSignals", th);
        } else {
            zzu.zzo().i("SignalGeneratorImpl.generateSignals", th);
        }
        ft0 ft0VarD1 = zzak.D1((n5.a) this.f15930a, (zzbyq) this.f15931b);
        if (((Boolean) eh.f4205e.k()).booleanValue() && ft0VarD1 != null) {
            bt0 bt0Var = (bt0) this.f15933f;
            bt0Var.e(th);
            bt0Var.x(false);
            ft0VarD1.a(bt0Var);
            ft0VarD1.h();
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            ((rt) this.f15932d).zzb(message);
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.k21, com.google.android.gms.internal.ads.pl0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo4a(Object obj) {
        zzay zzayVar = (zzay) obj;
        ft0 ft0VarD1 = zzak.D1((n5.a) this.f15930a, (zzbyq) this.f15931b);
        ((zzak) this.f15934h).N.set(true);
        if (!((Boolean) zzba.zzc().a(eg.O6)).booleanValue()) {
            try {
                ((rt) this.f15932d).zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e10) {
                zzm.zzg("QueryInfo generation has been disabled.".concat(e10.toString()));
            }
            if (!((Boolean) eh.f4205e.k()).booleanValue() || ft0VarD1 == null) {
                return;
            }
            bt0 bt0Var = (bt0) this.f15933f;
            bt0Var.i("QueryInfo generation has been disabled.");
            bt0Var.x(false);
            ft0VarD1.a(bt0Var);
            ft0VarD1.h();
            return;
        }
        try {
            try {
                if (zzayVar == null) {
                    ((rt) this.f15932d).t1(null, null, null);
                    ((bt0) this.f15933f).x(true);
                    if (!((Boolean) eh.f4205e.k()).booleanValue() || ft0VarD1 == null) {
                        return;
                    }
                    ft0VarD1.a((bt0) this.f15933f);
                    ft0VarD1.h();
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(zzayVar.zzb).optString("request_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED))) {
                        zzm.zzj("The request ID is empty in request JSON.");
                        ((rt) this.f15932d).zzb("Internal error: request ID is empty in request JSON.");
                        bt0 bt0Var2 = (bt0) this.f15933f;
                        bt0Var2.i("Request ID empty");
                        bt0Var2.x(false);
                        if (!((Boolean) eh.f4205e.k()).booleanValue() || ft0VarD1 == null) {
                            return;
                        }
                        ft0VarD1.a((bt0) this.f15933f);
                        ft0VarD1.h();
                        return;
                    }
                    Bundle bundle = zzayVar.zzd;
                    zzak zzakVar = (zzak) this.f15934h;
                    if (zzakVar.B && bundle != null && bundle.getInt(zzakVar.D, -1) == -1) {
                        zzak zzakVar2 = (zzak) this.f15934h;
                        bundle.putInt(zzakVar2.D, zzakVar2.E.get());
                    }
                    zzak zzakVar3 = (zzak) this.f15934h;
                    if (zzakVar3.A && bundle != null && TextUtils.isEmpty(bundle.getString(zzakVar3.C))) {
                        if (TextUtils.isEmpty(((zzak) this.f15934h).G)) {
                            zzak zzakVar4 = (zzak) this.f15934h;
                            zzt zztVarZzp = zzu.zzp();
                            zzak zzakVar5 = (zzak) this.f15934h;
                            zzakVar4.G = zztVarZzp.zzc(zzakVar5.f2357b, zzakVar5.F.afmaVersion);
                        }
                        zzak zzakVar6 = (zzak) this.f15934h;
                        bundle.putString(zzakVar6.C, zzakVar6.G);
                    }
                    ((rt) this.f15932d).t1(zzayVar.zza, bundle, zzayVar.zzb);
                    ((bt0) this.f15933f).x(true);
                    if (!((Boolean) eh.f4205e.k()).booleanValue() || ft0VarD1 == null) {
                        return;
                    }
                    ft0VarD1.a((bt0) this.f15933f);
                    ft0VarD1.h();
                } catch (JSONException e11) {
                    zzm.zzj("Failed to create JSON object from the request string.");
                    ((rt) this.f15932d).zzb("Internal error for request JSON: " + e11.toString());
                    bt0 bt0Var3 = (bt0) this.f15933f;
                    bt0Var3.e(e11);
                    bt0Var3.x(false);
                    zzu.zzo().i("SignalGeneratorImpl.generateSignals.onSuccess", e11);
                    if (!((Boolean) eh.f4205e.k()).booleanValue() || ft0VarD1 == null) {
                        return;
                    }
                    ft0VarD1.a((bt0) this.f15933f);
                    ft0VarD1.h();
                }
            } catch (Throwable th) {
                if (((Boolean) eh.f4205e.k()).booleanValue() && ft0VarD1 != null) {
                    ft0VarD1.a((bt0) this.f15933f);
                    ft0VarD1.h();
                }
                throw th;
            }
        } catch (RemoteException e12) {
            bt0 bt0Var4 = (bt0) this.f15933f;
            bt0Var4.e(e12);
            bt0Var4.x(false);
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e12);
            zzu.zzo().i("SignalGeneratorImpl.generateSignals.onSuccess", e12);
            if (!((Boolean) eh.f4205e.k()).booleanValue() || ft0VarD1 == null) {
                return;
            }
            ft0VarD1.a((bt0) this.f15933f);
            ft0VarD1.h();
        }
    }

    public final z b() {
        if (((q) this.f15930a) != null) {
            return new z(this);
        }
        throw new IllegalStateException("url == null");
    }

    public final g c() {
        return new g((Account) this.f15930a, (s.c) this.f15931b, (String) this.f15932d, (String) this.f15933f, (i4.a) this.f15934h);
    }

    public final void d(f7.d dVar) {
        String string = dVar.toString();
        if (string.isEmpty()) {
            g("Cache-Control");
        } else {
            e("Cache-Control", string);
        }
    }

    public final void e(String str, String str2) {
        f7.e eVar = (f7.e) this.f15932d;
        eVar.getClass();
        f7.e.b(str, str2);
        eVar.c(str);
        eVar.a(str, str2);
    }

    public final void f(String str, i iVar) {
        if (str.length() == 0) {
            throw new IllegalArgumentException("method.length() == 0");
        }
        if (iVar != null && !u.x(str)) {
            throw new IllegalArgumentException(fb1.i("method ", str, " must not have a request body."));
        }
        if (iVar == null && (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT"))) {
            throw new IllegalArgumentException(fb1.i("method ", str, " must have a request body."));
        }
        this.f15931b = str;
        this.f15933f = iVar;
    }

    public final void g(String str) {
        ((f7.e) this.f15932d).c(str);
    }

    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("url == null");
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:" + str.substring(4);
        }
        z5.b bVar = new z5.b(1);
        q qVarA = bVar.d(null, str) == 1 ? bVar.a() : null;
        if (qVarA == null) {
            throw new IllegalArgumentException("unexpected url: ".concat(str));
        }
        this.f15930a = qVarA;
    }
}
