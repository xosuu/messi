package c7;

import android.os.Looper;
import b7.v0;
import d7.l;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l {
    @Override // d7.l
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // d7.l
    public v0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(d.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // d7.l
    public int c() {
        return 1073741823;
    }
}
