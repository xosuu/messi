package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f16423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f16424b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f16425d;

    static {
        f fVar = new f("LOW", 0);
        f16423a = fVar;
        f fVar2 = new f("MEDIUM", 1);
        f fVar3 = new f("HIGH", 2);
        f fVar4 = new f("IMMEDIATE", 3);
        f16424b = fVar4;
        f16425d = new f[]{fVar, fVar2, fVar3, fVar4};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f16425d.clone();
    }
}
