package y5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20460b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f20461d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f20462f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f20463h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ a[] f20464q;

    static {
        a aVar = new a("LevelDebug", 0);
        f20459a = aVar;
        a aVar2 = new a("LevelInfo", 1);
        f20460b = aVar2;
        a aVar3 = new a("LevelWarning", 2);
        f20461d = aVar3;
        a aVar4 = new a("LevelError", 3);
        f20462f = aVar4;
        a aVar5 = new a("LevelNone", 4);
        f20463h = aVar5;
        f20464q = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f20464q.clone();
    }
}
