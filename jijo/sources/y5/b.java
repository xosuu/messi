package y5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f20465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f20466b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f20467d;

    static {
        b bVar = new b("OnErrorDiscard", 0);
        f20465a = bVar;
        b bVar2 = new b("OnErrorRecover", 1);
        f20466b = bVar2;
        f20467d = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f20467d.clone();
    }
}
