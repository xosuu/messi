package u7;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a extends LinkedHashMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17663a = 512;

    public a(int i10) {
        super(i10, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.f17663a;
    }
}
