package h4;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class n extends o {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f13985q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f13986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f13987t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f13990w;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Long f13984h = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f13988u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f13989v = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, String str, String str2, Bundle bundle) {
        super(rVar, true);
        this.f13990w = rVar;
        this.f13985q = str;
        this.f13986s = str2;
        this.f13987t = bundle;
    }

    @Override // h4.o
    public final void a() {
        Long l9 = this.f13984h;
        long jLongValue = l9 == null ? this.f13991a : l9.longValue();
        e eVar = this.f13990w.f14007h;
        z3.a.l(eVar);
        String str = this.f13985q;
        String str2 = this.f13986s;
        Bundle bundle = this.f13987t;
        boolean z9 = this.f13988u;
        boolean z10 = this.f13989v;
        c cVar = (c) eVar;
        Parcel parcelM = cVar.m();
        parcelM.writeString(str);
        parcelM.writeString(str2);
        a.a(parcelM, bundle);
        parcelM.writeInt(z9 ? 1 : 0);
        parcelM.writeInt(z10 ? 1 : 0);
        parcelM.writeLong(jLongValue);
        cVar.t(parcelM, 2);
    }
}
