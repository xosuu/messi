package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f1547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f1548b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f1549d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w f1550f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final w f1551h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final w f1552q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ w[] f1553s;

    static {
        w wVar = new w("ENQUEUED", 0);
        f1547a = wVar;
        w wVar2 = new w("RUNNING", 1);
        f1548b = wVar2;
        w wVar3 = new w("SUCCEEDED", 2);
        f1549d = wVar3;
        w wVar4 = new w("FAILED", 3);
        f1550f = wVar4;
        w wVar5 = new w("BLOCKED", 4);
        f1551h = wVar5;
        w wVar6 = new w("CANCELLED", 5);
        f1552q = wVar6;
        f1553s = new w[]{wVar, wVar2, wVar3, wVar4, wVar5, wVar6};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f1553s.clone();
    }

    public final boolean a() {
        return this == f1549d || this == f1550f || this == f1552q;
    }
}
