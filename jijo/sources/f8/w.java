package f8;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public enum w {
    IN(1),
    /* JADX INFO: Fake field, exist only in values array */
    CH(3),
    /* JADX INFO: Fake field, exist only in values array */
    HS(4),
    NONE(254),
    ANY(255);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f13479h = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13481a;

    static {
        for (w wVar : values()) {
            f13479h.put(Integer.valueOf(wVar.f13481a), wVar);
        }
    }

    w(int i10) {
        this.f13481a = i10;
    }
}
