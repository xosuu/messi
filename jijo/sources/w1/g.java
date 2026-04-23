package w1;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18098c;

    public /* synthetic */ g(Object obj, int i10, Object obj2) {
        this.f18096a = i10;
        this.f18098c = obj;
        this.f18097b = obj2;
    }

    @Override // w1.p
    public final void b(q qVar) {
        int i10 = this.f18096a;
        Object obj = this.f18097b;
        switch (i10) {
            case 0:
                a0 a0Var = y.f18150a;
                a0Var.z((View) obj, 1.0f);
                a0Var.getClass();
                qVar.v(this);
                break;
            case 1:
                ((ArrayList) ((s.b) obj).getOrDefault(((s) this.f18098c).f18139b, null)).remove(qVar);
                qVar.v(this);
                break;
            default:
                ((q) obj).y();
                qVar.v(this);
                break;
        }
    }
}
