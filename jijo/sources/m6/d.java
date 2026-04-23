package m6;

import com.google.android.gms.internal.ads.tp1;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends tp1 {
    public static int u0(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
