package h4;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class k extends o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13973h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f13974q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f13975s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f13976t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f13977u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f13978v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, String str, String str2, Object obj) {
        super(rVar, true);
        this.f13973h = 1;
        this.f13977u = rVar;
        this.f13974q = str;
        this.f13975s = str2;
        this.f13978v = obj;
        this.f13976t = true;
    }

    @Override // h4.o
    public final void a() {
        switch (this.f13973h) {
            case 0:
                e eVar = this.f13977u.f14007h;
                z3.a.l(eVar);
                String str = this.f13974q;
                String str2 = this.f13975s;
                boolean z9 = this.f13976t;
                b bVar = (b) this.f13978v;
                c cVar = (c) eVar;
                Parcel parcelM = cVar.m();
                parcelM.writeString(str);
                parcelM.writeString(str2);
                int i10 = a.f13949a;
                parcelM.writeInt(z9 ? 1 : 0);
                a.b(parcelM, bVar);
                cVar.t(parcelM, 5);
                break;
            default:
                e eVar2 = this.f13977u.f14007h;
                z3.a.l(eVar2);
                String str3 = this.f13974q;
                String str4 = this.f13975s;
                a4.b bVar2 = new a4.b(this.f13978v);
                boolean z10 = this.f13976t;
                long j10 = this.f13991a;
                c cVar2 = (c) eVar2;
                Parcel parcelM2 = cVar2.m();
                parcelM2.writeString(str3);
                parcelM2.writeString(str4);
                a.b(parcelM2, bVar2);
                parcelM2.writeInt(z10 ? 1 : 0);
                parcelM2.writeLong(j10);
                cVar2.t(parcelM2, 4);
                break;
        }
    }

    @Override // h4.o
    public final void b() {
        switch (this.f13973h) {
            case 0:
                ((b) this.f13978v).a0(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, String str, String str2, boolean z9, b bVar) {
        super(rVar, true);
        this.f13973h = 0;
        this.f13977u = rVar;
        this.f13974q = str;
        this.f13975s = str2;
        this.f13976t = z9;
        this.f13978v = bVar;
    }
}
