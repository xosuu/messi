package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f1537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f1538b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f1539d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f1540f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f1541h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final o f1542q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ o[] f1543s;

    static {
        o oVar = new o("NOT_REQUIRED", 0);
        f1537a = oVar;
        o oVar2 = new o("CONNECTED", 1);
        f1538b = oVar2;
        o oVar3 = new o("UNMETERED", 2);
        f1539d = oVar3;
        o oVar4 = new o("NOT_ROAMING", 3);
        f1540f = oVar4;
        o oVar5 = new o("METERED", 4);
        f1541h = oVar5;
        o oVar6 = new o("TEMPORARILY_UNMETERED", 5);
        f1542q = oVar6;
        f1543s = new o[]{oVar, oVar2, oVar3, oVar4, oVar5, oVar6};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f1543s.clone();
    }
}
