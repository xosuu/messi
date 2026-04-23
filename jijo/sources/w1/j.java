package w1;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f18106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18107b;

    public j(View view, ArrayList arrayList) {
        this.f18106a = view;
        this.f18107b = arrayList;
    }

    @Override // w1.p
    public final void a() {
    }

    @Override // w1.p
    public final void b(q qVar) {
        qVar.v(this);
        this.f18106a.setVisibility(8);
        ArrayList arrayList = this.f18107b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((View) arrayList.get(i10)).setVisibility(0);
        }
    }

    @Override // w1.p
    public final void c() {
    }

    @Override // w1.p
    public final void d() {
    }

    @Override // w1.p
    public final void e() {
    }
}
