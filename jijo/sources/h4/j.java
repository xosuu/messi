package h4;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class j extends o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13970h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b f13971q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f13972s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(r rVar, b bVar, int i10) {
        super(rVar, true);
        this.f13970h = i10;
        this.f13972s = rVar;
        this.f13971q = bVar;
    }

    @Override // h4.o
    public final void a() {
        switch (this.f13970h) {
            case 0:
                e eVar = this.f13972s.f14007h;
                z3.a.l(eVar);
                b bVar = this.f13971q;
                c cVar = (c) eVar;
                Parcel parcelM = cVar.m();
                a.b(parcelM, bVar);
                cVar.t(parcelM, 21);
                break;
            case 1:
                e eVar2 = this.f13972s.f14007h;
                z3.a.l(eVar2);
                b bVar2 = this.f13971q;
                c cVar2 = (c) eVar2;
                Parcel parcelM2 = cVar2.m();
                a.b(parcelM2, bVar2);
                cVar2.t(parcelM2, 19);
                break;
            case 2:
                e eVar3 = this.f13972s.f14007h;
                z3.a.l(eVar3);
                b bVar3 = this.f13971q;
                c cVar3 = (c) eVar3;
                Parcel parcelM3 = cVar3.m();
                a.b(parcelM3, bVar3);
                cVar3.t(parcelM3, 22);
                break;
            case 3:
                e eVar4 = this.f13972s.f14007h;
                z3.a.l(eVar4);
                b bVar4 = this.f13971q;
                c cVar4 = (c) eVar4;
                Parcel parcelM4 = cVar4.m();
                a.b(parcelM4, bVar4);
                cVar4.t(parcelM4, 16);
                break;
            default:
                e eVar5 = this.f13972s.f14007h;
                z3.a.l(eVar5);
                b bVar5 = this.f13971q;
                c cVar5 = (c) eVar5;
                Parcel parcelM5 = cVar5.m();
                a.b(parcelM5, bVar5);
                cVar5.t(parcelM5, 17);
                break;
        }
    }

    @Override // h4.o
    public final void b() {
        int i10 = this.f13970h;
        b bVar = this.f13971q;
        switch (i10) {
            case 0:
                bVar.a0(null);
                break;
            case 1:
                bVar.a0(null);
                break;
            case 2:
                bVar.a0(null);
                break;
            case 3:
                bVar.a0(null);
                break;
            default:
                bVar.a0(null);
                break;
        }
    }
}
