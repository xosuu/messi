package l3;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.zzu;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzcb f15186b;

    public g(zzcb zzcbVar, String str) {
        this.f15186b = zzcbVar;
        this.f15185a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f15186b) {
            try {
                for (zzbz zzbzVar : this.f15186b.f2160b) {
                    String str2 = this.f15185a;
                    Map map = zzbzVar.zza;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        zzu.zzo().d().zzJ(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
