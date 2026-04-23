package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f981b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f982d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f983f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f984h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ l[] f985q;

    static {
        l lVar = new l("DESTROYED", 0);
        f980a = lVar;
        l lVar2 = new l("INITIALIZED", 1);
        f981b = lVar2;
        l lVar3 = new l("CREATED", 2);
        f982d = lVar3;
        l lVar4 = new l("STARTED", 3);
        f983f = lVar4;
        l lVar5 = new l("RESUMED", 4);
        f984h = lVar5;
        f985q = new l[]{lVar, lVar2, lVar3, lVar4, lVar5};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f985q.clone();
    }

    public final boolean a(l lVar) {
        return compareTo(lVar) >= 0;
    }
}
