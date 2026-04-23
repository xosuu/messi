package h4;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class f extends o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13954h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Bundle f13955q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f13956s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(r rVar, Bundle bundle, int i10) {
        super(rVar, true);
        this.f13954h = i10;
        this.f13956s = rVar;
        this.f13955q = bundle;
    }

    @Override // h4.o
    public final void a() {
        switch (this.f13954h) {
            case 0:
                e eVar = this.f13956s.f14007h;
                z3.a.l(eVar);
                Bundle bundle = this.f13955q;
                long j10 = this.f13991a;
                c cVar = (c) eVar;
                Parcel parcelM = cVar.m();
                a.a(parcelM, bundle);
                parcelM.writeLong(j10);
                cVar.t(parcelM, 8);
                break;
            default:
                e eVar2 = this.f13956s.f14007h;
                z3.a.l(eVar2);
                Bundle bundle2 = this.f13955q;
                long j11 = this.f13991a;
                c cVar2 = (c) eVar2;
                Parcel parcelM2 = cVar2.m();
                a.a(parcelM2, bundle2);
                parcelM2.writeLong(j11);
                cVar2.t(parcelM2, 44);
                break;
        }
    }
}
