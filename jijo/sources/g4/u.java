package g4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f13796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f13797b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f13798d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ u[] f13799f;

    /* JADX INFO: Fake field, exist only in values array */
    u EF0;

    static {
        u uVar = new u("DEBUG_PARAM_UNKNOWN", 0);
        u uVar2 = new u("ALWAYS_SHOW", 1);
        u uVar3 = new u("GEO_OVERRIDE_EEA", 2);
        f13796a = uVar3;
        u uVar4 = new u("GEO_OVERRIDE_NON_EEA", 3);
        f13797b = uVar4;
        u uVar5 = new u("PREVIEWING_DEBUG_MESSAGES", 4);
        f13798d = uVar5;
        f13799f = new u[]{uVar, uVar2, uVar3, uVar4, uVar5};
    }

    public static u[] values() {
        return (u[]) f13799f.clone();
    }
}
