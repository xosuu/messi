package x7;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    QUERY,
    /* JADX INFO: Fake field, exist only in values array */
    INVERSE_QUERY,
    /* JADX INFO: Fake field, exist only in values array */
    STATUS,
    /* JADX INFO: Fake field, exist only in values array */
    UNASSIGNED3,
    /* JADX INFO: Fake field, exist only in values array */
    NOTIFY,
    /* JADX INFO: Fake field, exist only in values array */
    UPDATE;


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b[] f18522d = new b[values().length];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f18524a = (byte) ordinal();

    static {
        for (b bVar : values()) {
            b[] bVarArr = f18522d;
            byte b10 = bVar.f18524a;
            if (bVarArr[b10] != null) {
                throw new IllegalStateException();
            }
            bVarArr[b10] = bVar;
        }
    }

    b() {
    }
}
