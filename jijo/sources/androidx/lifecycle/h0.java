package androidx.lifecycle;

import android.os.Bundle;
import com.google.android.gms.internal.ads.fb1;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements q1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1.d f967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l6.d f970d;

    public h0(q1.d dVar, androidx.fragment.app.w wVar) {
        g4.a0.f(dVar, "savedStateRegistry");
        this.f967a = dVar;
        this.f970d = new l6.d(new g0(wVar));
    }

    @Override // q1.c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f969c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((i0) this.f970d.a()).f971c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f968b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        fb1.t(entry.getValue());
        throw null;
    }
}
