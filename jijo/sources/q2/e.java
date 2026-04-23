package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f16417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f16418b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f16419d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f16420f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f16421h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ e[] f16422q;

    static {
        e eVar = new e("POOR", 0);
        f16417a = eVar;
        e eVar2 = new e("MODERATE", 1);
        f16418b = eVar2;
        e eVar3 = new e("GOOD", 2);
        f16419d = eVar3;
        e eVar4 = new e("EXCELLENT", 3);
        f16420f = eVar4;
        e eVar5 = new e("UNKNOWN", 4);
        f16421h = eVar5;
        f16422q = new e[]{eVar, eVar2, eVar3, eVar4, eVar5};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f16422q.clone();
    }
}
