package h4;

import android.app.Activity;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class p extends o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13995h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Activity f13996q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f13997s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Activity activity, int i10) {
        super(qVar.f13998a, true);
        this.f13995h = i10;
        if (i10 == 1) {
            this.f13997s = qVar;
            this.f13996q = activity;
            super(qVar.f13998a, true);
            return;
        }
        if (i10 == 2) {
            this.f13997s = qVar;
            this.f13996q = activity;
            super(qVar.f13998a, true);
        } else if (i10 == 3) {
            this.f13997s = qVar;
            this.f13996q = activity;
            super(qVar.f13998a, true);
        } else if (i10 != 4) {
            this.f13997s = qVar;
            this.f13996q = activity;
        } else {
            this.f13997s = qVar;
            this.f13996q = activity;
            super(qVar.f13998a, true);
        }
    }

    @Override // h4.o
    public final void a() {
        switch (this.f13995h) {
            case 0:
                e eVar = this.f13997s.f13998a.f14007h;
                z3.a.l(eVar);
                a4.b bVar = new a4.b(this.f13996q);
                long j10 = this.f13992b;
                c cVar = (c) eVar;
                Parcel parcelM = cVar.m();
                a.b(parcelM, bVar);
                parcelM.writeLong(j10);
                cVar.t(parcelM, 25);
                break;
            case 1:
                e eVar2 = this.f13997s.f13998a.f14007h;
                z3.a.l(eVar2);
                a4.b bVar2 = new a4.b(this.f13996q);
                long j11 = this.f13992b;
                c cVar2 = (c) eVar2;
                Parcel parcelM2 = cVar2.m();
                a.b(parcelM2, bVar2);
                parcelM2.writeLong(j11);
                cVar2.t(parcelM2, 30);
                break;
            case 2:
                e eVar3 = this.f13997s.f13998a.f14007h;
                z3.a.l(eVar3);
                a4.b bVar3 = new a4.b(this.f13996q);
                long j12 = this.f13992b;
                c cVar3 = (c) eVar3;
                Parcel parcelM3 = cVar3.m();
                a.b(parcelM3, bVar3);
                parcelM3.writeLong(j12);
                cVar3.t(parcelM3, 29);
                break;
            case 3:
                e eVar4 = this.f13997s.f13998a.f14007h;
                z3.a.l(eVar4);
                a4.b bVar4 = new a4.b(this.f13996q);
                long j13 = this.f13992b;
                c cVar4 = (c) eVar4;
                Parcel parcelM4 = cVar4.m();
                a.b(parcelM4, bVar4);
                parcelM4.writeLong(j13);
                cVar4.t(parcelM4, 26);
                break;
            default:
                e eVar5 = this.f13997s.f13998a.f14007h;
                z3.a.l(eVar5);
                a4.b bVar5 = new a4.b(this.f13996q);
                long j14 = this.f13992b;
                c cVar5 = (c) eVar5;
                Parcel parcelM5 = cVar5.m();
                a.b(parcelM5, bVar5);
                parcelM5.writeLong(j14);
                cVar5.t(parcelM5, 28);
                break;
        }
    }
}
