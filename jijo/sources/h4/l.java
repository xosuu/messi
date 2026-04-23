package h4;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class l extends o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13979h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f13980q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f13981s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f13982t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(r rVar, Object obj, b bVar, int i10) {
        super(rVar, true);
        this.f13979h = i10;
        this.f13980q = rVar;
        this.f13981s = obj;
        this.f13982t = bVar;
    }

    @Override // h4.o
    public final void a() {
        Bundle bundle = null;
        switch (this.f13979h) {
            case 0:
                e eVar = ((r) this.f13980q).f14007h;
                z3.a.l(eVar);
                String str = (String) this.f13981s;
                a4.b bVar = new a4.b(this.f13982t);
                a4.b bVar2 = new a4.b(null);
                a4.b bVar3 = new a4.b(null);
                c cVar = (c) eVar;
                Parcel parcelM = cVar.m();
                parcelM.writeInt(5);
                parcelM.writeString(str);
                a.b(parcelM, bVar);
                a.b(parcelM, bVar2);
                a.b(parcelM, bVar3);
                cVar.t(parcelM, 33);
                break;
            case 1:
                e eVar2 = ((r) this.f13980q).f14007h;
                z3.a.l(eVar2);
                Bundle bundle2 = (Bundle) this.f13981s;
                b bVar4 = (b) this.f13982t;
                long j10 = this.f13991a;
                c cVar2 = (c) eVar2;
                Parcel parcelM2 = cVar2.m();
                a.a(parcelM2, bundle2);
                a.b(parcelM2, bVar4);
                parcelM2.writeLong(j10);
                cVar2.t(parcelM2, 32);
                break;
            case 2:
                e eVar3 = ((r) this.f13980q).f14007h;
                z3.a.l(eVar3);
                String str2 = (String) this.f13981s;
                b bVar5 = (b) this.f13982t;
                c cVar3 = (c) eVar3;
                Parcel parcelM3 = cVar3.m();
                parcelM3.writeString(str2);
                a.b(parcelM3, bVar5);
                cVar3.t(parcelM3, 6);
                break;
            case 3:
                if (((Bundle) this.f13981s) != null) {
                    bundle = new Bundle();
                    if (((Bundle) this.f13981s).containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = ((Bundle) this.f13981s).get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                }
                e eVar4 = ((q) this.f13980q).f13998a.f14007h;
                z3.a.l(eVar4);
                a4.b bVar6 = new a4.b((Activity) this.f13982t);
                long j11 = this.f13992b;
                c cVar4 = (c) eVar4;
                Parcel parcelM4 = cVar4.m();
                a.b(parcelM4, bVar6);
                a.a(parcelM4, bundle);
                parcelM4.writeLong(j11);
                cVar4.t(parcelM4, 27);
                break;
            default:
                e eVar5 = ((q) this.f13980q).f13998a.f14007h;
                z3.a.l(eVar5);
                a4.b bVar7 = new a4.b((Activity) this.f13981s);
                b bVar8 = (b) this.f13982t;
                long j12 = this.f13992b;
                c cVar5 = (c) eVar5;
                Parcel parcelM5 = cVar5.m();
                a.b(parcelM5, bVar7);
                a.b(parcelM5, bVar8);
                parcelM5.writeLong(j12);
                cVar5.t(parcelM5, 31);
                break;
        }
    }

    @Override // h4.o
    public final void b() {
        int i10 = this.f13979h;
        Object obj = this.f13982t;
        switch (i10) {
            case 1:
                ((b) obj).a0(null);
                break;
            case 2:
                ((b) obj).a0(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, Activity activity, b bVar) {
        super(qVar.f13998a, true);
        this.f13979h = 4;
        this.f13980q = qVar;
        this.f13981s = activity;
        this.f13982t = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, Bundle bundle, Activity activity) {
        super(qVar.f13998a, true);
        this.f13979h = 3;
        this.f13980q = qVar;
        this.f13981s = bundle;
        this.f13982t = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, Object obj) {
        super(rVar, false);
        this.f13979h = 0;
        this.f13980q = rVar;
        this.f13981s = "Error with data collection. Data lost.";
        this.f13982t = obj;
    }
}
