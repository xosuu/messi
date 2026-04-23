package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f917b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f918d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f919f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f920h;

    public w0(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f916a = i10;
        this.f917b = arrayList;
        this.f918d = arrayList2;
        this.f919f = arrayList3;
        this.f920h = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i10 = 0; i10 < this.f916a; i10++) {
            View view = (View) this.f917b.get(i10);
            String str = (String) this.f918d.get(i10);
            WeakHashMap weakHashMap = o0.v0.f16075a;
            o0.j0.v(view, str);
            o0.j0.v((View) this.f919f.get(i10), (String) this.f920h.get(i10));
        }
    }
}
