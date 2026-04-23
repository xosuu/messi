package h4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.measurement.zzcl;
import g4.a0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f13962h = "am";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f13963q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f13964s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f13965t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f13966u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r rVar, String str, Context context, Bundle bundle) {
        super(rVar, true);
        this.f13966u = rVar;
        this.f13963q = str;
        this.f13964s = context;
        this.f13965t = bundle;
    }

    @Override // h4.o
    public final void a() {
        boolean z9;
        String str;
        String str2;
        String str3;
        try {
            String str4 = this.f13962h;
            if (this.f13963q == null || str4 == null) {
                z9 = false;
            } else {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                    z9 = false;
                } catch (ClassNotFoundException unused) {
                    z9 = true;
                }
            }
            e cVar = null;
            if (z9) {
                str3 = this.f13963q;
                str2 = this.f13962h;
                str = this.f13966u.f14000a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            z3.a.l(this.f13964s);
            r rVar = this.f13966u;
            Context context = this.f13964s;
            rVar.getClass();
            try {
                IBinder iBinderB = b4.d.c(context, b4.d.f1313c, "com.google.android.gms.measurement.dynamite").b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService");
                int i10 = d.f13953b;
                if (iBinderB != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
                    cVar = iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new c(iBinderB);
                }
            } catch (DynamiteModule$LoadingException e10) {
                rVar.a(e10, true, false);
            }
            rVar.f14007h = cVar;
            if (this.f13966u.f14007h == null) {
                String str5 = this.f13966u.f14000a;
                return;
            }
            int iA = b4.d.a(this.f13964s, "com.google.android.gms.measurement.dynamite");
            zzcl zzclVar = new zzcl(61000L, Math.max(iA, r0), b4.d.d(this.f13964s, "com.google.android.gms.measurement.dynamite", false) < iA, str, str2, str3, this.f13965t, a0.F(this.f13964s));
            e eVar = this.f13966u.f14007h;
            z3.a.l(eVar);
            a4.b bVar = new a4.b(this.f13964s);
            long j10 = this.f13991a;
            c cVar2 = (c) eVar;
            Parcel parcelM = cVar2.m();
            a.b(parcelM, bVar);
            a.a(parcelM, zzclVar);
            parcelM.writeLong(j10);
            cVar2.t(parcelM, 1);
        } catch (Exception e11) {
            this.f13966u.a(e11, true, false);
        }
    }
}
