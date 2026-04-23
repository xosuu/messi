package z7;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8.a f20742a = a8.a.f49e;

    public static boolean a(org.minidns.dnsname.a aVar, org.minidns.dnsname.a aVar2, org.minidns.dnsname.a aVar3) {
        int iE = aVar2.e();
        int iE2 = aVar3.e();
        int iE3 = aVar.e();
        if (iE3 > iE && !aVar.g(aVar2) && aVar.n(iE).f16142a.compareTo(aVar2.f16142a) < 0) {
            return false;
        }
        String str = aVar.f16142a;
        if (iE3 <= iE && str.compareTo(aVar2.n(iE3).f16142a) < 0) {
            return false;
        }
        if (iE3 <= iE2 || aVar.g(aVar3) || aVar.n(iE2).f16142a.compareTo(aVar3.f16142a) <= 0) {
            return iE3 > iE2 || str.compareTo(aVar3.n(iE3).f16142a) < 0;
        }
        return false;
    }
}
