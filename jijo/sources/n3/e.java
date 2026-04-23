package n3;

import android.util.Pair;
import com.google.android.gms.ads.nonagon.signalgeneration.zzk;
import com.google.android.gms.ads.nonagon.signalgeneration.zzl;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e extends LinkedHashMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzl f15941a;

    public e(zzl zzlVar) {
        this.f15941a = zzlVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.f15941a) {
            try {
                int size = size();
                zzl zzlVar = this.f15941a;
                if (size <= zzlVar.f2414a) {
                    return false;
                }
                zzlVar.f2419f.add(new Pair((String) entry.getKey(), ((zzk) entry.getValue()).zzb));
                return size() > this.f15941a.f2414a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
