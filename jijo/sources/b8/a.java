package b8;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f1477d = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1479b;

    public a(String str, int i10) {
        this.f1478a = str;
        this.f1479b = i10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f1479b, ((a) ((d) obj)).f1479b);
    }
}
