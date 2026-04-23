package c8;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    UNKNOWN(-1),
    NSID(3);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f1587f = new HashMap(values().length);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1589a;

    static {
        for (b bVar : values()) {
            f1587f.put(Integer.valueOf(bVar.f1589a), bVar);
        }
    }

    b(int i10) {
        this.f1589a = i10;
    }
}
