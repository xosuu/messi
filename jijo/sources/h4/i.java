package h4;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class i extends o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13967h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f13968q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f13969s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(r rVar, String str, int i10) {
        super(rVar, true);
        this.f13967h = i10;
        this.f13969s = rVar;
        this.f13968q = str;
    }

    @Override // h4.o
    public final void a() {
        switch (this.f13967h) {
            case 0:
                e eVar = this.f13969s.f14007h;
                z3.a.l(eVar);
                String str = this.f13968q;
                long j10 = this.f13992b;
                c cVar = (c) eVar;
                Parcel parcelM = cVar.m();
                parcelM.writeString(str);
                parcelM.writeLong(j10);
                cVar.t(parcelM, 23);
                break;
            default:
                e eVar2 = this.f13969s.f14007h;
                z3.a.l(eVar2);
                String str2 = this.f13968q;
                long j11 = this.f13992b;
                c cVar2 = (c) eVar2;
                Parcel parcelM2 = cVar2.m();
                parcelM2.writeString(str2);
                parcelM2.writeLong(j11);
                cVar2.t(parcelM2, 24);
                break;
        }
    }
}
