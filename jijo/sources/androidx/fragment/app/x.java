package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f922b;

    public /* synthetic */ x(int i10, Object obj) {
        this.f921a = i10;
        this.f922b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f921a;
        Object obj = this.f922b;
        switch (i10) {
            case 0:
                d dVar = (d) obj;
                Object obj2 = dVar.f753c;
                q qVar = ((s) obj2).V;
                if ((qVar == null ? null : qVar.f861a) != null) {
                    ((s) obj2).i().f861a = null;
                    ((d0) dVar.f754d).c((s) dVar.f753c, (k0.b) dVar.f755e);
                }
                break;
            case 1:
                d dVar2 = (d) obj;
                dVar2.f752b.endViewTransition((View) dVar2.f753c);
                ((f) dVar2.f754d).b();
                break;
            case 2:
                m mVar = (m) obj;
                mVar.f821k0.onDismiss(mVar.f829s0);
                break;
            case 3:
                ((j0) obj).x(true);
                break;
            default:
                q0.b(4, (ArrayList) obj);
                break;
        }
    }
}
