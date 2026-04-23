package l5;

import androidx.annotation.RecentlyNonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f15214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f15215b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f15216d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d[] f15217f;

    static {
        d dVar = new d("UNKNOWN", 0);
        f15214a = dVar;
        d dVar2 = new d("NOT_REQUIRED", 1);
        f15215b = dVar2;
        d dVar3 = new d("REQUIRED", 2);
        f15216d = dVar3;
        f15217f = new d[]{dVar, dVar2, dVar3};
    }

    @RecentlyNonNull
    public static d valueOf(@RecentlyNonNull String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    @RecentlyNonNull
    public static d[] values() {
        return (d[]) f15217f.clone();
    }
}
