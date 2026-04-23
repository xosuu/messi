package h4;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class g extends o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13957h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f13958q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f13959s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f13960t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f13961u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(r rVar, String str, String str2, Object obj, int i10) {
        super(rVar, true);
        this.f13957h = i10;
        this.f13960t = rVar;
        this.f13958q = str;
        this.f13959s = str2;
        this.f13961u = obj;
    }

    @Override // h4.o
    public final void a() {
        switch (this.f13957h) {
            case 0:
                e eVar = this.f13960t.f14007h;
                z3.a.l(eVar);
                String str = this.f13958q;
                String str2 = this.f13959s;
                Bundle bundle = (Bundle) this.f13961u;
                c cVar = (c) eVar;
                Parcel parcelM = cVar.m();
                parcelM.writeString(str);
                parcelM.writeString(str2);
                a.a(parcelM, bundle);
                cVar.t(parcelM, 9);
                break;
            case 1:
                e eVar2 = this.f13960t.f14007h;
                z3.a.l(eVar2);
                String str3 = this.f13958q;
                String str4 = this.f13959s;
                b bVar = (b) this.f13961u;
                c cVar2 = (c) eVar2;
                Parcel parcelM2 = cVar2.m();
                parcelM2.writeString(str3);
                parcelM2.writeString(str4);
                a.b(parcelM2, bVar);
                cVar2.t(parcelM2, 10);
                break;
            default:
                e eVar3 = this.f13960t.f14007h;
                z3.a.l(eVar3);
                a4.b bVar2 = new a4.b((Activity) this.f13961u);
                String str5 = this.f13958q;
                String str6 = this.f13959s;
                long j10 = this.f13991a;
                c cVar3 = (c) eVar3;
                Parcel parcelM3 = cVar3.m();
                a.b(parcelM3, bVar2);
                parcelM3.writeString(str5);
                parcelM3.writeString(str6);
                parcelM3.writeLong(j10);
                cVar3.t(parcelM3, 15);
                break;
        }
    }

    @Override // h4.o
    public final void b() {
        switch (this.f13957h) {
            case 1:
                ((b) this.f13961u).a0(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r rVar, Activity activity, String str, String str2) {
        super(rVar, true);
        this.f13957h = 2;
        this.f13960t = rVar;
        this.f13961u = activity;
        this.f13958q = str;
        this.f13959s = str2;
    }
}
